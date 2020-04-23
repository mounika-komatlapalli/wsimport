
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.opentravel.ota._2003._05.commontypes.LocationType;


/**
 * 
 *         Inventory segment information.
 *       
 * 
 * <p>Java class for InventorySegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventorySegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" minOccurs="0"/>
 *         &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
 *         &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}LocationType" minOccurs="0"/>
 *         &lt;element name="InventorySegmentDetail" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}InventorySegmentDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventorySegmentType", propOrder = {
    "segmentNumber",
    "originLocation",
    "destinationLocation",
    "inventorySegmentDetail"
})
public class InventorySegmentType {

    @XmlElement(name = "SegmentNumber")
    protected String segmentNumber;
    @XmlElement(name = "OriginLocation")
    protected LocationType originLocation;
    @XmlElement(name = "DestinationLocation")
    protected LocationType destinationLocation;
    @XmlElement(name = "InventorySegmentDetail")
    protected List<InventorySegmentDetailType> inventorySegmentDetail;

    /**
     * Gets the value of the segmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentNumber() {
        return segmentNumber;
    }

    /**
     * Sets the value of the segmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentNumber(String value) {
        this.segmentNumber = value;
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
     * Gets the value of the inventorySegmentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventorySegmentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventorySegmentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventorySegmentDetailType }
     * 
     * 
     */
    public List<InventorySegmentDetailType> getInventorySegmentDetail() {
        if (inventorySegmentDetail == null) {
            inventorySegmentDetail = new ArrayList<InventorySegmentDetailType>();
        }
        return this.inventorySegmentDetail;
    }

}
