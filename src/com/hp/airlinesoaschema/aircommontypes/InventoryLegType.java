
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.opentravel.ota._2003._05.commontypes.LocationType;


/**
 * Leg Information.
 * 
 * <p>Java class for InventoryLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryLegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type"/>
 *         &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType"/>
 *         &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="InventoryEquipment" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8"/>
 *         &lt;element name="GenericEquipment" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="DateChangeInd" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="SegmentSaleInhibit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CancellationInhibit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WaitlistInhibit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarriedInhibit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FlifoInd" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="JumpSeatAuthorized" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to16" minOccurs="0"/>
 *         &lt;element name="JumpSeatBooked" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to16" minOccurs="0"/>
 *         &lt;element name="DupLeg" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" minOccurs="0"/>
 *         &lt;element name="InventoryBCP" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}InventoryBCPType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryLegType", propOrder = {
    "legNumber",
    "originLocation",
    "destinationLocation",
    "departureTime",
    "arrivalTime",
    "inventoryEquipment",
    "genericEquipment",
    "dateChangeInd",
    "segmentSaleInhibit",
    "cancellationInhibit",
    "waitlistInhibit",
    "marriedInhibit",
    "flifoInd",
    "jumpSeatAuthorized",
    "jumpSeatBooked",
    "dupLeg",
    "inventoryBCP"
})
public class InventoryLegType {

    @XmlElement(name = "LegNumber", required = true)
    protected String legNumber;
    @XmlElement(name = "OriginLocation", required = true)
    protected LocationType originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected LocationType destinationLocation;
    @XmlElement(name = "DepartureTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "ArrivalTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(name = "InventoryEquipment", required = true)
    protected String inventoryEquipment;
    @XmlElement(name = "GenericEquipment")
    protected String genericEquipment;
    @XmlElement(name = "DateChangeInd")
    protected String dateChangeInd;
    @XmlElement(name = "SegmentSaleInhibit")
    protected Boolean segmentSaleInhibit;
    @XmlElement(name = "CancellationInhibit")
    protected Boolean cancellationInhibit;
    @XmlElement(name = "WaitlistInhibit")
    protected Boolean waitlistInhibit;
    @XmlElement(name = "MarriedInhibit")
    protected Boolean marriedInhibit;
    @XmlElement(name = "FlifoInd")
    protected String flifoInd;
    @XmlElement(name = "JumpSeatAuthorized")
    protected String jumpSeatAuthorized;
    @XmlElement(name = "JumpSeatBooked")
    protected String jumpSeatBooked;
    @XmlElement(name = "DupLeg")
    protected String dupLeg;
    @XmlElement(name = "InventoryBCP")
    protected List<InventoryBCPType> inventoryBCP;

    /**
     * Gets the value of the legNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegNumber() {
        return legNumber;
    }

    /**
     * Sets the value of the legNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegNumber(String value) {
        this.legNumber = value;
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
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDestinationLocation(LocationType value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the inventoryEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryEquipment() {
        return inventoryEquipment;
    }

    /**
     * Sets the value of the inventoryEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryEquipment(String value) {
        this.inventoryEquipment = value;
    }

    /**
     * Gets the value of the genericEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericEquipment() {
        return genericEquipment;
    }

    /**
     * Sets the value of the genericEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericEquipment(String value) {
        this.genericEquipment = value;
    }

    /**
     * Gets the value of the dateChangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateChangeInd() {
        return dateChangeInd;
    }

    /**
     * Sets the value of the dateChangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateChangeInd(String value) {
        this.dateChangeInd = value;
    }

    /**
     * Gets the value of the segmentSaleInhibit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSegmentSaleInhibit() {
        return segmentSaleInhibit;
    }

    /**
     * Sets the value of the segmentSaleInhibit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSegmentSaleInhibit(Boolean value) {
        this.segmentSaleInhibit = value;
    }

    /**
     * Gets the value of the cancellationInhibit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellationInhibit() {
        return cancellationInhibit;
    }

    /**
     * Sets the value of the cancellationInhibit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellationInhibit(Boolean value) {
        this.cancellationInhibit = value;
    }

    /**
     * Gets the value of the waitlistInhibit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitlistInhibit() {
        return waitlistInhibit;
    }

    /**
     * Sets the value of the waitlistInhibit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitlistInhibit(Boolean value) {
        this.waitlistInhibit = value;
    }

    /**
     * Gets the value of the marriedInhibit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarriedInhibit() {
        return marriedInhibit;
    }

    /**
     * Sets the value of the marriedInhibit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarriedInhibit(Boolean value) {
        this.marriedInhibit = value;
    }

    /**
     * Gets the value of the flifoInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlifoInd() {
        return flifoInd;
    }

    /**
     * Sets the value of the flifoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlifoInd(String value) {
        this.flifoInd = value;
    }

    /**
     * Gets the value of the jumpSeatAuthorized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJumpSeatAuthorized() {
        return jumpSeatAuthorized;
    }

    /**
     * Sets the value of the jumpSeatAuthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJumpSeatAuthorized(String value) {
        this.jumpSeatAuthorized = value;
    }

    /**
     * Gets the value of the jumpSeatBooked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJumpSeatBooked() {
        return jumpSeatBooked;
    }

    /**
     * Sets the value of the jumpSeatBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJumpSeatBooked(String value) {
        this.jumpSeatBooked = value;
    }

    /**
     * Gets the value of the dupLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDupLeg() {
        return dupLeg;
    }

    /**
     * Sets the value of the dupLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDupLeg(String value) {
        this.dupLeg = value;
    }

    /**
     * Gets the value of the inventoryBCP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryBCP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryBCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryBCPType }
     * 
     * 
     */
    public List<InventoryBCPType> getInventoryBCP() {
        if (inventoryBCP == null) {
            inventoryBCP = new ArrayList<InventoryBCPType>();
        }
        return this.inventoryBCP;
    }

}
