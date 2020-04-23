
package org.opentravel.ota._2003._05.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketFeeTotalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketFeeTotalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="Total"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketFeeTotalType")
@XmlEnum
public enum TicketFeeTotalType {


    /**
     * The total of base ticket fees.
     * 
     */
    @XmlEnumValue("Base")
    BASE("Base"),

    /**
     * The total of all taxes for the ticket fees.
     * 
     */
    @XmlEnumValue("Tax")
    TAX("Tax"),

    /**
     * The total of all ticket fees.
     * 
     */
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    TicketFeeTotalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketFeeTotalType fromValue(String v) {
        for (TicketFeeTotalType c: TicketFeeTotalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
