
package org.opentravel.ota._2003._05.simpletypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckInhibitorTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckInhibitorTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="CheckDigit"/>
 *     &lt;enumeration value="InterlineAgreement"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckInhibitorTypeType", namespace = "http://www.opentravel.org/OTA/2003/05/SimpleTypes")
@XmlEnum
public enum CheckInhibitorTypeType {


    /**
     * The CheckDigit of the TicketNumber does not need to be verified.
     * 
     */
    @XmlEnumValue("CheckDigit")
    CHECK_DIGIT("CheckDigit"),

    /**
     * No automatic interline agreement check needs to be performed on the ticket to be reissued.
     * 
     */
    @XmlEnumValue("InterlineAgreement")
    INTERLINE_AGREEMENT("InterlineAgreement"),

    /**
     * Neither the ticket number check digit nor the interline agreement needs to be checked.
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    CheckInhibitorTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckInhibitorTypeType fromValue(String v) {
        for (CheckInhibitorTypeType c: CheckInhibitorTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
