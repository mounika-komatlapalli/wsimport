
package org.opentravel.ota._2003._05.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareAmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareAmountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="NOADC"/>
 *     &lt;enumeration value="Bulk"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="AddCollect"/>
 *     &lt;enumeration value="Charter"/>
 *     &lt;enumeration value="NoFare"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareAmountType")
@XmlEnum
public enum FareAmountType {

    NOADC("NOADC"),
    @XmlEnumValue("Bulk")
    BULK("Bulk"),
    IT("IT"),
    @XmlEnumValue("AddCollect")
    ADD_COLLECT("AddCollect"),
    @XmlEnumValue("Charter")
    CHARTER("Charter"),
    @XmlEnumValue("NoFare")
    NO_FARE("NoFare");
    private final String value;

    FareAmountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareAmountType fromValue(String v) {
        for (FareAmountType c: FareAmountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
