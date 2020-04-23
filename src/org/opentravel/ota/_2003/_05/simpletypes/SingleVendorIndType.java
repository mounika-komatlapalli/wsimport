
package org.opentravel.ota._2003._05.simpletypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleVendorIndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SingleVendorIndType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="SingleVndr"/>
 *     &lt;enumeration value="Alliance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SingleVendorIndType", namespace = "http://www.opentravel.org/OTA/2003/05/SimpleTypes")
@XmlEnum
public enum SingleVendorIndType {


    /**
     * Indicates the program is not part of an alliance.
     * 
     */
    @XmlEnumValue("SingleVndr")
    SINGLE_VNDR("SingleVndr"),

    /**
     * Indicates the program is part of an alliance.
     * 
     */
    @XmlEnumValue("Alliance")
    ALLIANCE("Alliance");
    private final String value;

    SingleVendorIndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SingleVendorIndType fromValue(String v) {
        for (SingleVendorIndType c: SingleVendorIndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
