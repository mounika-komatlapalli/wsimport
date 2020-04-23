
package org.opentravel.ota._2003._05.commontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.opentravel.ota._2003._05.simpletypes.ShareMarketIndType;
import org.opentravel.ota._2003._05.simpletypes.ShareSynchIndType;


/**
 * Identification about a specific credit card.
 * 
 * <p>Java class for PaymentCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardHolderName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" minOccurs="0"/>
 *         &lt;element name="CardIssuerName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}IssuerNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}AddressType" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}TelephoneInfoType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}EmailType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CustLoyaltyType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SignatureOnFile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}EffectiveExpireOptionalDateGroup"/>
 *                 &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MagneticStripe" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Track1">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                       &lt;minLength value="0"/>
 *                       &lt;maxLength value="108"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Track2">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                       &lt;minLength value="0"/>
 *                       &lt;maxLength value="56"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Track3">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                       &lt;minLength value="0"/>
 *                       &lt;maxLength value="144"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PrivacyGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PaymentCardDateGroup"/>
 *       &lt;attribute name="CardType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
 *       &lt;attribute name="CardCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}PaymentCardCodeType" />
 *       &lt;attribute name="CardNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to19" />
 *       &lt;attribute name="SeriesCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to8" />
 *       &lt;attribute name="MaskedCardNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to19" />
 *       &lt;attribute name="CardHolderRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="ExtendPaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CountryOfIssue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ISO3166" />
 *       &lt;attribute name="ExtendedPaymentQuantity" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to999" />
 *       &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CompanyCardReference" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to19" />
 *       &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to128" />
 *       &lt;attribute name="EncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", propOrder = {
    "cardHolderName",
    "cardIssuerName",
    "address",
    "telephone",
    "email",
    "custLoyalty",
    "signatureOnFile",
    "magneticStripe"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.commontypes.DonationType.CreditCardInfo.class
})
public class PaymentCardType {

    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "CardIssuerName")
    protected PaymentCardType.CardIssuerName cardIssuerName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Telephone")
    protected List<TelephoneInfoType> telephone;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "CustLoyalty")
    protected List<CustLoyaltyType> custLoyalty;
    @XmlElement(name = "SignatureOnFile")
    protected PaymentCardType.SignatureOnFile signatureOnFile;
    @XmlElement(name = "MagneticStripe")
    protected PaymentCardType.MagneticStripe magneticStripe;
    @XmlAttribute(name = "CardType")
    protected String cardType;
    @XmlAttribute(name = "CardCode")
    protected String cardCode;
    @XmlAttribute(name = "CardNumber")
    protected String cardNumber;
    @XmlAttribute(name = "SeriesCode")
    protected String seriesCode;
    @XmlAttribute(name = "MaskedCardNumber")
    protected String maskedCardNumber;
    @XmlAttribute(name = "CardHolderRPH")
    protected String cardHolderRPH;
    @XmlAttribute(name = "ExtendPaymentIndicator")
    protected Boolean extendPaymentIndicator;
    @XmlAttribute(name = "CountryOfIssue")
    protected String countryOfIssue;
    @XmlAttribute(name = "ExtendedPaymentQuantity")
    protected Integer extendedPaymentQuantity;
    @XmlAttribute(name = "SignatureOnFileIndicator")
    protected Boolean signatureOnFileIndicator;
    @XmlAttribute(name = "CompanyCardReference")
    protected String companyCardReference;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "EncryptionKey")
    protected String encryptionKey;
    @XmlAttribute(name = "ShareSynchInd")
    protected ShareSynchIndType shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected ShareMarketIndType shareMarketInd;
    @XmlAttribute(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    protected String expireDate;

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.CardIssuerName }
     *     
     */
    public PaymentCardType.CardIssuerName getCardIssuerName() {
        return cardIssuerName;
    }

    /**
     * Sets the value of the cardIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.CardIssuerName }
     *     
     */
    public void setCardIssuerName(PaymentCardType.CardIssuerName value) {
        this.cardIssuerName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneInfoType }
     * 
     * 
     */
    public List<TelephoneInfoType> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<TelephoneInfoType>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustLoyaltyType }
     * 
     * 
     */
    public List<CustLoyaltyType> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<CustLoyaltyType>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the signatureOnFile property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.SignatureOnFile }
     *     
     */
    public PaymentCardType.SignatureOnFile getSignatureOnFile() {
        return signatureOnFile;
    }

    /**
     * Sets the value of the signatureOnFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.SignatureOnFile }
     *     
     */
    public void setSignatureOnFile(PaymentCardType.SignatureOnFile value) {
        this.signatureOnFile = value;
    }

    /**
     * Gets the value of the magneticStripe property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.MagneticStripe }
     *     
     */
    public PaymentCardType.MagneticStripe getMagneticStripe() {
        return magneticStripe;
    }

    /**
     * Sets the value of the magneticStripe property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.MagneticStripe }
     *     
     */
    public void setMagneticStripe(PaymentCardType.MagneticStripe value) {
        this.magneticStripe = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the seriesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /**
     * Sets the value of the seriesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesCode(String value) {
        this.seriesCode = value;
    }

    /**
     * Gets the value of the maskedCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * Sets the value of the maskedCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCardNumber(String value) {
        this.maskedCardNumber = value;
    }

    /**
     * Gets the value of the cardHolderRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderRPH() {
        return cardHolderRPH;
    }

    /**
     * Sets the value of the cardHolderRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderRPH(String value) {
        this.cardHolderRPH = value;
    }

    /**
     * Gets the value of the extendPaymentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendPaymentIndicator() {
        return extendPaymentIndicator;
    }

    /**
     * Sets the value of the extendPaymentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendPaymentIndicator(Boolean value) {
        this.extendPaymentIndicator = value;
    }

    /**
     * Gets the value of the countryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    /**
     * Sets the value of the countryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfIssue(String value) {
        this.countryOfIssue = value;
    }

    /**
     * Gets the value of the extendedPaymentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtendedPaymentQuantity() {
        return extendedPaymentQuantity;
    }

    /**
     * Sets the value of the extendedPaymentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtendedPaymentQuantity(Integer value) {
        this.extendedPaymentQuantity = value;
    }

    /**
     * Gets the value of the signatureOnFileIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureOnFileIndicator() {
        return signatureOnFileIndicator;
    }

    /**
     * Sets the value of the signatureOnFileIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureOnFileIndicator(Boolean value) {
        this.signatureOnFileIndicator = value;
    }

    /**
     * Gets the value of the companyCardReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCardReference() {
        return companyCardReference;
    }

    /**
     * Sets the value of the companyCardReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCardReference(String value) {
        this.companyCardReference = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link ShareSynchIndType }
     *     
     */
    public ShareSynchIndType getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareSynchIndType }
     *     
     */
    public void setShareSynchInd(ShareSynchIndType value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link ShareMarketIndType }
     *     
     */
    public ShareMarketIndType getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareMarketIndType }
     *     
     */
    public void setShareMarketInd(ShareMarketIndType value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}IssuerNameGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CardIssuerName {

        @XmlAttribute(name = "BankID")
        protected String bankID;

        /**
         * Gets the value of the bankID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankID() {
            return bankID;
        }

        /**
         * Sets the value of the bankID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankID(String value) {
            this.bankID = value;
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
     *       &lt;attribute name="Track1">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
     *             &lt;minLength value="0"/>
     *             &lt;maxLength value="108"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Track2">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
     *             &lt;minLength value="0"/>
     *             &lt;maxLength value="56"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Track3">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
     *             &lt;minLength value="0"/>
     *             &lt;maxLength value="144"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MagneticStripe {

        @XmlAttribute(name = "Track1")
        protected byte[] track1;
        @XmlAttribute(name = "Track2")
        protected byte[] track2;
        @XmlAttribute(name = "Track3")
        protected byte[] track3;

        /**
         * Gets the value of the track1 property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getTrack1() {
            return track1;
        }

        /**
         * Sets the value of the track1 property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setTrack1(byte[] value) {
            this.track1 = value;
        }

        /**
         * Gets the value of the track2 property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getTrack2() {
            return track2;
        }

        /**
         * Sets the value of the track2 property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setTrack2(byte[] value) {
            this.track2 = value;
        }

        /**
         * Gets the value of the track3 property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getTrack3() {
            return track3;
        }

        /**
         * Sets the value of the track3 property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setTrack3(byte[] value) {
            this.track3 = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}EffectiveExpireOptionalDateGroup"/>
     *       &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SignatureOnFile {

        @XmlAttribute(name = "SignatureOnFileIndicator")
        protected Boolean signatureOnFileIndicator;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;

        /**
         * Gets the value of the signatureOnFileIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSignatureOnFileIndicator() {
            return signatureOnFileIndicator;
        }

        /**
         * Sets the value of the signatureOnFileIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignatureOnFileIndicator(Boolean value) {
            this.signatureOnFileIndicator = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the expireDateExclusiveIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * Sets the value of the expireDateExclusiveIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
        }

    }

}
