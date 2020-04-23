
package com.eds.airlinesoaschema.ping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.eds.airlinesoaschema.airlinepingrs.AirlinePingRS;


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
 *         &lt;element ref="{http://www.eds.com/AirlineSOASchema/AirlinePingRS}AirlinePingRS"/>
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
    "airlinePingRS"
})
@XmlRootElement(name = "pingResponse")
public class PingResponse {

    @XmlElement(name = "AirlinePingRS", namespace = "http://www.eds.com/AirlineSOASchema/AirlinePingRS", required = true)
    protected AirlinePingRS airlinePingRS;

    /**
     * Gets the value of the airlinePingRS property.
     * 
     * @return
     *     possible object is
     *     {@link AirlinePingRS }
     *     
     */
    public AirlinePingRS getAirlinePingRS() {
        return airlinePingRS;
    }

    /**
     * Sets the value of the airlinePingRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlinePingRS }
     *     
     */
    public void setAirlinePingRS(AirlinePingRS value) {
        this.airlinePingRS = value;
    }

}
