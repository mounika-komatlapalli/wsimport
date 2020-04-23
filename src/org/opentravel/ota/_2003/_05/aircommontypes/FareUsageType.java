
package org.opentravel.ota._2003._05.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareUsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="PassengerFare"/>
 *     &lt;enumeration value="TicketFee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareUsageType")
@XmlEnum
public enum FareUsageType {


    /**
     * The fare information for the passenger fees.
     * 
     */
    @XmlEnumValue("PassengerFare")
    PASSENGER_FARE("PassengerFare"),

    /**
     * The fare information for the ticket fees.
     * 
     */
    @XmlEnumValue("TicketFee")
    TICKET_FEE("TicketFee");
    private final String value;

    FareUsageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareUsageType fromValue(String v) {
        for (FareUsageType c: FareUsageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
