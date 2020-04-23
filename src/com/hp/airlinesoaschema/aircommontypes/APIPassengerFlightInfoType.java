
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.opentravel.ota._2003._05.aircommontypes.SpecialServiceRequestType;
import org.opentravel.ota._2003._05.commontypes.FeeType;
import org.opentravel.ota._2003._05.simpletypes.CabinType;
import org.opentravel.ota._2003._05.simpletypes.ShareMarketIndType;
import org.opentravel.ota._2003._05.simpletypes.ShareSynchIndType;
import org.opentravel.ota._2003._05.simpletypes.SingleVendorIndType;


/**
 * Captures information for a specific passenger travelling on a specific flight or segment.
 * 
 * <p>Java class for API_PassengerFlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_PassengerFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingInfo" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_BookingInfoType" minOccurs="0"/>
 *         &lt;element name="SeatBoardingInfo" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_SeatBoardingInfoType" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}FeeType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="SpecialServiceRequest" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}SpecialServiceRequestType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="AgencyRequirements" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_AgencyRequirementsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternationalProcessingInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="DocumentVerification" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1" />
 *                 &lt;attribute name="AirportPassengerProcessingCode">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{2}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="DocumentVerifiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FrequentTravelerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CustomerLoyaltyGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PassengerRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="FlightRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="BaggageCabinType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}CabinType" />
 *       &lt;attribute name="SpecialPurposeCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[A-Z]{1,4}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DeniedBoardingVolunteerInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ShortCheckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NonRevAuthorizedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PassengerCouponStatus" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1" />
 *       &lt;attribute name="DCS_SequenceNumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[A-Za-z0-9]{1,5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DCS_PassengerRefNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to999" />
 *       &lt;attribute name="BoardingPassColor" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
 *       &lt;attribute name="ModifySeatMapIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_PassengerFlightInfoType", propOrder = {
    "bookingInfo",
    "seatBoardingInfo",
    "fee",
    "specialServiceRequest",
    "agencyRequirements",
    "internationalProcessingInfo",
    "frequentTravelerInfo"
})
public class APIPassengerFlightInfoType {

    @XmlElement(name = "BookingInfo")
    protected APIBookingInfoType bookingInfo;
    @XmlElement(name = "SeatBoardingInfo")
    protected APISeatBoardingInfoType seatBoardingInfo;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
    @XmlElement(name = "SpecialServiceRequest")
    protected List<SpecialServiceRequestType> specialServiceRequest;
    @XmlElement(name = "AgencyRequirements")
    protected List<APIAgencyRequirementsType> agencyRequirements;
    @XmlElement(name = "InternationalProcessingInfo")
    protected APIPassengerFlightInfoType.InternationalProcessingInfo internationalProcessingInfo;
    @XmlElement(name = "FrequentTravelerInfo")
    protected APIPassengerFlightInfoType.FrequentTravelerInfo frequentTravelerInfo;
    @XmlAttribute(name = "PassengerRPH", required = true)
    protected String passengerRPH;
    @XmlAttribute(name = "FlightRPH", required = true)
    protected String flightRPH;
    @XmlAttribute(name = "BaggageCabinType")
    protected CabinType baggageCabinType;
    @XmlAttribute(name = "SpecialPurposeCode")
    protected String specialPurposeCode;
    @XmlAttribute(name = "DeniedBoardingVolunteerInd")
    protected Boolean deniedBoardingVolunteerInd;
    @XmlAttribute(name = "ShortCheckInd")
    protected Boolean shortCheckInd;
    @XmlAttribute(name = "NonRevAuthorizedInd")
    protected Boolean nonRevAuthorizedInd;
    @XmlAttribute(name = "PassengerCouponStatus")
    protected String passengerCouponStatus;
    @XmlAttribute(name = "DCS_SequenceNumber")
    protected String dcsSequenceNumber;
    @XmlAttribute(name = "DCS_PassengerRefNumber")
    protected Integer dcsPassengerRefNumber;
    @XmlAttribute(name = "BoardingPassColor")
    protected String boardingPassColor;
    @XmlAttribute(name = "ModifySeatMapIndicator")
    protected Boolean modifySeatMapIndicator;

    /**
     * Gets the value of the bookingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link APIBookingInfoType }
     *     
     */
    public APIBookingInfoType getBookingInfo() {
        return bookingInfo;
    }

    /**
     * Sets the value of the bookingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIBookingInfoType }
     *     
     */
    public void setBookingInfo(APIBookingInfoType value) {
        this.bookingInfo = value;
    }

    /**
     * Gets the value of the seatBoardingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link APISeatBoardingInfoType }
     *     
     */
    public APISeatBoardingInfoType getSeatBoardingInfo() {
        return seatBoardingInfo;
    }

    /**
     * Sets the value of the seatBoardingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link APISeatBoardingInfoType }
     *     
     */
    public void setSeatBoardingInfo(APISeatBoardingInfoType value) {
        this.seatBoardingInfo = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the specialServiceRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceRequestType }
     * 
     * 
     */
    public List<SpecialServiceRequestType> getSpecialServiceRequest() {
        if (specialServiceRequest == null) {
            specialServiceRequest = new ArrayList<SpecialServiceRequestType>();
        }
        return this.specialServiceRequest;
    }

    /**
     * Gets the value of the agencyRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIAgencyRequirementsType }
     * 
     * 
     */
    public List<APIAgencyRequirementsType> getAgencyRequirements() {
        if (agencyRequirements == null) {
            agencyRequirements = new ArrayList<APIAgencyRequirementsType>();
        }
        return this.agencyRequirements;
    }

    /**
     * Gets the value of the internationalProcessingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link APIPassengerFlightInfoType.InternationalProcessingInfo }
     *     
     */
    public APIPassengerFlightInfoType.InternationalProcessingInfo getInternationalProcessingInfo() {
        return internationalProcessingInfo;
    }

    /**
     * Sets the value of the internationalProcessingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIPassengerFlightInfoType.InternationalProcessingInfo }
     *     
     */
    public void setInternationalProcessingInfo(APIPassengerFlightInfoType.InternationalProcessingInfo value) {
        this.internationalProcessingInfo = value;
    }

    /**
     * Gets the value of the frequentTravelerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link APIPassengerFlightInfoType.FrequentTravelerInfo }
     *     
     */
    public APIPassengerFlightInfoType.FrequentTravelerInfo getFrequentTravelerInfo() {
        return frequentTravelerInfo;
    }

    /**
     * Sets the value of the frequentTravelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIPassengerFlightInfoType.FrequentTravelerInfo }
     *     
     */
    public void setFrequentTravelerInfo(APIPassengerFlightInfoType.FrequentTravelerInfo value) {
        this.frequentTravelerInfo = value;
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
     * Gets the value of the flightRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightRPH() {
        return flightRPH;
    }

    /**
     * Sets the value of the flightRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightRPH(String value) {
        this.flightRPH = value;
    }

    /**
     * Gets the value of the baggageCabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getBaggageCabinType() {
        return baggageCabinType;
    }

    /**
     * Sets the value of the baggageCabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setBaggageCabinType(CabinType value) {
        this.baggageCabinType = value;
    }

    /**
     * Gets the value of the specialPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPurposeCode() {
        return specialPurposeCode;
    }

    /**
     * Sets the value of the specialPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPurposeCode(String value) {
        this.specialPurposeCode = value;
    }

    /**
     * Gets the value of the deniedBoardingVolunteerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeniedBoardingVolunteerInd() {
        return deniedBoardingVolunteerInd;
    }

    /**
     * Sets the value of the deniedBoardingVolunteerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeniedBoardingVolunteerInd(Boolean value) {
        this.deniedBoardingVolunteerInd = value;
    }

    /**
     * Gets the value of the shortCheckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortCheckInd() {
        return shortCheckInd;
    }

    /**
     * Sets the value of the shortCheckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortCheckInd(Boolean value) {
        this.shortCheckInd = value;
    }

    /**
     * Gets the value of the nonRevAuthorizedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRevAuthorizedInd() {
        return nonRevAuthorizedInd;
    }

    /**
     * Sets the value of the nonRevAuthorizedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRevAuthorizedInd(Boolean value) {
        this.nonRevAuthorizedInd = value;
    }

    /**
     * Gets the value of the passengerCouponStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerCouponStatus() {
        return passengerCouponStatus;
    }

    /**
     * Sets the value of the passengerCouponStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerCouponStatus(String value) {
        this.passengerCouponStatus = value;
    }

    /**
     * Gets the value of the dcsSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSSequenceNumber() {
        return dcsSequenceNumber;
    }

    /**
     * Sets the value of the dcsSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSSequenceNumber(String value) {
        this.dcsSequenceNumber = value;
    }

    /**
     * Gets the value of the dcsPassengerRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDCSPassengerRefNumber() {
        return dcsPassengerRefNumber;
    }

    /**
     * Sets the value of the dcsPassengerRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDCSPassengerRefNumber(Integer value) {
        this.dcsPassengerRefNumber = value;
    }

    /**
     * Gets the value of the boardingPassColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingPassColor() {
        return boardingPassColor;
    }

    /**
     * Sets the value of the boardingPassColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingPassColor(String value) {
        this.boardingPassColor = value;
    }

    /**
     * Gets the value of the modifySeatMapIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifySeatMapIndicator() {
        return modifySeatMapIndicator;
    }

    /**
     * Sets the value of the modifySeatMapIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifySeatMapIndicator(Boolean value) {
        this.modifySeatMapIndicator = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CustomerLoyaltyGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FrequentTravelerInfo {

        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "PrimaryLoyaltyIndicator")
        protected Boolean primaryLoyaltyIndicator;
        @XmlAttribute(name = "AllianceLoyaltyLevelName")
        protected String allianceLoyaltyLevelName;
        @XmlAttribute(name = "CustomerType")
        protected String customerType;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;
        @XmlAttribute(name = "Password")
        protected String password;
        @XmlAttribute(name = "ShareSynchInd")
        protected ShareSynchIndType shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        protected ShareMarketIndType shareMarketInd;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "SignupDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signupDate;
        @XmlAttribute(name = "SingleVendorInd")
        protected SingleVendorIndType singleVendorInd;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected Integer loyalLevelCode;

        /**
         * Gets the value of the programID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * Sets the value of the programID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * Gets the value of the membershipID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * Sets the value of the membershipID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
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
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * Gets the value of the primaryLoyaltyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryLoyaltyIndicator() {
            return primaryLoyaltyIndicator;
        }

        /**
         * Sets the value of the primaryLoyaltyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryLoyaltyIndicator(Boolean value) {
            this.primaryLoyaltyIndicator = value;
        }

        /**
         * Gets the value of the allianceLoyaltyLevelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllianceLoyaltyLevelName() {
            return allianceLoyaltyLevelName;
        }

        /**
         * Sets the value of the allianceLoyaltyLevelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllianceLoyaltyLevelName(String value) {
            this.allianceLoyaltyLevelName = value;
        }

        /**
         * Gets the value of the customerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerType() {
            return customerType;
        }

        /**
         * Sets the value of the customerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerType(String value) {
            this.customerType = value;
        }

        /**
         * Gets the value of the customerValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * Sets the value of the customerValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link ShareSynchIndType }
         *     
         */
        public ShareSynchIndType getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShareSynchIndType }
         *     
         */
        public void setShareSynchInd(ShareSynchIndType value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link ShareMarketIndType }
         *     
         */
        public ShareMarketIndType getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShareMarketIndType }
         *     
         */
        public void setShareMarketInd(ShareMarketIndType value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the expireDateExclusiveIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * Sets the value of the expireDateExclusiveIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
        }

        /**
         * Gets the value of the signupDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignupDate() {
            return signupDate;
        }

        /**
         * Sets the value of the signupDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignupDate(XMLGregorianCalendar value) {
            this.signupDate = value;
        }

        /**
         * Gets the value of the singleVendorInd property.
         * 
         * @return
         *     possible object is
         *     {@link SingleVendorIndType }
         *     
         */
        public SingleVendorIndType getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * Sets the value of the singleVendorInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link SingleVendorIndType }
         *     
         */
        public void setSingleVendorInd(SingleVendorIndType value) {
            this.singleVendorInd = value;
        }

        /**
         * Gets the value of the loyalLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * Sets the value of the loyalLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * Gets the value of the loyalLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * Sets the value of the loyalLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLoyalLevelCode(Integer value) {
            this.loyalLevelCode = value;
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
     *       &lt;attribute name="DocumentVerification" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1" />
     *       &lt;attribute name="AirportPassengerProcessingCode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{2}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="DocumentVerifiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InternationalProcessingInfo {

        @XmlAttribute(name = "DocumentVerification")
        protected String documentVerification;
        @XmlAttribute(name = "AirportPassengerProcessingCode")
        protected String airportPassengerProcessingCode;
        @XmlAttribute(name = "DocumentVerifiedInd")
        protected Boolean documentVerifiedInd;

        /**
         * Gets the value of the documentVerification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentVerification() {
            return documentVerification;
        }

        /**
         * Sets the value of the documentVerification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentVerification(String value) {
            this.documentVerification = value;
        }

        /**
         * Gets the value of the airportPassengerProcessingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirportPassengerProcessingCode() {
            return airportPassengerProcessingCode;
        }

        /**
         * Sets the value of the airportPassengerProcessingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirportPassengerProcessingCode(String value) {
            this.airportPassengerProcessingCode = value;
        }

        /**
         * Gets the value of the documentVerifiedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDocumentVerifiedInd() {
            return documentVerifiedInd;
        }

        /**
         * Sets the value of the documentVerifiedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDocumentVerifiedInd(Boolean value) {
            this.documentVerifiedInd = value;
        }

    }

}
