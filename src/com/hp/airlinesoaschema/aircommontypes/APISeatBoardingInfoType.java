
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for API_SeatBoardingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_SeatBoardingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BoardingPriority" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *       &lt;attribute name="BoardingZone">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9a-zA-Z]{1,9}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SeatCharacteristics" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfOTA_CodeType" />
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_SeatBoardingInfoType")
public class APISeatBoardingInfoType {

    @XmlAttribute(name = "BoardingPriority")
    protected String boardingPriority;
    @XmlAttribute(name = "BoardingZone")
    protected String boardingZone;
    @XmlAttribute(name = "SeatCharacteristics")
    protected List<String> seatCharacteristics;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "NonRevCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nonRevCategory;

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

}
