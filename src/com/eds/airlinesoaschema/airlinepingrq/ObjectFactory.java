
package com.eds.airlinesoaschema.airlinepingrq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eds.airlinesoaschema.airlinepingrq package. 
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

    private final static QName _AirlinePingRQ_QNAME = new QName("http://www.eds.com/AirlineSOASchema/AirlinePingRQ", "AirlinePingRQ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eds.airlinesoaschema.airlinepingrq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AirlinePingRQ }
     * 
     */
    public AirlinePingRQ createAirlinePingRQ() {
        return new AirlinePingRQ();
    }

    /**
     * Create an instance of {@link AirlinePingRQ.CustomerDataList }
     * 
     */
    public AirlinePingRQ.CustomerDataList createAirlinePingRQCustomerDataList() {
        return new AirlinePingRQ.CustomerDataList();
    }

    /**
     * Create an instance of {@link AirlinePingRQ.CustomerDataList.CustomerData }
     * 
     */
    public AirlinePingRQ.CustomerDataList.CustomerData createAirlinePingRQCustomerDataListCustomerData() {
        return new AirlinePingRQ.CustomerDataList.CustomerData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlinePingRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.eds.com/AirlineSOASchema/AirlinePingRQ", name = "AirlinePingRQ")
    public JAXBElement<AirlinePingRQ> createAirlinePingRQ(AirlinePingRQ value) {
        return new JAXBElement<AirlinePingRQ>(_AirlinePingRQ_QNAME, AirlinePingRQ.class, null, value);
    }

}
