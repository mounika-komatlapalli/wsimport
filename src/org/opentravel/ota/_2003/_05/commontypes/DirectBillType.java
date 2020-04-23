
package org.opentravel.ota._2003._05.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.opentravel.ota._2003._05.simpletypes.ShareMarketIndType;
import org.opentravel.ota._2003._05.simpletypes.ShareSynchIndType;


/**
 * Company name and location for sending invoice for remittances for travel services.
 * 
 * <p>Java class for DirectBillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectBillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/CommonTypes>CompanyNameType">
 *                 &lt;attribute name="ContactName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}EmailType" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}TelephoneInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PrivacyGroup"/>
 *       &lt;attribute name="DirectBill_ID" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *       &lt;attribute name="BillingNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectBillType", propOrder = {
    "companyName",
    "address",
    "email",
    "telephone"
})
public class DirectBillType {

    @XmlElement(name = "CompanyName")
    protected DirectBillType.CompanyName companyName;
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlElement(name = "Telephone")
    protected TelephoneInfoType telephone;
    @XmlAttribute(name = "DirectBill_ID")
    protected String directBillID;
    @XmlAttribute(name = "BillingNumber")
    protected String billingNumber;
    @XmlAttribute(name = "ShareSynchInd")
    protected ShareSynchIndType shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected ShareMarketIndType shareMarketInd;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType.CompanyName }
     *     
     */
    public DirectBillType.CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType.CompanyName }
     *     
     */
    public void setCompanyName(DirectBillType.CompanyName value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddress(AddressInfoType value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneInfoType }
     *     
     */
    public TelephoneInfoType getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneInfoType }
     *     
     */
    public void setTelephone(TelephoneInfoType value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the directBillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectBillID() {
        return directBillID;
    }

    /**
     * Sets the value of the directBillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectBillID(String value) {
        this.directBillID = value;
    }

    /**
     * Gets the value of the billingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingNumber() {
        return billingNumber;
    }

    /**
     * Sets the value of the billingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingNumber(String value) {
        this.billingNumber = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/CommonTypes>CompanyNameType">
     *       &lt;attribute name="ContactName" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CompanyName
        extends CompanyNameType
    {

        @XmlAttribute(name = "ContactName")
        protected String contactName;

        /**
         * Gets the value of the contactName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactName() {
            return contactName;
        }

        /**
         * Sets the value of the contactName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactName(String value) {
            this.contactName = value;
        }

    }

}
