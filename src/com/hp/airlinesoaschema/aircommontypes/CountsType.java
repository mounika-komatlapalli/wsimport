
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Total"/>
 *     &lt;enumeration value="Transit"/>
 *     &lt;enumeration value="Join"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountsType")
@XmlEnum
public enum CountsType {

    @XmlEnumValue("Total")
    TOTAL("Total"),
    @XmlEnumValue("Transit")
    TRANSIT("Transit"),
    @XmlEnumValue("Join")
    JOIN("Join");
    private final String value;

    CountsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountsType fromValue(String v) {
        for (CountsType c: CountsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
