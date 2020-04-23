
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageCountsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaggageCountsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Checked"/>
 *     &lt;enumeration value="Carryon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaggageCountsType")
@XmlEnum
public enum BaggageCountsType {

    @XmlEnumValue("Checked")
    CHECKED("Checked"),
    @XmlEnumValue("Carryon")
    CARRYON("Carryon");
    private final String value;

    BaggageCountsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageCountsType fromValue(String v) {
        for (BaggageCountsType c: BaggageCountsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
