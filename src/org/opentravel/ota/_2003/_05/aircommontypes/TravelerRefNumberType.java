
package org.opentravel.ota._2003._05.aircommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the RPH reference to the traveler.
 * 
 * <p>Java class for TravelerRefNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerRefNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}TravelerRefNumberGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerRefNumberType")
@XmlSeeAlso({
    org.opentravel.ota._2003._05.aircommontypes.SpecialRemarkType.TravelerRefNumber.class
})
public class TravelerRefNumberType {

    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "SurnameRefNumber")
    protected String surnameRefNumber;

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
     * Gets the value of the surnameRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameRefNumber() {
        return surnameRefNumber;
    }

    /**
     * Sets the value of the surnameRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameRefNumber(String value) {
        this.surnameRefNumber = value;
    }

}
