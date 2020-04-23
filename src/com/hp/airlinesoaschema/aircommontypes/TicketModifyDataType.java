
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.opentravel.ota._2003._05.commontypes.UniqueIDType;


/**
 * <p>Java class for TicketModifyDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketModifyDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketNumbers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecordLocator" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="TicketType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Paper"/>
 *               &lt;enumeration value="Electronic"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ValidatingCarrierCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketModifyDataType", propOrder = {
    "ticketNumbers",
    "recordLocator",
    "ticketType"
})
public class TicketModifyDataType {

    @XmlElement(name = "TicketNumbers", required = true)
    protected TicketModifyDataType.TicketNumbers ticketNumbers;
    @XmlElement(name = "RecordLocator")
    protected UniqueIDType recordLocator;
    @XmlElement(name = "TicketType", required = true)
    protected String ticketType;
    @XmlAttribute(name = "ValidatingCarrierCode")
    protected String validatingCarrierCode;

    /**
     * Gets the value of the ticketNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link TicketModifyDataType.TicketNumbers }
     *     
     */
    public TicketModifyDataType.TicketNumbers getTicketNumbers() {
        return ticketNumbers;
    }

    /**
     * Sets the value of the ticketNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketModifyDataType.TicketNumbers }
     *     
     */
    public void setTicketNumbers(TicketModifyDataType.TicketNumbers value) {
        this.ticketNumbers = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setRecordLocator(UniqueIDType value) {
        this.recordLocator = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketType(String value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the validatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
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
     *         &lt;element name="TicketNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" maxOccurs="unbounded"/>
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
        "ticketNumber"
    })
    public static class TicketNumbers {

        @XmlElement(name = "TicketNumber", required = true)
        protected List<String> ticketNumber;

        /**
         * Gets the value of the ticketNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTicketNumber() {
            if (ticketNumber == null) {
                ticketNumber = new ArrayList<String>();
            }
            return this.ticketNumber;
        }

    }

}
