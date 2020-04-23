
package org.opentravel.ota._2003._05.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountUsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Plus"/>
 *     &lt;enumeration value="Minus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscountUsageType")
@XmlEnum
public enum DiscountUsageType {


    /**
     * The discount being applied is an increase to the fare.
     * 
     */
    @XmlEnumValue("Plus")
    PLUS("Plus"),

    /**
     * The discount being applied is subtracted from the fare.
     * 
     */
    @XmlEnumValue("Minus")
    MINUS("Minus");
    private final String value;

    DiscountUsageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountUsageType fromValue(String v) {
        for (DiscountUsageType c: DiscountUsageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
