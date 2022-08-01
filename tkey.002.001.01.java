// TKEY7 iso20022

package schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlElement(required = true, name = "Document")
public class Document {
	protected Document Document;
}

// Max35Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max35Text")
public class Max35Text {
	protected String Max35Text;
}

// ISODateTime 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ISODateTime")
public class ISODateTime {
	protected String ISODateTime;
}

// BatchBookingIndicator 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "BatchBookingIndicator")
public class BatchBookingIndicator {
	protected Boolean BatchBookingIndicator;
}

// Max15NumericText 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max15NumericText")
public class Max15NumericText {
	protected String Max15NumericText;
}

// DecimalNumber 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DecimalNumber")
public class DecimalNumber {
	protected Float DecimalNumber;
}

// ActiveCurrencyAndAmount_SimpleType 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ActiveCurrencyAndAmount_SimpleType")
public class ActiveCurrencyAndAmount_SimpleType {
	protected Float ActiveCurrencyAndAmount_SimpleType;
}

// ActiveCurrencyAndAmount 
public class ActiveCurrencyAndAmount {
	@XmlAttribute(name = "Ccy", required = true)
	protected String CcyAttr;
	@XmlValue
	protected Float value;
}

// ActiveCurrencyCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ActiveCurrencyCode")
public class ActiveCurrencyCode {
	protected String ActiveCurrencyCode;
}

// ISODate 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ISODate")
public class ISODate {
	protected String ISODate;
}

