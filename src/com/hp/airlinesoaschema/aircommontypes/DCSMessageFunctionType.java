
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DCS_MessageFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCS_MessageFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Function">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="AssignAircraft"/>
 *             &lt;enumeration value="SeatReac_Specific"/>
 *             &lt;enumeration value="SeatReac_Generic"/>
 *             &lt;enumeration value="SeatReac_Both"/>
 *             &lt;enumeration value="SeatReac_OpenSeating"/>
 *             &lt;enumeration value="StartCheckIn"/>
 *             &lt;enumeration value="BlockSeat"/>
 *             &lt;enumeration value="UndoBlockSeat"/>
 *             &lt;enumeration value="InopSeat"/>
 *             &lt;enumeration value="UndoInopSeat"/>
 *             &lt;enumeration value="CancelMisconnects"/>
 *             &lt;enumeration value="UndoCancelMisconnects"/>
 *             &lt;enumeration value="RestrictCheckInToGate"/>
 *             &lt;enumeration value="CloseFlightForDeparture"/>
 *             &lt;enumeration value="FlightMessageDisplay"/>
 *             &lt;enumeration value="FlightMessageUpdate"/>
 *             &lt;enumeration value="WeightRestriction"/>
 *             &lt;enumeration value="PreliminaryMealOrdering"/>
 *             &lt;enumeration value="FinalMealOrdering"/>
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
@XmlType(name = "DCS_MessageFunctionType")
public class DCSMessageFunctionType {

    @XmlAttribute(name = "Function")
    protected String function;

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

}
