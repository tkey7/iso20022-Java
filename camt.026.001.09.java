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

// AMLIndicator 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "AMLIndicator")
public class AMLIndicator {
	protected Boolean AMLIndicator;
}

// AccountIdentification4Choice 
public class AccountIdentification4Choice {
	@XmlElement(required = true, name = "IBAN")
	protected String IBAN;
	@XmlElement(required = true, name = "Othr")
	protected GenericAccountIdentification1 Othr;
}

// AccountSchemeName1Choice 
public class AccountSchemeName1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ActiveOrHistoricCurrencyAndAmount_SimpleType 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ActiveOrHistoricCurrencyAndAmount_SimpleType")
public class ActiveOrHistoricCurrencyAndAmount_SimpleType {
	protected Float ActiveOrHistoricCurrencyAndAmount_SimpleType;
}

// ActiveOrHistoricCurrencyAndAmount 
public class ActiveOrHistoricCurrencyAndAmount {
	@XmlAttribute(name = "Ccy", required = true)
	protected String CcyAttr;
	@XmlValue
	protected Float value;
}

// ActiveOrHistoricCurrencyCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ActiveOrHistoricCurrencyCode")
public class ActiveOrHistoricCurrencyCode {
	protected String ActiveOrHistoricCurrencyCode;
}

// AddressType2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "AddressType2Code")
public class AddressType2Code {
	protected String AddressType2Code;
}

// AddressType3Choice 
public class AddressType3Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected GenericIdentification30 Prtry;
}

// AmendmentInformationDetails14 
public class AmendmentInformationDetails14 {
	@XmlElement(required = true, name = "OrgnlMndtId")
	protected String OrgnlMndtId;
	@XmlElement(required = true, name = "OrgnlCdtrSchmeId")
	protected PartyIdentification135 OrgnlCdtrSchmeId;
	@XmlElement(required = true, name = "OrgnlCdtrAgt")
	protected BranchAndFinancialInstitutionIdentification6 OrgnlCdtrAgt;
	@XmlElement(required = true, name = "OrgnlCdtrAgtAcct")
	protected CashAccount40 OrgnlCdtrAgtAcct;
	@XmlElement(required = true, name = "OrgnlDbtr")
	protected PartyIdentification135 OrgnlDbtr;
	@XmlElement(required = true, name = "OrgnlDbtrAcct")
	protected CashAccount40 OrgnlDbtrAcct;
	@XmlElement(required = true, name = "OrgnlDbtrAgt")
	protected BranchAndFinancialInstitutionIdentification6 OrgnlDbtrAgt;
	@XmlElement(required = true, name = "OrgnlDbtrAgtAcct")
	protected CashAccount40 OrgnlDbtrAgtAcct;
	@XmlElement(required = true, name = "OrgnlFnlColltnDt")
	protected String OrgnlFnlColltnDt;
	@XmlElement(required = true, name = "OrgnlFrqcy")
	protected Frequency36Choice OrgnlFrqcy;
	@XmlElement(required = true, name = "OrgnlRsn")
	protected MandateSetupReason1Choice OrgnlRsn;
	@XmlElement(required = true, name = "OrgnlTrckgDays")
	protected String OrgnlTrckgDays;
}

// AmountType4Choice 
public class AmountType4Choice {
	@XmlElement(required = true, name = "InstdAmt")
	protected ActiveOrHistoricCurrencyAndAmount InstdAmt;
	@XmlElement(required = true, name = "EqvtAmt")
	protected EquivalentAmount2 EqvtAmt;
}

// AnyBICDec2014Identifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "AnyBICDec2014Identifier")
public class AnyBICDec2014Identifier {
	protected String AnyBICDec2014Identifier;
}

// BICFIDec2014Identifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "BICFIDec2014Identifier")
public class BICFIDec2014Identifier {
	protected String BICFIDec2014Identifier;
}

// BranchAndFinancialInstitutionIdentification6 
public class BranchAndFinancialInstitutionIdentification6 {
	@XmlElement(required = true, name = "FinInstnId")
	protected FinancialInstitutionIdentification18 FinInstnId;
	@XmlElement(required = true, name = "BrnchId")
	protected BranchData3 BrnchId;
}

// BranchData3 
public class BranchData3 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "LEI")
	protected String LEI;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress24 PstlAdr;
}

// Case5 
public class Case5 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "Cretr")
	protected Party40Choice Cretr;
	@XmlElement(required = true, name = "ReopCaseIndctn")
	protected Boolean ReopCaseIndctn;
}

// CaseAssignment5 
public class CaseAssignment5 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "Assgnr")
	protected Party40Choice Assgnr;
	@XmlElement(required = true, name = "Assgne")
	protected Party40Choice Assgne;
	@XmlElement(required = true, name = "CreDtTm")
	protected String CreDtTm;
}

// CashAccount40 
public class CashAccount40 {
	@XmlElement(required = true, name = "Id")
	protected AccountIdentification4Choice Id;
	@XmlElement(required = true, name = "Tp")
	protected CashAccountType2Choice Tp;
	@XmlElement(required = true, name = "Ccy")
	protected String Ccy;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "Prxy")
	protected ProxyAccountIdentification1 Prxy;
}

// CashAccountType2Choice 
public class CashAccountType2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// CategoryPurpose1Choice 
public class CategoryPurpose1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ClearingChannel2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ClearingChannel2Code")
public class ClearingChannel2Code {
	protected String ClearingChannel2Code;
}

// ClearingSystemIdentification2Choice 
public class ClearingSystemIdentification2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ClearingSystemIdentification3Choice 
public class ClearingSystemIdentification3Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ClearingSystemMemberIdentification2 
public class ClearingSystemMemberIdentification2 {
	@XmlElement(required = true, name = "ClrSysId")
	protected ClearingSystemIdentification2Choice ClrSysId;
	@XmlElement(required = true, name = "MmbId")
	protected String MmbId;
}

