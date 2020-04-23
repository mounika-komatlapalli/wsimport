
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoardingMessageFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BoardingMessageFunctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StartBoarding"/>
 *     &lt;enumeration value="BoardPassenger"/>
 *     &lt;enumeration value="CancelBoardedPassenger"/>
 *     &lt;enumeration value="DisplayPassengersBoarded"/>
 *     &lt;enumeration value="DisplayPassengersNotBoarded"/>
 *     &lt;enumeration value="DisplayBoardingStatus"/>
 *     &lt;enumeration value="BoardingComplete"/>
 *     &lt;enumeration value="AbortBoarding"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BoardingMessageFunctionType")
@XmlEnum
public enum BoardingMessageFunctionType {


    /**
     * initialize the boarding process by either seat number or check-in sequence number
     * 
     */
    @XmlEnumValue("StartBoarding")
    START_BOARDING("StartBoarding"),

    /**
     * start the passenger boarding by either seat number or check-in sequence number
     * 
     */
    @XmlEnumValue("BoardPassenger")
    BOARD_PASSENGER("BoardPassenger"),

    /**
     * cancel the previously boarded passenger by either seat number or the check-in sequence number
     * 
     */
    @XmlEnumValue("CancelBoardedPassenger")
    CANCEL_BOARDED_PASSENGER("CancelBoardedPassenger"),

    /**
     * display the reconcile passenger name list
     * 
     */
    @XmlEnumValue("DisplayPassengersBoarded")
    DISPLAY_PASSENGERS_BOARDED("DisplayPassengersBoarded"),

    /**
     * display the unreconcile passenger name list
     * 
     */
    @XmlEnumValue("DisplayPassengersNotBoarded")
    DISPLAY_PASSENGERS_NOT_BOARDED("DisplayPassengersNotBoarded"),

    /**
     * display the total of checked-in passengers, and the total of reconcile and unreconcile passengers broken down by ICR compartments.
     * 
     */
    @XmlEnumValue("DisplayBoardingStatus")
    DISPLAY_BOARDING_STATUS("DisplayBoardingStatus"),

    /**
     * indicate the boarding process is complete.
     * 
     */
    @XmlEnumValue("BoardingComplete")
    BOARDING_COMPLETE("BoardingComplete"),

    /**
     * clear out all existing passenger reconcile date associated with the specified flight, date, and board point
     * 
     */
    @XmlEnumValue("AbortBoarding")
    ABORT_BOARDING("AbortBoarding");
    private final String value;

    BoardingMessageFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingMessageFunctionType fromValue(String v) {
        for (BoardingMessageFunctionType c: BoardingMessageFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
