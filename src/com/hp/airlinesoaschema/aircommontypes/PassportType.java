
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="SEAMAN"/>
 *     &lt;enumeration value="GOVERNMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PassportType")
@XmlEnum
public enum PassportType {

    NORMAL,
    SEAMAN,
    GOVERNMENT;

    public String value() {
        return name();
    }

    public static PassportType fromValue(String v) {
        return valueOf(v);
    }

}