// Contact4 
public class Contact4 {
	@XmlElement(required = true, name = "NmPrfx")
	protected String NmPrfx;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PhneNb")
	protected String PhneNb;
	@XmlElement(required = true, name = "MobNb")
	protected String MobNb;
	@XmlElement(required = true, name = "FaxNb")
	protected String FaxNb;
	@XmlElement(required = true, name = "EmailAdr")
	protected String EmailAdr;
	@XmlElement(required = true, name = "EmailPurp")
	protected String EmailPurp;
	@XmlElement(required = true, name = "JobTitl")
	protected String JobTitl;
	@XmlElement(required = true, name = "Rspnsblty")
	protected String Rspnsblty;
	@XmlElement(required = true, name = "Dept")
	protected String Dept;
	@XmlElement(required = true, name = "Othr")
	protected List<OtherContact1> Othr;
	@XmlElement(required = true, name = "PrefrdMtd")
	protected String PrefrdMtd;
}

// CountryCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CountryCode")
public class CountryCode {
	protected String CountryCode;
}

// CreditDebitCode 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CreditDebitCode")
public class CreditDebitCode {
	protected String CreditDebitCode;
}

// CreditTransferMandateData1 
public class CreditTransferMandateData1 {
	@XmlElement(required = true, name = "MndtId")
	protected String MndtId;
	@XmlElement(required = true, name = "Tp")
	protected MandateTypeInformation2 Tp;
	@XmlElement(required = true, name = "DtOfSgntr")
	protected String DtOfSgntr;
	@XmlElement(required = true, name = "DtOfVrfctn")
	protected String DtOfVrfctn;
	@XmlElement(required = true, name = "ElctrncSgntr")
	protected List<Byte> ElctrncSgntr;
	@XmlElement(required = true, name = "FrstPmtDt")
	protected String FrstPmtDt;
	@XmlElement(required = true, name = "FnlPmtDt")
	protected String FnlPmtDt;
	@XmlElement(required = true, name = "Frqcy")
	protected Frequency36Choice Frqcy;
	@XmlElement(required = true, name = "Rsn")
	protected MandateSetupReason1Choice Rsn;
}

// CreditorReferenceInformation2 
public class CreditorReferenceInformation2 {
	@XmlElement(required = true, name = "Tp")
	protected CreditorReferenceType2 Tp;
	@XmlElement(required = true, name = "Ref")
	protected String Ref;
}