// SettlementInstruction4 
public class SettlementInstruction4 {
	@XmlElement(required = true, name = "SttlmMtd")
	protected String SttlmMtd;
	@XmlElement(required = true, name = "SttlmAcct")
	protected CashAccount24 SttlmAcct;
	@XmlElement(required = true, name = "ClrSys")
	protected ClearingSystemIdentification3Choice ClrSys;
	@XmlElement(required = true, name = "InstgRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification5 InstgRmbrsmntAgt;
	@XmlElement(required = true, name = "InstgRmbrsmntAgtAcct")
	protected CashAccount24 InstgRmbrsmntAgtAcct;
	@XmlElement(required = true, name = "InstdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification5 InstdRmbrsmntAgt;
	@XmlElement(required = true, name = "InstdRmbrsmntAgtAcct")
	protected CashAccount24 InstdRmbrsmntAgtAcct;
	@XmlElement(required = true, name = "ThrdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification5 ThrdRmbrsmntAgt;
	@XmlElement(required = true, name = "ThrdRmbrsmntAgtAcct")
	protected CashAccount24 ThrdRmbrsmntAgtAcct;
}

// SettlementMethod1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "SettlementMethod1Code")
public class SettlementMethod1Code {
	protected String SettlementMethod1Code;
}

// ClearingSystemIdentification3Choice 
public class ClearingSystemIdentification3Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalCashClearingSystem1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalCashClearingSystem1Code")
public class ExternalCashClearingSystem1Code {
	protected String ExternalCashClearingSystem1Code;
}

// CashAccount24 
public class CashAccount24 {
	@XmlElement(required = true, name = "Id")
	protected AccountIdentification4Choice Id;
	@XmlElement(required = true, name = "Tp")
	protected CashAccountType2Choice Tp;
	@XmlElement(required = true, name = "Ccy")
	protected String Ccy;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
}

// AccountIdentification4Choice 
public class AccountIdentification4Choice {
	@XmlElement(required = true, name = "IBAN")
	protected String IBAN;
	@XmlElement(required = true, name = "Othr")
	protected GenericAccountIdentification1 Othr;
}

// IBAN2007Identifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "IBAN2007Identifier")
public class IBAN2007Identifier {
	protected String IBAN2007Identifier;
}

// GenericAccountIdentification1 
public class GenericAccountIdentification1 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "SchmeNm")
	protected AccountSchemeName1Choice SchmeNm;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// Max34Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max34Text")
public class Max34Text {
	protected String Max34Text;
}

// AccountSchemeName1Choice 
public class AccountSchemeName1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalAccountIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalAccountIdentification1Code")
public class ExternalAccountIdentification1Code {
	protected String ExternalAccountIdentification1Code;
}

// CashAccountType2Choice 
public class CashAccountType2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalCashAccountType1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalCashAccountType1Code")
public class ExternalCashAccountType1Code {
	protected String ExternalCashAccountType1Code;
}

// ActiveOrHistoricCurrencyCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ActiveOrHistoricCurrencyCode")
public class ActiveOrHistoricCurrencyCode {
	protected String ActiveOrHistoricCurrencyCode;
}

// Max70Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max70Text")
public class Max70Text {
	protected String Max70Text;
}

// BranchAndFinancialInstitutionIdentification5 
public class BranchAndFinancialInstitutionIdentification5 {
	@XmlElement(required = true, name = "FinInstnId")
	protected FinancialInstitutionIdentification8 FinInstnId;
	@XmlElement(required = true, name = "BrnchId")
	protected BranchData2 BrnchId;
}

// FinancialInstitutionIdentification8 
public class FinancialInstitutionIdentification8 {
	@XmlElement(required = true, name = "BICFI")
	protected String BICFI;
	@XmlElement(required = true, name = "ClrSysMmbId")
	protected ClearingSystemMemberIdentification2 ClrSysMmbId;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress6 PstlAdr;
	@XmlElement(required = true, name = "Othr")
	protected GenericFinancialIdentification1 Othr;
}

// BICFIIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "BICFIIdentifier")
public class BICFIIdentifier {
	protected String BICFIIdentifier;
}

// ClearingSystemMemberIdentification2 
public class ClearingSystemMemberIdentification2 {
	@XmlElement(required = true, name = "ClrSysId")
	protected ClearingSystemIdentification2Choice ClrSysId;
	@XmlElement(required = true, name = "MmbId")
	protected String MmbId;
}

// ClearingSystemIdentification2Choice 
public class ClearingSystemIdentification2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalClearingSystemIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalClearingSystemIdentification1Code")
public class ExternalClearingSystemIdentification1Code {
	protected String ExternalClearingSystemIdentification1Code;
}

// Max140Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max140Text")
public class Max140Text {
	protected String Max140Text;
}

// PostalAddress6 
public class PostalAddress6 {
	@XmlElement(required = true, name = "AdrTp")
	protected String AdrTp;
	@XmlElement(required = true, name = "Dept")
	protected String Dept;
	@XmlElement(required = true, name = "SubDept")
	protected String SubDept;
	@XmlElement(required = true, name = "StrtNm")
	protected String StrtNm;
	@XmlElement(required = true, name = "BldgNb")
	protected String BldgNb;
	@XmlElement(required = true, name = "PstCd")
	protected String PstCd;
	@XmlElement(required = true, name = "TwnNm")
	protected String TwnNm;
	@XmlElement(required = true, name = "CtrySubDvsn")
	protected String CtrySubDvsn;
	@XmlElement(required = true, name = "Ctry")
	protected String Ctry;
	@XmlElement(required = true, name = "AdrLine")
	protected List<String> AdrLine;
}

// AddressType2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "AddressType2Code")
public class AddressType2Code {
	protected String AddressType2Code;
}

// Max16Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max16Text")
public class Max16Text {
	protected String Max16Text;
}

// CountryCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CountryCode")
public class CountryCode {
	protected String CountryCode;
}

// GenericFinancialIdentification1 
public class GenericFinancialIdentification1 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "SchmeNm")
	protected FinancialIdentificationSchemeName1Choice SchmeNm;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// FinancialIdentificationSchemeName1Choice 
public class FinancialIdentificationSchemeName1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalFinancialInstitutionIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalFinancialInstitutionIdentification1Code")
public class ExternalFinancialInstitutionIdentification1Code {
	protected String ExternalFinancialInstitutionIdentification1Code;
}

// BranchData2 
public class BranchData2 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress6 PstlAdr;
}

