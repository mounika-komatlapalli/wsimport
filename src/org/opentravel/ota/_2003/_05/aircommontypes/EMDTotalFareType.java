
package org.opentravel.ota._2003._05.aircommontypes;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify the total, total net, total sell fare or refund amount.
 * 
 * <p>Java class for EMD_TotalFareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMD_TotalFareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CurrencyAmountGroup"/>
 *       &lt;attribute name="Purpose" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}PurposeType" />
 *       &lt;attribute name="FareAmountType" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}FareAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMD_TotalFareType")
public class EMDTotalFareType {

    @XmlAttribute(name = "Purpose")
    protected PurposeType purpose;
    @XmlAttribute(name = "FareAmountType")
    protected FareAmountType fareAmountType;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeType }
     *     
     */
    public PurposeType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeType }
     *     
     */
    public void setPurpose(PurposeType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the fareAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link FareAmountType }
     *     
     */
    public FareAmountType getFareAmountType() {
        return fareAmountType;
    }

    /**
     * Sets the value of the fareAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAmountType }
     *     
     */
    public void setFareAmountType(FareAmountType value) {
        this.fareAmountType = value;
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