// CreditorReferenceType1Choice 
public class CreditorReferenceType1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// CreditorReferenceType2 
public class CreditorReferenceType2 {
	@XmlElement(required = true, name = "CdOrPrtry")
	protected CreditorReferenceType1Choice CdOrPrtry;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// DateAndDateTime2Choice 
public class DateAndDateTime2Choice {
	@XmlElement(required = true, name = "Dt")
	protected String Dt;
	@XmlElement(required = true, name = "DtTm")
	protected String DtTm;
}

// DateAndPlaceOfBirth1 
public class DateAndPlaceOfBirth1 {
	@XmlElement(required = true, name = "BirthDt")
	protected String BirthDt;
	@XmlElement(required = true, name = "PrvcOfBirth")
	protected String PrvcOfBirth;
	@XmlElement(required = true, name = "CityOfBirth")
	protected String CityOfBirth;
	@XmlElement(required = true, name = "CtryOfBirth")
	protected String CtryOfBirth;
}

// DatePeriod2 
public class DatePeriod2 {
	@XmlElement(required = true, name = "FrDt")
	protected String FrDt;
	@XmlElement(required = true, name = "ToDt")
	protected String ToDt;
}

// DecimalNumber 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DecimalNumber")
public class DecimalNumber {
	protected Float DecimalNumber;
}

// DiscountAmountAndType1 
public class DiscountAmountAndType1 {
	@XmlElement(required = true, name = "Tp")
	protected DiscountAmountType1Choice Tp;
	@XmlElement(required = true, name = "Amt")
	protected ActiveOrHistoricCurrencyAndAmount Amt;
}

// DiscountAmountType1Choice 
public class DiscountAmountType1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// DocumentAdjustment1 
public class DocumentAdjustment1 {
	@XmlElement(required = true, name = "Amt")
	protected ActiveOrHistoricCurrencyAndAmount Amt;
	@XmlElement(required = true, name = "CdtDbtInd")
	protected String CdtDbtInd;
	@XmlElement(required = true, name = "Rsn")
	protected String Rsn;
	@XmlElement(required = true, name = "AddtlInf")
	protected String AddtlInf;
}

// DocumentLineIdentification1 
public class DocumentLineIdentification1 {
	@XmlElement(required = true, name = "Tp")
	protected DocumentLineType1 Tp;
	@XmlElement(required = true, name = "Nb")
	protected String Nb;
	@XmlElement(required = true, name = "RltdDt")
	protected String RltdDt;
}

// DocumentLineInformation1 
public class DocumentLineInformation1 {
	@XmlElement(required = true, name = "Id")
	protected List<DocumentLineIdentification1> Id;
	@XmlElement(required = true, name = "Desc")
	protected String Desc;
	@XmlElement(required = true, name = "Amt")
	protected RemittanceAmount3 Amt;
}

// DocumentLineType1 
public class DocumentLineType1 {
	@XmlElement(required = true, name = "CdOrPrtry")
	protected DocumentLineType1Choice CdOrPrtry;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// DocumentLineType1Choice 
public class DocumentLineType1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// DocumentType3Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DocumentType3Code")
public class DocumentType3Code {
	protected String DocumentType3Code;
}

// DocumentType6Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "DocumentType6Code")
public class DocumentType6Code {
	protected String DocumentType6Code;
}

// EquivalentAmount2 
public class EquivalentAmount2 {
	@XmlElement(required = true, name = "Amt")
	protected ActiveOrHistoricCurrencyAndAmount Amt;
	@XmlElement(required = true, name = "CcyOfTrf")
	protected String CcyOfTrf;
}

// Exact2NumericText 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Exact2NumericText")
public class Exact2NumericText {
	protected String Exact2NumericText;
}

// Exact4AlphaNumericText 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Exact4AlphaNumericText")
public class Exact4AlphaNumericText {
	protected String Exact4AlphaNumericText;
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

// ExternalCashClearingSystem1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalCashClearingSystem1Code")
public class ExternalCashClearingSystem1Code {
	protected String ExternalCashClearingSystem1Code;
}

// ExternalCategoryPurpose1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalCategoryPurpose1Code")
public class ExternalCategoryPurpose1Code {
	protected String ExternalCategoryPurpose1Code;
}

// ExternalClearingSystemIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalClearingSystemIdentification1Code")
public class ExternalClearingSystemIdentification1Code {
	protected String ExternalClearingSystemIdentification1Code;
}

// ExternalDiscountAmountType1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalDiscountAmountType1Code")
public class ExternalDiscountAmountType1Code {
	protected String ExternalDiscountAmountType1Code;
}

// ExternalDocumentLineType1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalDocumentLineType1Code")
public class ExternalDocumentLineType1Code {
	protected String ExternalDocumentLineType1Code;
}

// ExternalFinancialInstitutionIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalFinancialInstitutionIdentification1Code")
public class ExternalFinancialInstitutionIdentification1Code {
	protected String ExternalFinancialInstitutionIdentification1Code;
}

// ExternalGarnishmentType1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalGarnishmentType1Code")
public class ExternalGarnishmentType1Code {
	protected String ExternalGarnishmentType1Code;
}

// ExternalLocalInstrument1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalLocalInstrument1Code")
public class ExternalLocalInstrument1Code {
	protected String ExternalLocalInstrument1Code;
}

// ExternalMandateSetupReason1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalMandateSetupReason1Code")
public class ExternalMandateSetupReason1Code {
	protected String ExternalMandateSetupReason1Code;
}

// ExternalOrganisationIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalOrganisationIdentification1Code")
public class ExternalOrganisationIdentification1Code {
	protected String ExternalOrganisationIdentification1Code;
}

// ExternalPersonIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalPersonIdentification1Code")
public class ExternalPersonIdentification1Code {
	protected String ExternalPersonIdentification1Code;
}

// ExternalProxyAccountType1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalProxyAccountType1Code")
public class ExternalProxyAccountType1Code {
	protected String ExternalProxyAccountType1Code;
}

// ExternalPurpose1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalPurpose1Code")
public class ExternalPurpose1Code {
	protected String ExternalPurpose1Code;
}

// ExternalServiceLevel1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalServiceLevel1Code")
public class ExternalServiceLevel1Code {
	protected String ExternalServiceLevel1Code;
}

// ExternalTaxAmountType1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalTaxAmountType1Code")
public class ExternalTaxAmountType1Code {
	protected String ExternalTaxAmountType1Code;
}

// ExternalUnableToApplyIncorrectData1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalUnableToApplyIncorrectData1Code")
public class ExternalUnableToApplyIncorrectData1Code {
	protected String ExternalUnableToApplyIncorrectData1Code;
}

// ExternalUnableToApplyMissingData1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalUnableToApplyMissingData1Code")
public class ExternalUnableToApplyMissingData1Code {
	protected String ExternalUnableToApplyMissingData1Code;
}

// FinancialIdentificationSchemeName1Choice 
public class FinancialIdentificationSchemeName1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// FinancialInstitutionIdentification18 
public class FinancialInstitutionIdentification18 {
	@XmlElement(required = true, name = "BICFI")
	protected String BICFI;
	@XmlElement(required = true, name = "ClrSysMmbId")
	protected ClearingSystemMemberIdentification2 ClrSysMmbId;
	@XmlElement(required = true, name = "LEI")
	protected String LEI;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress24 PstlAdr;
	@XmlElement(required = true, name = "Othr")
	protected GenericFinancialIdentification1 Othr;
}

// Frequency36Choice 
public class Frequency36Choice {
	@XmlElement(required = true, name = "Tp")
	protected String Tp;
	@XmlElement(required = true, name = "Prd")
	protected FrequencyPeriod1 Prd;
	@XmlElement(required = true, name = "PtInTm")
	protected FrequencyAndMoment1 PtInTm;
}

// Frequency6Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Frequency6Code")
public class Frequency6Code {
	protected String Frequency6Code;
}

// FrequencyAndMoment1 
public class FrequencyAndMoment1 {
	@XmlElement(required = true, name = "Tp")
	protected String Tp;
	@XmlElement(required = true, name = "PtInTm")
	protected String PtInTm;
}

// FrequencyPeriod1 
public class FrequencyPeriod1 {
	@XmlElement(required = true, name = "Tp")
	protected String Tp;
	@XmlElement(required = true, name = "CntPerPrd")
	protected Float CntPerPrd;
}

// Garnishment3 
public class Garnishment3 {
	@XmlElement(required = true, name = "Tp")
	protected GarnishmentType1 Tp;
	@XmlElement(required = true, name = "Grnshee")
	protected PartyIdentification135 Grnshee;
	@XmlElement(required = true, name = "GrnshmtAdmstr")
	protected PartyIdentification135 GrnshmtAdmstr;
	@XmlElement(required = true, name = "RefNb")
	protected String RefNb;
	@XmlElement(required = true, name = "Dt")
	protected String Dt;
	@XmlElement(required = true, name = "RmtdAmt")
	protected ActiveOrHistoricCurrencyAndAmount RmtdAmt;
	@XmlElement(required = true, name = "FmlyMdclInsrncInd")
	protected Boolean FmlyMdclInsrncInd;
	@XmlElement(required = true, name = "MplyeeTermntnInd")
	protected Boolean MplyeeTermntnInd;
}

// GarnishmentType1 
public class GarnishmentType1 {
	@XmlElement(required = true, name = "CdOrPrtry")
	protected GarnishmentType1Choice CdOrPrtry;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// GarnishmentType1Choice 
public class GarnishmentType1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
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

// GenericFinancialIdentification1 
public class GenericFinancialIdentification1 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "SchmeNm")
	protected FinancialIdentificationSchemeName1Choice SchmeNm;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// GenericIdentification30 
public class GenericIdentification30 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
	@XmlElement(required = true, name = "SchmeNm")
	protected String SchmeNm;
}

// GenericOrganisationIdentification1 
public class GenericOrganisationIdentification1 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "SchmeNm")
	protected OrganisationIdentificationSchemeName1Choice SchmeNm;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// GenericPersonIdentification1 
public class GenericPersonIdentification1 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "SchmeNm")
	protected PersonIdentificationSchemeName1Choice SchmeNm;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// IBAN2007Identifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "IBAN2007Identifier")