// PaymentTypeInformation21 
public class PaymentTypeInformation21 {
	@XmlElement(required = true, name = "InstrPrty")
	protected String InstrPrty;
	@XmlElement(required = true, name = "ClrChanl")
	protected String ClrChanl;
	@XmlElement(required = true, name = "SvcLvl")
	protected ServiceLevel8Choice SvcLvl;
	@XmlElement(required = true, name = "LclInstrm")
	protected LocalInstrument2Choice LclInstrm;
	@XmlElement(required = true, name = "CtgyPurp")
	protected CategoryPurpose1Choice CtgyPurp;
}

// Priority2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Priority2Code")
public class Priority2Code {
	protected String Priority2Code;
}

// ClearingChannel2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ClearingChannel2Code")
public class ClearingChannel2Code {
	protected String ClearingChannel2Code;
}

// ServiceLevel8Choice 
public class ServiceLevel8Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalServiceLevel1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalServiceLevel1Code")
public class ExternalServiceLevel1Code {
	protected String ExternalServiceLevel1Code;
}

// LocalInstrument2Choice 
public class LocalInstrument2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalLocalInstrument1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalLocalInstrument1Code")
public class ExternalLocalInstrument1Code {
	protected String ExternalLocalInstrument1Code;
}

// CategoryPurpose1Choice 
public class CategoryPurpose1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalCategoryPurpose1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalCategoryPurpose1Code")
public class ExternalCategoryPurpose1Code {
	protected String ExternalCategoryPurpose1Code;
}

// GroupHeader70 
public class GroupHeader70 {
	@XmlElement(required = true, name = "MsgId")
	protected String MsgId;
	@XmlElement(required = true, name = "CreDtTm")
	protected String CreDtTm;
	@XmlElement(required = true, name = "BtchBookg")
	protected Boolean BtchBookg;
	@XmlElement(required = true, name = "NbOfTxs")
	protected String NbOfTxs;
	@XmlElement(required = true, name = "CtrlSum")
	protected Float CtrlSum;
	@XmlElement(required = true, name = "TtlIntrBkSttlmAmt")
	protected ActiveCurrencyAndAmount TtlIntrBkSttlmAmt;
	@XmlElement(required = true, name = "IntrBkSttlmDt")
	protected String IntrBkSttlmDt;
	@XmlElement(required = true, name = "SttlmInf")
	protected SettlementInstruction4 SttlmInf;
	@XmlElement(required = true, name = "PmtTpInf")
	protected PaymentTypeInformation21 PmtTpInf;
	@XmlElement(required = true, name = "InstgAgt")
	protected BranchAndFinancialInstitutionIdentification5 InstgAgt;
	@XmlElement(required = true, name = "InstdAgt")
	protected BranchAndFinancialInstitutionIdentification5 InstdAgt;
}

// TransactionSettlementNotificationV01 
public class TransactionSettlementNotificationV01 {
	@XmlElement(required = true, name = "GrpHdr")
	protected GroupHeader70 GrpHdr;
	@XmlElement(required = true, name = "TxSttlmInf")
	protected List<TransactionSettlementInformation1> TxSttlmInf;
}

// TransactionSettlementInformation1 
public class TransactionSettlementInformation1 {
	@XmlElement(required = true, name = "OrgnlGrpInf")
	protected OriginalGroupInformation3 OrgnlGrpInf;
	@XmlElement(required = true, name = "TxInf")
	protected List<PaymentTransactionInformation2> TxInf;
}

// PaymentTransactionInformation2 
public class PaymentTransactionInformation2 {
	@XmlElement(required = true, name = "SttlmId")
	protected String SttlmId;
	@XmlElement(required = true, name = "OrgnlInstrId")
	protected String OrgnlInstrId;
	@XmlElement(required = true, name = "OrgnlEndToEndId")
	protected String OrgnlEndToEndId;
	@XmlElement(required = true, name = "OrgnlTxId")
	protected String OrgnlTxId;
	@XmlElement(required = true, name = "ActlSttlmAmt")
	protected CurrencyAndAmount ActlSttlmAmt;
	@XmlElement(required = true, name = "OrgnlTxRef")
	protected OriginalTransactionReference1 OrgnlTxRef;
}

