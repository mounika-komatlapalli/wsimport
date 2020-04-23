
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Detailed inventory segment information.
 *       
 * 
 * <p>Java class for InventorySegmentDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventorySegmentDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingCompartmentNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" minOccurs="0"/>
 *         &lt;element name="ClassSuppressed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassOfService" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" minOccurs="0"/>
 *         &lt;element name="MinValue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="MaxValue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="PrimarySharedClass" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" minOccurs="0"/>
 *         &lt;element name="SeatsSold" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="SharedSeatsSold" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="GroupSeats" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="WaitlistedSeats" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="WaitlistClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LimitSalesInd" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="LimitNotification" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="OtherAirlineClass" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" minOccurs="0"/>
 *         &lt;element name="SegmentProfileInd" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventorySegmentDetailType", propOrder = {
    "bookingCompartmentNumber",
    "classSuppressed",
    "classBlocked",
    "classOfService",
    "minValue",
    "maxValue",
    "primarySharedClass",
    "seatsSold",
    "sharedSeatsSold",
    "groupSeats",
    "waitlistedSeats",
    "waitlistClosed",
    "limitSalesInd",
    "limitNotification",
    "otherAirlineClass",
    "segmentProfileInd"
})
public class InventorySegmentDetailType {

    @XmlElement(name = "BookingCompartmentNumber")
    protected String bookingCompartmentNumber;
    @XmlElement(name = "ClassSuppressed")
    protected Boolean classSuppressed;
    @XmlElement(name = "ClassBlocked")
    protected Boolean classBlocked;
    @XmlElement(name = "ClassOfService")
    protected String classOfService;
    @XmlElement(name = "MinValue")
    protected String minValue;
    @XmlElement(name = "MaxValue")
    protected String maxValue;
    @XmlElement(name = "PrimarySharedClass")
    protected String primarySharedClass;
    @XmlElement(name = "SeatsSold")
    protected String seatsSold;
    @XmlElement(name = "SharedSeatsSold")
    protected String sharedSeatsSold;
    @XmlElement(name = "GroupSeats")
    protected String groupSeats;
    @XmlElement(name = "WaitlistedSeats")
    protected String waitlistedSeats;
    @XmlElement(name = "WaitlistClosed")
    protected Boolean waitlistClosed;
    @XmlElement(name = "LimitSalesInd")
    protected String limitSalesInd;
    @XmlElement(name = "LimitNotification")
    protected String limitNotification;
    @XmlElement(name = "OtherAirlineClass")
    protected String otherAirlineClass;
    @XmlElement(name = "SegmentProfileInd")
    protected String segmentProfileInd;

    /**
     * Gets the value of the bookingCompartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCompartmentNumber() {
        return bookingCompartmentNumber;
    }

    /**
     * Sets the value of the bookingCompartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCompartmentNumber(String value) {
        this.bookingCompartmentNumber = value;
    }

    /**
     * Gets the value of the classSuppressed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassSuppressed() {
        return classSuppressed;
    }

    /**
     * Sets the value of the classSuppressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassSuppressed(Boolean value) {
        this.classSuppressed = value;
    }

    /**
     * Gets the value of the classBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassBlocked() {
        return classBlocked;
    }

    /**
     * Sets the value of the classBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassBlocked(Boolean value) {
        this.classBlocked = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinValue(String value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxValue(String value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the primarySharedClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySharedClass() {
        return primarySharedClass;
    }

    /**
     * Sets the value of the primarySharedClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySharedClass(String value) {
        this.primarySharedClass = value;
    }

    /**
     * Gets the value of the seatsSold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatsSold() {
        return seatsSold;
    }

    /**
     * Sets the value of the seatsSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatsSold(String value) {
        this.seatsSold = value;
    }

    /**
     * Gets the value of the sharedSeatsSold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedSeatsSold() {
        return sharedSeatsSold;
    }

    /**
     * Sets the value of the sharedSeatsSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedSeatsSold(String value) {
        this.sharedSeatsSold = value;
    }

    /**
     * Gets the value of the groupSeats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSeats() {
        return groupSeats;
    }

    /**
     * Sets the value of the groupSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSeats(String value) {
        this.groupSeats = value;
    }

    /**
     * Gets the value of the waitlistedSeats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistedSeats() {
        return waitlistedSeats;
    }

    /**
     * Sets the value of the waitlistedSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistedSeats(String value) {
        this.waitlistedSeats = value;
    }

    /**
     * Gets the value of the waitlistClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitlistClosed() {
        return waitlistClosed;
    }

    /**
     * Sets the value of the waitlistClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitlistClosed(Boolean value) {
        this.waitlistClosed = value;
    }

    /**
     * Gets the value of the limitSalesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitSalesInd() {
        return limitSalesInd;
    }

    /**
     * Sets the value of the limitSalesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitSalesInd(String value) {
        this.limitSalesInd = value;
    }

    /**
     * Gets the value of the limitNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitNotification() {
        return limitNotification;
    }

    /**
     * Sets the value of the limitNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitNotification(String value) {
        this.limitNotification = value;
    }

    /**
     * Gets the value of the otherAirlineClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAirlineClass() {
        return otherAirlineClass;
    }

    /**
     * Sets the value of the otherAirlineClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAirlineClass(String value) {
        this.otherAirlineClass = value;
    }

    /**
     * Gets the value of the segmentProfileInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentProfileInd() {
        return segmentProfileInd;
    }

    /**
     * Sets the value of the segmentProfileInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentProfileInd(String value) {
        this.segmentProfileInd = value;
    }

}
