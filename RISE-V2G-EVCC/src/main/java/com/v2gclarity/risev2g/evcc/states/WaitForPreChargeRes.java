/*******************************************************************************
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2015 - 2019  Dr. Marc Mültin (V2G Clarity)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *******************************************************************************/
package com.v2gclarity.risev2g.evcc.states;

import java.util.concurrent.TimeUnit;

import com.v2gclarity.risev2g.evcc.evController.IDCEVController;
import com.v2gclarity.risev2g.evcc.session.V2GCommunicationSessionEVCC;
import com.v2gclarity.risev2g.shared.enumerations.V2GMessages;
import com.v2gclarity.risev2g.shared.messageHandling.ReactionToIncomingMessage;
import com.v2gclarity.risev2g.shared.messageHandling.TerminateSession;
import com.v2gclarity.risev2g.shared.misc.TimeRestrictions;
import com.v2gclarity.risev2g.shared.utils.MiscUtils;
import com.v2gclarity.risev2g.shared.v2gMessages.msgDef.ChargeProgressType;
import com.v2gclarity.risev2g.shared.v2gMessages.msgDef.PreChargeReqType;
import com.v2gclarity.risev2g.shared.v2gMessages.msgDef.PreChargeResType;
import com.v2gclarity.risev2g.shared.v2gMessages.msgDef.V2GMessage;

public class WaitForPreChargeRes extends ClientState {

	public WaitForPreChargeRes(V2GCommunicationSessionEVCC commSessionContext) {
		super(commSessionContext);
	}

	@Override
	public ReactionToIncomingMessage processIncomingMessage(Object message) {
		if (isIncomingMessageValid(message, PreChargeResType.class)) {
			V2GMessage v2gMessageRes = (V2GMessage) message;
			PreChargeResType preChargeRes = 
					(PreChargeResType) v2gMessageRes.getBody().getBodyElement().getValue();
			
			// TODO how to react to DC_EVSEStatus
			
			IDCEVController dcEvController = (IDCEVController) getCommSessionContext().getEvController();
			double targetVoltage = dcEvController.getTargetVoltage().getValue() * Math.pow(10, dcEvController.getTargetVoltage().getMultiplier());
			double presentVoltage = preChargeRes.getEVSEPresentVoltage().getValue() * Math.pow(10, preChargeRes.getEVSEPresentVoltage().getMultiplier());
					
			// Each EV has an EV-specific allowed deviation when measuring a target voltage
			int voltageAccuracy = (int) MiscUtils.getPropertyValue("voltage.accuracy");
			
			if (presentVoltage >= targetVoltage * (1 - voltageAccuracy / 100) && presentVoltage <= targetVoltage * (1 + voltageAccuracy / 100)) {
				getCommSessionContext().setOngoingTimerActive(false);
				getCommSessionContext().setOngoingTimer(0L);
				
				return getSendMessage(getPowerDeliveryReq(ChargeProgressType.START), V2GMessages.POWER_DELIVERY_RES);
			} else {
				long elapsedTime = System.nanoTime() - getCommSessionContext().getOngoingTimer();
				long elapsedTimeInMs = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
				
				if (elapsedTimeInMs > TimeRestrictions.V2G_EVCC_PRE_CHARGE_TIMEOUT) 
					return new TerminateSession("PreCharge timer timed out for PreChargeReq");
				else {
					getLogger().debug("Target voltage of " + targetVoltage + " V not yet reached. Present voltage at EVSE is " + presentVoltage);
					PreChargeReqType preChargeReq = new PreChargeReqType();
					preChargeReq.setDCEVStatus(dcEvController.getDCEVStatus());
					preChargeReq.setEVTargetCurrent(dcEvController.getTargetCurrent());
					preChargeReq.setEVTargetVoltage(dcEvController.getTargetVoltage());
					
					return getSendMessage(preChargeReq, V2GMessages.PRE_CHARGE_RES, Math.min((TimeRestrictions.V2G_EVCC_PRE_CHARGE_TIMEOUT - (int) elapsedTimeInMs), TimeRestrictions.getV2gEvccMsgTimeout(V2GMessages.PRE_CHARGE_RES)));
				}
			}
		} else {
			return new TerminateSession("Incoming message raised an error");
		}
	}
}