// CurrencyAndAmount 
public class CurrencyAndAmount extends Float  {
	@XmlAttribute(name = "Ccy", required = true)
	protected String CcyAttr;
}

// OriginalGroupInformation3 
public class OriginalGroupInformation3 {
	@XmlElement(required = true, name = "OrgnlMsgId")
	protected String OrgnlMsgId;
	@XmlElement(required = true, name = "OrgnlMsgNmId")
	protected String OrgnlMsgNmId;
	@XmlElement(required = true, name = "OrgnlCreDtTm")
	protected String OrgnlCreDtTm;
}

// CurrencyAndAmount_SimpleType 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CurrencyAndAmount_SimpleType")
public class CurrencyAndAmount_SimpleType {
	protected Float CurrencyAndAmount_SimpleType;
}

// CurrencyCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CurrencyCode")
public class CurrencyCode {
	protected String CurrencyCode;
}

// OriginalTransactionReference1 
public class OriginalTransactionReference1 {
	@XmlElement(required = true, name = "IntrBkSttlmAmt")
	protected CurrencyAndAmount IntrBkSttlmAmt;
	@XmlElement(required = true, name = "Amt")
	protected AmountType2Choice Amt;
	@XmlElement(required = true, name = "IntrBkSttlmDt")
	protected String IntrBkSttlmDt;
	@XmlElement(required = true, name = "ReqdExctnDt")
	protected String ReqdExctnDt;
	@XmlElement(required = true, name = "ReqdColltnDt")
	protected String ReqdColltnDt;
	@XmlElement(required = true, name = "CdtrSchmeId")
	protected PartyIdentification8 CdtrSchmeId;
	@XmlElement(required = true, name = "SttlmInf")
	protected SettlementInformation3 SttlmInf;
	@XmlElement(required = true, name = "PmtTpInf")
	protected PaymentTypeInformation6 PmtTpInf;
	@XmlElement(required = true, name = "PmtMtd")
	protected String PmtMtd;
	@XmlElement(required = true, name = "MndtRltdInf")
	protected MandateRelatedInformation1 MndtRltdInf;
	@XmlElement(required = true, name = "RmtInf")
	protected RemittanceInformation1 RmtInf;
	@XmlElement(required = true, name = "UltmtDbtr")
	protected PartyIdentification8 UltmtDbtr;
	@XmlElement(required = true, name = "Dbtr")
	protected PartyIdentification8 Dbtr;
	@XmlElement(required = true, name = "DbtrAcct")
	protected CashAccount7 DbtrAcct;
	@XmlElement(required = true, name = "DbtrAgt")
	protected BranchAndFinancialInstitutionIdentification3 DbtrAgt;
	@XmlElement(required = true, name = "DbtrAgtAcct")
	protected CashAccount7 DbtrAgtAcct;
	@XmlElement(required = true, name = "CdtrAgt")
	protected BranchAndFinancialInstitutionIdentification3 CdtrAgt;
	@XmlElement(required = true, name = "CdtrAgtAcct")
	protected CashAccount7 CdtrAgtAcct;
	@XmlElement(required = true, name = "Cdtr")
	protected PartyIdentification8 Cdtr;
	@XmlElement(required = true, name = "CdtrAcct")
	protected CashAccount7 CdtrAcct;
	@XmlElement(required = true, name = "UltmtCdtr")
	protected PartyIdentification8 UltmtCdtr;
}

// AmountType2Choice 
public class AmountType2Choice {
	@XmlElement(required = true, name = "InstdAmt")
	protected CurrencyAndAmount InstdAmt;
	@XmlElement(required = true, name = "EqvtAmt")
	protected EquivalentAmount EqvtAmt;
}

// EquivalentAmount 
public class EquivalentAmount {
	@XmlElement(required = true, name = "Amt")
	protected CurrencyAndAmount Amt;
	@XmlElement(required = true, name = "CcyOfTrf")
	protected String CcyOfTrf;
}

