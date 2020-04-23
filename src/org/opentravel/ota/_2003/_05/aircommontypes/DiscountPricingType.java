
package org.opentravel.ota._2003._05.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountPricingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountPricingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="Percent"/>
 *     &lt;enumeration value="PlusUpAmount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscountPricingType")
@XmlEnum
public enum DiscountPricingType {


    /**
     * The discount is an amount.
     * 
     */
    @XmlEnumValue("Amount")
    AMOUNT("Amount"),

    /**
     * The discount is a percentage.
     * 
     */
    @XmlEnumValue("Percent")
    PERCENT("Percent"),

    /**
     * A discount on an international fare that is not a stored fare.
     * 
     */
    @XmlEnumValue("PlusUpAmount")
    PLUS_UP_AMOUNT("PlusUpAmount");
    private final String value;

    DiscountPricingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountPricingType fromValue(String v) {
        for (DiscountPricingType c: DiscountPricingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
