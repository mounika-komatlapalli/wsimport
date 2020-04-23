
package org.opentravel.ota._2003._05.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Waitlist"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Need"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionCodeType")
@XmlEnum
public enum ActionCodeType {


    /**
     * Status is confirmed.
     * 
     */
    OK("OK"),

    /**
     * Status is waitlisted.
     * 
     */
    @XmlEnumValue("Waitlist")
    WAITLIST("Waitlist"),

    /**
     * Status is other.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Status is cancel.
     * 
     */
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     *  Status is need.
     * 
     */
    @XmlEnumValue("Need")
    NEED("Need");
    private final String value;

    ActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCodeType fromValue(String v) {
        for (ActionCodeType c: ActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
