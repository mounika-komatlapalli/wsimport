
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Extended inventory flight information.
 *       
 * 
 * <p>Java class for InventoryExtendedFlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryExtendedFlightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumIgnoreTimeEntered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumIgnoreTimeEntered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WaitlistAutoInhibit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WaitlistClearanceInhibit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BCPQueueCity" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" minOccurs="0"/>
 *         &lt;element name="SegmentQueueCity" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" minOccurs="0"/>
 *         &lt;element name="MinimumIgnoreInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinimumIgnoreTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to16" minOccurs="0"/>
 *         &lt;element name="MaximumIgnoreInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumIgnoreTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to16" minOccurs="0"/>
 *         &lt;element name="OverbookInhibited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BCPSlide" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AvailabilityLevellingInhibited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WaitlistMax" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to3" minOccurs="0"/>
 *         &lt;element name="WaitlistClearanceTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to16" minOccurs="0"/>
 *         &lt;element name="WaitlistKLMax" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to16" minOccurs="0"/>
 *         &lt;element name="WaitlistKLCurrent" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to16" minOccurs="0"/>
 *         &lt;element name="WaitlistPriority" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="WaitlistSegmentPriority" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryExtendedFlightType", propOrder = {
    "minimumIgnoreTimeEntered",
    "maximumIgnoreTimeEntered",
    "waitlistAutoInhibit",
    "waitlistClearanceInhibit",
    "bcpQueueCity",
    "segmentQueueCity",
    "minimumIgnoreInd",
    "minimumIgnoreTime",
    "maximumIgnoreInd",
    "maximumIgnoreTime",
    "overbookInhibited",
    "bcpSlide",
    "availabilityLevellingInhibited",
    "waitlistMax",
    "waitlistClearanceTime",
    "waitlistKLMax",
    "waitlistKLCurrent",
    "waitlistPriority",
    "waitlistSegmentPriority"
})
public class InventoryExtendedFlightType {

    @XmlElement(name = "MinimumIgnoreTimeEntered")
    protected Boolean minimumIgnoreTimeEntered;
    @XmlElement(name = "MaximumIgnoreTimeEntered")
    protected Boolean maximumIgnoreTimeEntered;
    @XmlElement(name = "WaitlistAutoInhibit")
    protected Boolean waitlistAutoInhibit;
    @XmlElement(name = "WaitlistClearanceInhibit")
    protected Boolean waitlistClearanceInhibit;
    @XmlElement(name = "BCPQueueCity")
    protected String bcpQueueCity;
    @XmlElement(name = "SegmentQueueCity")
    protected String segmentQueueCity;
    @XmlElement(name = "MinimumIgnoreInd")
    protected Boolean minimumIgnoreInd;
    @XmlElement(name = "MinimumIgnoreTime")
    protected String minimumIgnoreTime;
    @XmlElement(name = "MaximumIgnoreInd")
    protected Boolean maximumIgnoreInd;
    @XmlElement(name = "MaximumIgnoreTime")
    protected String maximumIgnoreTime;
    @XmlElement(name = "OverbookInhibited")
    protected Boolean overbookInhibited;
    @XmlElement(name = "BCPSlide")
    protected Boolean bcpSlide;
    @XmlElement(name = "AvailabilityLevellingInhibited")
    protected Boolean availabilityLevellingInhibited;
    @XmlElement(name = "WaitlistMax")
    protected String waitlistMax;
    @XmlElement(name = "WaitlistClearanceTime")
    protected String waitlistClearanceTime;
    @XmlElement(name = "WaitlistKLMax")
    protected String waitlistKLMax;
    @XmlElement(name = "WaitlistKLCurrent")
    protected String waitlistKLCurrent;
    @XmlElement(name = "WaitlistPriority")
    protected String waitlistPriority;
    @XmlElement(name = "WaitlistSegmentPriority")
    protected String waitlistSegmentPriority;

