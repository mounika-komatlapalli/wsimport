
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
import org.opentravel.ota._2003._05.commontypes.EquipmentType;
import org.opentravel.ota._2003._05.commontypes.OperatingAirlineType;
import org.opentravel.ota._2003._05.simpletypes.DayOfWeekType;


/**
 * <p>Java class for FlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierInfo" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}OperatingAirlineType" maxOccurs="2"/>
 *         &lt;element name="Equipment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/CommonTypes>EquipmentType">
 *                 &lt;attribute name="AircraftTailNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DepartureInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}AirportLocationGroup"/>
 *                 &lt;attribute name="DateOfDeparture" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *                 &lt;attribute name="JulianDateOfDeparture">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{3}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DayOfWeekType" />
 *                 &lt;attribute name="ScheduledDepartureTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *                 &lt;attribute name="EstimatedDepartureDateTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *                 &lt;attribute name="BoardingDateTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *                 &lt;attribute name="OtherCheckInInformation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to128" />
 *                 &lt;attribute name="LocationName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrivalInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}AirportLocationGroup"/>
 *                 &lt;attribute name="DateOfArrival" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DayOfWeekType" />
 *                 &lt;attribute name="ScheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="DateChangeIdentifier">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="-1"/>
 *                       &lt;enumeration value="+1"/>
 *                       &lt;enumeration value="+2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="LocationName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="StopoverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoType", propOrder = {
    "carrierInfo",
    "equipment",
    "departureInformation",
    "arrivalInformation"
})
public class FlightInfoType {

    @XmlElement(name = "CarrierInfo", required = true)
    protected List<OperatingAirlineType> carrierInfo;
    @XmlElement(name = "Equipment")
    protected FlightInfoType.Equipment equipment;
    @XmlElement(name = "DepartureInformation", required = true)
    protected FlightInfoType.DepartureInformation departureInformation;
    @XmlElement(name = "ArrivalInformation")
    protected FlightInfoType.ArrivalInformation arrivalInformation;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "StopoverInd")
    protected Boolean stopoverInd;

    /**
     * Gets the value of the carrierInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingAirlineType }
     * 
     * 
     */
    public List<OperatingAirlineType> getCarrierInfo() {
        if (carrierInfo == null) {
            carrierInfo = new ArrayList<OperatingAirlineType>();
        }
        return this.carrierInfo;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoType.Equipment }
     *     
     */
    public FlightInfoType.Equipment getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoType.Equipment }
     *     
     */
    public void setEquipment(FlightInfoType.Equipment value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the departureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoType.DepartureInformation }
     *     
     */
    public FlightInfoType.DepartureInformation getDepartureInformation() {
        return departureInformation;
    }

    /**
     * Sets the value of the departureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoType.DepartureInformation }
     *     
     */
    public void setDepartureInformation(FlightInfoType.DepartureInformation value) {
        this.departureInformation = value;
    }

    /**
     * Gets the value of the arrivalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoType.ArrivalInformation }
     *     
     */
    public FlightInfoType.ArrivalInformation getArrivalInformation() {
        return arrivalInformation;
    }

    /**
     * Sets the value of the arrivalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoType.ArrivalInformation }
     *     
     */
    public void setArrivalInformation(FlightInfoType.ArrivalInformation value) {
        this.arrivalInformation = value;
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
     * Gets the value of the stopoverInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopoverInd() {
        return stopoverInd;
    }

    /**
     * Sets the value of the stopoverInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopoverInd(Boolean value) {
        this.stopoverInd = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}AirportLocationGroup"/>
     *       &lt;attribute name="DateOfArrival" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
     *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DayOfWeekType" />
     *       &lt;attribute name="ScheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="DateChangeIdentifier">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="-1"/>
     *             &lt;enumeration value="+1"/>
     *             &lt;enumeration value="+2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="LocationName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalInformation {

        @XmlAttribute(name = "DateOfArrival")
        protected String dateOfArrival;
        @XmlAttribute(name = "DayOfWeek")
        protected DayOfWeekType dayOfWeek;
        @XmlAttribute(name = "ScheduledArrivalTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar scheduledArrivalTime;
        @XmlAttribute(name = "DateChangeIdentifier")
        protected String dateChangeIdentifier;
        @XmlAttribute(name = "LocationName")
        protected String locationName;
        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Terminal")
        protected String terminal;
        @XmlAttribute(name = "Gate")
        protected String gate;

        /**
         * Gets the value of the dateOfArrival property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfArrival() {
            return dateOfArrival;
        }

        /**
         * Sets the value of the dateOfArrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfArrival(String value) {
            this.dateOfArrival = value;
        }

        /**
         * Gets the value of the dayOfWeek property.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * Sets the value of the dayOfWeek property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDayOfWeek(DayOfWeekType value) {
            this.dayOfWeek = value;
        }

        /**
         * Gets the value of the scheduledArrivalTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getScheduledArrivalTime() {
            return scheduledArrivalTime;
        }

        /**
         * Sets the value of the scheduledArrivalTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setScheduledArrivalTime(XMLGregorianCalendar value) {
            this.scheduledArrivalTime = value;
        }

        /**
         * Gets the value of the dateChangeIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateChangeIdentifier() {
            return dateChangeIdentifier;
        }

        /**
         * Sets the value of the dateChangeIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateChangeIdentifier(String value) {
            this.dateChangeIdentifier = value;
        }

        /**
         * Gets the value of the locationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationName() {
            return locationName;
        }

        /**
         * Sets the value of the locationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationName(String value) {
            this.locationName = value;
        }

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

        /**
         * Gets the value of the terminal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminal() {
            return terminal;
        }

        /**
         * Sets the value of the terminal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminal(String value) {
            this.terminal = value;
        }

        /**
         * Gets the value of the gate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGate() {
            return gate;
        }

        /**
         * Sets the value of the gate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGate(String value) {
            this.gate = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}AirportLocationGroup"/>
     *       &lt;attribute name="DateOfDeparture" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
     *       &lt;attribute name="JulianDateOfDeparture">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{3}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DayOfWeekType" />
     *       &lt;attribute name="ScheduledDepartureTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
     *       &lt;attribute name="EstimatedDepartureDateTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
     *       &lt;attribute name="BoardingDateTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
     *       &lt;attribute name="OtherCheckInInformation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to128" />
     *       &lt;attribute name="LocationName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DepartureInformation {

        @XmlAttribute(name = "DateOfDeparture", required = true)
        protected String dateOfDeparture;
        @XmlAttribute(name = "JulianDateOfDeparture")
        protected String julianDateOfDeparture;
        @XmlAttribute(name = "DayOfWeek")
        protected DayOfWeekType dayOfWeek;
        @XmlAttribute(name = "ScheduledDepartureTime")
        protected String scheduledDepartureTime;
        @XmlAttribute(name = "EstimatedDepartureDateTime")
        protected String estimatedDepartureDateTime;
        @XmlAttribute(name = "BoardingDateTime")
        protected String boardingDateTime;
        @XmlAttribute(name = "OtherCheckInInformation")
        protected String otherCheckInInformation;
        @XmlAttribute(name = "LocationName")
        protected String locationName;
        @XmlAttribute(name = "LocationCode")
        protected String locationCode;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Terminal")
        protected String terminal;
        @XmlAttribute(name = "Gate")
        protected String gate;

        /**
         * Gets the value of the dateOfDeparture property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfDeparture() {
            return dateOfDeparture;
        }

        /**
         * Sets the value of the dateOfDeparture property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfDeparture(String value) {
            this.dateOfDeparture = value;
        }

        /**
         * Gets the value of the julianDateOfDeparture property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJulianDateOfDeparture() {
            return julianDateOfDeparture;
        }

        /**
         * Sets the value of the julianDateOfDeparture property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJulianDateOfDeparture(String value) {
            this.julianDateOfDeparture = value;
        }

        /**
         * Gets the value of the dayOfWeek property.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * Sets the value of the dayOfWeek property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDayOfWeek(DayOfWeekType value) {
            this.dayOfWeek = value;
        }

        /**
         * Gets the value of the scheduledDepartureTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScheduledDepartureTime() {
            return scheduledDepartureTime;
        }

        /**
         * Sets the value of the scheduledDepartureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScheduledDepartureTime(String value) {
            this.scheduledDepartureTime = value;
        }

        /**
         * Gets the value of the estimatedDepartureDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstimatedDepartureDateTime() {
            return estimatedDepartureDateTime;
        }

        /**
         * Sets the value of the estimatedDepartureDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstimatedDepartureDateTime(String value) {
            this.estimatedDepartureDateTime = value;
        }

        /**
         * Gets the value of the boardingDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoardingDateTime() {
            return boardingDateTime;
        }

        /**
         * Sets the value of the boardingDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoardingDateTime(String value) {
            this.boardingDateTime = value;
        }

        /**
         * Gets the value of the otherCheckInInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherCheckInInformation() {
            return otherCheckInInformation;
        }

        /**
         * Sets the value of the otherCheckInInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherCheckInInformation(String value) {
            this.otherCheckInInformation = value;
        }

        /**
         * Gets the value of the locationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationName() {
            return locationName;
        }

        /**
         * Sets the value of the locationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationName(String value) {
            this.locationName = value;
        }

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

        /**
         * Gets the value of the terminal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminal() {
            return terminal;
        }

        /**
         * Sets the value of the terminal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminal(String value) {
            this.terminal = value;
        }

        /**
         * Gets the value of the gate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGate() {
            return gate;
        }

        /**
         * Sets the value of the gate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGate(String value) {
            this.gate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/CommonTypes>EquipmentType">
     *       &lt;attribute name="AircraftTailNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Equipment
        extends EquipmentType
    {

        @XmlAttribute(name = "AircraftTailNumber")
        protected String aircraftTailNumber;

        /**
         * Gets the value of the aircraftTailNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAircraftTailNumber() {
            return aircraftTailNumber;
        }

        /**
         * Sets the value of the aircraftTailNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAircraftTailNumber(String value) {
            this.aircraftTailNumber = value;
        }

    }

}
