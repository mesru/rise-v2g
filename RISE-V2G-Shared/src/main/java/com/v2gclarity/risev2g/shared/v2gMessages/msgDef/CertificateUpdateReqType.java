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
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.07 um 04:55:05 PM CEST 
//


package com.v2gclarity.risev2g.shared.v2gMessages.msgDef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für CertificateUpdateReqType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CertificateUpdateReqType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:iso:15118:2:2013:MsgBody}BodyBaseType">
 *       &lt;sequence>
 *         &lt;element name="ContractSignatureCertChain" type="{urn:iso:15118:2:2013:MsgDataTypes}CertificateChainType"/>
 *         &lt;element name="eMAID" type="{urn:iso:15118:2:2013:MsgDataTypes}eMAIDType"/>
 *         &lt;element name="ListOfRootCertificateIDs" type="{urn:iso:15118:2:2013:MsgDataTypes}ListOfRootCertificateIDsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateUpdateReqType", namespace = "urn:iso:15118:2:2013:MsgBody", propOrder = {
    "contractSignatureCertChain",
    "emaid",
    "listOfRootCertificateIDs"
})
public class CertificateUpdateReqType
    extends BodyBaseType
{

    @XmlElement(name = "ContractSignatureCertChain", required = true)
    protected CertificateChainType contractSignatureCertChain;
    @XmlElement(name = "eMAID", required = true)
    protected String emaid;
    @XmlElement(name = "ListOfRootCertificateIDs", required = true)
    protected ListOfRootCertificateIDsType listOfRootCertificateIDs;
    @XmlAttribute(name = "Id", namespace = "urn:iso:15118:2:2013:MsgBody", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der contractSignatureCertChain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CertificateChainType }
     *     
     */
    public CertificateChainType getContractSignatureCertChain() {
        return contractSignatureCertChain;
    }

    /**
     * Legt den Wert der contractSignatureCertChain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateChainType }
     *     
     */
    public void setContractSignatureCertChain(CertificateChainType value) {
        this.contractSignatureCertChain = value;
    }

    /**
     * Ruft den Wert der emaid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAID() {
        return emaid;
    }

    /**
     * Legt den Wert der emaid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAID(String value) {
        this.emaid = value;
    }

    /**
     * Ruft den Wert der listOfRootCertificateIDs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ListOfRootCertificateIDsType }
     *     
     */
    public ListOfRootCertificateIDsType getListOfRootCertificateIDs() {
        return listOfRootCertificateIDs;
    }

    /**
     * Legt den Wert der listOfRootCertificateIDs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfRootCertificateIDsType }
     *     
     */
    public void setListOfRootCertificateIDs(ListOfRootCertificateIDsType value) {
        this.listOfRootCertificateIDs = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
