
package com.hp.airlinesoaschema.aircommontypes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.opentravel.ota._2003._05.aircommontypes.FareType;
import org.opentravel.ota._2003._05.aircommontypes.OtherServiceInfoType;
import org.opentravel.ota._2003._05.aircommontypes.PassengerTypeQuantityType;
import org.opentravel.ota._2003._05.commontypes.ContactPersonType;
import org.opentravel.ota._2003._05.commontypes.LocationType;
import org.opentravel.ota._2003._05.commontypes.PaymentDetailType;
import org.opentravel.ota._2003._05.commontypes.PersonNameType;
import org.opentravel.ota._2003._05.commontypes.UniqueIDType;
import org.opentravel.ota._2003._05.simpletypes.GenderType;


/**
 * <p>Java class for API_PassengerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_PassengerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerName" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PersonNameType" minOccurs="0"/>
 *         &lt;element name="PassengerWeight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherServiceInformation" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}OtherServiceInfoType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="ContactInfo" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/CommonTypes}ContactPersonType">
 *                 &lt;sequence>
 *                   &lt;element name="Relationship" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OptionToDecline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}PassengerTypeQuantityType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}GenderGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketingInfo" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CouponInfo" maxOccurs="16">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfRPH" />
 *                           &lt;attribute name="CouponNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to4" />
 *                           &lt;attribute name="DocumentNumberCheckDigit">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="PaperTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to8" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PricingInfo" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}FareType" minOccurs="0"/>
 *                   &lt;element name="PaymentTotal" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FormOfPayment" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PaymentDetailType" maxOccurs="4" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CurrencyAmountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CityCodeOfIssue" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
 *                   &lt;element name="ACN_Number" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UniqueID_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyID_AttributesGroup"/>
 *                 &lt;attribute name="AirlineAccountingCode" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{3}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="FormAndSerialNumber" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9a-zA-Z]{10}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AgencyCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *                 &lt;attribute name="CountryCodeOfIssue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ISO3166" />
 *                 &lt;attribute name="IssuingCompanyName">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9a-zA-Z]{1,35}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="EndorsementInfo" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
 *                 &lt;attribute name="DateOfIssue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *                 &lt;attribute name="OriginalDateofIssue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *                 &lt;attribute name="IssuingAgentID" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to8" />
 *                 &lt;attribute name="TicketBookReference" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingReferenceID" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}BookingReferenceIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="SurnameRefNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *       &lt;attribute name="JumpSeatAuthority" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="SecurityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *       &lt;attribute name="GroupReference" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *       &lt;attribute name="AddToModifySeatMapDateTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *       &lt;attribute name="InfantIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EmployeeSeniorityDate" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *       &lt;attribute name="EmployeeLengthOfService" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_PassengerInfoType", propOrder = {
    "passengerName",
    "passengerWeight",
    "otherServiceInformation",
    "contactInfo",
    "passengerType",
    "ticketingInfo",
    "bookingReferenceID"
})
public class APIPassengerInfoType {

    @XmlElement(name = "PassengerName")
    protected PersonNameType passengerName;
    @XmlElement(name = "PassengerWeight")
    protected APIPassengerInfoType.PassengerWeight passengerWeight;
    @XmlElement(name = "OtherServiceInformation")
    protected List<OtherServiceInfoType> otherServiceInformation;
    @XmlElement(name = "ContactInfo")
    protected List<APIPassengerInfoType.ContactInfo> contactInfo;
    @XmlElement(name = "PassengerType")
    protected APIPassengerInfoType.PassengerType passengerType;
    @XmlElement(name = "TicketingInfo")
    protected List<APIPassengerInfoType.TicketingInfo> ticketingInfo;
    @XmlElement(name = "BookingReferenceID")
    protected BookingReferenceIDType bookingReferenceID;
    @XmlAttribute(name = "RPH", required = true)
    protected String rph;
    @XmlAttribute(name = "PassengerRPH")
    protected String passengerRPH;
    @XmlAttribute(name = "SurnameRefNumber")
    protected String surnameRefNumber;
    @XmlAttribute(name = "JumpSeatAuthority")
    protected String jumpSeatAuthority;
    @XmlAttribute(name = "SecurityCode")
    protected String securityCode;
    @XmlAttribute(name = "GroupReference")
    protected String groupReference;
    @XmlAttribute(name = "AddToModifySeatMapDateTime")
    protected String addToModifySeatMapDateTime;
    @XmlAttribute(name = "InfantIndicator")
    protected Boolean infantIndicator;
    @XmlAttribute(name = "EmployeeSeniorityDate")
    protected String employeeSeniorityDate;
    @XmlAttribute(name = "EmployeeLengthOfService")
    protected Duration employeeLengthOfService;

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPassengerName(PersonNameType value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the passengerWeight property.
     * 
     * @return
     *     possible object is
     *     {@link APIPassengerInfoType.PassengerWeight }
     *     
     */
    public APIPassengerInfoType.PassengerWeight getPassengerWeight() {
        return passengerWeight;
    }

    /**
     * Sets the value of the passengerWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIPassengerInfoType.PassengerWeight }
     *     
     */
    public void setPassengerWeight(APIPassengerInfoType.PassengerWeight value) {
        this.passengerWeight = value;
    }

    /**
     * Gets the value of the otherServiceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherServiceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherServiceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherServiceInfoType }
     * 
     * 
     */
    public List<OtherServiceInfoType> getOtherServiceInformation() {
        if (otherServiceInformation == null) {
            otherServiceInformation = new ArrayList<OtherServiceInfoType>();
        }
        return this.otherServiceInformation;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIPassengerInfoType.ContactInfo }
     * 
     * 
     */
    public List<APIPassengerInfoType.ContactInfo> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<APIPassengerInfoType.ContactInfo>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link APIPassengerInfoType.PassengerType }
     *     
     */
    public APIPassengerInfoType.PassengerType getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIPassengerInfoType.PassengerType }
     *     
     */
    public void setPassengerType(APIPassengerInfoType.PassengerType value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the ticketingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIPassengerInfoType.TicketingInfo }
     * 
     * 
     */
    public List<APIPassengerInfoType.TicketingInfo> getTicketingInfo() {
        if (ticketingInfo == null) {
            ticketingInfo = new ArrayList<APIPassengerInfoType.TicketingInfo>();
        }
        return this.ticketingInfo;
    }

    /**
     * Gets the value of the bookingReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReferenceIDType }
     *     
     */
    public BookingReferenceIDType getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * Sets the value of the bookingReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReferenceIDType }
     *     
     */
    public void setBookingReferenceID(BookingReferenceIDType value) {
        this.bookingReferenceID = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the passengerRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerRPH() {
        return passengerRPH;
    }

    /**
     * Sets the value of the passengerRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerRPH(String value) {
        this.passengerRPH = value;
    }

    /**
     * Gets the value of the surnameRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameRefNumber() {
        return surnameRefNumber;
    }

    /**
     * Sets the value of the surnameRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameRefNumber(String value) {
        this.surnameRefNumber = value;
    }

    /**
     * Gets the value of the jumpSeatAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJumpSeatAuthority() {
        return jumpSeatAuthority;
    }

    /**
     * Sets the value of the jumpSeatAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJumpSeatAuthority(String value) {
        this.jumpSeatAuthority = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the groupReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupReference() {
        return groupReference;
    }

    /**
     * Sets the value of the groupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupReference(String value) {
        this.groupReference = value;
    }

    /**
     * Gets the value of the addToModifySeatMapDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddToModifySeatMapDateTime() {
        return addToModifySeatMapDateTime;
    }

    /**
     * Sets the value of the addToModifySeatMapDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddToModifySeatMapDateTime(String value) {
        this.addToModifySeatMapDateTime = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfantIndicator(Boolean value) {
        this.infantIndicator = value;
    }

    /**
     * Gets the value of the employeeSeniorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeSeniorityDate() {
        return employeeSeniorityDate;
    }

    /**
     * Sets the value of the employeeSeniorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeSeniorityDate(String value) {
        this.employeeSeniorityDate = value;
    }

    /**
     * Gets the value of the employeeLengthOfService property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEmployeeLengthOfService() {
        return employeeLengthOfService;
    }

    /**
     * Sets the value of the employeeLengthOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEmployeeLengthOfService(Duration value) {
        this.employeeLengthOfService = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/CommonTypes}ContactPersonType">
     *       &lt;sequence>
     *         &lt;element name="Relationship" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64"/>
     *       &lt;/sequence>
     *       &lt;attribute name="OptionToDecline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relationship"
    })
    public static class ContactInfo
        extends ContactPersonType
    {

        @XmlElement(name = "Relationship", required = true)
        protected String relationship;
        @XmlAttribute(name = "OptionToDecline")
        protected Boolean optionToDecline;

        /**
         * Gets the value of the relationship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelationship() {
            return relationship;
        }

        /**
         * Sets the value of the relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelationship(String value) {
            this.relationship = value;
        }

        /**
         * Gets the value of the optionToDecline property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOptionToDecline() {
            return optionToDecline;
        }

        /**
         * Sets the value of the optionToDecline property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOptionToDecline(Boolean value) {
            this.optionToDecline = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}PassengerTypeQuantityType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}GenderGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerType
        extends PassengerTypeQuantityType
    {

        @XmlAttribute(name = "Gender")
        protected GenderType gender;

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link GenderType }
         *     
         */
        public GenderType getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenderType }
         *     
         */
        public void setGender(GenderType value) {
            this.gender = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerWeight {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Gets the value of the unitOfMeasureQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * Sets the value of the unitOfMeasureQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * Gets the value of the unitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Sets the value of the unitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CouponInfo" maxOccurs="16">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfRPH" />
     *                 &lt;attribute name="CouponNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to4" />
     *                 &lt;attribute name="DocumentNumberCheckDigit">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="PaperTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to8" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PricingInfo" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}FareType" minOccurs="0"/>
     *         &lt;element name="PaymentTotal" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FormOfPayment" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PaymentDetailType" maxOccurs="4" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CurrencyAmountGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CityCodeOfIssue" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
     *         &lt;element name="ACN_Number" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UniqueID_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyID_AttributesGroup"/>
     *       &lt;attribute name="AirlineAccountingCode" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{3}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="FormAndSerialNumber" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9a-zA-Z]{10}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="AgencyCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
     *       &lt;attribute name="CountryCodeOfIssue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ISO3166" />
     *       &lt;attribute name="IssuingCompanyName">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9a-zA-Z]{1,35}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="EndorsementInfo" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
     *       &lt;attribute name="DateOfIssue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
     *       &lt;attribute name="OriginalDateofIssue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
     *       &lt;attribute name="IssuingAgentID" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to8" />
     *       &lt;attribute name="TicketBookReference" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "couponInfo",
        "pricingInfo",
        "paymentTotal",
        "cityCodeOfIssue",
        "acnNumber"
    })
    public static class TicketingInfo {

        @XmlElement(name = "CouponInfo", required = true)
        protected List<APIPassengerInfoType.TicketingInfo.CouponInfo> couponInfo;
        @XmlElement(name = "PricingInfo")
        protected FareType pricingInfo;
        @XmlElement(name = "PaymentTotal")
        protected APIPassengerInfoType.TicketingInfo.PaymentTotal paymentTotal;
        @XmlElement(name = "CityCodeOfIssue")
        protected LocationType cityCodeOfIssue;
        @XmlElement(name = "ACN_Number")
        protected UniqueIDType acnNumber;
        @XmlAttribute(name = "AirlineAccountingCode", required = true)
        protected String airlineAccountingCode;
        @XmlAttribute(name = "FormAndSerialNumber", required = true)
        protected String formAndSerialNumber;
        @XmlAttribute(name = "AgencyCode")
        protected String agencyCode;
        @XmlAttribute(name = "CountryCodeOfIssue")
        protected String countryCodeOfIssue;
        @XmlAttribute(name = "IssuingCompanyName")
        protected String issuingCompanyName;
        @XmlAttribute(name = "EndorsementInfo")
        protected String endorsementInfo;
        @XmlAttribute(name = "DateOfIssue")
        protected String dateOfIssue;
        @XmlAttribute(name = "OriginalDateofIssue")
        protected String originalDateofIssue;
        @XmlAttribute(name = "IssuingAgentID")
        protected String issuingAgentID;
        @XmlAttribute(name = "TicketBookReference")
        protected String ticketBookReference;
        @XmlAttribute(name = "CompanyShortName")
        protected String companyShortName;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the couponInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APIPassengerInfoType.TicketingInfo.CouponInfo }
         * 
         * 
         */
        public List<APIPassengerInfoType.TicketingInfo.CouponInfo> getCouponInfo() {
            if (couponInfo == null) {
                couponInfo = new ArrayList<APIPassengerInfoType.TicketingInfo.CouponInfo>();
            }
            return this.couponInfo;
        }

        /**
         * Gets the value of the pricingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FareType }
         *     
         */
        public FareType getPricingInfo() {
            return pricingInfo;
        }

        /**
         * Sets the value of the pricingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareType }
         *     
         */
        public void setPricingInfo(FareType value) {
            this.pricingInfo = value;
        }

        /**
         * Gets the value of the paymentTotal property.
         * 
         * @return
         *     possible object is
         *     {@link APIPassengerInfoType.TicketingInfo.PaymentTotal }
         *     
         */
        public APIPassengerInfoType.TicketingInfo.PaymentTotal getPaymentTotal() {
            return paymentTotal;
        }

        /**
         * Sets the value of the paymentTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link APIPassengerInfoType.TicketingInfo.PaymentTotal }
         *     
         */
        public void setPaymentTotal(APIPassengerInfoType.TicketingInfo.PaymentTotal value) {
            this.paymentTotal = value;
        }

        /**
         * Gets the value of the cityCodeOfIssue property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getCityCodeOfIssue() {
            return cityCodeOfIssue;
        }

        /**
         * Sets the value of the cityCodeOfIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setCityCodeOfIssue(LocationType value) {
            this.cityCodeOfIssue = value;
        }

        /**
         * Gets the value of the acnNumber property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getACNNumber() {
            return acnNumber;
        }

        /**
         * Sets the value of the acnNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setACNNumber(UniqueIDType value) {
            this.acnNumber = value;
        }

        /**
         * Gets the value of the airlineAccountingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirlineAccountingCode() {
            return airlineAccountingCode;
        }

        /**
         * Sets the value of the airlineAccountingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirlineAccountingCode(String value) {
            this.airlineAccountingCode = value;
        }

        /**
         * Gets the value of the formAndSerialNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormAndSerialNumber() {
            return formAndSerialNumber;
        }

        /**
         * Sets the value of the formAndSerialNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormAndSerialNumber(String value) {
            this.formAndSerialNumber = value;
        }

        /**
         * Gets the value of the agencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencyCode() {
            return agencyCode;
        }

        /**
         * Sets the value of the agencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencyCode(String value) {
            this.agencyCode = value;
        }

        /**
         * Gets the value of the countryCodeOfIssue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCodeOfIssue() {
            return countryCodeOfIssue;
        }

        /**
         * Sets the value of the countryCodeOfIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCodeOfIssue(String value) {
            this.countryCodeOfIssue = value;
        }

        /**
         * Gets the value of the issuingCompanyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuingCompanyName() {
            return issuingCompanyName;
        }

        /**
         * Sets the value of the issuingCompanyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuingCompanyName(String value) {
            this.issuingCompanyName = value;
        }

        /**
         * Gets the value of the endorsementInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndorsementInfo() {
            return endorsementInfo;
        }

        /**
         * Sets the value of the endorsementInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndorsementInfo(String value) {
            this.endorsementInfo = value;
        }

        /**
         * Gets the value of the dateOfIssue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * Sets the value of the dateOfIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfIssue(String value) {
            this.dateOfIssue = value;
        }

        /**
         * Gets the value of the originalDateofIssue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalDateofIssue() {
            return originalDateofIssue;
        }

        /**
         * Sets the value of the originalDateofIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalDateofIssue(String value) {
            this.originalDateofIssue = value;
        }

        /**
         * Gets the value of the issuingAgentID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuingAgentID() {
            return issuingAgentID;
        }

        /**
         * Sets the value of the issuingAgentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuingAgentID(String value) {
            this.issuingAgentID = value;
        }

        /**
         * Gets the value of the ticketBookReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketBookReference() {
            return ticketBookReference;
        }

        /**
         * Sets the value of the ticketBookReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketBookReference(String value) {
            this.ticketBookReference = value;
        }

        /**
         * Gets the value of the companyShortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyShortName() {
            return companyShortName;
        }

        /**
         * Sets the value of the companyShortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyShortName(String value) {
            this.companyShortName = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfRPH" />
         *       &lt;attribute name="CouponNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to4" />
         *       &lt;attribute name="DocumentNumberCheckDigit">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="PaperTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="CouponReference" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to8" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CouponInfo {

            @XmlAttribute(name = "FlightRPH", required = true)
            protected List<String> flightRPH;
            @XmlAttribute(name = "CouponNumber", required = true)
            protected int couponNumber;
            @XmlAttribute(name = "DocumentNumberCheckDigit")
            protected String documentNumberCheckDigit;
            @XmlAttribute(name = "PaperTicketInd")
            protected Boolean paperTicketInd;
            @XmlAttribute(name = "CouponReference")
            protected String couponReference;

            /**
             * Gets the value of the flightRPH property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightRPH property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightRPH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getFlightRPH() {
                if (flightRPH == null) {
                    flightRPH = new ArrayList<String>();
                }
                return this.flightRPH;
            }

            /**
             * Gets the value of the couponNumber property.
             * 
             */
            public int getCouponNumber() {
                return couponNumber;
            }

            /**
             * Sets the value of the couponNumber property.
             * 
             */
            public void setCouponNumber(int value) {
                this.couponNumber = value;
            }

            /**
             * Gets the value of the documentNumberCheckDigit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentNumberCheckDigit() {
                return documentNumberCheckDigit;
            }

            /**
             * Sets the value of the documentNumberCheckDigit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentNumberCheckDigit(String value) {
                this.documentNumberCheckDigit = value;
            }

            /**
             * Gets the value of the paperTicketInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPaperTicketInd() {
                return paperTicketInd;
            }

            /**
             * Sets the value of the paperTicketInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPaperTicketInd(Boolean value) {
                this.paperTicketInd = value;
            }

            /**
             * Gets the value of the couponReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCouponReference() {
                return couponReference;
            }

            /**
             * Sets the value of the couponReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCouponReference(String value) {
                this.couponReference = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FormOfPayment" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PaymentDetailType" maxOccurs="4" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CurrencyAmountGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "formOfPayment"
        })
        public static class PaymentTotal {

            @XmlElement(name = "FormOfPayment")
            protected List<PaymentDetailType> formOfPayment;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the formOfPayment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFormOfPayment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PaymentDetailType }
             * 
             * 
             */
            public List<PaymentDetailType> getFormOfPayment() {
                if (formOfPayment == null) {
                    formOfPayment = new ArrayList<PaymentDetailType>();
                }
                return this.formOfPayment;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

        }

    }

}
