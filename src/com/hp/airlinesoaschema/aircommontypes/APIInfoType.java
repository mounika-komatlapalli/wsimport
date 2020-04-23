
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.opentravel.ota._2003._05.commontypes.AddressType;
import org.opentravel.ota._2003._05.commontypes.DocumentType;
import org.opentravel.ota._2003._05.simpletypes.ActionType;


/**
 * <p>Java class for API_InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_InfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/CommonTypes}DocumentType">
 *       &lt;sequence>
 *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/CommonTypes}AddressType">
 *                 &lt;sequence>
 *                   &lt;element name="ICAOCountryName" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/SimpleTypes>StringLength0to64">
 *                           &lt;attribute name="Code" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_ICAOCountry" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="API_InfoSource" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
 *       &lt;attribute name="InfantInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BirthStateProv" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StateProvCodeType" />
 *       &lt;attribute name="BirthLocation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to64" />
 *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ActionType" />
 *       &lt;attribute name="CountryOfResidence" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ISO3166" />
 *       &lt;attribute name="ICAOCountryOfResidence" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_ICAOCountry" />
 *       &lt;attribute name="ICAODocIssueCountry" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_ICAOCountry" />
 *       &lt;attribute name="ICAODocHolderNationality" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_ICAOCountry" />
 *       &lt;attribute name="VerifiedID_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TrustedDataInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_InfoType", propOrder = {
    "address"
})
public class APIInfoType
    extends DocumentType
{

    @XmlElement(name = "Address")
    protected List<APIInfoType.Address> address;
    @XmlAttribute(name = "API_InfoSource")
    protected String apiInfoSource;
    @XmlAttribute(name = "InfantInd")
    protected Boolean infantInd;
    @XmlAttribute(name = "BirthStateProv")
    protected String birthStateProv;
    @XmlAttribute(name = "BirthLocation")
    protected String birthLocation;
    @XmlAttribute(name = "Operation")
    protected ActionType operation;
    @XmlAttribute(name = "CountryOfResidence")
    protected String countryOfResidence;
    @XmlAttribute(name = "ICAOCountryOfResidence")
    protected String icaoCountryOfResidence;
    @XmlAttribute(name = "ICAODocIssueCountry")
    protected String icaoDocIssueCountry;
    @XmlAttribute(name = "ICAODocHolderNationality")
    protected String icaoDocHolderNationality;
    @XmlAttribute(name = "VerifiedID_Ind")
    protected Boolean verifiedIDInd;
    @XmlAttribute(name = "TrustedDataInd")
    protected Boolean trustedDataInd;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIInfoType.Address }
     * 
     * 
     */
    public List<APIInfoType.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<APIInfoType.Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the apiInfoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIInfoSource() {
        return apiInfoSource;
    }

    /**
     * Sets the value of the apiInfoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIInfoSource(String value) {
        this.apiInfoSource = value;
    }

    /**
     * Gets the value of the infantInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfantInd() {
        return infantInd;
    }

    /**
     * Sets the value of the infantInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfantInd(Boolean value) {
        this.infantInd = value;
    }

    /**
     * Gets the value of the birthStateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthStateProv() {
        return birthStateProv;
    }

    /**
     * Sets the value of the birthStateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthStateProv(String value) {
        this.birthStateProv = value;
    }

    /**
     * Gets the value of the birthLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthLocation() {
        return birthLocation;
    }

    /**
     * Sets the value of the birthLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthLocation(String value) {
        this.birthLocation = value;
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
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the icaoCountryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICAOCountryOfResidence() {
        return icaoCountryOfResidence;
    }

    /**
     * Sets the value of the icaoCountryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICAOCountryOfResidence(String value) {
        this.icaoCountryOfResidence = value;
    }

    /**
     * Gets the value of the icaoDocIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICAODocIssueCountry() {
        return icaoDocIssueCountry;
    }

    /**
     * Sets the value of the icaoDocIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICAODocIssueCountry(String value) {
        this.icaoDocIssueCountry = value;
    }

    /**
     * Gets the value of the icaoDocHolderNationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICAODocHolderNationality() {
        return icaoDocHolderNationality;
    }

    /**
     * Sets the value of the icaoDocHolderNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICAODocHolderNationality(String value) {
        this.icaoDocHolderNationality = value;
    }

    /**
     * Gets the value of the verifiedIDInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifiedIDInd() {
        return verifiedIDInd;
    }

    /**
     * Sets the value of the verifiedIDInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifiedIDInd(Boolean value) {
        this.verifiedIDInd = value;
    }

    /**
     * Gets the value of the trustedDataInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrustedDataInd() {
        return trustedDataInd;
    }

    /**
     * Sets the value of the trustedDataInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrustedDataInd(Boolean value) {
        this.trustedDataInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/CommonTypes}AddressType">
     *       &lt;sequence>
     *         &lt;element name="ICAOCountryName" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/SimpleTypes>StringLength0to64">
     *                 &lt;attribute name="Code" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_ICAOCountry" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "icaoCountryName"
    })
    public static class Address
        extends AddressType
    {

        @XmlElement(name = "ICAOCountryName")
        protected APIInfoType.Address.ICAOCountryName icaoCountryName;

        /**
         * Gets the value of the icaoCountryName property.
         * 
         * @return
         *     possible object is
         *     {@link APIInfoType.Address.ICAOCountryName }
         *     
         */
        public APIInfoType.Address.ICAOCountryName getICAOCountryName() {
            return icaoCountryName;
        }

        /**
         * Sets the value of the icaoCountryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link APIInfoType.Address.ICAOCountryName }
         *     
         */
        public void setICAOCountryName(APIInfoType.Address.ICAOCountryName value) {
            this.icaoCountryName = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/SimpleTypes>StringLength0to64">
         *       &lt;attribute name="Code" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_ICAOCountry" />
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
        public static class ICAOCountryName {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Code")
            protected String code;

            /**
             * Used for Character Strings, length 0 to 64.
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
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

        }

    }

}
