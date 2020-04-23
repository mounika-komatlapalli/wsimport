
package com.hp.airlinesoaschema.aircommontypes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.opentravel.ota._2003._05.aircommontypes.FlightSegmentType;
import org.opentravel.ota._2003._05.commontypes.FreeTextType;
import org.opentravel.ota._2003._05.simpletypes.ActionType;


/**
 * Information for a leg of the flight. A leg is one take off and landing.
 * 
 * <p>Java class for FlightLegInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightLegInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}FlightSegmentType">
 *       &lt;sequence>
 *         &lt;element name="CompartmentInfo" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SeatNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to8" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CompartmentCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to32" />
 *                 &lt;attribute name="SeatCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConnectingFlightInfo" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}FlightSegmentType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="MessageInfo" maxOccurs="99" minOccurs="0">
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightLegInfoType", propOrder = {
    "compartmentInfo",
    "connectingFlightInfo",
    "messageInfo"
})
public class FlightLegInfoType
    extends FlightSegmentType
{

    @XmlElement(name = "CompartmentInfo")
    protected List<FlightLegInfoType.CompartmentInfo> compartmentInfo;
    @XmlElement(name = "ConnectingFlightInfo")
    protected List<FlightSegmentType> connectingFlightInfo;
    @XmlElement(name = "MessageInfo")
    protected List<FlightLegInfoType.MessageInfo> messageInfo;

    /**
     * Gets the value of the compartmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compartmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompartmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightLegInfoType.CompartmentInfo }
     * 
     * 
     */
    public List<FlightLegInfoType.CompartmentInfo> getCompartmentInfo() {
        if (compartmentInfo == null) {
            compartmentInfo = new ArrayList<FlightLegInfoType.CompartmentInfo>();
        }
        return this.compartmentInfo;
    }

    /**
     * Gets the value of the connectingFlightInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingFlightInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingFlightInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentType }
     * 
     * 
     */
    public List<FlightSegmentType> getConnectingFlightInfo() {
        if (connectingFlightInfo == null) {
            connectingFlightInfo = new ArrayList<FlightSegmentType>();
        }
        return this.connectingFlightInfo;
    }

    /**
     * Gets the value of the messageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightLegInfoType.MessageInfo }
     * 
     * 
     */
    public List<FlightLegInfoType.MessageInfo> getMessageInfo() {
        if (messageInfo == null) {
            messageInfo = new ArrayList<FlightLegInfoType.MessageInfo>();
        }
        return this.messageInfo;
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
     *         &lt;element name="SeatNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to8" maxOccurs="10" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="CompartmentCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to32" />
     *       &lt;attribute name="SeatCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "seatNumber"
    })
    public static class CompartmentInfo {

        @XmlElement(name = "SeatNumber")
        protected List<String> seatNumber;
        @XmlAttribute(name = "CompartmentCode")
        protected String compartmentCode;
        @XmlAttribute(name = "SeatCount")
        protected BigInteger seatCount;

        /**
         * Gets the value of the seatNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSeatNumber() {
            if (seatNumber == null) {
                seatNumber = new ArrayList<String>();
            }
            return this.seatNumber;
        }

        /**
         * Gets the value of the compartmentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompartmentCode() {
            return compartmentCode;
        }

        /**
         * Sets the value of the compartmentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompartmentCode(String value) {
            this.compartmentCode = value;
        }

        /**
         * Gets the value of the seatCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeatCount() {
            return seatCount;
        }

        /**
         * Sets the value of the seatCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeatCount(BigInteger value) {
            this.seatCount = value;
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
    public static class MessageInfo
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
