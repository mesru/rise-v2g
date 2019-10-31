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
package com.v2gclarity.risev2g.shared.exiCodec;

import javax.xml.namespace.QName;

import com.siemens.ct.exi.context.GrammarContext;
import com.siemens.ct.exi.context.GrammarUriContext;
import com.siemens.ct.exi.context.QNameContext;
import com.siemens.ct.exi.exceptions.UnsupportedOption;
import com.siemens.ct.exi.grammars.Grammars;
import com.siemens.ct.exi.grammars.event.EndDocument;
import com.siemens.ct.exi.grammars.event.Event;
import com.siemens.ct.exi.grammars.event.StartDocument;
import com.siemens.ct.exi.grammars.event.StartElement;
import com.siemens.ct.exi.grammars.grammar.DocEnd;
import com.siemens.ct.exi.grammars.grammar.Document;
import com.siemens.ct.exi.grammars.grammar.Fragment;
import com.siemens.ct.exi.grammars.grammar.Grammar;
import com.siemens.ct.exi.grammars.grammar.SchemaInformedDocContent;
import com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTagGrammar;

@SuppressWarnings("unused")
public class EXIficient_xmldsig_core_schema implements Grammars {

		/* BEGIN GrammarContext ----- */
	final String ns0 = "";
	final QNameContext qnc0 = new QNameContext(0, 0, new QName(ns0, "Algorithm"));
	final QNameContext qnc1 = new QNameContext(0, 1, new QName(ns0, "Encoding"));
	final QNameContext qnc2 = new QNameContext(0, 2, new QName(ns0, "Id"));
	final QNameContext qnc3 = new QNameContext(0, 3, new QName(ns0, "MimeType"));
	final QNameContext qnc4 = new QNameContext(0, 4, new QName(ns0, "Target"));
	final QNameContext qnc5 = new QNameContext(0, 5, new QName(ns0, "Type"));
	final QNameContext qnc6 = new QNameContext(0, 6, new QName(ns0, "URI"));
	final QNameContext[] grammarQNames0 = {qnc0, qnc1, qnc2, qnc3, qnc4, qnc5, qnc6};
	final String[] grammarPrefixes0 = {""};
	final GrammarUriContext guc0 = new GrammarUriContext(0, ns0, grammarQNames0, grammarPrefixes0);
	
	final String ns1 = "http://www.w3.org/XML/1998/namespace";
	final QNameContext qnc7 = new QNameContext(1, 0, new QName(ns1, "base"));
	final QNameContext qnc8 = new QNameContext(1, 1, new QName(ns1, "id"));
	final QNameContext qnc9 = new QNameContext(1, 2, new QName(ns1, "lang"));
	final QNameContext qnc10 = new QNameContext(1, 3, new QName(ns1, "space"));
	final QNameContext[] grammarQNames1 = {qnc7, qnc8, qnc9, qnc10};
	final String[] grammarPrefixes1 = {"xml"};
	final GrammarUriContext guc1 = new GrammarUriContext(1, ns1, grammarQNames1, grammarPrefixes1);
	
	final String ns2 = "http://www.w3.org/2001/XMLSchema-instance";
	final QNameContext qnc11 = new QNameContext(2, 0, new QName(ns2, "nil"));
	final QNameContext qnc12 = new QNameContext(2, 1, new QName(ns2, "type"));
	final QNameContext[] grammarQNames2 = {qnc11, qnc12};
	final String[] grammarPrefixes2 = {"xsi"};
	final GrammarUriContext guc2 = new GrammarUriContext(2, ns2, grammarQNames2, grammarPrefixes2);
	