public class IBAN2007Identifier {
	protected String IBAN2007Identifier;
}

// ISODate 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ISODate")
public class ISODate {
	protected String ISODate;
}

// ISODateTime 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ISODateTime")
public class ISODateTime {
	protected String ISODateTime;
}

// ISOYear 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ISOYear")
public class ISOYear {
	protected String ISOYear;
}

// IncorrectData1Choice 
public class IncorrectData1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// LEIIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "LEIIdentifier")
public class LEIIdentifier {
	protected String LEIIdentifier;
}

// LocalInstrument2Choice 
public class LocalInstrument2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// MandateClassification1Choice 
public class MandateClassification1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// MandateClassification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "MandateClassification1Code")
public class MandateClassification1Code {
	protected String MandateClassification1Code;
}

// MandateRelatedData2Choice 
public class MandateRelatedData2Choice {
	@XmlElement(required = true, name = "DrctDbtMndt")
	protected MandateRelatedInformation15 DrctDbtMndt;
	@XmlElement(required = true, name = "CdtTrfMndt")
	protected CreditTransferMandateData1 CdtTrfMndt;
}

// MandateRelatedInformation15 
public class MandateRelatedInformation15 {
	@XmlElement(required = true, name = "MndtId")
	protected String MndtId;
	@XmlElement(required = true, name = "DtOfSgntr")
	protected String DtOfSgntr;
	@XmlElement(required = true, name = "AmdmntInd")
	protected Boolean AmdmntInd;
	@XmlElement(required = true, name = "AmdmntInfDtls")
	protected AmendmentInformationDetails14 AmdmntInfDtls;
	@XmlElement(required = true, name = "ElctrncSgntr")
	protected String ElctrncSgntr;
	@XmlElement(required = true, name = "FrstColltnDt")
	protected String FrstColltnDt;
	@XmlElement(required = true, name = "FnlColltnDt")
	protected String FnlColltnDt;
	@XmlElement(required = true, name = "Frqcy")
	protected Frequency36Choice Frqcy;
	@XmlElement(required = true, name = "Rsn")
	protected MandateSetupReason1Choice Rsn;
	@XmlElement(required = true, name = "TrckgDays")
	protected String TrckgDays;
}

// MandateSetupReason1Choice 
public class MandateSetupReason1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// MandateTypeInformation2 
public class MandateTypeInformation2 {
	@XmlElement(required = true, name = "SvcLvl")
	protected ServiceLevel8Choice SvcLvl;
	@XmlElement(required = true, name = "LclInstrm")
	protected LocalInstrument2Choice LclInstrm;
	@XmlElement(required = true, name = "CtgyPurp")
	protected CategoryPurpose1Choice CtgyPurp;
	@XmlElement(required = true, name = "Clssfctn")
	protected MandateClassification1Choice Clssfctn;
}

// Max1025Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max1025Text")
public class Max1025Text {
	protected String Max1025Text;
}

// Max10KBinary 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max10KBinary")
public class Max10KBinary {
	protected List<Byte> Max10KBinary;
}

// Max128Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max128Text")
public class Max128Text {
	protected String Max128Text;
}

// Max140Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max140Text")
public class Max140Text {
	protected String Max140Text;
}

// Max16Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max16Text")
public class Max16Text {
	protected String Max16Text;
}

// Max2048Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max2048Text")
public class Max2048Text {
	protected String Max2048Text;
}

// Max34Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max34Text")
public class Max34Text {
	protected String Max34Text;
}

// Max350Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max350Text")
public class Max350Text {
	protected String Max350Text;
}

// Max35Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max35Text")
public class Max35Text {
	protected String Max35Text;
}

// Max4Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max4Text")
public class Max4Text {
	protected String Max4Text;
}

// Max70Text 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Max70Text")
public class Max70Text {
	protected String Max70Text;
}

// MissingData1Choice 
public class MissingData1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// MissingOrIncorrectData1 
public class MissingOrIncorrectData1 {
	@XmlElement(required = true, name = "AMLReq")
	protected Boolean AMLReq;
	@XmlElement(required = true, name = "MssngInf")
	protected List<UnableToApplyMissing2> MssngInf;
	@XmlElement(required = true, name = "IncrrctInf")
	protected List<UnableToApplyIncorrect2> IncrrctInf;
}

// NamePrefix2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "NamePrefix2Code")
public class NamePrefix2Code {
	protected String NamePrefix2Code;
}

// Number 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Number")
public class Number {
	protected Float Number;
}

// OrganisationIdentification29 
public class OrganisationIdentification29 {
	@XmlElement(required = true, name = "AnyBIC")
	protected String AnyBIC;
	@XmlElement(required = true, name = "LEI")
	protected String LEI;
	@XmlElement(required = true, name = "Othr")
	protected List<GenericOrganisationIdentification1> Othr;
}

// OrganisationIdentificationSchemeName1Choice 
public class OrganisationIdentificationSchemeName1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// OriginalGroupInformation29 
public class OriginalGroupInformation29 {
	@XmlElement(required = true, name = "OrgnlMsgId")
	protected String OrgnlMsgId;
	@XmlElement(required = true, name = "OrgnlMsgNmId")
	protected String OrgnlMsgNmId;
	@XmlElement(required = true, name = "OrgnlCreDtTm")
	protected String OrgnlCreDtTm;
}