// PartyIdentification8 
public class PartyIdentification8 {
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress1 PstlAdr;
	@XmlElement(required = true, name = "Id")
	protected Party2Choice Id;
	@XmlElement(required = true, name = "CtryOfRes")
	protected String CtryOfRes;
}

// PostalAddress1 
public class PostalAddress1 {
	@XmlElement(required = true, name = "AdrTp")
	protected String AdrTp;
	@XmlElement(required = true, name = "AdrLine")
	protected List<String> AdrLine;
	@XmlElement(required = true, name = "StrtNm")
	protected String StrtNm;
	@XmlElement(required = true, name = "BldgNb")
	protected String BldgNb;
	@XmlElement(required = true, name = "PstCd")
	protected String PstCd;
	@XmlElement(required = true, name = "TwnNm")
	protected String TwnNm;
	@XmlElement(required = true, name = "CtrySubDvsn")
	protected String CtrySubDvsn;
	@XmlElement(required = true, name = "Ctry")
	protected String Ctry;
}

// Party2Choice 
public class Party2Choice {
	@XmlElement(required = true, name = "OrgId")
	protected OrganisationIdentification2 OrgId;
	@XmlElement(required = true, name = "PrvtId")
	protected List<PersonIdentification3> PrvtId;
}

// OrganisationIdentification2 
public class OrganisationIdentification2 {
	@XmlElement(required = true, name = "BIC")
	protected String BIC;
	@XmlElement(required = true, name = "IBEI")
	protected String IBEI;
	@XmlElement(required = true, name = "BEI")
	protected String BEI;
	@XmlElement(required = true, name = "EANGLN")
	protected String EANGLN;
	@XmlElement(required = true, name = "USCHU")
	protected String USCHU;
	@XmlElement(required = true, name = "DUNS")
	protected String DUNS;
	@XmlElement(required = true, name = "BkPtyId")
	protected String BkPtyId;
	@XmlElement(required = true, name = "TaxIdNb")
	protected String TaxIdNb;
	@XmlElement(required = true, name = "PrtryId")
	protected GenericIdentification3 PrtryId;
}

// BICIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "BICIdentifier")
public class BICIdentifier {
	protected String BICIdentifier;
}

// IBEIIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "IBEIIdentifier")
public class IBEIIdentifier {
	protected String IBEIIdentifier;
}

// BEIIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "BEIIdentifier")
public class BEIIdentifier {
	protected String BEIIdentifier;
}

// EANGLNIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "EANGLNIdentifier")
public class EANGLNIdentifier {
	protected String EANGLNIdentifier;
}

// CHIPSUniversalIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CHIPSUniversalIdentifier")
public class CHIPSUniversalIdentifier {
	protected String CHIPSUniversalIdentifier;
}

// DunsIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DunsIdentifier")
public class DunsIdentifier {
	protected String DunsIdentifier;
}

// GenericIdentification3 
public class GenericIdentification3 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// PersonIdentification3 
public class PersonIdentification3 {
	@XmlElement(required = true, name = "DrvrsLicNb")
	protected String DrvrsLicNb;
	@XmlElement(required = true, name = "CstmrNb")
	protected String CstmrNb;
	@XmlElement(required = true, name = "SclSctyNb")
	protected String SclSctyNb;
	@XmlElement(required = true, name = "AlnRegnNb")
	protected String AlnRegnNb;
	@XmlElement(required = true, name = "PsptNb")
	protected String PsptNb;
	@XmlElement(required = true, name = "TaxIdNb")
	protected String TaxIdNb;
	@XmlElement(required = true, name = "IdntyCardNb")
	protected String IdntyCardNb;
	@XmlElement(required = true, name = "MplyrIdNb")
	protected String MplyrIdNb;
	@XmlElement(required = true, name = "DtAndPlcOfBirth")
	protected DateAndPlaceOfBirth DtAndPlcOfBirth;
	@XmlElement(required = true, name = "OthrId")
	protected GenericIdentification4 OthrId;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// DateAndPlaceOfBirth 
public class DateAndPlaceOfBirth {
	@XmlElement(required = true, name = "BirthDt")
	protected String BirthDt;
	@XmlElement(required = true, name = "PrvcOfBirth")
	protected String PrvcOfBirth;
	@XmlElement(required = true, name = "CityOfBirth")
	protected String CityOfBirth;
	@XmlElement(required = true, name = "CtryOfBirth")
	protected String CtryOfBirth;
}

// GenericIdentification4 
public class GenericIdentification4 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "IdTp")
	protected String IdTp;
}

