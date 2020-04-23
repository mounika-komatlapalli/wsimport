
package com.hp.airlinesoaschema.aircommontypes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.opentravel.ota._2003._05.commontypes.CompanyNameType;
import org.opentravel.ota._2003._05.commontypes.ContactPersonType;
import org.opentravel.ota._2003._05.commontypes.PersonNameType;


/**
 * Loyalty specific member profile information.
 * 
 * <p>Java class for LoyaltyAccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyAccountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberInfo" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}ContactPersonType"/>
 *         &lt;element name="MemberPreferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalReward" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PersonNameType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="MemberID" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Offer" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Communication" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Partner"/>
 *                                 &lt;enumeration value="Loyalty"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PromotionCodeGroup"/>
 *                 &lt;attribute name="Awareness" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *                 &lt;attribute name="AwardsPreference">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Points"/>
 *                       &lt;enumeration value="Miles"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SecurityInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PasswordHint" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Hint">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Question"/>
 *                                 &lt;enumeration value="Answer"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Username" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *                 &lt;attribute name="Password" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountBalances" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SubAccountType" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
 *                 &lt;attribute name="Balance" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PointBalance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="EnrollmentType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Full"/>
 *             &lt;enumeration value="Partial"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="EnrollmentMethod" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyAccountInfoType", propOrder = {
    "memberInfo",
    "memberPreferences",
    "securityInfo",
    "accountBalances"
})
public class LoyaltyAccountInfoType {

    @XmlElement(name = "MemberInfo", required = true)
    protected ContactPersonType memberInfo;
    @XmlElement(name = "MemberPreferences")
    protected LoyaltyAccountInfoType.MemberPreferences memberPreferences;
    @XmlElement(name = "SecurityInfo")
    protected LoyaltyAccountInfoType.SecurityInfo securityInfo;
    @XmlElement(name = "AccountBalances")
    protected List<LoyaltyAccountInfoType.AccountBalances> accountBalances;
    @XmlAttribute(name = "PointBalance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pointBalance;
    @XmlAttribute(name = "EnrollmentType")
    protected String enrollmentType;
    @XmlAttribute(name = "EnrollmentMethod")
    protected String enrollmentMethod;

    /**
     * Gets the value of the memberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getMemberInfo() {
        return memberInfo;
    }

    /**
     * Sets the value of the memberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setMemberInfo(ContactPersonType value) {
        this.memberInfo = value;
    }

    /**
     * Gets the value of the memberPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccountInfoType.MemberPreferences }
     *     
     */
    public LoyaltyAccountInfoType.MemberPreferences getMemberPreferences() {
        return memberPreferences;
    }

    /**
     * Sets the value of the memberPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountInfoType.MemberPreferences }
     *     
     */
    public void setMemberPreferences(LoyaltyAccountInfoType.MemberPreferences value) {
        this.memberPreferences = value;
    }

    /**
     * Gets the value of the securityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccountInfoType.SecurityInfo }
     *     
     */
    public LoyaltyAccountInfoType.SecurityInfo getSecurityInfo() {
        return securityInfo;
    }

    /**
     * Sets the value of the securityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountInfoType.SecurityInfo }
     *     
     */
    public void setSecurityInfo(LoyaltyAccountInfoType.SecurityInfo value) {
        this.securityInfo = value;
    }

    /**
     * Gets the value of the accountBalances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountBalances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountBalances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyAccountInfoType.AccountBalances }
     * 
     * 
     */
    public List<LoyaltyAccountInfoType.AccountBalances> getAccountBalances() {
        if (accountBalances == null) {
            accountBalances = new ArrayList<LoyaltyAccountInfoType.AccountBalances>();
        }
        return this.accountBalances;
    }

    /**
     * Gets the value of the pointBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointBalance() {
        return pointBalance;
    }

    /**
     * Sets the value of the pointBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointBalance(BigInteger value) {
        this.pointBalance = value;
    }

    /**
     * Gets the value of the enrollmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentType() {
        return enrollmentType;
    }

    /**
     * Sets the value of the enrollmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentType(String value) {
        this.enrollmentType = value;
    }

    /**
     * Gets the value of the enrollmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentMethod() {
        return enrollmentMethod;
    }

    /**
     * Sets the value of the enrollmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentMethod(String value) {
        this.enrollmentMethod = value;
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
     *       &lt;attribute name="SubAccountType" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
     *       &lt;attribute name="Balance" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccountBalances {

        @XmlAttribute(name = "SubAccountType", required = true)
        protected String subAccountType;
        @XmlAttribute(name = "Balance", required = true)
        protected BigInteger balance;

        /**
         * Gets the value of the subAccountType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubAccountType() {
            return subAccountType;
        }

        /**
         * Sets the value of the subAccountType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubAccountType(String value) {
            this.subAccountType = value;
        }

        /**
         * Gets the value of the balance property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBalance() {
            return balance;
        }

        /**
         * Sets the value of the balance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBalance(BigInteger value) {
            this.balance = value;
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
     *         &lt;element name="AdditionalReward" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PersonNameType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="MemberID" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Offer" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Communication" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Partner"/>
     *                       &lt;enumeration value="Loyalty"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PromotionCodeGroup"/>
     *       &lt;attribute name="Awareness" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
     *       &lt;attribute name="AwardsPreference">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Points"/>
     *             &lt;enumeration value="Miles"/>
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
    @XmlType(name = "", propOrder = {
        "additionalReward",
        "offer"
    })
    public static class MemberPreferences {

        @XmlElement(name = "AdditionalReward")
        protected List<LoyaltyAccountInfoType.MemberPreferences.AdditionalReward> additionalReward;
        @XmlElement(name = "Offer")
        protected List<LoyaltyAccountInfoType.MemberPreferences.Offer> offer;
        @XmlAttribute(name = "Awareness")
        protected String awareness;
        @XmlAttribute(name = "AwardsPreference")
        protected String awardsPreference;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;

        /**
         * Gets the value of the additionalReward property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalReward property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalReward().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LoyaltyAccountInfoType.MemberPreferences.AdditionalReward }
         * 
         * 
         */
        public List<LoyaltyAccountInfoType.MemberPreferences.AdditionalReward> getAdditionalReward() {
            if (additionalReward == null) {
                additionalReward = new ArrayList<LoyaltyAccountInfoType.MemberPreferences.AdditionalReward>();
            }
            return this.additionalReward;
        }

        /**
         * Gets the value of the offer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LoyaltyAccountInfoType.MemberPreferences.Offer }
         * 
         * 
         */
        public List<LoyaltyAccountInfoType.MemberPreferences.Offer> getOffer() {
            if (offer == null) {
                offer = new ArrayList<LoyaltyAccountInfoType.MemberPreferences.Offer>();
            }
            return this.offer;
        }

        /**
         * Gets the value of the awareness property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwareness() {
            return awareness;
        }

        /**
         * Sets the value of the awareness property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwareness(String value) {
            this.awareness = value;
        }

        /**
         * Gets the value of the awardsPreference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwardsPreference() {
            return awardsPreference;
        }

        /**
         * Sets the value of the awardsPreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwardsPreference(String value) {
            this.awardsPreference = value;
        }

        /**
         * Gets the value of the promotionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * Sets the value of the promotionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
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
         *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PersonNameType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="MemberID" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "companyName",
            "name"
        })
        public static class AdditionalReward {

            @XmlElement(name = "CompanyName")
            protected CompanyNameType companyName;
            @XmlElement(name = "Name")
            protected PersonNameType name;
            @XmlAttribute(name = "MemberID")
            protected String memberID;

            /**
             * Gets the value of the companyName property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getCompanyName() {
                return companyName;
            }

            /**
             * Sets the value of the companyName property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setCompanyName(CompanyNameType value) {
                this.companyName = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setName(PersonNameType value) {
                this.name = value;
            }

            /**
             * Gets the value of the memberID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberID() {
                return memberID;
            }

            /**
             * Sets the value of the memberID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberID(String value) {
                this.memberID = value;
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
         *         &lt;element name="Communication" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Partner"/>
         *             &lt;enumeration value="Loyalty"/>
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
        @XmlType(name = "", propOrder = {
            "communication"
        })
        public static class Offer {

            @XmlElement(name = "Communication")
            protected List<LoyaltyAccountInfoType.MemberPreferences.Offer.Communication> communication;
            @XmlAttribute(name = "Type")
            protected String type;

            /**
             * Gets the value of the communication property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the communication property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCommunication().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LoyaltyAccountInfoType.MemberPreferences.Offer.Communication }
             * 
             * 
             */
            public List<LoyaltyAccountInfoType.MemberPreferences.Offer.Communication> getCommunication() {
                if (communication == null) {
                    communication = new ArrayList<LoyaltyAccountInfoType.MemberPreferences.Offer.Communication>();
                }
                return this.communication;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
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
             *       &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Communication {

                @XmlAttribute(name = "DistribType")
                protected String distribType;

                /**
                 * Gets the value of the distribType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDistribType() {
                    return distribType;
                }

                /**
                 * Sets the value of the distribType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDistribType(String value) {
                    this.distribType = value;
                }

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
     *         &lt;element name="PasswordHint" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Hint">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Question"/>
     *                       &lt;enumeration value="Answer"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Username" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
     *       &lt;attribute name="Password" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passwordHint"
    })
    public static class SecurityInfo {

        @XmlElement(name = "PasswordHint")
        protected List<LoyaltyAccountInfoType.SecurityInfo.PasswordHint> passwordHint;
        @XmlAttribute(name = "Username")
        protected String username;
        @XmlAttribute(name = "Password")
        protected String password;

        /**
         * Gets the value of the passwordHint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passwordHint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPasswordHint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LoyaltyAccountInfoType.SecurityInfo.PasswordHint }
         * 
         * 
         */
        public List<LoyaltyAccountInfoType.SecurityInfo.PasswordHint> getPasswordHint() {
            if (passwordHint == null) {
                passwordHint = new ArrayList<LoyaltyAccountInfoType.SecurityInfo.PasswordHint>();
            }
            return this.passwordHint;
        }

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Hint">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Question"/>
         *             &lt;enumeration value="Answer"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
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
        public static class PasswordHint {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Hint")
            protected String hint;

            /**
             * Gets the value of the value property.
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
             * Gets the value of the hint property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHint() {
                return hint;
            }

            /**
             * Sets the value of the hint property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHint(String value) {
                this.hint = value;
            }

        }

    }

}