	final String ns3 = "http://www.w3.org/2001/XMLSchema";
	final QNameContext qnc13 = new QNameContext(3, 0, new QName(ns3, "ENTITIES"));
	final QNameContext qnc14 = new QNameContext(3, 1, new QName(ns3, "ENTITY"));
	final QNameContext qnc15 = new QNameContext(3, 2, new QName(ns3, "ID"));
	final QNameContext qnc16 = new QNameContext(3, 3, new QName(ns3, "IDREF"));
	final QNameContext qnc17 = new QNameContext(3, 4, new QName(ns3, "IDREFS"));
	final QNameContext qnc18 = new QNameContext(3, 5, new QName(ns3, "NCName"));
	final QNameContext qnc19 = new QNameContext(3, 6, new QName(ns3, "NMTOKEN"));
	final QNameContext qnc20 = new QNameContext(3, 7, new QName(ns3, "NMTOKENS"));
	final QNameContext qnc21 = new QNameContext(3, 8, new QName(ns3, "NOTATION"));
	final QNameContext qnc22 = new QNameContext(3, 9, new QName(ns3, "Name"));
	final QNameContext qnc23 = new QNameContext(3, 10, new QName(ns3, "QName"));
	final QNameContext qnc24 = new QNameContext(3, 11, new QName(ns3, "anySimpleType"));
	final QNameContext qnc25 = new QNameContext(3, 12, new QName(ns3, "anyType"));
	final QNameContext qnc26 = new QNameContext(3, 13, new QName(ns3, "anyURI"));
	final QNameContext qnc27 = new QNameContext(3, 14, new QName(ns3, "base64Binary"));
	final QNameContext qnc28 = new QNameContext(3, 15, new QName(ns3, "boolean"));
	final QNameContext qnc29 = new QNameContext(3, 16, new QName(ns3, "byte"));
	final QNameContext qnc30 = new QNameContext(3, 17, new QName(ns3, "date"));
	final QNameContext qnc31 = new QNameContext(3, 18, new QName(ns3, "dateTime"));
	final QNameContext qnc32 = new QNameContext(3, 19, new QName(ns3, "decimal"));
	final QNameContext qnc33 = new QNameContext(3, 20, new QName(ns3, "double"));
	final QNameContext qnc34 = new QNameContext(3, 21, new QName(ns3, "duration"));
	final QNameContext qnc35 = new QNameContext(3, 22, new QName(ns3, "float"));
	final QNameContext qnc36 = new QNameContext(3, 23, new QName(ns3, "gDay"));
	final QNameContext qnc37 = new QNameContext(3, 24, new QName(ns3, "gMonth"));
	final QNameContext qnc38 = new QNameContext(3, 25, new QName(ns3, "gMonthDay"));
	final QNameContext qnc39 = new QNameContext(3, 26, new QName(ns3, "gYear"));
	final QNameContext qnc40 = new QNameContext(3, 27, new QName(ns3, "gYearMonth"));
	final QNameContext qnc41 = new QNameContext(3, 28, new QName(ns3, "hexBinary"));
	final QNameContext qnc42 = new QNameContext(3, 29, new QName(ns3, "int"));
	final QNameContext qnc43 = new QNameContext(3, 30, new QName(ns3, "integer"));
	final QNameContext qnc44 = new QNameContext(3, 31, new QName(ns3, "language"));
	final QNameContext qnc45 = new QNameContext(3, 32, new QName(ns3, "long"));
	final QNameContext qnc46 = new QNameContext(3, 33, new QName(ns3, "negativeInteger"));
	final QNameContext qnc47 = new QNameContext(3, 34, new QName(ns3, "nonNegativeInteger"));
	final QNameContext qnc48 = new QNameContext(3, 35, new QName(ns3, "nonPositiveInteger"));
	final QNameContext qnc49 = new QNameContext(3, 36, new QName(ns3, "normalizedString"));
	final QNameContext qnc50 = new QNameContext(3, 37, new QName(ns3, "positiveInteger"));
	final QNameContext qnc51 = new QNameContext(3, 38, new QName(ns3, "short"));
	final QNameContext qnc52 = new QNameContext(3, 39, new QName(ns3, "string"));
	final QNameContext qnc53 = new QNameContext(3, 40, new QName(ns3, "time"));
	final QNameContext qnc54 = new QNameContext(3, 41, new QName(ns3, "token"));
	final QNameContext qnc55 = new QNameContext(3, 42, new QName(ns3, "unsignedByte"));
	final QNameContext qnc56 = new QNameContext(3, 43, new QName(ns3, "unsignedInt"));
	final QNameContext qnc57 = new QNameContext(3, 44, new QName(ns3, "unsignedLong"));
	final QNameContext qnc58 = new QNameContext(3, 45, new QName(ns3, "unsignedShort"));
	final QNameContext[] grammarQNames3 = {qnc13, qnc14, qnc15, qnc16, qnc17, qnc18, qnc19, qnc20, qnc21, qnc22, qnc23, qnc24, qnc25, qnc26, qnc27, qnc28, qnc29, qnc30, qnc31, qnc32, qnc33, qnc34, qnc35, qnc36, qnc37, qnc38, qnc39, qnc40, qnc41, qnc42, qnc43, qnc44, qnc45, qnc46, qnc47, qnc48, qnc49, qnc50, qnc51, qnc52, qnc53, qnc54, qnc55, qnc56, qnc57, qnc58};
	final String[] grammarPrefixes3 = {};
	final GrammarUriContext guc3 = new GrammarUriContext(3, ns3, grammarQNames3, grammarPrefixes3);
	