// SettlementInformation3 
public class SettlementInformation3 {
	@XmlElement(required = true, name = "SttlmMtd")
	protected String SttlmMtd;
	@XmlElement(required = true, name = "SttlmAcct")
	protected CashAccount7 SttlmAcct;
	@XmlElement(required = true, name = "ClrSys")
	protected ClearingSystemIdentification1Choice ClrSys;
	@XmlElement(required = true, name = "InstgRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification3 InstgRmbrsmntAgt;
	@XmlElement(required = true, name = "InstgRmbrsmntAgtAcct")
	protected CashAccount7 InstgRmbrsmntAgtAcct;
	@XmlElement(required = true, name = "InstdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification3 InstdRmbrsmntAgt;
	@XmlElement(required = true, name = "InstdRmbrsmntAgtAcct")
	protected CashAccount7 InstdRmbrsmntAgtAcct;
	@XmlElement(required = true, name = "ThrdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification3 ThrdRmbrsmntAgt;
	@XmlElement(required = true, name = "ThrdRmbrsmntAgtAcct")
	protected CashAccount7 ThrdRmbrsmntAgtAcct;
}

// CashAccount7 
public class CashAccount7 {
	@XmlElement(required = true, name = "Id")
	protected AccountIdentification3Choice Id;
	@XmlElement(required = true, name = "Tp")
	protected CashAccountType2 Tp;
	@XmlElement(required = true, name = "Ccy")
	protected String Ccy;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
}

// AccountIdentification3Choice 
public class AccountIdentification3Choice {
	@XmlElement(required = true, name = "IBAN")
	protected String IBAN;
	@XmlElement(required = true, name = "BBAN")
	protected String BBAN;
	@XmlElement(required = true, name = "UPIC")
	protected String UPIC;
	@XmlElement(required = true, name = "PrtryAcct")
	protected SimpleIdentificationInformation2 PrtryAcct;
}

// IBANIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "IBANIdentifier")
public class IBANIdentifier {
	protected String IBANIdentifier;
}

// BBANIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "BBANIdentifier")
public class BBANIdentifier {
	protected String BBANIdentifier;
}

// UPICIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "UPICIdentifier")
public class UPICIdentifier {
	protected String UPICIdentifier;
}

// SimpleIdentificationInformation2 
public class SimpleIdentificationInformation2 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
}

// CashAccountType2 
public class CashAccountType2 {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// CashAccountType4Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CashAccountType4Code")
public class CashAccountType4Code {
	protected String CashAccountType4Code;
}

// ClearingSystemIdentification1Choice 
public class ClearingSystemIdentification1Choice {
	@XmlElement(required = true, name = "ClrSysId")
	protected String ClrSysId;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// CashClearingSystem3Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CashClearingSystem3Code")
public class CashClearingSystem3Code {
	protected String CashClearingSystem3Code;
}

// BranchAndFinancialInstitutionIdentification3 
public class BranchAndFinancialInstitutionIdentification3 {
	@XmlElement(required = true, name = "FinInstnId")
	protected FinancialInstitutionIdentification5Choice FinInstnId;
	@XmlElement(required = true, name = "BrnchId")
	protected BranchData BrnchId;
}

// FinancialInstitutionIdentification5Choice 
public class FinancialInstitutionIdentification5Choice {
	@XmlElement(required = true, name = "BIC")
	protected String BIC;
	@XmlElement(required = true, name = "ClrSysMmbId")
	protected ClearingSystemMemberIdentification3Choice ClrSysMmbId;
	@XmlElement(required = true, name = "NmAndAdr")
	protected NameAndAddress7 NmAndAdr;
	@XmlElement(required = true, name = "PrtryId")
	protected GenericIdentification3 PrtryId;
	@XmlElement(required = true, name = "CmbndId")
	protected FinancialInstitutionIdentification3 CmbndId;
}

// ClearingSystemMemberIdentification3Choice 
public class ClearingSystemMemberIdentification3Choice {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalClearingSystemMemberCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalClearingSystemMemberCode")
public class ExternalClearingSystemMemberCode {
	protected String ExternalClearingSystemMemberCode;
}

// NameAndAddress7 
public class NameAndAddress7 {
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress1 PstlAdr;
}

// FinancialInstitutionIdentification3 
public class FinancialInstitutionIdentification3 {
	@XmlElement(required = true, name = "BIC")
	protected String BIC;
	@XmlElement(required = true, name = "ClrSysMmbId")
	protected ClearingSystemMemberIdentification3Choice ClrSysMmbId;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress1 PstlAdr;
	@XmlElement(required = true, name = "PrtryId")
	protected GenericIdentification3 PrtryId;
}

// BranchData 
public class BranchData {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress1 PstlAdr;
}

// PaymentTypeInformation6 
public class PaymentTypeInformation6 {
	@XmlElement(required = true, name = "InstrPrty")
	protected String InstrPrty;
	@XmlElement(required = true, name = "SvcLvl")
	protected ServiceLevel2Choice SvcLvl;
	@XmlElement(required = true, name = "ClrChanl")
	protected String ClrChanl;
	@XmlElement(required = true, name = "LclInstrm")
	protected LocalInstrument1Choice LclInstrm;
	@XmlElement(required = true, name = "SeqTp")
	protected String SeqTp;
	@XmlElement(required = true, name = "CtgyPurp")
	protected String CtgyPurp;
}

// ServiceLevel2Choice 
public class ServiceLevel2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ServiceLevel1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ServiceLevel1Code")
public class ServiceLevel1Code {
	protected String ServiceLevel1Code;
}

// LocalInstrument1Choice 
public class LocalInstrument1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ExternalLocalInstrumentCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalLocalInstrumentCode")
public class ExternalLocalInstrumentCode {
	protected String ExternalLocalInstrumentCode;
}

// SequenceType1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "SequenceType1Code")
public class SequenceType1Code {
	protected String SequenceType1Code;
}

// PaymentCategoryPurpose1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "PaymentCategoryPurpose1Code")
public class PaymentCategoryPurpose1Code {
	protected String PaymentCategoryPurpose1Code;
}

// PaymentMethod4Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "PaymentMethod4Code")
public class PaymentMethod4Code {
	protected String PaymentMethod4Code;
}

// MandateRelatedInformation1 
public class MandateRelatedInformation1 {
	@XmlElement(required = true, name = "MndtId")
	protected String MndtId;
	@XmlElement(required = true, name = "DtOfSgntr")
	protected String DtOfSgntr;
	@XmlElement(required = true, name = "AmdmntInd")
	protected Boolean AmdmntInd;
	@XmlElement(required = true, name = "AmdmntInfDtls")
	protected AmendmentInformationDetails1 AmdmntInfDtls;
	@XmlElement(required = true, name = "ElctrncSgntr")
	protected String ElctrncSgntr;
	@XmlElement(required = true, name = "FrstColltnDt")
	protected String FrstColltnDt;
	@XmlElement(required = true, name = "FnlColltnDt")
	protected String FnlColltnDt;
	@XmlElement(required = true, name = "Frqcy")
	protected String Frqcy;
}

// TrueFalseIndicator 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "TrueFalseIndicator")
public class TrueFalseIndicator {
	protected Boolean TrueFalseIndicator;
}

// AmendmentInformationDetails1 
public class AmendmentInformationDetails1 {
	@XmlElement(required = true, name = "OrgnlMndtId")
	protected String OrgnlMndtId;
	@XmlElement(required = true, name = "OrgnlCdtrSchmeId")
	protected PartyIdentification8 OrgnlCdtrSchmeId;
	@XmlElement(required = true, name = "OrgnlCdtrAgt")
	protected BranchAndFinancialInstitutionIdentification3 OrgnlCdtrAgt;
	@XmlElement(required = true, name = "OrgnlCdtrAgtAcct")
	protected CashAccount7 OrgnlCdtrAgtAcct;
	@XmlElement(required = true, name = "OrgnlDbtr")
	protected PartyIdentification8 OrgnlDbtr;
	@XmlElement(required = true, name = "OrgnlDbtrAcct")
	protected CashAccount7 OrgnlDbtrAcct;
	@XmlElement(required = true, name = "OrgnlDbtrAgt")
	protected BranchAndFinancialInstitutionIdentification3 OrgnlDbtrAgt;
	@XmlElement(required = true, name = "OrgnlDbtrAgtAcct")
	protected CashAccount7 OrgnlDbtrAgtAcct;
	@XmlElement(required = true, name = "OrgnlFnlColltnDt")
	protected String OrgnlFnlColltnDt;
	@XmlElement(required = true, name = "OrgnlFrqcy")
	protected String OrgnlFrqcy;
}

// Frequency1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Frequency1Code")
public class Frequency1Code {
	protected String Frequency1Code;
}

// Max1025Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max1025Text")
public class Max1025Text {
	protected String Max1025Text;
}

// RemittanceInformation1 
public class RemittanceInformation1 {
	@XmlElement(required = true, name = "Ustrd")
	protected List<String> Ustrd;
	@XmlElement(required = true, name = "Strd")
	protected List<StructuredRemittanceInformation6> Strd;
}

// StructuredRemittanceInformation6 
public class StructuredRemittanceInformation6 {
	@XmlElement(required = true, name = "RfrdDocInf")
	protected ReferredDocumentInformation1 RfrdDocInf;
	@XmlElement(required = true, name = "RfrdDocRltdDt")
	protected String RfrdDocRltdDt;
	@XmlElement(required = true, name = "RfrdDocAmt")
	protected List<ReferredDocumentAmount1Choice> RfrdDocAmt;
	@XmlElement(required = true, name = "CdtrRefInf")
	protected CreditorReferenceInformation1 CdtrRefInf;
	@XmlElement(required = true, name = "Invcr")
	protected PartyIdentification8 Invcr;
	@XmlElement(required = true, name = "Invcee")
	protected PartyIdentification8 Invcee;
	@XmlElement(required = true, name = "AddtlRmtInf")
	protected String AddtlRmtInf;
}

// ReferredDocumentInformation1 
public class ReferredDocumentInformation1 {
	@XmlElement(required = true, name = "RfrdDocTp")
	protected ReferredDocumentType1 RfrdDocTp;
	@XmlElement(required = true, name = "RfrdDocNb")
	protected String RfrdDocNb;
}

// ReferredDocumentType1 
public class ReferredDocumentType1 {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// DocumentType2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DocumentType2Code")
public class DocumentType2Code {
	protected String DocumentType2Code;
}

// ReferredDocumentAmount1Choice 
public class ReferredDocumentAmount1Choice {
	@XmlElement(required = true, name = "DuePyblAmt")
	protected CurrencyAndAmount DuePyblAmt;
	@XmlElement(required = true, name = "DscntApldAmt")
	protected CurrencyAndAmount DscntApldAmt;
	@XmlElement(required = true, name = "RmtdAmt")
	protected CurrencyAndAmount RmtdAmt;
	@XmlElement(required = true, name = "CdtNoteAmt")
	protected CurrencyAndAmount CdtNoteAmt;
	@XmlElement(required = true, name = "TaxAmt")
	protected CurrencyAndAmount TaxAmt;
}

// CreditorReferenceInformation1 
public class CreditorReferenceInformation1 {
	@XmlElement(required = true, name = "CdtrRefTp")
	protected CreditorReferenceType1 CdtrRefTp;
	@XmlElement(required = true, name = "CdtrRef")
	protected String CdtrRef;
}

// CreditorReferenceType1 
public class CreditorReferenceType1 {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// DocumentType3Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DocumentType3Code")
public class DocumentType3Code {
	protected String DocumentType3Code;
}
