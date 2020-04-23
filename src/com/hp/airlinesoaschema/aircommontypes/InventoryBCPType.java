
package com.hp.airlinesoaschema.aircommontypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.opentravel.ota._2003._05.commontypes.LocationType;


/**
 * 
 *         Booking Compartment Information.
 *       
 * 
 * <p>Java class for InventoryBCPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryBCPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BCPType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
 *         &lt;element name="BCPMappingNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="BCPNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to3" minOccurs="0"/>
 *         &lt;element name="ClassOfService" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to8" minOccurs="0"/>
 *         &lt;element name="BCPSlide" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="Capacity" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="AuthorizedLevel" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="HeldSeats" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="SoldSeats" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="NetSeats" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="GrossSeats" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OandDInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GroupBookings" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="GroupBookingsMaxed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WaitlistedBookings" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="NonRevPositiveSpace" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="NonRevSpaceAvailable" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="AuthorizationIncrease" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="ProtectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FirmingLevel" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="OpenLevel" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="NoticeInd" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="GroupInd" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="MaxGroupCounter" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="MaxNonRevPositiveSpace" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="MaxNonRevSpaceAvailable" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to5" minOccurs="0"/>
 *         &lt;element name="MealCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="MealStatus" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="EMSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMSRInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EMSRAdjustment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMSRDisplacement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OandDTrigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCPDummyRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryBCPType", propOrder = {
    "bcpType",
    "originLocation",
    "bcpMappingNumber",
    "bcpNumber",
    "classOfService",
    "bcpSlide",
    "capacity",
    "authorizedLevel",
    "heldSeats",
    "soldSeats",
    "netSeats",
    "grossSeats",
    "oandDInd",
    "groupBookings",
    "groupBookingsMaxed",
    "waitlistedBookings",
    "nonRevPositiveSpace",
    "nonRevSpaceAvailable",
    "authorizationIncrease",
    "protectionInd",
    "firmingLevel",
    "openLevel",
    "noticeInd",
    "groupInd",
    "maxGroupCounter",
    "maxNonRevPositiveSpace",
    "maxNonRevSpaceAvailable",
    "mealCode",
    "mealStatus",
    "emsr",
    "emsrInd",
    "emsrAdjustment",
    "emsrDisplacement",
    "oandDTrigger",
    "bcpDummyRef"
})
public class InventoryBCPType {

    @XmlElement(name = "BCPType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bcpType;
    @XmlElement(name = "OriginLocation")
    protected LocationType originLocation;
    @XmlElement(name = "BCPMappingNumber")
    protected String bcpMappingNumber;
    @XmlElement(name = "BCPNumber")
    protected String bcpNumber;
    @XmlElement(name = "ClassOfService")
    protected String classOfService;
    @XmlElement(name = "BCPSlide")
    protected String bcpSlide;
    @XmlElement(name = "Capacity")
    protected String capacity;
    @XmlElement(name = "AuthorizedLevel")
    protected String authorizedLevel;
    @XmlElement(name = "HeldSeats")
    protected String heldSeats;
    @XmlElement(name = "SoldSeats")
    protected String soldSeats;
    @XmlElement(name = "NetSeats")
    protected String netSeats;
    @XmlElement(name = "GrossSeats")
    protected BigInteger grossSeats;
    @XmlElement(name = "OandDInd")
    protected Boolean oandDInd;
    @XmlElement(name = "GroupBookings")
    protected String groupBookings;
    @XmlElement(name = "GroupBookingsMaxed")
    protected Boolean groupBookingsMaxed;
    @XmlElement(name = "WaitlistedBookings")
    protected String waitlistedBookings;
    @XmlElement(name = "NonRevPositiveSpace")
    protected String nonRevPositiveSpace;
    @XmlElement(name = "NonRevSpaceAvailable")
    protected String nonRevSpaceAvailable;
    @XmlElement(name = "AuthorizationIncrease")
    protected String authorizationIncrease;
    @XmlElement(name = "ProtectionInd")
    protected Boolean protectionInd;
    @XmlElement(name = "FirmingLevel")
    protected String firmingLevel;
    @XmlElement(name = "OpenLevel")
    protected String openLevel;
    @XmlElement(name = "NoticeInd")
    protected String noticeInd;
    @XmlElement(name = "GroupInd")
    protected String groupInd;
    @XmlElement(name = "MaxGroupCounter")
    protected String maxGroupCounter;
    @XmlElement(name = "MaxNonRevPositiveSpace")
    protected String maxNonRevPositiveSpace;
    @XmlElement(name = "MaxNonRevSpaceAvailable")
    protected String maxNonRevSpaceAvailable;
    @XmlElement(name = "MealCode")
    protected String mealCode;
    @XmlElement(name = "MealStatus")
    protected String mealStatus;
    @XmlElement(name = "EMSR")
    protected String emsr;
    @XmlElement(name = "EMSRInd")
    protected Boolean emsrInd;
    @XmlElement(name = "EMSRAdjustment")
    protected String emsrAdjustment;
    @XmlElement(name = "EMSRDisplacement")
    protected String emsrDisplacement;
    @XmlElement(name = "OandDTrigger")
    protected String oandDTrigger;
    @XmlElement(name = "BCPDummyRef")
    protected String bcpDummyRef;

    /**
     * Gets the value of the bcpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCPType() {
        return bcpType;
    }

    /**
     * Sets the value of the bcpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCPType(String value) {
        this.bcpType = value;
    }

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOriginLocation(LocationType value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the bcpMappingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCPMappingNumber() {
        return bcpMappingNumber;
    }

    /**
     * Sets the value of the bcpMappingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCPMappingNumber(String value) {
        this.bcpMappingNumber = value;
    }

    /**
     * Gets the value of the bcpNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCPNumber() {
        return bcpNumber;
    }

    /**
     * Sets the value of the bcpNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCPNumber(String value) {
        this.bcpNumber = value;
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
     * Gets the value of the bcpSlide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCPSlide() {
        return bcpSlide;
    }

    /**
     * Sets the value of the bcpSlide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCPSlide(String value) {
        this.bcpSlide = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacity(String value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the authorizedLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedLevel() {
        return authorizedLevel;
    }

    /**
     * Sets the value of the authorizedLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedLevel(String value) {
        this.authorizedLevel = value;
    }

    /**
     * Gets the value of the heldSeats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeldSeats() {
        return heldSeats;
    }

    /**
     * Sets the value of the heldSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeldSeats(String value) {
        this.heldSeats = value;
    }

    /**
     * Gets the value of the soldSeats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldSeats() {
        return soldSeats;
    }

    /**
     * Sets the value of the soldSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldSeats(String value) {
        this.soldSeats = value;
    }

    /**
     * Gets the value of the netSeats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetSeats() {
        return netSeats;
    }

    /**
     * Sets the value of the netSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetSeats(String value) {
        this.netSeats = value;
    }

    /**
     * Gets the value of the grossSeats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrossSeats() {
        return grossSeats;
    }

    /**
     * Sets the value of the grossSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrossSeats(BigInteger value) {
        this.grossSeats = value;
    }

    /**
     * Gets the value of the oandDInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOandDInd() {
        return oandDInd;
    }

    /**
     * Sets the value of the oandDInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOandDInd(Boolean value) {
        this.oandDInd = value;
    }

    /**
     * Gets the value of the groupBookings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupBookings() {
        return groupBookings;
    }

    /**
     * Sets the value of the groupBookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupBookings(String value) {
        this.groupBookings = value;
    }

    /**
     * Gets the value of the groupBookingsMaxed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupBookingsMaxed() {
        return groupBookingsMaxed;
    }

    /**
     * Sets the value of the groupBookingsMaxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupBookingsMaxed(Boolean value) {
        this.groupBookingsMaxed = value;
    }

    /**
     * Gets the value of the waitlistedBookings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitlistedBookings() {
        return waitlistedBookings;
    }

    /**
     * Sets the value of the waitlistedBookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitlistedBookings(String value) {
        this.waitlistedBookings = value;
    }

    /**
     * Gets the value of the nonRevPositiveSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRevPositiveSpace() {
        return nonRevPositiveSpace;
    }

    /**
     * Sets the value of the nonRevPositiveSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRevPositiveSpace(String value) {
        this.nonRevPositiveSpace = value;
    }

    /**
     * Gets the value of the nonRevSpaceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRevSpaceAvailable() {
        return nonRevSpaceAvailable;
    }

    /**
     * Sets the value of the nonRevSpaceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRevSpaceAvailable(String value) {
        this.nonRevSpaceAvailable = value;
    }

    /**
     * Gets the value of the authorizationIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationIncrease() {
        return authorizationIncrease;
    }

    /**
     * Sets the value of the authorizationIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationIncrease(String value) {
        this.authorizationIncrease = value;
    }

    /**
     * Gets the value of the protectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtectionInd() {
        return protectionInd;
    }

    /**
     * Sets the value of the protectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectionInd(Boolean value) {
        this.protectionInd = value;
    }

    /**
     * Gets the value of the firmingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmingLevel() {
        return firmingLevel;
    }

    /**
     * Sets the value of the firmingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmingLevel(String value) {
        this.firmingLevel = value;
    }

    /**
     * Gets the value of the openLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenLevel() {
        return openLevel;
    }

    /**
     * Sets the value of the openLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenLevel(String value) {
        this.openLevel = value;
    }

    /**
     * Gets the value of the noticeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeInd() {
        return noticeInd;
    }

    /**
     * Sets the value of the noticeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeInd(String value) {
        this.noticeInd = value;
    }

    /**
     * Gets the value of the groupInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupInd() {
        return groupInd;
    }

    /**
     * Sets the value of the groupInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupInd(String value) {
        this.groupInd = value;
    }

    /**
     * Gets the value of the maxGroupCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxGroupCounter() {
        return maxGroupCounter;
    }

    /**
     * Sets the value of the maxGroupCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxGroupCounter(String value) {
        this.maxGroupCounter = value;
    }

    /**
     * Gets the value of the maxNonRevPositiveSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNonRevPositiveSpace() {
        return maxNonRevPositiveSpace;
    }

    /**
     * Sets the value of the maxNonRevPositiveSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNonRevPositiveSpace(String value) {
        this.maxNonRevPositiveSpace = value;
    }

    /**
     * Gets the value of the maxNonRevSpaceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNonRevSpaceAvailable() {
        return maxNonRevSpaceAvailable;
    }

    /**
     * Sets the value of the maxNonRevSpaceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNonRevSpaceAvailable(String value) {
        this.maxNonRevSpaceAvailable = value;
    }

    /**
     * Gets the value of the mealCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealCode() {
        return mealCode;
    }

    /**
     * Sets the value of the mealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealCode(String value) {
        this.mealCode = value;
    }

    /**
     * Gets the value of the mealStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealStatus() {
        return mealStatus;
    }

    /**
     * Sets the value of the mealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealStatus(String value) {
        this.mealStatus = value;
    }

    /**
     * Gets the value of the emsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMSR() {
        return emsr;
    }

    /**
     * Sets the value of the emsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMSR(String value) {
        this.emsr = value;
    }

    /**
     * Gets the value of the emsrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEMSRInd() {
        return emsrInd;
    }

    /**
     * Sets the value of the emsrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEMSRInd(Boolean value) {
        this.emsrInd = value;
    }

    /**
     * Gets the value of the emsrAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMSRAdjustment() {
        return emsrAdjustment;
    }

    /**
     * Sets the value of the emsrAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMSRAdjustment(String value) {
        this.emsrAdjustment = value;
    }

    /**
     * Gets the value of the emsrDisplacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMSRDisplacement() {
        return emsrDisplacement;
    }

    /**
     * Sets the value of the emsrDisplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMSRDisplacement(String value) {
        this.emsrDisplacement = value;
    }

    /**
     * Gets the value of the oandDTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOandDTrigger() {
        return oandDTrigger;
    }

    /**
     * Sets the value of the oandDTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOandDTrigger(String value) {
        this.oandDTrigger = value;
    }

    /**
     * Gets the value of the bcpDummyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCPDummyRef() {
        return bcpDummyRef;
    }

    /**
     * Sets the value of the bcpDummyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCPDummyRef(String value) {
        this.bcpDummyRef = value;
    }

}
