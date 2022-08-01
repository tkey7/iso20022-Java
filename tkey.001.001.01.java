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

// ExternalFinancialInstitutionIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalFinancialInstitutionIdentification1Code")
public class ExternalFinancialInstitutionIdentification1Code {
	protected String ExternalFinancialInstitutionIdentification1Code;
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

// SettlementMethod1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "SettlementMethod1Code")
public class SettlementMethod1Code {
	protected String SettlementMethod1Code;
}

// ExternalCashClearingSystem1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalCashClearingSystem1Code")
public class ExternalCashClearingSystem1Code {
	protected String ExternalCashClearingSystem1Code;
}

// IBAN2007Identifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "IBAN2007Identifier")
public class IBAN2007Identifier {
	protected String IBAN2007Identifier;
}

// Max34Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max34Text")
public class Max34Text {
	protected String Max34Text;
}

// ExternalAccountIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalAccountIdentification1Code")
public class ExternalAccountIdentification1Code {
	protected String ExternalAccountIdentification1Code;
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

// ClearingSystemIdentification3Choice 
public class ClearingSystemIdentification3Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
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

// GenericAccountIdentification1 
public class GenericAccountIdentification1 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "SchmeNm")
	protected AccountSchemeName1Choice SchmeNm;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// AccountSchemeName1Choice 
public class AccountSchemeName1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// CashAccountType2Choice 
public class CashAccountType2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
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

// FinancialIdentificationSchemeName1Choice 
public class FinancialIdentificationSchemeName1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
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

// CustomerIdentificationStatusNotificationV01 
public class CustomerIdentificationStatusNotificationV01 {
	@XmlElement(required = true, name = "GrpHdr")
	protected GroupHeader70 GrpHdr;
	@XmlElement(required = true, name = "AcctInfAndIdSts")
	protected List<AccountInformationAndIdentificationStatus1> AcctInfAndIdSts;
}

// AccountInformationAndIdentificationStatus1 
public class AccountInformationAndIdentificationStatus1 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "AcctIdInf")
	protected AccountIdentificationInformation1 AcctIdInf;
	@XmlElement(required = true, name = "CstmrIdInf")
	protected CustomerIdentificationInformation1 CstmrIdInf;
}

// AccountIdentificationInformation1 
public class AccountIdentificationInformation1 {
	@XmlElement(required = true, name = "AdrsngId")
	protected String AdrsngId;
	@XmlElement(required = true, name = "SttlmAcctId")
	protected String SttlmAcctId;
	@XmlElement(required = true, name = "NoteTp")
	protected String NoteTp;
	@XmlElement(required = true, name = "Note")
	protected String Note;
	@XmlElement(required = true, name = "CstmrAcctIdSts")
	protected String CstmrAcctIdSts;
	@XmlElement(required = true, name = "PmtId")
	protected PaymentIdentification3 PmtId;
}

// CustomerIdentificationInformation1 
public class CustomerIdentificationInformation1 {
	@XmlElement(required = true, name = "KYCSts")
	protected String KYCSts;
	@XmlElement(required = true, name = "AMLSts")
	protected String AMLSts;
	@XmlElement(required = true, name = "PIIInf")
	protected String PIIInf;
	@XmlElement(required = true, name = "PmtId")
	protected PaymentIdentification3 PmtId;
}

// PaymentIdentification3 
public class PaymentIdentification3 {
	@XmlElement(required = true, name = "InstrId")
	protected String InstrId;
	@XmlElement(required = true, name = "EndToEndId")
	protected String EndToEndId;
	@XmlElement(required = true, name = "TxId")
	protected String TxId;
	@XmlElement(required = true, name = "ClrSysRef")
	protected String ClrSysRef;
}

// NoteType1 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "NoteType1")
public class NoteType1 {
	protected String NoteType1;
}

// Note1 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Note1")
public class Note1 {
	protected String Note1;
}

// CustomerAccountIdentificationStatus1 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CustomerAccountIdentificationStatus1")
public class CustomerAccountIdentificationStatus1 {
	protected String CustomerAccountIdentificationStatus1;
}

// PersonallyIdentifiableInformationInfo1 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "PersonallyIdentifiableInformationInfo1")
public class PersonallyIdentifiableInformationInfo1 {
	protected String PersonallyIdentifiableInformationInfo1;
}

// KYCStatus1 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "KYCStatus1")
public class KYCStatus1 {
	protected String KYCStatus1;
}

// AMLStatus1 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "AMLStatus1")
public class AMLStatus1 {
	protected String AMLStatus1;
}

@XmlAccessorType(XmlAccessType.FIELD)
@XmlElement(required = true, name = "AddressingIdentification1")
public class AddressingIdentification1 {
	protected String AddressingIdentification1;
}

@XmlAccessorType(XmlAccessType.FIELD)
@XmlElement(required = true, name = "SettlementAccountIdentification1")
public class SettlementAccountIdentification1 {
	protected String SettlementAccountIdentification1;
}

// DateTimeString 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DateTimeString")
public class DateTimeString {
	protected String DateTimeString;
}

// DateString 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DateString")
public class DateString {
	protected String DateString;
}