    /**
     * Gets the value of the minimumIgnoreTimeEntered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumIgnoreTimeEntered() {
        return minimumIgnoreTimeEntered;
    }

    /**
     * Sets the value of the minimumIgnoreTimeEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumIgnoreTimeEntered(Boolean value) {
        this.minimumIgnoreTimeEntered = value;
    }

    /**
     * Gets the value of the maximumIgnoreTimeEntered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumIgnoreTimeEntered() {
        return maximumIgnoreTimeEntered;
    }

    /**
     * Sets the value of the maximumIgnoreTimeEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumIgnoreTimeEntered(Boolean value) {
        this.maximumIgnoreTimeEntered = value;
    }

    /**
     * Gets the value of the waitlistAutoInhibit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitlistAutoInhibit() {
        return waitlistAutoInhibit;
    }

    /**
     * Sets the value of the waitlistAutoInhibit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitlistAutoInhibit(Boolean value) {
        this.waitlistAutoInhibit = value;
    }

    /**
     * Gets the value of the waitlistClearanceInhibit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitlistClearanceInhibit() {
        return waitlistClearanceInhibit;
    }

    /**
     * Sets the value of the waitlistClearanceInhibit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitlistClearanceInhibit(Boolean value) {
        this.waitlistClearanceInhibit = value;
    }

    /**
     * Gets the value of the bcpQueueCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCPQueueCity() {
        return bcpQueueCity;
    }

    /**
     * Sets the value of the bcpQueueCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCPQueueCity(String value) {
        this.bcpQueueCity = value;
    }

    /**
     * Gets the value of the segmentQueueCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentQueueCity() {
        return segmentQueueCity;
    }

    /**
     * Sets the value of the segmentQueueCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentQueueCity(String value) {
        this.segmentQueueCity = value;
    }

    /**
     * Gets the value of the minimumIgnoreInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumIgnoreInd() {
        return minimumIgnoreInd;
    }

    /**
     * Sets the value of the minimumIgnoreInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumIgnoreInd(Boolean value) {
        this.minimumIgnoreInd = value;
    }

    /**
     * Gets the value of the minimumIgnoreTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumIgnoreTime() {
        return minimumIgnoreTime;
    }

    /**
     * Sets the value of the minimumIgnoreTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumIgnoreTime(String value) {
        this.minimumIgnoreTime = value;
    }

    /**
     * Gets the value of the maximumIgnoreInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumIgnoreInd() {
        return maximumIgnoreInd;
    }

    /**
     * Sets the value of the maximumIgnoreInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumIgnoreInd(Boolean value) {
        this.maximumIgnoreInd = value;
    }

    /**
     * Gets the value of the maximumIgnoreTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumIgnoreTime() {
        return maximumIgnoreTime;
    }

    /**
     * Sets the value of the maximumIgnoreTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumIgnoreTime(String value) {
        this.maximumIgnoreTime = value;
    }

    /**
     * Gets the value of the overbookInhibited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverbookInhibited() {
        return overbookInhibited;
    }

    /**
     * Sets the value of the overbookInhibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverbookInhibited(Boolean value) {
        this.overbookInhibited = value;
    }

    /**
     * Gets the value of the bcpSlide property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBCPSlide() {
        return bcpSlide;
    }

    /**
     * Sets the value of the bcpSlide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBCPSlide(Boolean value) {
        this.bcpSlide = value;
    }

    /**
     * Gets the value of the availabilityLevellingInhibited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailabilityLevellingInhibited() {
        return availabilityLevellingInhibited;
    }

    /**
     * Sets the value of the availabilityLevellingInhibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailabilityLevellingInhibited(Boolean value) {
        this.availabilityLevellingInhibited = value;
    }

    /**
     * Gets the value of the waitlistMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistMax() {
        return waitlistMax;
    }

    /**
     * Sets the value of the waitlistMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistMax(String value) {
        this.waitlistMax = value;
    }

    /**
     * Gets the value of the waitlistClearanceTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistClearanceTime() {
        return waitlistClearanceTime;
    }

    /**
     * Sets the value of the waitlistClearanceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistClearanceTime(String value) {
        this.waitlistClearanceTime = value;
    }

    /**
     * Gets the value of the waitlistKLMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistKLMax() {
        return waitlistKLMax;
    }

    /**
     * Sets the value of the waitlistKLMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistKLMax(String value) {
        this.waitlistKLMax = value;
    }

    /**
     * Gets the value of the waitlistKLCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistKLCurrent() {
        return waitlistKLCurrent;
    }

    /**
     * Sets the value of the waitlistKLCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistKLCurrent(String value) {
        this.waitlistKLCurrent = value;
    }

    /**
     * Gets the value of the waitlistPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistPriority() {
        return waitlistPriority;
    }

    /**
     * Sets the value of the waitlistPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistPriority(String value) {
        this.waitlistPriority = value;
    }

    /**
     * Gets the value of the waitlistSegmentPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistSegmentPriority() {
        return waitlistSegmentPriority;
    }

    /**
     * Sets the value of the waitlistSegmentPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistSegmentPriority(String value) {
        this.waitlistSegmentPriority = value;
    }

}
