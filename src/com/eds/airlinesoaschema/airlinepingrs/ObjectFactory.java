
package com.eds.airlinesoaschema.airlinepingrs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eds.airlinesoaschema.airlinepingrs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AirlinePingRS_QNAME = new QName("http://www.eds.com/AirlineSOASchema/AirlinePingRS", "AirlinePingRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eds.airlinesoaschema.airlinepingrs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AirlinePingRS }
     * 
     */
    public AirlinePingRS createAirlinePingRS() {
        return new AirlinePingRS();
    }

    /**
     * Create an instance of {@link AirlinePingRS.PingResponse }
     * 
     */
    public AirlinePingRS.PingResponse createAirlinePingRSPingResponse() {
        return new AirlinePingRS.PingResponse();
    }

    /**
     * Create an instance of {@link AirlinePingRS.PingResponse.Processes }
     * 
     */
    public AirlinePingRS.PingResponse.Processes createAirlinePingRSPingResponseProcesses() {
        return new AirlinePingRS.PingResponse.Processes();
    }

    /**
     * Create an instance of {@link AirlinePingRS.PingResponse.Measurements }
     * 
     */
    public AirlinePingRS.PingResponse.Measurements createAirlinePingRSPingResponseMeasurements() {
        return new AirlinePingRS.PingResponse.Measurements();
    }

    /**
     * Create an instance of {@link AirlinePingRS.PingResponse.Processes.Process }
     * 
     */
    public AirlinePingRS.PingResponse.Processes.Process createAirlinePingRSPingResponseProcessesProcess() {
        return new AirlinePingRS.PingResponse.Processes.Process();
    }

    /**
     * Create an instance of {@link AirlinePingRS.PingResponse.Measurements.Measurement }
     * 
     */
    public AirlinePingRS.PingResponse.Measurements.Measurement createAirlinePingRSPingResponseMeasurementsMeasurement() {
        return new AirlinePingRS.PingResponse.Measurements.Measurement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlinePingRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eds.com/AirlineSOASchema/AirlinePingRS", name = "AirlinePingRS")
    public JAXBElement<AirlinePingRS> createAirlinePingRS(AirlinePingRS value) {
        return new JAXBElement<AirlinePingRS>(_AirlinePingRS_QNAME, AirlinePingRS.class, null, value);
    }

}
