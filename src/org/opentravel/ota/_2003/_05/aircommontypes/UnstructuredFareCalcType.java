
package org.opentravel.ota._2003._05.aircommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.opentravel.ota._2003._05.simpletypes.ActionType;


/**
 * <p>Java class for UnstructuredFareCalcType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredFareCalcType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="FareCalcMode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1" />
 *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnstructuredFareCalcType", propOrder = {
    "value"
})
public class UnstructuredFareCalcType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "FareCalcMode")
    protected String fareCalcMode;
    @XmlAttribute(name = "Operation")
    protected ActionType operation;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the fareCalcMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalcMode() {
        return fareCalcMode;
    }

    /**
     * Sets the value of the fareCalcMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCalcMode(String value) {
        this.fareCalcMode = value;
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
