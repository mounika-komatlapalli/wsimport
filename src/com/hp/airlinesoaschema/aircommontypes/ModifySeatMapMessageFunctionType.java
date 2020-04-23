
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifySeatMapMessageFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModifySeatMapMessageFunctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReleaseHeldSeats"/>
 *     &lt;enumeration value="StartModifySeatMap"/>
 *     &lt;enumeration value="ClearAllModifySeatMap"/>
 *     &lt;enumeration value="ClearNextModifySeatMap"/>
 *     &lt;enumeration value="SkipNextModifySeatMap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModifySeatMapMessageFunctionType")
@XmlEnum
public enum ModifySeatMapMessageFunctionType {


    /**
     * release remaining held seats prior to starting ModifySeatMap clearance.
     * 
     */
    @XmlEnumValue("ReleaseHeldSeats")
    RELEASE_HELD_SEATS("ReleaseHeldSeats"),

    /**
     * initiate ModifySeatMap boarding process
     * 
     */
    @XmlEnumValue("StartModifySeatMap")
    START_MODIFY_SEAT_MAP("StartModifySeatMap"),

    /**
     * process all of the passengers on the ModifySeatMap list
     * 
     */
    @XmlEnumValue("ClearAllModifySeatMap")
    CLEAR_ALL_MODIFY_SEAT_MAP("ClearAllModifySeatMap"),

    /**
     * process the next passenger on the ModifySeatMap list
     * 
     */
    @XmlEnumValue("ClearNextModifySeatMap")
    CLEAR_NEXT_MODIFY_SEAT_MAP("ClearNextModifySeatMap"),

    /**
     * skip the current ModifySeatMap passenger and process the next passenger on the Stanby list 
     * 
     */
    @XmlEnumValue("SkipNextModifySeatMap")
    SKIP_NEXT_MODIFY_SEAT_MAP("SkipNextModifySeatMap");
    private final String value;

    ModifySeatMapMessageFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModifySeatMapMessageFunctionType fromValue(String v) {
        for (ModifySeatMapMessageFunctionType c: ModifySeatMapMessageFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