	final String ns4 = "http://www.w3.org/2000/09/xmldsig#";
	final QNameContext qnc59 = new QNameContext(4, 0, new QName(ns4, "CanonicalizationMethod"));
	final QNameContext qnc60 = new QNameContext(4, 1, new QName(ns4, "CanonicalizationMethodType"));
	final QNameContext qnc61 = new QNameContext(4, 2, new QName(ns4, "CryptoBinary"));
	final QNameContext qnc62 = new QNameContext(4, 3, new QName(ns4, "DSAKeyValue"));
	final QNameContext qnc63 = new QNameContext(4, 4, new QName(ns4, "DSAKeyValueType"));
	final QNameContext qnc64 = new QNameContext(4, 5, new QName(ns4, "DigestMethod"));
	final QNameContext qnc65 = new QNameContext(4, 6, new QName(ns4, "DigestMethodType"));
	final QNameContext qnc66 = new QNameContext(4, 7, new QName(ns4, "DigestValue"));
	final QNameContext qnc67 = new QNameContext(4, 8, new QName(ns4, "DigestValueType"));
	final QNameContext qnc68 = new QNameContext(4, 9, new QName(ns4, "Exponent"));
	final QNameContext qnc69 = new QNameContext(4, 10, new QName(ns4, "G"));
	final QNameContext qnc70 = new QNameContext(4, 11, new QName(ns4, "HMACOutputLength"));
	final QNameContext qnc71 = new QNameContext(4, 12, new QName(ns4, "HMACOutputLengthType"));
	final QNameContext qnc72 = new QNameContext(4, 13, new QName(ns4, "J"));
	final QNameContext qnc73 = new QNameContext(4, 14, new QName(ns4, "KeyInfo"));
	final QNameContext qnc74 = new QNameContext(4, 15, new QName(ns4, "KeyInfoType"));
	final QNameContext qnc75 = new QNameContext(4, 16, new QName(ns4, "KeyName"));
	final QNameContext qnc76 = new QNameContext(4, 17, new QName(ns4, "KeyValue"));
	final QNameContext qnc77 = new QNameContext(4, 18, new QName(ns4, "KeyValueType"));
	final QNameContext qnc78 = new QNameContext(4, 19, new QName(ns4, "Manifest"));
	final QNameContext qnc79 = new QNameContext(4, 20, new QName(ns4, "ManifestType"));
	final QNameContext qnc80 = new QNameContext(4, 21, new QName(ns4, "MgmtData"));
	final QNameContext qnc81 = new QNameContext(4, 22, new QName(ns4, "Modulus"));
	final QNameContext qnc82 = new QNameContext(4, 23, new QName(ns4, "Object"));
	final QNameContext qnc83 = new QNameContext(4, 24, new QName(ns4, "ObjectType"));
	final QNameContext qnc84 = new QNameContext(4, 25, new QName(ns4, "P"));
	final QNameContext qnc85 = new QNameContext(4, 26, new QName(ns4, "PGPData"));
	final QNameContext qnc86 = new QNameContext(4, 27, new QName(ns4, "PGPDataType"));
	final QNameContext qnc87 = new QNameContext(4, 28, new QName(ns4, "PGPKeyID"));
	final QNameContext qnc88 = new QNameContext(4, 29, new QName(ns4, "PGPKeyPacket"));
	final QNameContext qnc89 = new QNameContext(4, 30, new QName(ns4, "PgenCounter"));
	final QNameContext qnc90 = new QNameContext(4, 31, new QName(ns4, "Q"));
	final QNameContext qnc91 = new QNameContext(4, 32, new QName(ns4, "RSAKeyValue"));
	final QNameContext qnc92 = new QNameContext(4, 33, new QName(ns4, "RSAKeyValueType"));
	final QNameContext qnc93 = new QNameContext(4, 34, new QName(ns4, "Reference"));
	final QNameContext qnc94 = new QNameContext(4, 35, new QName(ns4, "ReferenceType"));
	final QNameContext qnc95 = new QNameContext(4, 36, new QName(ns4, "RetrievalMethod"));
	final QNameContext qnc96 = new QNameContext(4, 37, new QName(ns4, "RetrievalMethodType"));
	final QNameContext qnc97 = new QNameContext(4, 38, new QName(ns4, "SPKIData"));
	final QNameContext qnc98 = new QNameContext(4, 39, new QName(ns4, "SPKIDataType"));
	final QNameContext qnc99 = new QNameContext(4, 40, new QName(ns4, "SPKISexp"));
	final QNameContext qnc100 = new QNameContext(4, 41, new QName(ns4, "Seed"));
	final QNameContext qnc101 = new QNameContext(4, 42, new QName(ns4, "Signature"));
	final QNameContext qnc102 = new QNameContext(4, 43, new QName(ns4, "SignatureMethod"));
	final QNameContext qnc103 = new QNameContext(4, 44, new QName(ns4, "SignatureMethodType"));
	final QNameContext qnc104 = new QNameContext(4, 45, new QName(ns4, "SignatureProperties"));
	final QNameContext qnc105 = new QNameContext(4, 46, new QName(ns4, "SignaturePropertiesType"));
	final QNameContext qnc106 = new QNameContext(4, 47, new QName(ns4, "SignatureProperty"));
	final QNameContext qnc107 = new QNameContext(4, 48, new QName(ns4, "SignaturePropertyType"));
	final QNameContext qnc108 = new QNameContext(4, 49, new QName(ns4, "SignatureType"));
	final QNameContext qnc109 = new QNameContext(4, 50, new QName(ns4, "SignatureValue"));
	final QNameContext qnc110 = new QNameContext(4, 51, new QName(ns4, "SignatureValueType"));
	final QNameContext qnc111 = new QNameContext(4, 52, new QName(ns4, "SignedInfo"));
	final QNameContext qnc112 = new QNameContext(4, 53, new QName(ns4, "SignedInfoType"));
	final QNameContext qnc113 = new QNameContext(4, 54, new QName(ns4, "Transform"));
	final QNameContext qnc114 = new QNameContext(4, 55, new QName(ns4, "TransformType"));
	final QNameContext qnc115 = new QNameContext(4, 56, new QName(ns4, "Transforms"));
	final QNameContext qnc116 = new QNameContext(4, 57, new QName(ns4, "TransformsType"));
	final QNameContext qnc117 = new QNameContext(4, 58, new QName(ns4, "X509CRL"));
	final QNameContext qnc118 = new QNameContext(4, 59, new QName(ns4, "X509Certificate"));
	final QNameContext qnc119 = new QNameContext(4, 60, new QName(ns4, "X509Data"));
	final QNameContext qnc120 = new QNameContext(4, 61, new QName(ns4, "X509DataType"));
	final QNameContext qnc121 = new QNameContext(4, 62, new QName(ns4, "X509IssuerName"));
	final QNameContext qnc122 = new QNameContext(4, 63, new QName(ns4, "X509IssuerSerial"));
	final QNameContext qnc123 = new QNameContext(4, 64, new QName(ns4, "X509IssuerSerialType"));
	final QNameContext qnc124 = new QNameContext(4, 65, new QName(ns4, "X509SKI"));
	final QNameContext qnc125 = new QNameContext(4, 66, new QName(ns4, "X509SerialNumber"));
	final QNameContext qnc126 = new QNameContext(4, 67, new QName(ns4, "X509SubjectName"));
	final QNameContext qnc127 = new QNameContext(4, 68, new QName(ns4, "XPath"));
	final QNameContext qnc128 = new QNameContext(4, 69, new QName(ns4, "Y"));
	final QNameContext[] grammarQNames4 = {qnc59, qnc60, qnc61, qnc62, qnc63, qnc64, qnc65, qnc66, qnc67, qnc68, qnc69, qnc70, qnc71, qnc72, qnc73, qnc74, qnc75, qnc76, qnc77, qnc78, qnc79, qnc80, qnc81, qnc82, qnc83, qnc84, qnc85, qnc86, qnc87, qnc88, qnc89, qnc90, qnc91, qnc92, qnc93, qnc94, qnc95, qnc96, qnc97, qnc98, qnc99, qnc100, qnc101, qnc102, qnc103, qnc104, qnc105, qnc106, qnc107, qnc108, qnc109, qnc110, qnc111, qnc112, qnc113, qnc114, qnc115, qnc116, qnc117, qnc118, qnc119, qnc120, qnc121, qnc122, qnc123, qnc124, qnc125, qnc126, qnc127, qnc128};
	final String[] grammarPrefixes4 = {};
	final GrammarUriContext guc4 = new GrammarUriContext(4, ns4, grammarQNames4, grammarPrefixes4);
	