// OriginalTransactionReference35 
public class OriginalTransactionReference35 {
	@XmlElement(required = true, name = "IntrBkSttlmAmt")
	protected ActiveOrHistoricCurrencyAndAmount IntrBkSttlmAmt;
	@XmlElement(required = true, name = "Amt")
	protected AmountType4Choice Amt;
	@XmlElement(required = true, name = "IntrBkSttlmDt")
	protected String IntrBkSttlmDt;
	@XmlElement(required = true, name = "ReqdColltnDt")
	protected String ReqdColltnDt;
	@XmlElement(required = true, name = "ReqdExctnDt")
	protected DateAndDateTime2Choice ReqdExctnDt;
	@XmlElement(required = true, name = "CdtrSchmeId")
	protected PartyIdentification135 CdtrSchmeId;
	@XmlElement(required = true, name = "SttlmInf")
	protected SettlementInstruction11 SttlmInf;
	@XmlElement(required = true, name = "PmtTpInf")
	protected PaymentTypeInformation27 PmtTpInf;
	@XmlElement(required = true, name = "PmtMtd")
	protected String PmtMtd;
	@XmlElement(required = true, name = "MndtRltdInf")
	protected MandateRelatedData2Choice MndtRltdInf;
	@XmlElement(required = true, name = "RmtInf")
	protected RemittanceInformation21 RmtInf;
	@XmlElement(required = true, name = "UltmtDbtr")
	protected Party40Choice UltmtDbtr;
	@XmlElement(required = true, name = "Dbtr")
	protected Party40Choice Dbtr;
	@XmlElement(required = true, name = "DbtrAcct")
	protected CashAccount40 DbtrAcct;
	@XmlElement(required = true, name = "DbtrAgt")
	protected BranchAndFinancialInstitutionIdentification6 DbtrAgt;
	@XmlElement(required = true, name = "DbtrAgtAcct")
	protected CashAccount40 DbtrAgtAcct;
	@XmlElement(required = true, name = "CdtrAgt")
	protected BranchAndFinancialInstitutionIdentification6 CdtrAgt;
	@XmlElement(required = true, name = "CdtrAgtAcct")
	protected CashAccount40 CdtrAgtAcct;
	@XmlElement(required = true, name = "Cdtr")
	protected Party40Choice Cdtr;
	@XmlElement(required = true, name = "CdtrAcct")
	protected CashAccount40 CdtrAcct;
	@XmlElement(required = true, name = "UltmtCdtr")
	protected Party40Choice UltmtCdtr;
	@XmlElement(required = true, name = "Purp")
	protected Purpose2Choice Purp;
}

// OtherContact1 
public class OtherContact1 {
	@XmlElement(required = true, name = "ChanlTp")
	protected String ChanlTp;
	@XmlElement(required = true, name = "Id")
	protected String Id;
}

// Party38Choice 
public class Party38Choice {
	@XmlElement(required = true, name = "OrgId")
	protected OrganisationIdentification29 OrgId;
	@XmlElement(required = true, name = "PrvtId")
	protected PersonIdentification13 PrvtId;
}

// Party40Choice 
public class Party40Choice {
	@XmlElement(required = true, name = "Pty")
	protected PartyIdentification135 Pty;
	@XmlElement(required = true, name = "Agt")
	protected BranchAndFinancialInstitutionIdentification6 Agt;
}

// PartyIdentification135 
public class PartyIdentification135 {
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
	@XmlElement(required = true, name = "PstlAdr")
	protected PostalAddress24 PstlAdr;
	@XmlElement(required = true, name = "Id")
	protected Party38Choice Id;
	@XmlElement(required = true, name = "CtryOfRes")
	protected String CtryOfRes;
	@XmlElement(required = true, name = "CtctDtls")
	protected Contact4 CtctDtls;
}

// PaymentMethod4Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "PaymentMethod4Code")
public class PaymentMethod4Code {
	protected String PaymentMethod4Code;
}

// PaymentTypeInformation27 
public class PaymentTypeInformation27 {
	@XmlElement(required = true, name = "InstrPrty")
	protected String InstrPrty;
	@XmlElement(required = true, name = "ClrChanl")
	protected String ClrChanl;
	@XmlElement(required = true, name = "SvcLvl")
	protected List<ServiceLevel8Choice> SvcLvl;
	@XmlElement(required = true, name = "LclInstrm")
	protected LocalInstrument2Choice LclInstrm;
	@XmlElement(required = true, name = "SeqTp")
	protected String SeqTp;
	@XmlElement(required = true, name = "CtgyPurp")
	protected CategoryPurpose1Choice CtgyPurp;
}

// PercentageRate 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "PercentageRate")
public class PercentageRate {
	protected Float PercentageRate;
}

// PersonIdentification13 
public class PersonIdentification13 {
	@XmlElement(required = true, name = "DtAndPlcOfBirth")
	protected DateAndPlaceOfBirth1 DtAndPlcOfBirth;
	@XmlElement(required = true, name = "Othr")
	protected List<GenericPersonIdentification1> Othr;
}

// PersonIdentificationSchemeName1Choice 
public class PersonIdentificationSchemeName1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// PhoneNumber 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "PhoneNumber")
public class PhoneNumber {
	protected String PhoneNumber;
}

