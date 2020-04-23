
package com.eds.airlinesoaschema.messagerequestbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrelationHandleID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HostCarrierCode" type="{http://www.eds.com/AirlineSOASchema/SimpleTypes}ANCaps"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageRequest", propOrder = {
    "correlationHandleID",
    "hostCarrierCode"
})
public class MessageRequest {

    @XmlElement(name = "CorrelationHandleID", required = true)
    protected String correlationHandleID;
    @XmlElement(name = "HostCarrierCode", required = true)
    protected String hostCarrierCode;

    /**
     * Gets the value of the correlationHandleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationHandleID() {
        return correlationHandleID;
    }

    /**
     * Sets the value of the correlationHandleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationHandleID(String value) {
        this.correlationHandleID = value;
    }

    /**
     * Gets the value of the hostCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostCarrierCode() {
        return hostCarrierCode;
    }

    /**
     * Sets the value of the hostCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostCarrierCode(String value) {
        this.hostCarrierCode = value;
    }

}
