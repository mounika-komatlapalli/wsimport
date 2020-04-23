
package com.hp.airlinesoaschema.modifyseatmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.hp.airlinesoaschema.airmodifyseatmaprq.HPAirModifySeatMapRQ;


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
 *         &lt;element ref="{http://www.hp.com/AirlineSOASchema/AirModifySeatMapRQ}HP_AirModifySeatMapRQ"/>
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
    "hpAirModifySeatMapRQ"
})
@XmlRootElement(name = "processModifySeatMap")
public class ProcessModifySeatMap {

    @XmlElement(name = "HP_AirModifySeatMapRQ", namespace = "http://www.hp.com/AirlineSOASchema/AirModifySeatMapRQ", required = true)
    protected HPAirModifySeatMapRQ hpAirModifySeatMapRQ;

    /**
     * Gets the value of the hpAirModifySeatMapRQ property.
     * 
     * @return
     *     possible object is
     *     {@link HPAirModifySeatMapRQ }
     *     
     */
    public HPAirModifySeatMapRQ getHPAirModifySeatMapRQ() {
        return hpAirModifySeatMapRQ;
    }

    /**
     * Sets the value of the hpAirModifySeatMapRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link HPAirModifySeatMapRQ }
     *     
     */
    public void setHPAirModifySeatMapRQ(HPAirModifySeatMapRQ value) {
        this.hpAirModifySeatMapRQ = value;
    }

}