	final GrammarUriContext[] grammarUriContexts = {guc0, guc1, guc2, guc3, guc4};
	final GrammarContext gc = new GrammarContext(grammarUriContexts, 129);
	/* END GrammarContext ----- */

	
		/* BEGIN Grammars ----- */
	com.siemens.ct.exi.grammars.grammar.Document g0 = new com.siemens.ct.exi.grammars.grammar.Document();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedDocContent g1 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedDocContent();
	com.siemens.ct.exi.grammars.grammar.DocEnd g2 = new com.siemens.ct.exi.grammars.grammar.DocEnd();
	com.siemens.ct.exi.grammars.grammar.Fragment g3 = new com.siemens.ct.exi.grammars.grammar.Fragment();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFragmentContent g4 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFragmentContent();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g5 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g6 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g7 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g8 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g9 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g10 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g11 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g12 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g13 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g14 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g15 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g16 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g17 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g18 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g19 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g20 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g21 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g22 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g23 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g24 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g25 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g26 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g27 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g28 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g29 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g30 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g31 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g32 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g33 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g34 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g35 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g36 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g37 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g38 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g39 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g40 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g41 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g42 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g43 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g44 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g45 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g46 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g47 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag g48 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedFirstStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g49 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g50 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g51 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g52 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g53 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g54 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g55 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g56 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g57 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g58 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g59 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g60 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g61 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g62 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g63 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g64 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g65 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag g66 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedStartTag();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g67 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g68 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g69 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g70 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g71 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g72 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g73 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g74 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g75 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g76 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g77 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g78 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g79 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g80 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g81 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g82 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g83 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g84 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g85 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g86 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g87 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g88 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g89 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g90 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g91 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g92 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g93 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g94 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g95 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g96 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g97 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g98 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g99 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g100 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g101 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g102 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g103 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g104 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g105 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g106 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g107 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g108 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g109 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g110 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g111 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g112 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g113 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g114 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g115 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g116 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g117 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g118 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g119 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g120 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g121 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g122 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g123 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g124 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g125 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g126 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g127 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g128 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g129 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	com.siemens.ct.exi.grammars.grammar.SchemaInformedElement g130 = new com.siemens.ct.exi.grammars.grammar.SchemaInformedElement();
	/* END Grammars ----- */

	
		com.siemens.ct.exi.grammars.event.StartElement globalSE59 = new com.siemens.ct.exi.grammars.event.StartElement(qnc59, g5);
	com.siemens.ct.exi.grammars.event.StartElement globalSE62 = new com.siemens.ct.exi.grammars.event.StartElement(qnc62, g6);
	com.siemens.ct.exi.grammars.event.StartElement globalSE64 = new com.siemens.ct.exi.grammars.event.StartElement(qnc64, g5);
	com.siemens.ct.exi.grammars.event.StartElement globalSE66 = new com.siemens.ct.exi.grammars.event.StartElement(qnc66, g7);
	com.siemens.ct.exi.grammars.event.StartElement globalSE73 = new com.siemens.ct.exi.grammars.event.StartElement(qnc73, g8);
	com.siemens.ct.exi.grammars.event.StartElement globalSE75 = new com.siemens.ct.exi.grammars.event.StartElement(qnc75, g9);
	com.siemens.ct.exi.grammars.event.StartElement globalSE76 = new com.siemens.ct.exi.grammars.event.StartElement(qnc76, g10);
	com.siemens.ct.exi.grammars.event.StartElement globalSE78 = new com.siemens.ct.exi.grammars.event.StartElement(qnc78, g21);
	com.siemens.ct.exi.grammars.event.StartElement globalSE80 = new com.siemens.ct.exi.grammars.event.StartElement(qnc80, g9);
	com.siemens.ct.exi.grammars.event.StartElement globalSE82 = new com.siemens.ct.exi.grammars.event.StartElement(qnc82, g23);
	com.siemens.ct.exi.grammars.event.StartElement globalSE85 = new com.siemens.ct.exi.grammars.event.StartElement(qnc85, g19);
	com.siemens.ct.exi.grammars.event.StartElement globalSE91 = new com.siemens.ct.exi.grammars.event.StartElement(qnc91, g11);
	com.siemens.ct.exi.grammars.event.StartElement globalSE93 = new com.siemens.ct.exi.grammars.event.StartElement(qnc93, g22);
	com.siemens.ct.exi.grammars.event.StartElement globalSE95 = new com.siemens.ct.exi.grammars.event.StartElement(qnc95, g12);
	com.siemens.ct.exi.grammars.event.StartElement globalSE97 = new com.siemens.ct.exi.grammars.event.StartElement(qnc97, g20);
	com.siemens.ct.exi.grammars.event.StartElement globalSE101 = new com.siemens.ct.exi.grammars.event.StartElement(qnc101, g24);
	com.siemens.ct.exi.grammars.event.StartElement globalSE102 = new com.siemens.ct.exi.grammars.event.StartElement(qnc102, g26);
	com.siemens.ct.exi.grammars.event.StartElement globalSE104 = new com.siemens.ct.exi.grammars.event.StartElement(qnc104, g29);
	com.siemens.ct.exi.grammars.event.StartElement globalSE106 = new com.siemens.ct.exi.grammars.event.StartElement(qnc106, g30);
	com.siemens.ct.exi.grammars.event.StartElement globalSE109 = new com.siemens.ct.exi.grammars.event.StartElement(qnc109, g28);
	com.siemens.ct.exi.grammars.event.StartElement globalSE111 = new com.siemens.ct.exi.grammars.event.StartElement(qnc111, g25);
	com.siemens.ct.exi.grammars.event.StartElement globalSE113 = new com.siemens.ct.exi.grammars.event.StartElement(qnc113, g14);
	com.siemens.ct.exi.grammars.event.StartElement globalSE115 = new com.siemens.ct.exi.grammars.event.StartElement(qnc115, g13);
	com.siemens.ct.exi.grammars.event.StartElement globalSE119 = new com.siemens.ct.exi.grammars.event.StartElement(qnc119, g15);


