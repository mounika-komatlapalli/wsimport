
package com.eds.airlinesoaschema.simpletypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for debit_credit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="debit_credit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "debit_credit", namespace = "http://www.eds.com/AirlineSOASchema/SimpleTypes")
@XmlEnum
public enum DebitCredit {

    D,
    C;

    public String value() {
        return name();
    }

    public static DebitCredit fromValue(String v) {
        return valueOf(v);
    }

}
