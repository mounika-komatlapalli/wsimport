
package com.eds.airlinesoaschema.ping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.eds.airlinesoaschema.airlinepingrq.AirlinePingRQ;


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
 *         &lt;element ref="{http://www.eds.com/AirlineSOASchema/AirlinePingRQ}AirlinePingRQ"/>
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
    "airlinePingRQ"
})
@XmlRootElement(name = "ping")
public class Ping {

    @XmlElement(name = "AirlinePingRQ", namespace = "http://www.eds.com/AirlineSOASchema/AirlinePingRQ", required = true)
    protected AirlinePingRQ airlinePingRQ;

    /**
     * Gets the value of the airlinePingRQ property.
     * 
     * @return
     *     possible object is
     *     {@link AirlinePingRQ }
     *     
     */
    public AirlinePingRQ getAirlinePingRQ() {
        return airlinePingRQ;
    }

    /**
     * Sets the value of the airlinePingRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlinePingRQ }
     *     
     */
    public void setAirlinePingRQ(AirlinePingRQ value) {
        this.airlinePingRQ = value;
    }

}
