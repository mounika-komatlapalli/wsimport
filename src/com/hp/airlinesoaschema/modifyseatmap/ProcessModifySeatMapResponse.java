
package com.hp.airlinesoaschema.modifyseatmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.hp.airlinesoaschema.airmodifyseatmaprs.HPAirModifySeatMapRS;


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
 *         &lt;element ref="{http://www.hp.com/AirlineSOASchema/AirModifySeatMapRS}HP_AirModifySeatMapRS"/>
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
    "hpAirModifySeatMapRS"
})
@XmlRootElement(name = "processModifySeatMapResponse")
public class ProcessModifySeatMapResponse {

    @XmlElement(name = "HP_AirModifySeatMapRS", namespace = "http://www.hp.com/AirlineSOASchema/AirModifySeatMapRS", required = true)
    protected HPAirModifySeatMapRS hpAirModifySeatMapRS;

    /**
     * Gets the value of the hpAirModifySeatMapRS property.
     * 
     * @return
     *     possible object is
     *     {@link HPAirModifySeatMapRS }
     *     
     */
    public HPAirModifySeatMapRS getHPAirModifySeatMapRS() {
        return hpAirModifySeatMapRS;
    }

    /**
     * Sets the value of the hpAirModifySeatMapRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link HPAirModifySeatMapRS }
     *     
     */
    public void setHPAirModifySeatMapRS(HPAirModifySeatMapRS value) {
        this.hpAirModifySeatMapRS = value;
    }

}
