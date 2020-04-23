
package org.opentravel.ota._2003._05.simpletypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="eTicket"/>
 *     &lt;enumeration value="Paper"/>
 *     &lt;enumeration value="MCO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketType", namespace = "http://www.opentravel.org/OTA/2003/05/SimpleTypes")
@XmlEnum
public enum TicketType {


    /**
     * An electronic ticket
     * 
     */
    @XmlEnumValue("eTicket")
    E_TICKET("eTicket"),

    /**
     * A paper ticket
     * 
     */
    @XmlEnumValue("Paper")
    PAPER("Paper"),

    /**
     * A miscellaneous charge order
     * 
     */
    MCO("MCO");
    private final String value;

    TicketType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketType fromValue(String v) {
        for (TicketType c: TicketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