	protected String schemaId; 
	
	
	void initGlobalElements() {
			/* BEGIN GlobalElements ----- */
	qnc59.setGlobalStartElement(globalSE59);
	qnc62.setGlobalStartElement(globalSE62);
	qnc64.setGlobalStartElement(globalSE64);
	qnc66.setGlobalStartElement(globalSE66);
	qnc73.setGlobalStartElement(globalSE73);
	qnc75.setGlobalStartElement(globalSE75);
	qnc76.setGlobalStartElement(globalSE76);
	qnc78.setGlobalStartElement(globalSE78);
	qnc80.setGlobalStartElement(globalSE80);
	qnc82.setGlobalStartElement(globalSE82);
	qnc85.setGlobalStartElement(globalSE85);
	qnc91.setGlobalStartElement(globalSE91);
	qnc93.setGlobalStartElement(globalSE93);
	qnc95.setGlobalStartElement(globalSE95);
	qnc97.setGlobalStartElement(globalSE97);
	qnc101.setGlobalStartElement(globalSE101);
	qnc102.setGlobalStartElement(globalSE102);
	qnc104.setGlobalStartElement(globalSE104);
	qnc106.setGlobalStartElement(globalSE106);
	qnc109.setGlobalStartElement(globalSE109);
	qnc111.setGlobalStartElement(globalSE111);
	qnc113.setGlobalStartElement(globalSE113);
	qnc115.setGlobalStartElement(globalSE115);
	qnc119.setGlobalStartElement(globalSE119);
	/* END GlobalElements ----- */
	
	}
	
	void initGlobalAttributes() {
			/* BEGIN GlobalAttributes ----- */
	/* END GlobalAttributes ----- */

	}
	
