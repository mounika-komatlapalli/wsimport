
package org.opentravel.ota._2003._05.simpletypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PkgAirType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PkgAirType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Charter"/>
 *     &lt;enumeration value="Scheduled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PkgAirType", namespace = "http://www.opentravel.org/OTA/2003/05/SimpleTypes")
@XmlEnum
public enum PkgAirType {

    @XmlEnumValue("Charter")
    CHARTER("Charter"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled");
    private final String value;

    PkgAirType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PkgAirType fromValue(String v) {
        for (PkgAirType c: PkgAirType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