// PostalAddress24 
public class PostalAddress24 {
	@XmlElement(required = true, name = "AdrTp")
	protected AddressType3Choice AdrTp;
	@XmlElement(required = true, name = "Dept")
	protected String Dept;
	@XmlElement(required = true, name = "SubDept")
	protected String SubDept;
	@XmlElement(required = true, name = "StrtNm")
	protected String StrtNm;
	@XmlElement(required = true, name = "BldgNb")
	protected String BldgNb;
	@XmlElement(required = true, name = "BldgNm")
	protected String BldgNm;
	@XmlElement(required = true, name = "Flr")
	protected String Flr;
	@XmlElement(required = true, name = "PstBx")
	protected String PstBx;
	@XmlElement(required = true, name = "Room")
	protected String Room;
	@XmlElement(required = true, name = "PstCd")
	protected String PstCd;
	@XmlElement(required = true, name = "TwnNm")
	protected String TwnNm;
	@XmlElement(required = true, name = "TwnLctnNm")
	protected String TwnLctnNm;
	@XmlElement(required = true, name = "DstrctNm")
	protected String DstrctNm;
	@XmlElement(required = true, name = "CtrySubDvsn")
	protected String CtrySubDvsn;
	@XmlElement(required = true, name = "Ctry")
	protected String Ctry;
	@XmlElement(required = true, name = "AdrLine")
	protected List<String> AdrLine;
}

// PreferredContactMethod1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "PreferredContactMethod1Code")
public class PreferredContactMethod1Code {
	protected String PreferredContactMethod1Code;
}

// Priority2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Priority2Code")
public class Priority2Code {
	protected String Priority2Code;
}

// ProxyAccountIdentification1 
public class ProxyAccountIdentification1 {
	@XmlElement(required = true, name = "Tp")
	protected ProxyAccountType1Choice Tp;
	@XmlElement(required = true, name = "Id")
	protected String Id;
}

// ProxyAccountType1Choice 
public class ProxyAccountType1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// Purpose2Choice 
public class Purpose2Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ReferredDocumentInformation7 
public class ReferredDocumentInformation7 {
	@XmlElement(required = true, name = "Tp")
	protected ReferredDocumentType4 Tp;
	@XmlElement(required = true, name = "Nb")
	protected String Nb;
	@XmlElement(required = true, name = "RltdDt")
	protected String RltdDt;
	@XmlElement(required = true, name = "LineDtls")
	protected List<DocumentLineInformation1> LineDtls;
}

// ReferredDocumentType3Choice 
public class ReferredDocumentType3Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// ReferredDocumentType4 
public class ReferredDocumentType4 {
	@XmlElement(required = true, name = "CdOrPrtry")
	protected ReferredDocumentType3Choice CdOrPrtry;
	@XmlElement(required = true, name = "Issr")
	protected String Issr;
}

// RemittanceAmount2 
public class RemittanceAmount2 {
	@XmlElement(required = true, name = "DuePyblAmt")
	protected ActiveOrHistoricCurrencyAndAmount DuePyblAmt;
	@XmlElement(required = true, name = "DscntApldAmt")
	protected List<DiscountAmountAndType1> DscntApldAmt;
	@XmlElement(required = true, name = "CdtNoteAmt")
	protected ActiveOrHistoricCurrencyAndAmount CdtNoteAmt;
	@XmlElement(required = true, name = "TaxAmt")
	protected List<TaxAmountAndType1> TaxAmt;
	@XmlElement(required = true, name = "AdjstmntAmtAndRsn")
	protected List<DocumentAdjustment1> AdjstmntAmtAndRsn;
	@XmlElement(required = true, name = "RmtdAmt")
	protected ActiveOrHistoricCurrencyAndAmount RmtdAmt;
}

// RemittanceAmount3 
public class RemittanceAmount3 {
	@XmlElement(required = true, name = "DuePyblAmt")
	protected ActiveOrHistoricCurrencyAndAmount DuePyblAmt;
	@XmlElement(required = true, name = "DscntApldAmt")
	protected List<DiscountAmountAndType1> DscntApldAmt;
	@XmlElement(required = true, name = "CdtNoteAmt")
	protected ActiveOrHistoricCurrencyAndAmount CdtNoteAmt;
	@XmlElement(required = true, name = "TaxAmt")
	protected List<TaxAmountAndType1> TaxAmt;
	@XmlElement(required = true, name = "AdjstmntAmtAndRsn")
	protected List<DocumentAdjustment1> AdjstmntAmtAndRsn;
	@XmlElement(required = true, name = "RmtdAmt")
	protected ActiveOrHistoricCurrencyAndAmount RmtdAmt;
}

// RemittanceInformation21 
public class RemittanceInformation21 {
	@XmlElement(required = true, name = "Ustrd")
	protected List<String> Ustrd;
	@XmlElement(required = true, name = "Strd")
	protected List<StructuredRemittanceInformation17> Strd;
}

// SequenceType3Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "SequenceType3Code")
public class SequenceType3Code {
	protected String SequenceType3Code;
}