	void initTypeGrammars() {
			/* BEGIN TypeGrammar ----- */
	qnc13.setTypeGrammar(g31);
	qnc14.setTypeGrammar(g32);
	qnc15.setTypeGrammar(g32);
	qnc16.setTypeGrammar(g32);
	qnc17.setTypeGrammar(g31);
	qnc18.setTypeGrammar(g32);
	qnc19.setTypeGrammar(g32);
	qnc20.setTypeGrammar(g31);
	qnc21.setTypeGrammar(g32);
	qnc22.setTypeGrammar(g32);
	qnc23.setTypeGrammar(g32);
	qnc24.setTypeGrammar(g32);
	qnc25.setTypeGrammar(g33);
	qnc26.setTypeGrammar(g32);
	qnc27.setTypeGrammar(g7);
	qnc28.setTypeGrammar(g34);
	qnc29.setTypeGrammar(g35);
	qnc30.setTypeGrammar(g36);
	qnc31.setTypeGrammar(g37);
	qnc32.setTypeGrammar(g38);
	qnc33.setTypeGrammar(g39);
	qnc34.setTypeGrammar(g32);
	qnc35.setTypeGrammar(g39);
	qnc36.setTypeGrammar(g40);
	qnc37.setTypeGrammar(g41);
	qnc38.setTypeGrammar(g42);
	qnc39.setTypeGrammar(g43);
	qnc40.setTypeGrammar(g44);
	qnc41.setTypeGrammar(g45);
	qnc42.setTypeGrammar(g27);
	qnc43.setTypeGrammar(g27);
	qnc44.setTypeGrammar(g32);
	qnc45.setTypeGrammar(g27);
	qnc46.setTypeGrammar(g27);
	qnc47.setTypeGrammar(g46);
	qnc48.setTypeGrammar(g27);
	qnc49.setTypeGrammar(g32);
	qnc50.setTypeGrammar(g46);
	qnc51.setTypeGrammar(g27);
	qnc52.setTypeGrammar(g32);
	qnc53.setTypeGrammar(g47);
	qnc54.setTypeGrammar(g32);
	qnc55.setTypeGrammar(g48);
	qnc56.setTypeGrammar(g46);
	qnc57.setTypeGrammar(g46);
	qnc58.setTypeGrammar(g46);
	qnc60.setTypeGrammar(g5);
	qnc61.setTypeGrammar(g7);
	qnc63.setTypeGrammar(g6);
	qnc65.setTypeGrammar(g5);
	qnc67.setTypeGrammar(g7);
	qnc71.setTypeGrammar(g27);
	qnc74.setTypeGrammar(g8);
	qnc77.setTypeGrammar(g10);
	qnc79.setTypeGrammar(g21);
	qnc83.setTypeGrammar(g23);
	qnc86.setTypeGrammar(g19);
	qnc92.setTypeGrammar(g11);
	qnc94.setTypeGrammar(g22);
	qnc96.setTypeGrammar(g12);
	qnc98.setTypeGrammar(g20);
	qnc103.setTypeGrammar(g26);
	qnc105.setTypeGrammar(g29);
	qnc107.setTypeGrammar(g30);
	qnc108.setTypeGrammar(g24);
	qnc110.setTypeGrammar(g28);
	qnc112.setTypeGrammar(g25);
	qnc114.setTypeGrammar(g14);
	qnc116.setTypeGrammar(g13);
	qnc120.setTypeGrammar(g15);
	qnc123.setTypeGrammar(g16);
	/* END TypeGrammar ----- */
	
	}
	
	
	void initGrammarEvents() {
			/* BEGIN Grammar Events ----- */
	g0.addProduction(new com.siemens.ct.exi.grammars.event.StartDocument(), g1);
	g1.addProduction(globalSE59, g2);
	g1.addProduction(globalSE62, g2);
	g1.addProduction(globalSE64, g2);
	g1.addProduction(globalSE66, g2);
	g1.addProduction(globalSE73, g2);
	g1.addProduction(globalSE75, g2);
	g1.addProduction(globalSE76, g2);
	g1.addProduction(globalSE78, g2);
	g1.addProduction(globalSE80, g2);
	g1.addProduction(globalSE82, g2);
	g1.addProduction(globalSE85, g2);
	g1.addProduction(globalSE91, g2);
	g1.addProduction(globalSE93, g2);
	g1.addProduction(globalSE95, g2);
	g1.addProduction(globalSE97, g2);
	g1.addProduction(globalSE101, g2);
	g1.addProduction(globalSE102, g2);
	g1.addProduction(globalSE104, g2);
	g1.addProduction(globalSE106, g2);
	g1.addProduction(globalSE109, g2);
	g1.addProduction(globalSE111, g2);
	g1.addProduction(globalSE113, g2);
	g1.addProduction(globalSE115, g2);
	g1.addProduction(globalSE119, g2);
	g1.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g2);
	g2.addProduction(new com.siemens.ct.exi.grammars.event.EndDocument(), g68);
	g3.addProduction(new com.siemens.ct.exi.grammars.event.StartDocument(), g4);
	g4.addProduction(globalSE59, g4);
	g4.addProduction(globalSE62, g4);
	g4.addProduction(globalSE64, g4);
	g4.addProduction(globalSE66, g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc68, g7), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc69, g7), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc70, g27), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc72, g7), g4);
	g4.addProduction(globalSE73, g4);
	g4.addProduction(globalSE75, g4);
	g4.addProduction(globalSE76, g4);
	g4.addProduction(globalSE78, g4);
	g4.addProduction(globalSE80, g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc81, g7), g4);
	g4.addProduction(globalSE82, g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc84, g7), g4);
	g4.addProduction(globalSE85, g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc87, g18), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc88, g18), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc89, g7), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc90, g7), g4);
	g4.addProduction(globalSE91, g4);
	g4.addProduction(globalSE93, g4);
	g4.addProduction(globalSE95, g4);
	g4.addProduction(globalSE97, g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc99, g18), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc100, g7), g4);
	g4.addProduction(globalSE101, g4);
	g4.addProduction(globalSE102, g4);
	g4.addProduction(globalSE104, g4);
	g4.addProduction(globalSE106, g4);
	g4.addProduction(globalSE109, g4);
	g4.addProduction(globalSE111, g4);
	g4.addProduction(globalSE113, g4);
	g4.addProduction(globalSE115, g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc117, g18), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc118, g18), g4);
	g4.addProduction(globalSE119, g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc121, g9), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc122, g16), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc124, g18), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc125, g17), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc126, g9), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc127, g9), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc128, g7), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g4);
	g4.addProduction(new com.siemens.ct.exi.grammars.event.EndDocument(), g68);
	g5.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc0, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g49);
	g6.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc84, g7), g71);
	g6.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc69, g7), g73);
	g6.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc128, g7), g74);
	g7.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BinaryBase64Datatype(qnc61)), g69);
	g8.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g50);
	g8.addProduction(globalSE75, g79);
	g8.addProduction(globalSE76, g79);
	g8.addProduction(globalSE95, g79);
	g8.addProduction(globalSE119, g79);
	g8.addProduction(globalSE85, g79);
	g8.addProduction(globalSE97, g79);
	g8.addProduction(globalSE80, g79);
	g8.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g79);
	g8.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g99);
	g9.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.StringDatatype(qnc52)), g69);
	g10.addProduction(globalSE62, g80);
	g10.addProduction(globalSE91, g80);
	g10.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g80);
	g10.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g83);
	g11.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc81, g7), g81);
	g12.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc5, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g51);
	g12.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc6, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g52);
	g12.addProduction(globalSE115, g69);
	g12.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g13.addProduction(globalSE113, g85);
	g14.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc0, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g53);
	g15.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc122, g16), g91);
	g15.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc124, g18), g91);
	g15.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc126, g9), g91);
	g15.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc118, g18), g91);
	g15.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc117, g18), g91);
	g15.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g91);
	g16.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc121, g9), g88);
	g17.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.IntegerDatatype(qnc43)), g69);
	g18.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BinaryBase64Datatype(qnc27)), g69);
	g19.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc87, g18), g93);
	g19.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc88, g18), g94);
	g20.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc99, g18), g96);
	g21.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g54);
	g21.addProduction(globalSE93, g103);
	g22.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g55);
	g22.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc5, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g56);
	g22.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc6, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g57);
	g22.addProduction(globalSE115, g100);
	g22.addProduction(globalSE64, g101);
	g23.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc1, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g58);
	g23.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g59);
	g23.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc3, new com.siemens.ct.exi.datatype.StringDatatype(qnc52)), g49);
	g23.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g23.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g23.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g67);
	g24.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g60);
	g24.addProduction(globalSE111, g108);
	g25.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g61);
	g25.addProduction(globalSE59, g105);
	g26.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc0, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g62);
	g27.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.IntegerDatatype(qnc71)), g69);
	g28.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g63);
	g28.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BinaryBase64Datatype(qnc27)), g69);
	g29.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g64);
	g29.addProduction(globalSE106, g113);
	g30.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g65);
	g30.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc4, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g66);
	g31.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.ListDatatype(new com.siemens.ct.exi.datatype.StringDatatype(qnc14), qnc13)), g69);
	g32.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.StringDatatype(qnc14)), g69);
	g33.addProduction(new com.siemens.ct.exi.grammars.event.AttributeGeneric(), g33);
	g33.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g33.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g33.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g67);
	g34.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BooleanDatatype(qnc28)), g69);
	g35.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.NBitUnsignedIntegerDatatype(com.siemens.ct.exi.values.IntegerValue.valueOf(-128), com.siemens.ct.exi.values.IntegerValue.valueOf(127), qnc29)), g69);
	g36.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.date, qnc30)), g69);
	g37.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.dateTime, qnc31)), g69);
	g38.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DecimalDatatype(qnc32)), g69);
	g39.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.FloatDatatype(qnc33)), g69);
	g40.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gDay, qnc36)), g69);
	g41.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gMonth, qnc37)), g69);
	g42.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gMonthDay, qnc38)), g69);
	g43.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gYear, qnc39)), g69);
	g44.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gYearMonth, qnc40)), g69);
	g45.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BinaryHexDatatype(qnc41)), g69);
	g46.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.UnsignedIntegerDatatype(qnc47)), g69);
	g47.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.time, qnc53)), g69);
	g48.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.NBitUnsignedIntegerDatatype(com.siemens.ct.exi.values.IntegerValue.valueOf(0), com.siemens.ct.exi.values.IntegerValue.valueOf(255), qnc55)), g69);
	g49.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g49.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g49.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g67);
	g50.addProduction(globalSE75, g79);
	g50.addProduction(globalSE76, g79);
	g50.addProduction(globalSE95, g79);
	g50.addProduction(globalSE119, g79);
	g50.addProduction(globalSE85, g79);
	g50.addProduction(globalSE97, g79);
	g50.addProduction(globalSE80, g79);
	g50.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g79);
	g50.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g99);
	g51.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc6, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g52);
	g51.addProduction(globalSE115, g69);
	g51.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g52.addProduction(globalSE115, g69);
	g52.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g53.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc127, g9), g84);
	g53.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g84);
	g53.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g53.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g84);
	g54.addProduction(globalSE93, g103);
	g55.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc5, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g56);
	g55.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc6, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g57);
	g55.addProduction(globalSE115, g100);
	g55.addProduction(globalSE64, g101);
	g56.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc6, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g57);
	g56.addProduction(globalSE115, g100);
	g56.addProduction(globalSE64, g101);
	g57.addProduction(globalSE115, g100);
	g57.addProduction(globalSE64, g101);
	g58.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc2, new com.siemens.ct.exi.datatype.StringDatatype(qnc15)), g59);
	g58.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc3, new com.siemens.ct.exi.datatype.StringDatatype(qnc52)), g49);
	g58.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g58.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g58.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g67);
	g59.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc3, new com.siemens.ct.exi.datatype.StringDatatype(qnc52)), g49);
	g59.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g59.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g59.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g67);
	g60.addProduction(globalSE111, g108);
	g61.addProduction(globalSE59, g105);
	g62.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc70, g27), g67);
	g62.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g62.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g62.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g106);
	g63.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BinaryBase64Datatype(qnc27)), g69);
	g64.addProduction(globalSE106, g113);
	g65.addProduction(new com.siemens.ct.exi.grammars.event.Attribute(qnc4, new com.siemens.ct.exi.datatype.StringDatatype(qnc26)), g66);
	g66.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g66.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g112);
	g67.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g67.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g67.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g67);
	g69.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g70.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BinaryBase64Datatype(qnc61)), g69);
	g71.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc90, g7), g72);
	g72.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc69, g7), g73);
	g72.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc128, g7), g74);
	g73.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc128, g7), g74);
	g74.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc72, g7), g75);
	g74.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc100, g7), g76);
	g74.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g75.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc100, g7), g76);
	g75.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g76.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc89, g7), g69);
	g77.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc84, g7), g71);
	g77.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc69, g7), g73);
	g77.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc128, g7), g74);
	g78.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.StringDatatype(qnc52)), g69);
	g79.addProduction(globalSE75, g79);
	g79.addProduction(globalSE76, g79);
	g79.addProduction(globalSE95, g79);
	g79.addProduction(globalSE119, g79);
	g79.addProduction(globalSE85, g79);
	g79.addProduction(globalSE97, g79);
	g79.addProduction(globalSE80, g79);
	g79.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g79);
	g79.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g79.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g79);
	g80.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g80.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g80);
	g81.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc68, g7), g69);
	g82.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc81, g7), g81);
	g83.addProduction(globalSE62, g80);
	g83.addProduction(globalSE91, g80);
	g83.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g80);
	g83.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g83);
	g84.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc127, g9), g84);
	g84.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g84);
	g84.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g84.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g84);
	g85.addProduction(globalSE113, g85);
	g85.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g86.addProduction(globalSE113, g85);
	g87.addProduction(globalSE115, g69);
	g87.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g88.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc125, g17), g69);
	g89.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.IntegerDatatype(qnc43)), g69);
	g90.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc121, g9), g88);
	g91.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc122, g16), g91);
	g91.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc124, g18), g91);
	g91.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc126, g9), g91);
	g91.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc118, g18), g91);
	g91.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc117, g18), g91);
	g91.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g91);
	g91.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g92.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc122, g16), g91);
	g92.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc124, g18), g91);
	g92.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc126, g9), g91);
	g92.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc118, g18), g91);
	g92.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc117, g18), g91);
	g92.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g91);
	g93.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc88, g18), g94);
	g93.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g94);
	g93.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g94.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g94);
	g94.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g95.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc87, g18), g93);
	g95.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc88, g18), g94);
	g96.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc99, g18), g96);
	g96.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g97);
	g96.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g97.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc99, g18), g96);
	g97.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g98.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc99, g18), g96);
	g99.addProduction(globalSE75, g79);
	g99.addProduction(globalSE76, g79);
	g99.addProduction(globalSE95, g79);
	g99.addProduction(globalSE119, g79);
	g99.addProduction(globalSE85, g79);
	g99.addProduction(globalSE97, g79);
	g99.addProduction(globalSE80, g79);
	g99.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g79);
	g99.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g99);
	g100.addProduction(globalSE64, g101);
	g101.addProduction(globalSE66, g69);
	g102.addProduction(globalSE115, g100);
	g102.addProduction(globalSE64, g101);
	g103.addProduction(globalSE93, g103);
	g103.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g104.addProduction(globalSE93, g103);
	g105.addProduction(globalSE102, g104);
	g106.addProduction(new com.siemens.ct.exi.grammars.event.StartElement(qnc70, g27), g67);
	g106.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g106.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g106.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g106);
	g107.addProduction(globalSE59, g105);
	g108.addProduction(globalSE109, g109);
	g109.addProduction(globalSE73, g110);
	g109.addProduction(globalSE82, g110);
	g109.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g110.addProduction(globalSE82, g110);
	g110.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g111.addProduction(globalSE111, g108);
	g112.addProduction(new com.siemens.ct.exi.grammars.event.StartElementGeneric(), g67);
	g112.addProduction(new com.siemens.ct.exi.grammars.event.CharactersGeneric(), g112);
	g113.addProduction(globalSE106, g113);
	g113.addProduction(new com.siemens.ct.exi.grammars.event.EndElement(), g68);
	g114.addProduction(globalSE106, g113);
	g115.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.ListDatatype(new com.siemens.ct.exi.datatype.StringDatatype(qnc14), qnc13)), g69);
	g116.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BooleanDatatype(qnc28)), g69);
	g117.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.NBitUnsignedIntegerDatatype(com.siemens.ct.exi.values.IntegerValue.valueOf(-128), com.siemens.ct.exi.values.IntegerValue.valueOf(127), qnc29)), g69);
	g118.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.date, qnc30)), g69);
	g119.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.dateTime, qnc31)), g69);
	g120.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DecimalDatatype(qnc32)), g69);
	g121.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.FloatDatatype(qnc33)), g69);
	g122.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gDay, qnc36)), g69);
	g123.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gMonth, qnc37)), g69);
	g124.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gMonthDay, qnc38)), g69);
	g125.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gYear, qnc39)), g69);
	g126.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.gYearMonth, qnc40)), g69);
	g127.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.BinaryHexDatatype(qnc41)), g69);
	g128.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.UnsignedIntegerDatatype(qnc47)), g69);
	g129.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.DatetimeDatatype(com.siemens.ct.exi.types.DateTimeType.time, qnc53)), g69);
	g130.addProduction(new com.siemens.ct.exi.grammars.event.Characters(new com.siemens.ct.exi.datatype.NBitUnsignedIntegerDatatype(com.siemens.ct.exi.values.IntegerValue.valueOf(0), com.siemens.ct.exi.values.IntegerValue.valueOf(255), qnc55)), g69);
	/* END Grammar Events ----- */

	}
	
	void initFirstStartGrammars() {
			/* BEGIN FirstStartGrammar ----- */
	g5.setElementContentGrammar(g67);
	g6.setElementContentGrammar(g77);
	g7.setElementContentGrammar(g70);
	g8.setElementContentGrammar(g99);
	g9.setElementContentGrammar(g78);
	g9.setTypeCastable(true);
	g10.setElementContentGrammar(g83);
	g11.setElementContentGrammar(g82);
	g12.setElementContentGrammar(g87);
	g13.setElementContentGrammar(g86);
	g14.setElementContentGrammar(g84);
	g15.setElementContentGrammar(g92);
	g16.setElementContentGrammar(g90);
	g17.setElementContentGrammar(g89);
	g17.setTypeCastable(true);
	g18.setElementContentGrammar(g70);
	g18.setTypeCastable(true);
	g19.setElementContentGrammar(g95);
	g20.setElementContentGrammar(g98);
	g21.setElementContentGrammar(g104);
	g22.setElementContentGrammar(g102);
	g23.setElementContentGrammar(g67);
	g24.setElementContentGrammar(g111);
	g25.setElementContentGrammar(g107);
	g26.setElementContentGrammar(g106);
	g27.setElementContentGrammar(g89);
	g28.setElementContentGrammar(g7);
	g29.setElementContentGrammar(g114);
	g30.setElementContentGrammar(g112);
	g31.setElementContentGrammar(g115);
	g32.setElementContentGrammar(g78);
	g33.setElementContentGrammar(g67);
	g34.setElementContentGrammar(g116);
	g35.setElementContentGrammar(g117);
	g36.setElementContentGrammar(g118);
	g37.setElementContentGrammar(g119);
	g38.setElementContentGrammar(g120);
	g39.setElementContentGrammar(g121);
	g40.setElementContentGrammar(g122);
	g41.setElementContentGrammar(g123);
	g42.setElementContentGrammar(g124);
	g43.setElementContentGrammar(g125);
	g44.setElementContentGrammar(g126);
	g45.setElementContentGrammar(g127);
	g46.setElementContentGrammar(g128);
	g47.setElementContentGrammar(g129);
	g48.setElementContentGrammar(g130);
	/* END FirstStartGrammar ----- */

	}
	
	public EXIficient_xmldsig_core_schema() {
		initGlobalElements();
		initGlobalAttributes();
		initTypeGrammars();
		initGrammarEvents();
		initFirstStartGrammars();
	}
	

	public boolean isSchemaInformed() {
		return true;
	}

	public String getSchemaId() {
		return schemaId;
	}

	public void setSchemaId(String schemaId) throws UnsupportedOption {
		this.schemaId = schemaId;
	}

	public boolean isBuiltInXMLSchemaTypesOnly() {
		return false;
	}

	public Grammar getDocumentGrammar() {
		return g0;
	}

	public Grammar getFragmentGrammar() {
		return g3;
	}
	

	
	public GrammarContext getGrammarContext() {
		return gc;
	}

}
