
package org.opentravel.ota._2003._05.aircommontypes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.opentravel.ota._2003._05.simpletypes.ActionType;


/**
 * Holds a base fare, tax, total and currency information on a price
 * 
 * <p>Java class for FareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}BaseFareType" minOccurs="0"/>
 *         &lt;element name="EquivFare" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}EquivFareType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}FareTaxesType" minOccurs="0"/>
 *         &lt;element name="Fees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}AirFeeType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}TotalFareType">
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareConstruction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FormattedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="OriginCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *                 &lt;attribute name="OriginCodeContext" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *                 &lt;attribute name="DestinationCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *                 &lt;attribute name="DestinationCodeContext" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnstructuredFareCalc" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}UnstructuredFareCalcType" minOccurs="0"/>
 *         &lt;element name="FareBaggageAllowance" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
 *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TourCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/SimpleTypes>StringLength1to16">
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to64" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="OriginalIssueInfo" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}FareOriginalIssueInfoType" minOccurs="0"/>
 *         &lt;element name="ExchangeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CouponInfo" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}CouponInfoType" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="OriginalOriginDestination" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="OriginCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *                           &lt;attribute name="DestinationCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Discounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Discount" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}DiscountInfoGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SalesLocation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SalesIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="TicketingIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReservationStatusCodeOrigin" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PassengerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PricingLocalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="PricingSystemDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}NegotiatedFareAttributes"/>
 *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
 *       &lt;attribute name="TotalNbrTrips" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to99" />
 *       &lt;attribute name="TotalNbrPTC" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to99" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareType", propOrder = {
    "baseFare",
    "equivFare",
    "taxes",
    "fees",
    "totalFare",
    "fareConstruction",
    "unstructuredFareCalc",
    "fareBaggageAllowance",
    "tourCode",
    "remark",
    "originalIssueInfo",
    "exchangeInfo",
    "discounts",
    "tpaExtensions"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.aircommontypes.PTCFareBreakdownType.PassengerFare.class,
    org.opentravel.ota._2003._05.aircommontypes.AirItineraryPricingInfoType.ItinTotalFare.class
})
public class FareType {

    @XmlElement(name = "BaseFare")
    protected BaseFareType baseFare;
    @XmlElement(name = "EquivFare")
    protected List<EquivFareType> equivFare;
    @XmlElement(name = "Taxes")
    protected FareTaxesType taxes;
    @XmlElement(name = "Fees")
    protected FareType.Fees fees;
    @XmlElement(name = "TotalFare")
    protected FareType.TotalFare totalFare;
    @XmlElement(name = "FareConstruction")
    protected FareType.FareConstruction fareConstruction;
    @XmlElement(name = "UnstructuredFareCalc")
    protected UnstructuredFareCalcType unstructuredFareCalc;
    @XmlElement(name = "FareBaggageAllowance")
    protected List<FareType.FareBaggageAllowance> fareBaggageAllowance;
    @XmlElement(name = "TourCode")
    protected FareType.TourCode tourCode;
    @XmlElement(name = "Remark")
    protected List<String> remark;
    @XmlElement(name = "OriginalIssueInfo")
    protected FareOriginalIssueInfoType originalIssueInfo;
    @XmlElement(name = "ExchangeInfo")
    protected FareType.ExchangeInfo exchangeInfo;
    @XmlElement(name = "Discounts")
    protected FareType.Discounts discounts;
    @XmlElement(name = "TPA_Extensions")
    protected FareType.TPAExtensions tpaExtensions;
    @XmlAttribute(name = "TicketDesignatorCode")
    protected String ticketDesignatorCode;
    @XmlAttribute(name = "TotalNbrTrips")
    protected Integer totalNbrTrips;
    @XmlAttribute(name = "TotalNbrPTC")
    protected Integer totalNbrPTC;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BaseFareType }
     *     
     */
    public BaseFareType getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFareType }
     *     
     */
    public void setBaseFare(BaseFareType value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquivFareType }
     * 
     * 
     */
    public List<EquivFareType> getEquivFare() {
        if (equivFare == null) {
            equivFare = new ArrayList<EquivFareType>();
        }
        return this.equivFare;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link FareTaxesType }
     *     
     */
    public FareTaxesType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTaxesType }
     *     
     */
    public void setTaxes(FareTaxesType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.Fees }
     *     
     */
    public FareType.Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.Fees }
     *     
     */
    public void setFees(FareType.Fees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.TotalFare }
     *     
     */
    public FareType.TotalFare getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.TotalFare }
     *     
     */
    public void setTotalFare(FareType.TotalFare value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the fareConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.FareConstruction }
     *     
     */
    public FareType.FareConstruction getFareConstruction() {
        return fareConstruction;
    }

    /**
     * Sets the value of the fareConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.FareConstruction }
     *     
     */
    public void setFareConstruction(FareType.FareConstruction value) {
        this.fareConstruction = value;
    }

    /**
     * Gets the value of the unstructuredFareCalc property.
     * 
     * @return
     *     possible object is
     *     {@link UnstructuredFareCalcType }
     *     
     */
    public UnstructuredFareCalcType getUnstructuredFareCalc() {
        return unstructuredFareCalc;
    }

    /**
     * Sets the value of the unstructuredFareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnstructuredFareCalcType }
     *     
     */
    public void setUnstructuredFareCalc(UnstructuredFareCalcType value) {
        this.unstructuredFareCalc = value;
    }

    /**
     * Gets the value of the fareBaggageAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareBaggageAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareType.FareBaggageAllowance }
     * 
     * 
     */
    public List<FareType.FareBaggageAllowance> getFareBaggageAllowance() {
        if (fareBaggageAllowance == null) {
            fareBaggageAllowance = new ArrayList<FareType.FareBaggageAllowance>();
        }
        return this.fareBaggageAllowance;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.TourCode }
     *     
     */
    public FareType.TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.TourCode }
     *     
     */
    public void setTourCode(FareType.TourCode value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemark() {
        if (remark == null) {
            remark = new ArrayList<String>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the originalIssueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareOriginalIssueInfoType }
     *     
     */
    public FareOriginalIssueInfoType getOriginalIssueInfo() {
        return originalIssueInfo;
    }

    /**
     * Sets the value of the originalIssueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareOriginalIssueInfoType }
     *     
     */
    public void setOriginalIssueInfo(FareOriginalIssueInfoType value) {
        this.originalIssueInfo = value;
    }

    /**
     * Gets the value of the exchangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.ExchangeInfo }
     *     
     */
    public FareType.ExchangeInfo getExchangeInfo() {
        return exchangeInfo;
    }

    /**
     * Sets the value of the exchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.ExchangeInfo }
     *     
     */
    public void setExchangeInfo(FareType.ExchangeInfo value) {
        this.exchangeInfo = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.Discounts }
     *     
     */
    public FareType.Discounts getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.Discounts }
     *     
     */
    public void setDiscounts(FareType.Discounts value) {
        this.discounts = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.TPAExtensions }
     *     
     */
    public FareType.TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.TPAExtensions }
     *     
     */
    public void setTPAExtensions(FareType.TPAExtensions value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the ticketDesignatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignatorCode() {
        return ticketDesignatorCode;
    }

    /**
     * Sets the value of the ticketDesignatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignatorCode(String value) {
        this.ticketDesignatorCode = value;
    }

    /**
     * Gets the value of the totalNbrTrips property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNbrTrips() {
        return totalNbrTrips;
    }

    /**
     * Sets the value of the totalNbrTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNbrTrips(Integer value) {
        this.totalNbrTrips = value;
    }

    /**
     * Gets the value of the totalNbrPTC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNbrPTC() {
        return totalNbrPTC;
    }

    /**
     * Sets the value of the totalNbrPTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNbrPTC(Integer value) {
        this.totalNbrPTC = value;
    }

    /**
     * Gets the value of the negotiatedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegotiatedFare() {
        return negotiatedFare;
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * Gets the value of the negotiatedFareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    /**
     * Sets the value of the negotiatedFareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedFareCode(String value) {
        this.negotiatedFareCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Discount" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}DiscountInfoGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "discount"
    })
    public static class Discounts {

        @XmlElement(name = "Discount", required = true)
        protected List<FareType.Discounts.Discount> discount;

        /**
         * Gets the value of the discount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the discount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiscount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareType.Discounts.Discount }
         * 
         * 
         */
        public List<FareType.Discounts.Discount> getDiscount() {
            if (discount == null) {
                discount = new ArrayList<FareType.Discounts.Discount>();
            }
            return this.discount;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}DiscountInfoGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Discount {

            @XmlAttribute(name = "Percent")
            protected BigDecimal percent;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the percent property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercent() {
                return percent;
            }

            /**
             * Sets the value of the percent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercent(BigDecimal value) {
                this.percent = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CouponInfo" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}CouponInfoType" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="OriginalOriginDestination" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="OriginCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
     *                 &lt;attribute name="DestinationCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "couponInfo",
        "originalOriginDestination"
    })
    public static class ExchangeInfo {

        @XmlElement(name = "CouponInfo")
        protected List<CouponInfoType> couponInfo;
        @XmlElement(name = "OriginalOriginDestination")
        protected FareType.ExchangeInfo.OriginalOriginDestination originalOriginDestination;
        @XmlAttribute(name = "TicketDocumentNbr")
        protected String ticketDocumentNbr;

        /**
         * Gets the value of the couponInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CouponInfoType }
         * 
         * 
         */
        public List<CouponInfoType> getCouponInfo() {
            if (couponInfo == null) {
                couponInfo = new ArrayList<CouponInfoType>();
            }
            return this.couponInfo;
        }

        /**
         * Gets the value of the originalOriginDestination property.
         * 
         * @return
         *     possible object is
         *     {@link FareType.ExchangeInfo.OriginalOriginDestination }
         *     
         */
        public FareType.ExchangeInfo.OriginalOriginDestination getOriginalOriginDestination() {
            return originalOriginDestination;
        }

        /**
         * Sets the value of the originalOriginDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareType.ExchangeInfo.OriginalOriginDestination }
         *     
         */
        public void setOriginalOriginDestination(FareType.ExchangeInfo.OriginalOriginDestination value) {
            this.originalOriginDestination = value;
        }

        /**
         * Gets the value of the ticketDocumentNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocumentNbr() {
            return ticketDocumentNbr;
        }

        /**
         * Sets the value of the ticketDocumentNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocumentNbr(String value) {
            this.ticketDocumentNbr = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="OriginCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
         *       &lt;attribute name="DestinationCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OriginalOriginDestination {

            @XmlAttribute(name = "OriginCityCode")
            protected String originCityCode;
            @XmlAttribute(name = "DestinationCityCode")
            protected String destinationCityCode;

            /**
             * Gets the value of the originCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginCityCode() {
                return originCityCode;
            }

            /**
             * Sets the value of the originCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginCityCode(String value) {
                this.originCityCode = value;
            }

            /**
             * Gets the value of the destinationCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDestinationCityCode() {
                return destinationCityCode;
            }

            /**
             * Sets the value of the destinationCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDestinationCityCode(String value) {
                this.destinationCityCode = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
     *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareBaggageAllowance {

        @XmlAttribute(name = "FlightSegmentRPH")
        protected String flightSegmentRPH;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;
        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Gets the value of the flightSegmentRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightSegmentRPH() {
            return flightSegmentRPH;
        }

        /**
         * Sets the value of the flightSegmentRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightSegmentRPH(String value) {
            this.flightSegmentRPH = value;
        }

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

        /**
         * Gets the value of the unitOfMeasureQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * Sets the value of the unitOfMeasureQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * Gets the value of the unitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Sets the value of the unitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="FormattedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *       &lt;attribute name="OriginCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
     *       &lt;attribute name="OriginCodeContext" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
     *       &lt;attribute name="DestinationCityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
     *       &lt;attribute name="DestinationCodeContext" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareConstruction {

        @XmlAttribute(name = "FormattedIndicator")
        protected Boolean formattedIndicator;
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "OriginCityCode")
        protected String originCityCode;
        @XmlAttribute(name = "OriginCodeContext")
        protected String originCodeContext;
        @XmlAttribute(name = "DestinationCityCode")
        protected String destinationCityCode;
        @XmlAttribute(name = "DestinationCodeContext")
        protected String destinationCodeContext;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * Gets the value of the formattedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFormattedIndicator() {
            return formattedIndicator;
        }

        /**
         * Sets the value of the formattedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFormattedIndicator(Boolean value) {
            this.formattedIndicator = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the originCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginCityCode() {
            return originCityCode;
        }

        /**
         * Sets the value of the originCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginCityCode(String value) {
            this.originCityCode = value;
        }

        /**
         * Gets the value of the originCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginCodeContext() {
            return originCodeContext;
        }

        /**
         * Sets the value of the originCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginCodeContext(String value) {
            this.originCodeContext = value;
        }

        /**
         * Gets the value of the destinationCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationCityCode() {
            return destinationCityCode;
        }

        /**
         * Sets the value of the destinationCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationCityCode(String value) {
            this.destinationCityCode = value;
        }

        /**
         * Gets the value of the destinationCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationCodeContext() {
            return destinationCodeContext;
        }

        /**
         * Sets the value of the destinationCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationCodeContext(String value) {
            this.destinationCodeContext = value;
        }

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}AirFeeType" maxOccurs="9"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fee"
    })
    public static class Fees {

        @XmlElement(name = "Fee", required = true)
        protected List<AirFeeType> fee;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirFeeType }
         * 
         * 
         */
        public List<AirFeeType> getFee() {
            if (fee == null) {
                fee = new ArrayList<AirFeeType>();
            }
            return this.fee;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SalesLocation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SalesIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="TicketingIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReservationStatusCodeOrigin" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PassengerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PricingLocalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="PricingSystemDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "salesLocation",
        "reservationStatusCodeOrigin",
        "passengerDescription",
        "pricingLocalDateTime",
        "pricingSystemDateTime",
        "bookingDate"
    })
    public static class TPAExtensions {

        @XmlElement(name = "SalesLocation")
        protected FareType.TPAExtensions.SalesLocation salesLocation;
        @XmlElement(name = "ReservationStatusCodeOrigin")
        protected List<FareType.TPAExtensions.ReservationStatusCodeOrigin> reservationStatusCodeOrigin;
        @XmlElement(name = "PassengerDescription")
        protected String passengerDescription;
        @XmlElement(name = "PricingLocalDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar pricingLocalDateTime;
        @XmlElement(name = "PricingSystemDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar pricingSystemDateTime;
        @XmlElement(name = "BookingDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar bookingDate;

        /**
         * Gets the value of the salesLocation property.
         * 
         * @return
         *     possible object is
         *     {@link FareType.TPAExtensions.SalesLocation }
         *     
         */
        public FareType.TPAExtensions.SalesLocation getSalesLocation() {
            return salesLocation;
        }

        /**
         * Sets the value of the salesLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareType.TPAExtensions.SalesLocation }
         *     
         */
        public void setSalesLocation(FareType.TPAExtensions.SalesLocation value) {
            this.salesLocation = value;
        }

        /**
         * Gets the value of the reservationStatusCodeOrigin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservationStatusCodeOrigin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservationStatusCodeOrigin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareType.TPAExtensions.ReservationStatusCodeOrigin }
         * 
         * 
         */
        public List<FareType.TPAExtensions.ReservationStatusCodeOrigin> getReservationStatusCodeOrigin() {
            if (reservationStatusCodeOrigin == null) {
                reservationStatusCodeOrigin = new ArrayList<FareType.TPAExtensions.ReservationStatusCodeOrigin>();
            }
            return this.reservationStatusCodeOrigin;
        }

        /**
         * Gets the value of the passengerDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassengerDescription() {
            return passengerDescription;
        }

        /**
         * Sets the value of the passengerDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassengerDescription(String value) {
            this.passengerDescription = value;
        }

        /**
         * Gets the value of the pricingLocalDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPricingLocalDateTime() {
            return pricingLocalDateTime;
        }

        /**
         * Sets the value of the pricingLocalDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPricingLocalDateTime(XMLGregorianCalendar value) {
            this.pricingLocalDateTime = value;
        }

        /**
         * Gets the value of the pricingSystemDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPricingSystemDateTime() {
            return pricingSystemDateTime;
        }

        /**
         * Sets the value of the pricingSystemDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPricingSystemDateTime(XMLGregorianCalendar value) {
            this.pricingSystemDateTime = value;
        }

        /**
         * Gets the value of the bookingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBookingDate() {
            return bookingDate;
        }

        /**
         * Sets the value of the bookingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBookingDate(XMLGregorianCalendar value) {
            this.bookingDate = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ReservationStatusCodeOrigin {

            @XmlAttribute(name = "ReservationStatusCode")
            protected String reservationStatusCode;
            @XmlAttribute(name = "FlightSegmentRPH")
            protected String flightSegmentRPH;

            /**
             * Gets the value of the reservationStatusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationStatusCode() {
                return reservationStatusCode;
            }

            /**
             * Sets the value of the reservationStatusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationStatusCode(String value) {
                this.reservationStatusCode = value;
            }

            /**
             * Gets the value of the flightSegmentRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightSegmentRPH() {
                return flightSegmentRPH;
            }

            /**
             * Sets the value of the flightSegmentRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightSegmentRPH(String value) {
                this.flightSegmentRPH = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="SalesIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="TicketingIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SalesLocation {

            @XmlAttribute(name = "SalesIndicator", required = true)
            protected boolean salesIndicator;
            @XmlAttribute(name = "TicketingIndicator", required = true)
            protected boolean ticketingIndicator;

            /**
             * Gets the value of the salesIndicator property.
             * 
             */
            public boolean isSalesIndicator() {
                return salesIndicator;
            }

            /**
             * Sets the value of the salesIndicator property.
             * 
             */
            public void setSalesIndicator(boolean value) {
                this.salesIndicator = value;
            }

            /**
             * Gets the value of the ticketingIndicator property.
             * 
             */
            public boolean isTicketingIndicator() {
                return ticketingIndicator;
            }

            /**
             * Sets the value of the ticketingIndicator property.
             * 
             */
            public void setTicketingIndicator(boolean value) {
                this.ticketingIndicator = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}TotalFareType">
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalFare
        extends TotalFareType
    {

        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/SimpleTypes>StringLength1to16">
     *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TourCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Operation")
        protected ActionType operation;

        /**
         * Used for Character Strings, length 1 to 16.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the operation property.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getOperation() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setOperation(ActionType value) {
            this.operation = value;
        }

    }

}