// ServiceLevel8Choice 
public class ServiceLevel8Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// SettlementInstruction11 
public class SettlementInstruction11 {
	@XmlElement(required = true, name = "SttlmMtd")
	protected String SttlmMtd;
	@XmlElement(required = true, name = "SttlmAcct")
	protected CashAccount40 SttlmAcct;
	@XmlElement(required = true, name = "ClrSys")
	protected ClearingSystemIdentification3Choice ClrSys;
	@XmlElement(required = true, name = "InstgRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification6 InstgRmbrsmntAgt;
	@XmlElement(required = true, name = "InstgRmbrsmntAgtAcct")
	protected CashAccount40 InstgRmbrsmntAgtAcct;
	@XmlElement(required = true, name = "InstdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification6 InstdRmbrsmntAgt;
	@XmlElement(required = true, name = "InstdRmbrsmntAgtAcct")
	protected CashAccount40 InstdRmbrsmntAgtAcct;
	@XmlElement(required = true, name = "ThrdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification6 ThrdRmbrsmntAgt;
	@XmlElement(required = true, name = "ThrdRmbrsmntAgtAcct")
	protected CashAccount40 ThrdRmbrsmntAgtAcct;
}

// SettlementMethod1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "SettlementMethod1Code")
public class SettlementMethod1Code {
	protected String SettlementMethod1Code;
}

// StructuredRemittanceInformation17 
public class StructuredRemittanceInformation17 {
	@XmlElement(required = true, name = "RfrdDocInf")
	protected List<ReferredDocumentInformation7> RfrdDocInf;
	@XmlElement(required = true, name = "RfrdDocAmt")
	protected RemittanceAmount2 RfrdDocAmt;
	@XmlElement(required = true, name = "CdtrRefInf")
	protected CreditorReferenceInformation2 CdtrRefInf;
	@XmlElement(required = true, name = "Invcr")
	protected PartyIdentification135 Invcr;
	@XmlElement(required = true, name = "Invcee")
	protected PartyIdentification135 Invcee;
	@XmlElement(required = true, name = "TaxRmt")
	protected TaxData1 TaxRmt;
	@XmlElement(required = true, name = "GrnshmtRmt")
	protected Garnishment3 GrnshmtRmt;
	@XmlElement(required = true, name = "AddtlRmtInf")
	protected List<String> AddtlRmtInf;
}

// SupplementaryData1 
public class SupplementaryData1 {
	@XmlElement(required = true, name = "PlcAndNm")
	protected String PlcAndNm;
	@XmlElement(required = true, name = "Envlp")
	protected SupplementaryDataEnvelope1 Envlp;
}

// SupplementaryDataEnvelope1 
public class SupplementaryDataEnvelope1 {
}

// TaxAmount3 
public class TaxAmount3 {
	@XmlElement(required = true, name = "Rate")
	protected Float Rate;
	@XmlElement(required = true, name = "TaxblBaseAmt")
	protected ActiveOrHistoricCurrencyAndAmount TaxblBaseAmt;
	@XmlElement(required = true, name = "TtlAmt")
	protected ActiveOrHistoricCurrencyAndAmount TtlAmt;
	@XmlElement(required = true, name = "Dtls")
	protected List<TaxRecordDetails3> Dtls;
}

// TaxAmountAndType1 
public class TaxAmountAndType1 {
	@XmlElement(required = true, name = "Tp")
	protected TaxAmountType1Choice Tp;
	@XmlElement(required = true, name = "Amt")
	protected ActiveOrHistoricCurrencyAndAmount Amt;
}

// TaxAmountType1Choice 
public class TaxAmountType1Choice {
	@XmlElement(required = true, name = "Cd")
	protected String Cd;
	@XmlElement(required = true, name = "Prtry")
	protected String Prtry;
}

// TaxAuthorisation1 
public class TaxAuthorisation1 {
	@XmlElement(required = true, name = "Titl")
	protected String Titl;
	@XmlElement(required = true, name = "Nm")
	protected String Nm;
}

// TaxData1 
public class TaxData1 {
	@XmlElement(required = true, name = "Cdtr")
	protected TaxParty1 Cdtr;
	@XmlElement(required = true, name = "Dbtr")
	protected TaxParty2 Dbtr;
	@XmlElement(required = true, name = "UltmtDbtr")
	protected TaxParty2 UltmtDbtr;
	@XmlElement(required = true, name = "AdmstnZone")
	protected String AdmstnZone;
	@XmlElement(required = true, name = "RefNb")
	protected String RefNb;
	@XmlElement(required = true, name = "Mtd")
	protected String Mtd;
	@XmlElement(required = true, name = "TtlTaxblBaseAmt")
	protected ActiveOrHistoricCurrencyAndAmount TtlTaxblBaseAmt;
	@XmlElement(required = true, name = "TtlTaxAmt")
	protected ActiveOrHistoricCurrencyAndAmount TtlTaxAmt;
	@XmlElement(required = true, name = "Dt")
	protected String Dt;
	@XmlElement(required = true, name = "SeqNb")
	protected Float SeqNb;
	@XmlElement(required = true, name = "Rcrd")
	protected List<TaxRecord3> Rcrd;
}

// TaxParty1 
public class TaxParty1 {
	@XmlElement(required = true, name = "TaxId")
	protected String TaxId;
	@XmlElement(required = true, name = "RegnId")
	protected String RegnId;
	@XmlElement(required = true, name = "TaxTp")
	protected String TaxTp;
}

// TaxParty2 
public class TaxParty2 {
	@XmlElement(required = true, name = "TaxId")
	protected String TaxId;
	@XmlElement(required = true, name = "RegnId")
	protected String RegnId;
	@XmlElement(required = true, name = "TaxTp")
	protected String TaxTp;
	@XmlElement(required = true, name = "Authstn")
	protected TaxAuthorisation1 Authstn;
}

// TaxPeriod3 
public class TaxPeriod3 {
	@XmlElement(required = true, name = "Yr")
	protected String Yr;
	@XmlElement(required = true, name = "Tp")
	protected String Tp;
	@XmlElement(required = true, name = "FrToDt")
	protected DatePeriod2 FrToDt;
}

// TaxRecord3 
public class TaxRecord3 {
	@XmlElement(required = true, name = "Tp")
	protected String Tp;
	@XmlElement(required = true, name = "Ctgy")
	protected String Ctgy;
	@XmlElement(required = true, name = "CtgyDtls")
	protected String CtgyDtls;
	@XmlElement(required = true, name = "DbtrSts")
	protected String DbtrSts;
	@XmlElement(required = true, name = "CertId")
	protected String CertId;
	@XmlElement(required = true, name = "FrmsCd")
	protected String FrmsCd;
	@XmlElement(required = true, name = "Prd")
	protected TaxPeriod3 Prd;
	@XmlElement(required = true, name = "TaxAmt")
	protected TaxAmount3 TaxAmt;
	@XmlElement(required = true, name = "AddtlInf")
	protected String AddtlInf;
}

// TaxRecordDetails3 
public class TaxRecordDetails3 {
	@XmlElement(required = true, name = "Prd")
	protected TaxPeriod3 Prd;
	@XmlElement(required = true, name = "Amt")
	protected ActiveOrHistoricCurrencyAndAmount Amt;
}

// TaxRecordPeriod1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "TaxRecordPeriod1Code")
public class TaxRecordPeriod1Code {
	protected String TaxRecordPeriod1Code;
}

// TrueFalseIndicator 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "TrueFalseIndicator")
public class TrueFalseIndicator {
	protected Boolean TrueFalseIndicator;
}

// UUIDv4Identifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "UUIDv4Identifier")
public class UUIDv4Identifier {
	protected String UUIDv4Identifier;
}

// UnableToApplyIncorrect2 
public class UnableToApplyIncorrect2 {
	@XmlElement(required = true, name = "Tp")
	protected IncorrectData1Choice Tp;
	@XmlElement(required = true, name = "AddtlIncrrctInf")
	protected String AddtlIncrrctInf;
}

// UnableToApplyJustification4Choice 
public class UnableToApplyJustification4Choice {
	@XmlElement(required = true, name = "AnyInf")
	protected Boolean AnyInf;
	@XmlElement(required = true, name = "MssngOrIncrrctInf")
	protected MissingOrIncorrectData1 MssngOrIncrrctInf;
	@XmlElement(required = true, name = "PssblDplctInstr")
	protected Boolean PssblDplctInstr;
}

// UnableToApplyMissing2 
public class UnableToApplyMissing2 {
	@XmlElement(required = true, name = "Tp")
	protected MissingData1Choice Tp;
	@XmlElement(required = true, name = "AddtlMssngInf")
	protected String AddtlMssngInf;
}

// UnableToApplyV09 
public class UnableToApplyV09 {
	@XmlElement(required = true, name = "Assgnmt")
	protected CaseAssignment5 Assgnmt;
	@XmlElement(required = true, name = "Case")
	protected Case5 Case;
	@XmlElement(required = true, name = "Undrlyg")
	protected UnderlyingTransaction7Choice Undrlyg;
	@XmlElement(required = true, name = "Justfn")
	protected UnableToApplyJustification4Choice Justfn;
	@XmlElement(required = true, name = "SplmtryData")
	protected List<SupplementaryData1> SplmtryData;
}

// UnderlyingGroupInformation1 
public class UnderlyingGroupInformation1 {
	@XmlElement(required = true, name = "OrgnlMsgId")
	protected String OrgnlMsgId;
	@XmlElement(required = true, name = "OrgnlMsgNmId")
	protected String OrgnlMsgNmId;
	@XmlElement(required = true, name = "OrgnlCreDtTm")
	protected String OrgnlCreDtTm;
	@XmlElement(required = true, name = "OrgnlMsgDlvryChanl")
	protected String OrgnlMsgDlvryChanl;
}

// UnderlyingPaymentInstruction7 
public class UnderlyingPaymentInstruction7 {
	@XmlElement(required = true, name = "OrgnlGrpInf")
	protected UnderlyingGroupInformation1 OrgnlGrpInf;
	@XmlElement(required = true, name = "OrgnlPmtInfId")
	protected String OrgnlPmtInfId;
	@XmlElement(required = true, name = "OrgnlInstrId")
	protected String OrgnlInstrId;
	@XmlElement(required = true, name = "OrgnlEndToEndId")
	protected String OrgnlEndToEndId;
	@XmlElement(required = true, name = "OrgnlUETR")
	protected String OrgnlUETR;
	@XmlElement(required = true, name = "OrgnlInstdAmt")
	protected ActiveOrHistoricCurrencyAndAmount OrgnlInstdAmt;
	@XmlElement(required = true, name = "ReqdExctnDt")
	protected DateAndDateTime2Choice ReqdExctnDt;
	@XmlElement(required = true, name = "ReqdColltnDt")
	protected String ReqdColltnDt;
	@XmlElement(required = true, name = "OrgnlTxRef")
	protected OriginalTransactionReference35 OrgnlTxRef;
}

// UnderlyingPaymentTransaction6 
public class UnderlyingPaymentTransaction6 {
	@XmlElement(required = true, name = "OrgnlGrpInf")
	protected UnderlyingGroupInformation1 OrgnlGrpInf;
	@XmlElement(required = true, name = "OrgnlInstrId")
	protected String OrgnlInstrId;
	@XmlElement(required = true, name = "OrgnlEndToEndId")
	protected String OrgnlEndToEndId;
	@XmlElement(required = true, name = "OrgnlTxId")
	protected String OrgnlTxId;
	@XmlElement(required = true, name = "OrgnlUETR")
	protected String OrgnlUETR;
	@XmlElement(required = true, name = "OrgnlIntrBkSttlmAmt")
	protected ActiveOrHistoricCurrencyAndAmount OrgnlIntrBkSttlmAmt;
	@XmlElement(required = true, name = "OrgnlIntrBkSttlmDt")
	protected String OrgnlIntrBkSttlmDt;
	@XmlElement(required = true, name = "OrgnlTxRef")
	protected OriginalTransactionReference35 OrgnlTxRef;
}

// UnderlyingStatementEntry3 
public class UnderlyingStatementEntry3 {
	@XmlElement(required = true, name = "OrgnlGrpInf")
	protected OriginalGroupInformation29 OrgnlGrpInf;
	@XmlElement(required = true, name = "OrgnlStmtId")
	protected String OrgnlStmtId;
	@XmlElement(required = true, name = "OrgnlNtryId")
	protected String OrgnlNtryId;
	@XmlElement(required = true, name = "OrgnlUETR")
	protected String OrgnlUETR;
}

// UnderlyingTransaction7Choice 
public class UnderlyingTransaction7Choice {
	@XmlElement(required = true, name = "Initn")
	protected UnderlyingPaymentInstruction7 Initn;
	@XmlElement(required = true, name = "IntrBk")
	protected UnderlyingPaymentTransaction6 IntrBk;
	@XmlElement(required = true, name = "StmtNtry")
	protected UnderlyingStatementEntry3 StmtNtry;
}

// YesNoIndicator 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "YesNoIndicator")
public class YesNoIndicator {
	protected Boolean YesNoIndicator;
}
