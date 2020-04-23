
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.opentravel.ota._2003._05.aircommontypes.OtherServiceInfoType;
import org.opentravel.ota._2003._05.aircommontypes.SpecialServiceRequestType;
import org.opentravel.ota._2003._05.commontypes.CompanyNameType;
import org.opentravel.ota._2003._05.commontypes.FreeTextType;
import org.opentravel.ota._2003._05.commontypes.LocationType;
import org.opentravel.ota._2003._05.simpletypes.ActionType;
import org.opentravel.ota._2003._05.simpletypes.ShareMarketIndType;
import org.opentravel.ota._2003._05.simpletypes.ShareSynchIndType;
import org.opentravel.ota._2003._05.simpletypes.SingleVendorIndType;


/**
 * <p>Java class for PassengerFlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerProcessingInfo" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}PassengerProcessingInfoType" minOccurs="0"/>
 *         &lt;element name="BookingInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookingReferenceID" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}BookingReferenceIDType" maxOccurs="9" minOccurs="0"/>
 *                   &lt;element name="FinalDestination" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="StatusCode">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[A-Z0-9a-z]{2}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="StatusName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *                 &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" />
 *                 &lt;attribute name="OriginalResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" />
 *                 &lt;attribute name="UpgradeResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SeatBoardingInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DepartureAirport" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalAirport" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="BoardingPriority" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *                 &lt;attribute name="BoardingZone">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9a-zA-Z]{1,9}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SeatCharacteristics" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfOTA_CodeType" />
 *                 &lt;attribute name="AddSeatNumber">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{1,3}[A-Z]{1}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SeatNumber">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{1,3}[A-Z]{1}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="NonRevCategory">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="NRPS"/>
 *                       &lt;enumeration value="NRSA"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *                 &lt;attribute name="SeatStatus" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
 *                 &lt;attribute name="NeedThruSeatInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerServiceInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialServiceRequest" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}SpecialServiceRequestType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="OtherServiceInfo" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}OtherServiceInfoType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="PassengerMessage" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/CommonTypes>FreeTextType">
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
 *         &lt;element name="ConnectingFlightInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InboundConnectingFlight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}FlightNumberType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OutboundConnectingFlight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}FlightNumberType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="FlightRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="ShortCheckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DCS_SequenceNumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[A-Za-z0-9]{1,5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DCS_InfantSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DCS_PassengerRefNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to999" />
 *       &lt;attribute name="AlternateFlightNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}FlightNumberType" />
 *       &lt;attribute name="CheckInDateTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *       &lt;attribute name="UpgradeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Voluntary"/>
 *             &lt;enumeration value="Involuntary"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RevenuePriorityCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFlightInfoType", propOrder = {
    "passengerProcessingInfo",
    "bookingInfo",
    "seatBoardingInfo",
    "passengerServiceInfo",
    "frequentTravelerInfo",
    "connectingFlightInfo"
})
public class PassengerFlightInfoType {

    @XmlElement(name = "PassengerProcessingInfo")
    protected PassengerProcessingInfoType passengerProcessingInfo;
    @XmlElement(name = "BookingInfo")
    protected PassengerFlightInfoType.BookingInfo bookingInfo;
    @XmlElement(name = "SeatBoardingInfo")
    protected List<PassengerFlightInfoType.SeatBoardingInfo> seatBoardingInfo;
    @XmlElement(name = "PassengerServiceInfo")
    protected PassengerFlightInfoType.PassengerServiceInfo passengerServiceInfo;
    @XmlElement(name = "FrequentTravelerInfo")
    protected PassengerFlightInfoType.FrequentTravelerInfo frequentTravelerInfo;
    @XmlElement(name = "ConnectingFlightInfo")
    protected PassengerFlightInfoType.ConnectingFlightInfo connectingFlightInfo;
    @XmlAttribute(name = "PassengerRPH")
    protected String passengerRPH;
    @XmlAttribute(name = "FlightRPH")
    protected String flightRPH;
    @XmlAttribute(name = "ShortCheckInd")
    protected Boolean shortCheckInd;
    @XmlAttribute(name = "DCS_SequenceNumber")
    protected String dcsSequenceNumber;
    @XmlAttribute(name = "DCS_InfantSequenceNumber")
    protected String dcsInfantSequenceNumber;
    @XmlAttribute(name = "DCS_PassengerRefNumber")
    protected Integer dcsPassengerRefNumber;
    @XmlAttribute(name = "AlternateFlightNumber")
    protected String alternateFlightNumber;
    @XmlAttribute(name = "CheckInDateTime")
    protected String checkInDateTime;
    @XmlAttribute(name = "UpgradeType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String upgradeType;
    @XmlAttribute(name = "RevenuePriorityCode")
    protected String revenuePriorityCode;

    /**
     * Gets the value of the passengerProcessingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProcessingInfoType }
     *     
     */
    public PassengerProcessingInfoType getPassengerProcessingInfo() {
        return passengerProcessingInfo;
    }

    /**
     * Sets the value of the passengerProcessingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProcessingInfoType }
     *     
     */
    public void setPassengerProcessingInfo(PassengerProcessingInfoType value) {
        this.passengerProcessingInfo = value;
    }

    /**
     * Gets the value of the bookingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFlightInfoType.BookingInfo }
     *     
     */
    public PassengerFlightInfoType.BookingInfo getBookingInfo() {
        return bookingInfo;
    }

    /**
     * Sets the value of the bookingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFlightInfoType.BookingInfo }
     *     
     */
    public void setBookingInfo(PassengerFlightInfoType.BookingInfo value) {
        this.bookingInfo = value;
    }

    /**
     * Gets the value of the seatBoardingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatBoardingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatBoardingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerFlightInfoType.SeatBoardingInfo }
     * 
     * 
     */
    public List<PassengerFlightInfoType.SeatBoardingInfo> getSeatBoardingInfo() {
        if (seatBoardingInfo == null) {
            seatBoardingInfo = new ArrayList<PassengerFlightInfoType.SeatBoardingInfo>();
        }
        return this.seatBoardingInfo;
    }

    /**
     * Gets the value of the passengerServiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFlightInfoType.PassengerServiceInfo }
     *     
     */
    public PassengerFlightInfoType.PassengerServiceInfo getPassengerServiceInfo() {
        return passengerServiceInfo;
    }

    /**
     * Sets the value of the passengerServiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFlightInfoType.PassengerServiceInfo }
     *     
     */
    public void setPassengerServiceInfo(PassengerFlightInfoType.PassengerServiceInfo value) {
        this.passengerServiceInfo = value;
    }

    /**
     * Gets the value of the frequentTravelerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFlightInfoType.FrequentTravelerInfo }
     *     
     */
    public PassengerFlightInfoType.FrequentTravelerInfo getFrequentTravelerInfo() {
        return frequentTravelerInfo;
    }

    /**
     * Sets the value of the frequentTravelerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFlightInfoType.FrequentTravelerInfo }
     *     
     */
    public void setFrequentTravelerInfo(PassengerFlightInfoType.FrequentTravelerInfo value) {
        this.frequentTravelerInfo = value;
    }

    /**
     * Gets the value of the connectingFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerFlightInfoType.ConnectingFlightInfo }
     *     
     */
    public PassengerFlightInfoType.ConnectingFlightInfo getConnectingFlightInfo() {
        return connectingFlightInfo;
    }

    /**
     * Sets the value of the connectingFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerFlightInfoType.ConnectingFlightInfo }
     *     
     */
    public void setConnectingFlightInfo(PassengerFlightInfoType.ConnectingFlightInfo value) {
        this.connectingFlightInfo = value;
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
     * Gets the value of the dcsInfantSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCSInfantSequenceNumber() {
        return dcsInfantSequenceNumber;
    }

    /**
     * Sets the value of the dcsInfantSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCSInfantSequenceNumber(String value) {
        this.dcsInfantSequenceNumber = value;
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
     * Gets the value of the alternateFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateFlightNumber() {
        return alternateFlightNumber;
    }

    /**
     * Sets the value of the alternateFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateFlightNumber(String value) {
        this.alternateFlightNumber = value;
    }

    /**
     * Gets the value of the checkInDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInDateTime() {
        return checkInDateTime;
    }

    /**
     * Sets the value of the checkInDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDateTime(String value) {
        this.checkInDateTime = value;
    }

    /**
     * Gets the value of the upgradeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeType() {
        return upgradeType;
    }

    /**
     * Sets the value of the upgradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeType(String value) {
        this.upgradeType = value;
    }

    /**
     * Gets the value of the revenuePriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenuePriorityCode() {
        return revenuePriorityCode;
    }

    /**
     * Sets the value of the revenuePriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenuePriorityCode(String value) {
        this.revenuePriorityCode = value;
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
     *         &lt;element name="BookingReferenceID" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}BookingReferenceIDType" maxOccurs="9" minOccurs="0"/>
     *         &lt;element name="FinalDestination" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="StatusCode">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[A-Z0-9a-z]{2}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="StatusName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
     *       &lt;attribute name="ResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" />
     *       &lt;attribute name="OriginalResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" />
     *       &lt;attribute name="UpgradeResBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingReferenceID",
        "finalDestination"
    })
    public static class BookingInfo {

        @XmlElement(name = "BookingReferenceID")
        protected List<BookingReferenceIDType> bookingReferenceID;
        @XmlElement(name = "FinalDestination")
        protected PassengerFlightInfoType.BookingInfo.FinalDestination finalDestination;
        @XmlAttribute(name = "StatusCode")
        protected String statusCode;
        @XmlAttribute(name = "StatusName")
        protected String statusName;
        @XmlAttribute(name = "ResBookDesigCode")
        protected String resBookDesigCode;
        @XmlAttribute(name = "OriginalResBookDesigCode")
        protected String originalResBookDesigCode;
        @XmlAttribute(name = "UpgradeResBookDesigCode")
        protected String upgradeResBookDesigCode;

        /**
         * Gets the value of the bookingReferenceID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingReferenceID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingReferenceID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingReferenceIDType }
         * 
         * 
         */
        public List<BookingReferenceIDType> getBookingReferenceID() {
            if (bookingReferenceID == null) {
                bookingReferenceID = new ArrayList<BookingReferenceIDType>();
            }
            return this.bookingReferenceID;
        }

        /**
         * Gets the value of the finalDestination property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerFlightInfoType.BookingInfo.FinalDestination }
         *     
         */
        public PassengerFlightInfoType.BookingInfo.FinalDestination getFinalDestination() {
            return finalDestination;
        }

        /**
         * Sets the value of the finalDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerFlightInfoType.BookingInfo.FinalDestination }
         *     
         */
        public void setFinalDestination(PassengerFlightInfoType.BookingInfo.FinalDestination value) {
            this.finalDestination = value;
        }

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        /**
         * Gets the value of the statusName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusName() {
            return statusName;
        }

        /**
         * Sets the value of the statusName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusName(String value) {
            this.statusName = value;
        }

        /**
         * Gets the value of the resBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        /**
         * Sets the value of the resBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResBookDesigCode(String value) {
            this.resBookDesigCode = value;
        }

        /**
         * Gets the value of the originalResBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalResBookDesigCode() {
            return originalResBookDesigCode;
        }

        /**
         * Sets the value of the originalResBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalResBookDesigCode(String value) {
            this.originalResBookDesigCode = value;
        }

        /**
         * Gets the value of the upgradeResBookDesigCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpgradeResBookDesigCode() {
            return upgradeResBookDesigCode;
        }

        /**
         * Sets the value of the upgradeResBookDesigCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpgradeResBookDesigCode(String value) {
            this.upgradeResBookDesigCode = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FinalDestination {

            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the locationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Sets the value of the locationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
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
     *         &lt;element name="InboundConnectingFlight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}FlightNumberType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OutboundConnectingFlight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}FlightNumberType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inboundConnectingFlight",
        "outboundConnectingFlight"
    })
    public static class ConnectingFlightInfo {

        @XmlElement(name = "InboundConnectingFlight")
        protected PassengerFlightInfoType.ConnectingFlightInfo.InboundConnectingFlight inboundConnectingFlight;
        @XmlElement(name = "OutboundConnectingFlight")
        protected PassengerFlightInfoType.ConnectingFlightInfo.OutboundConnectingFlight outboundConnectingFlight;

        /**
         * Gets the value of the inboundConnectingFlight property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerFlightInfoType.ConnectingFlightInfo.InboundConnectingFlight }
         *     
         */
        public PassengerFlightInfoType.ConnectingFlightInfo.InboundConnectingFlight getInboundConnectingFlight() {
            return inboundConnectingFlight;
        }

        /**
         * Sets the value of the inboundConnectingFlight property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerFlightInfoType.ConnectingFlightInfo.InboundConnectingFlight }
         *     
         */
        public void setInboundConnectingFlight(PassengerFlightInfoType.ConnectingFlightInfo.InboundConnectingFlight value) {
            this.inboundConnectingFlight = value;
        }

        /**
         * Gets the value of the outboundConnectingFlight property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerFlightInfoType.ConnectingFlightInfo.OutboundConnectingFlight }
         *     
         */
        public PassengerFlightInfoType.ConnectingFlightInfo.OutboundConnectingFlight getOutboundConnectingFlight() {
            return outboundConnectingFlight;
        }

        /**
         * Sets the value of the outboundConnectingFlight property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerFlightInfoType.ConnectingFlightInfo.OutboundConnectingFlight }
         *     
         */
        public void setOutboundConnectingFlight(PassengerFlightInfoType.ConnectingFlightInfo.OutboundConnectingFlight value) {
            this.outboundConnectingFlight = value;
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
         *         &lt;element name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}FlightNumberType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "carrierCode",
            "departureAirport"
        })
        public static class InboundConnectingFlight {

            @XmlElement(name = "CarrierCode")
            protected CompanyNameType carrierCode;
            @XmlElement(name = "DepartureAirport")
            protected LocationType departureAirport;
            @XmlAttribute(name = "FlightNumber")
            protected String flightNumber;

            /**
             * Gets the value of the carrierCode property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getCarrierCode() {
                return carrierCode;
            }

            /**
             * Sets the value of the carrierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setCarrierCode(CompanyNameType value) {
                this.carrierCode = value;
            }

            /**
             * Gets the value of the departureAirport property.
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getDepartureAirport() {
                return departureAirport;
            }

            /**
             * Sets the value of the departureAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setDepartureAirport(LocationType value) {
                this.departureAirport = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNumber(String value) {
                this.flightNumber = value;
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
         *         &lt;element name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}FlightNumberType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "carrierCode",
            "arrivalAirport"
        })
        public static class OutboundConnectingFlight {

            @XmlElement(name = "CarrierCode")
            protected CompanyNameType carrierCode;
            @XmlElement(name = "ArrivalAirport")
            protected LocationType arrivalAirport;
            @XmlAttribute(name = "FlightNumber")
            protected String flightNumber;

            /**
             * Gets the value of the carrierCode property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getCarrierCode() {
                return carrierCode;
            }

            /**
             * Sets the value of the carrierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setCarrierCode(CompanyNameType value) {
                this.carrierCode = value;
            }

            /**
             * Gets the value of the arrivalAirport property.
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getArrivalAirport() {
                return arrivalAirport;
            }

            /**
             * Sets the value of the arrivalAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setArrivalAirport(LocationType value) {
                this.arrivalAirport = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNumber(String value) {
                this.flightNumber = value;
            }

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
     *       &lt;sequence>
     *         &lt;element name="SpecialServiceRequest" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}SpecialServiceRequestType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="OtherServiceInfo" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}OtherServiceInfoType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="PassengerMessage" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/CommonTypes>FreeTextType">
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialServiceRequest",
        "otherServiceInfo",
        "passengerMessage"
    })
    public static class PassengerServiceInfo {

        @XmlElement(name = "SpecialServiceRequest")
        protected List<SpecialServiceRequestType> specialServiceRequest;
        @XmlElement(name = "OtherServiceInfo")
        protected List<OtherServiceInfoType> otherServiceInfo;
        @XmlElement(name = "PassengerMessage")
        protected List<PassengerFlightInfoType.PassengerServiceInfo.PassengerMessage> passengerMessage;

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
         * Gets the value of the otherServiceInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherServiceInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherServiceInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherServiceInfoType }
         * 
         * 
         */
        public List<OtherServiceInfoType> getOtherServiceInfo() {
            if (otherServiceInfo == null) {
                otherServiceInfo = new ArrayList<OtherServiceInfoType>();
            }
            return this.otherServiceInfo;
        }

        /**
         * Gets the value of the passengerMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerFlightInfoType.PassengerServiceInfo.PassengerMessage }
         * 
         * 
         */
        public List<PassengerFlightInfoType.PassengerServiceInfo.PassengerMessage> getPassengerMessage() {
            if (passengerMessage == null) {
                passengerMessage = new ArrayList<PassengerFlightInfoType.PassengerServiceInfo.PassengerMessage>();
            }
            return this.passengerMessage;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/CommonTypes>FreeTextType">
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PassengerMessage
            extends FreeTextType
        {

            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;

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
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
            }

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
     *         &lt;element name="DepartureAirport" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ArrivalAirport" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="BoardingPriority" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
     *       &lt;attribute name="BoardingZone">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9a-zA-Z]{1,9}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="SeatCharacteristics" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfOTA_CodeType" />
     *       &lt;attribute name="AddSeatNumber">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{1,3}[A-Z]{1}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="SeatNumber">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{1,3}[A-Z]{1}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="NonRevCategory">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="NRPS"/>
     *             &lt;enumeration value="NRSA"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Cabin" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
     *       &lt;attribute name="SeatStatus" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
     *       &lt;attribute name="NeedThruSeatInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "departureAirport",
        "arrivalAirport"
    })
    public static class SeatBoardingInfo {

        @XmlElement(name = "DepartureAirport")
        protected PassengerFlightInfoType.SeatBoardingInfo.DepartureAirport departureAirport;
        @XmlElement(name = "ArrivalAirport")
        protected PassengerFlightInfoType.SeatBoardingInfo.ArrivalAirport arrivalAirport;
        @XmlAttribute(name = "BoardingPriority")
        protected String boardingPriority;
        @XmlAttribute(name = "BoardingZone")
        protected String boardingZone;
        @XmlAttribute(name = "SeatCharacteristics")
        protected List<String> seatCharacteristics;
        @XmlAttribute(name = "AddSeatNumber")
        protected String addSeatNumber;
        @XmlAttribute(name = "SeatNumber")
        protected String seatNumber;
        @XmlAttribute(name = "NonRevCategory")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String nonRevCategory;
        @XmlAttribute(name = "Cabin")
        protected String cabin;
        @XmlAttribute(name = "SeatStatus")
        protected String seatStatus;
        @XmlAttribute(name = "NeedThruSeatInd")
        protected Boolean needThruSeatInd;

        /**
         * Gets the value of the departureAirport property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerFlightInfoType.SeatBoardingInfo.DepartureAirport }
         *     
         */
        public PassengerFlightInfoType.SeatBoardingInfo.DepartureAirport getDepartureAirport() {
            return departureAirport;
        }

        /**
         * Sets the value of the departureAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerFlightInfoType.SeatBoardingInfo.DepartureAirport }
         *     
         */
        public void setDepartureAirport(PassengerFlightInfoType.SeatBoardingInfo.DepartureAirport value) {
            this.departureAirport = value;
        }

        /**
         * Gets the value of the arrivalAirport property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerFlightInfoType.SeatBoardingInfo.ArrivalAirport }
         *     
         */
        public PassengerFlightInfoType.SeatBoardingInfo.ArrivalAirport getArrivalAirport() {
            return arrivalAirport;
        }

        /**
         * Sets the value of the arrivalAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerFlightInfoType.SeatBoardingInfo.ArrivalAirport }
         *     
         */
        public void setArrivalAirport(PassengerFlightInfoType.SeatBoardingInfo.ArrivalAirport value) {
            this.arrivalAirport = value;
        }

        /**
         * Gets the value of the boardingPriority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoardingPriority() {
            return boardingPriority;
        }

        /**
         * Sets the value of the boardingPriority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoardingPriority(String value) {
            this.boardingPriority = value;
        }

        /**
         * Gets the value of the boardingZone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoardingZone() {
            return boardingZone;
        }

        /**
         * Sets the value of the boardingZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoardingZone(String value) {
            this.boardingZone = value;
        }

        /**
         * Gets the value of the seatCharacteristics property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatCharacteristics property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatCharacteristics().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSeatCharacteristics() {
            if (seatCharacteristics == null) {
                seatCharacteristics = new ArrayList<String>();
            }
            return this.seatCharacteristics;
        }

        /**
         * Gets the value of the addSeatNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddSeatNumber() {
            return addSeatNumber;
        }

        /**
         * Sets the value of the addSeatNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddSeatNumber(String value) {
            this.addSeatNumber = value;
        }

        /**
         * Gets the value of the seatNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeatNumber() {
            return seatNumber;
        }

        /**
         * Sets the value of the seatNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeatNumber(String value) {
            this.seatNumber = value;
        }

        /**
         * Gets the value of the nonRevCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonRevCategory() {
            return nonRevCategory;
        }

        /**
         * Sets the value of the nonRevCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonRevCategory(String value) {
            this.nonRevCategory = value;
        }

        /**
         * Gets the value of the cabin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabin() {
            return cabin;
        }

        /**
         * Sets the value of the cabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabin(String value) {
            this.cabin = value;
        }

        /**
         * Gets the value of the seatStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeatStatus() {
            return seatStatus;
        }

        /**
         * Sets the value of the seatStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeatStatus(String value) {
            this.seatStatus = value;
        }

        /**
         * Gets the value of the needThruSeatInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNeedThruSeatInd() {
            return needThruSeatInd;
        }

        /**
         * Sets the value of the needThruSeatInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNeedThruSeatInd(Boolean value) {
            this.needThruSeatInd = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ArrivalAirport {

            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the locationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Sets the value of the locationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DepartureAirport {

            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the locationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * Sets the value of the locationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
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

        }

    }

}
