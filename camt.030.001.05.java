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

// CaseForwardingNotification3 
public class CaseForwardingNotification3 {
	@XmlElement(required = true, name = "Justfn")
	protected String Justfn;
}

// CaseForwardingNotification3Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "CaseForwardingNotification3Code")
public class CaseForwardingNotification3Code {
	protected String CaseForwardingNotification3Code;
}

// ClearingSystemIdentification2Choice 
public class ClearingSystemIdentification2Choice {
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

// Exact4AlphaNumericText 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "Exact4AlphaNumericText")
public class Exact4AlphaNumericText {
	protected String Exact4AlphaNumericText;
}

// ExternalClearingSystemIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalClearingSystemIdentification1Code")
public class ExternalClearingSystemIdentification1Code {
	protected String ExternalClearingSystemIdentification1Code;
}

// ExternalFinancialInstitutionIdentification1Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "ExternalFinancialInstitutionIdentification1Code")
public class ExternalFinancialInstitutionIdentification1Code {
	protected String ExternalFinancialInstitutionIdentification1Code;
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

// LEIIdentifier 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "LEIIdentifier")
public class LEIIdentifier {
	protected String LEIIdentifier;
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

// NamePrefix2Code 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "NamePrefix2Code")
public class NamePrefix2Code {
	protected String NamePrefix2Code;
}

// NotificationOfCaseAssignmentV05 
public class NotificationOfCaseAssignmentV05 {
	@XmlElement(required = true, name = "Hdr")
	protected ReportHeader5 Hdr;
	@XmlElement(required = true, name = "Case")
	protected Case5 Case;
	@XmlElement(required = true, name = "Assgnmt")
	protected CaseAssignment5 Assgnmt;
	@XmlElement(required = true, name = "Ntfctn")
	protected CaseForwardingNotification3 Ntfctn;
	@XmlElement(required = true, name = "SplmtryData")
	protected List<SupplementaryData1> SplmtryData;
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

// ReportHeader5 
public class ReportHeader5 {
	@XmlElement(required = true, name = "Id")
	protected String Id;
	@XmlElement(required = true, name = "Fr")
	protected Party40Choice Fr;
	@XmlElement(required = true, name = "To")
	protected Party40Choice To;
	@XmlElement(required = true, name = "CreDtTm")
	protected String CreDtTm;
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

// YesNoIndicator 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "YesNoIndicator")
public class YesNoIndicator {
	protected Boolean YesNoIndicator;
}
