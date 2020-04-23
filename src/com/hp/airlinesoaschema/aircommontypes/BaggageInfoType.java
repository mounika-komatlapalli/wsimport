
package com.hp.airlinesoaschema.aircommontypes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BaggageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckedBaggageDetails" maxOccurs="999" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CheckedBagWeight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BagTagDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="IssuerCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{3}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="SerialNumber">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{6}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="BagTagCount" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric0to999" />
 *                           &lt;attribute name="IssuanceMethod">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="Agent"/>
 *                                 &lt;enumeration value="Skycap"/>
 *                                 &lt;enumeration value="SelfService"/>
 *                                 &lt;enumeration value="Vendor"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="CarrierCode">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[A-Za-z0-9]{2,3}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="SpecialType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
 *                           &lt;attribute name="ConjunctionBagTagInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="BaggagePoolIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="UpgradeBaggageCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" />
 *                 &lt;attribute name="HeavyBagIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ShortCheckLocationCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *                 &lt;attribute name="ShortCheckCodeContext" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" default="IATA" />
 *                 &lt;attribute name="BagModifySeatMapIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PriorityHandlingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="BagSecurityStatus">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[A-Za-z0-9]{4}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ExcessBagIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckedBagWeightTotal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HandBagWeightTotal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PassengerRPH" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="CheckedBagCountTotal" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric0to999" />
 *       &lt;attribute name="HandBagCountTotal" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric0to999" />
 *       &lt;attribute name="HeadOfBaggagePoolInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageInfoType", propOrder = {
    "checkedBaggageDetails",
    "checkedBagWeightTotal",
    "handBagWeightTotal"
})
public class BaggageInfoType {

    @XmlElement(name = "CheckedBaggageDetails")
    protected List<BaggageInfoType.CheckedBaggageDetails> checkedBaggageDetails;
    @XmlElement(name = "CheckedBagWeightTotal")
    protected BaggageInfoType.CheckedBagWeightTotal checkedBagWeightTotal;
    @XmlElement(name = "HandBagWeightTotal")
    protected BaggageInfoType.HandBagWeightTotal handBagWeightTotal;
    @XmlAttribute(name = "PassengerRPH", required = true)
    protected String passengerRPH;
    @XmlAttribute(name = "CheckedBagCountTotal")
    protected Integer checkedBagCountTotal;
    @XmlAttribute(name = "HandBagCountTotal")
    protected Integer handBagCountTotal;
    @XmlAttribute(name = "HeadOfBaggagePoolInd")
    protected Boolean headOfBaggagePoolInd;

    /**
     * Gets the value of the checkedBaggageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedBaggageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBaggageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageInfoType.CheckedBaggageDetails }
     * 
     * 
     */
    public List<BaggageInfoType.CheckedBaggageDetails> getCheckedBaggageDetails() {
        if (checkedBaggageDetails == null) {
            checkedBaggageDetails = new ArrayList<BaggageInfoType.CheckedBaggageDetails>();
        }
        return this.checkedBaggageDetails;
    }

    /**
     * Gets the value of the checkedBagWeightTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageInfoType.CheckedBagWeightTotal }
     *     
     */
    public BaggageInfoType.CheckedBagWeightTotal getCheckedBagWeightTotal() {
        return checkedBagWeightTotal;
    }

    /**
     * Sets the value of the checkedBagWeightTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageInfoType.CheckedBagWeightTotal }
     *     
     */
    public void setCheckedBagWeightTotal(BaggageInfoType.CheckedBagWeightTotal value) {
        this.checkedBagWeightTotal = value;
    }

    /**
     * Gets the value of the handBagWeightTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageInfoType.HandBagWeightTotal }
     *     
     */
    public BaggageInfoType.HandBagWeightTotal getHandBagWeightTotal() {
        return handBagWeightTotal;
    }

    /**
     * Sets the value of the handBagWeightTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageInfoType.HandBagWeightTotal }
     *     
     */
    public void setHandBagWeightTotal(BaggageInfoType.HandBagWeightTotal value) {
        this.handBagWeightTotal = value;
    }

    /**
     * Gets the value of the passengerRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerRPH() {
        return passengerRPH;
    }

    /**
     * Sets the value of the passengerRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerRPH(String value) {
        this.passengerRPH = value;
    }

    /**
     * Gets the value of the checkedBagCountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckedBagCountTotal() {
        return checkedBagCountTotal;
    }

    /**
     * Sets the value of the checkedBagCountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckedBagCountTotal(Integer value) {
        this.checkedBagCountTotal = value;
    }

    /**
     * Gets the value of the handBagCountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandBagCountTotal() {
        return handBagCountTotal;
    }

    /**
     * Sets the value of the handBagCountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandBagCountTotal(Integer value) {
        this.handBagCountTotal = value;
    }

    /**
     * Gets the value of the headOfBaggagePoolInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadOfBaggagePoolInd() {
        return headOfBaggagePoolInd;
    }

    /**
     * Sets the value of the headOfBaggagePoolInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadOfBaggagePoolInd(Boolean value) {
        this.headOfBaggagePoolInd = value;
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CheckedBagWeightTotal {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

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
     *       &lt;sequence>
     *         &lt;element name="CheckedBagWeight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BagTagDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="IssuerCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{3}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="SerialNumber">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{6}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="BagTagCount" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric0to999" />
     *                 &lt;attribute name="IssuanceMethod">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="Agent"/>
     *                       &lt;enumeration value="Skycap"/>
     *                       &lt;enumeration value="SelfService"/>
     *                       &lt;enumeration value="Vendor"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="CarrierCode">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[A-Za-z0-9]{2,3}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="SpecialType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
     *                 &lt;attribute name="ConjunctionBagTagInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="BaggagePoolIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="UpgradeBaggageCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}UpperCaseAlphaLength1to2" />
     *       &lt;attribute name="HeavyBagIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ShortCheckLocationCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
     *       &lt;attribute name="ShortCheckCodeContext" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to32" default="IATA" />
     *       &lt;attribute name="BagModifySeatMapIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PriorityHandlingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="BagSecurityStatus">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[A-Za-z0-9]{4}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ExcessBagIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "checkedBagWeight",
        "bagTagDetails"
    })
    public static class CheckedBaggageDetails {

        @XmlElement(name = "CheckedBagWeight")
        protected BaggageInfoType.CheckedBaggageDetails.CheckedBagWeight checkedBagWeight;
        @XmlElement(name = "BagTagDetails")
        protected BaggageInfoType.CheckedBaggageDetails.BagTagDetails bagTagDetails;
        @XmlAttribute(name = "BaggagePoolIndicator")
        protected Boolean baggagePoolIndicator;
        @XmlAttribute(name = "UpgradeBaggageCode")
        protected String upgradeBaggageCode;
        @XmlAttribute(name = "HeavyBagIndicator")
        protected Boolean heavyBagIndicator;
        @XmlAttribute(name = "ShortCheckLocationCode")
        protected String shortCheckLocationCode;
        @XmlAttribute(name = "ShortCheckCodeContext")
        protected String shortCheckCodeContext;
        @XmlAttribute(name = "BagModifySeatMapIndicator")
        protected Boolean bagModifySeatMapIndicator;
        @XmlAttribute(name = "PriorityHandlingIndicator")
        protected Boolean priorityHandlingIndicator;
        @XmlAttribute(name = "BagSecurityStatus")
        protected String bagSecurityStatus;
        @XmlAttribute(name = "ExcessBagIndicator")
        protected Boolean excessBagIndicator;

        /**
         * Gets the value of the checkedBagWeight property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageInfoType.CheckedBaggageDetails.CheckedBagWeight }
         *     
         */
        public BaggageInfoType.CheckedBaggageDetails.CheckedBagWeight getCheckedBagWeight() {
            return checkedBagWeight;
        }

        /**
         * Sets the value of the checkedBagWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageInfoType.CheckedBaggageDetails.CheckedBagWeight }
         *     
         */
        public void setCheckedBagWeight(BaggageInfoType.CheckedBaggageDetails.CheckedBagWeight value) {
            this.checkedBagWeight = value;
        }

        /**
         * Gets the value of the bagTagDetails property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageInfoType.CheckedBaggageDetails.BagTagDetails }
         *     
         */
        public BaggageInfoType.CheckedBaggageDetails.BagTagDetails getBagTagDetails() {
            return bagTagDetails;
        }

        /**
         * Sets the value of the bagTagDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageInfoType.CheckedBaggageDetails.BagTagDetails }
         *     
         */
        public void setBagTagDetails(BaggageInfoType.CheckedBaggageDetails.BagTagDetails value) {
            this.bagTagDetails = value;
        }

        /**
         * Gets the value of the baggagePoolIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBaggagePoolIndicator() {
            return baggagePoolIndicator;
        }

        /**
         * Sets the value of the baggagePoolIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBaggagePoolIndicator(Boolean value) {
            this.baggagePoolIndicator = value;
        }

        /**
         * Gets the value of the upgradeBaggageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpgradeBaggageCode() {
            return upgradeBaggageCode;
        }

        /**
         * Sets the value of the upgradeBaggageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpgradeBaggageCode(String value) {
            this.upgradeBaggageCode = value;
        }

        /**
         * Gets the value of the heavyBagIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHeavyBagIndicator() {
            return heavyBagIndicator;
        }

        /**
         * Sets the value of the heavyBagIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHeavyBagIndicator(Boolean value) {
            this.heavyBagIndicator = value;
        }

        /**
         * Gets the value of the shortCheckLocationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortCheckLocationCode() {
            return shortCheckLocationCode;
        }

        /**
         * Sets the value of the shortCheckLocationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortCheckLocationCode(String value) {
            this.shortCheckLocationCode = value;
        }

        /**
         * Gets the value of the shortCheckCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortCheckCodeContext() {
            if (shortCheckCodeContext == null) {
                return "IATA";
            } else {
                return shortCheckCodeContext;
            }
        }

        /**
         * Sets the value of the shortCheckCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortCheckCodeContext(String value) {
            this.shortCheckCodeContext = value;
        }

        /**
         * Gets the value of the bagModifySeatMapIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBagModifySeatMapIndicator() {
            return bagModifySeatMapIndicator;
        }

        /**
         * Sets the value of the bagModifySeatMapIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBagModifySeatMapIndicator(Boolean value) {
            this.bagModifySeatMapIndicator = value;
        }

        /**
         * Gets the value of the priorityHandlingIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPriorityHandlingIndicator() {
            return priorityHandlingIndicator;
        }

        /**
         * Sets the value of the priorityHandlingIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPriorityHandlingIndicator(Boolean value) {
            this.priorityHandlingIndicator = value;
        }

        /**
         * Gets the value of the bagSecurityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBagSecurityStatus() {
            return bagSecurityStatus;
        }

        /**
         * Sets the value of the bagSecurityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBagSecurityStatus(String value) {
            this.bagSecurityStatus = value;
        }

        /**
         * Gets the value of the excessBagIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExcessBagIndicator() {
            return excessBagIndicator;
        }

        /**
         * Sets the value of the excessBagIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExcessBagIndicator(Boolean value) {
            this.excessBagIndicator = value;
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
         *       &lt;attribute name="Type">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="IssuerCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{3}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="SerialNumber">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{6}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="BagTagCount" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric0to999" />
         *       &lt;attribute name="IssuanceMethod">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="Agent"/>
         *             &lt;enumeration value="Skycap"/>
         *             &lt;enumeration value="SelfService"/>
         *             &lt;enumeration value="Vendor"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="CarrierCode">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[A-Za-z0-9]{2,3}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="SpecialType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
         *       &lt;attribute name="ConjunctionBagTagInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BagTagDetails {

            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "IssuerCode")
            protected String issuerCode;
            @XmlAttribute(name = "SerialNumber")
            protected String serialNumber;
            @XmlAttribute(name = "BagTagCount")
            protected Integer bagTagCount;
            @XmlAttribute(name = "IssuanceMethod")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String issuanceMethod;
            @XmlAttribute(name = "CarrierCode")
            protected String carrierCode;
            @XmlAttribute(name = "SpecialType")
            protected String specialType;
            @XmlAttribute(name = "ConjunctionBagTagInd")
            protected Boolean conjunctionBagTagInd;

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
             * Gets the value of the issuerCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssuerCode() {
                return issuerCode;
            }

            /**
             * Sets the value of the issuerCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuerCode(String value) {
                this.issuerCode = value;
            }

            /**
             * Gets the value of the serialNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerialNumber() {
                return serialNumber;
            }

            /**
             * Sets the value of the serialNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerialNumber(String value) {
                this.serialNumber = value;
            }

            /**
             * Gets the value of the bagTagCount property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBagTagCount() {
                return bagTagCount;
            }

            /**
             * Sets the value of the bagTagCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBagTagCount(Integer value) {
                this.bagTagCount = value;
            }

            /**
             * Gets the value of the issuanceMethod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssuanceMethod() {
                return issuanceMethod;
            }

            /**
             * Sets the value of the issuanceMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuanceMethod(String value) {
                this.issuanceMethod = value;
            }

            /**
             * Gets the value of the carrierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCarrierCode() {
                return carrierCode;
            }

            /**
             * Sets the value of the carrierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCarrierCode(String value) {
                this.carrierCode = value;
            }

            /**
             * Gets the value of the specialType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecialType() {
                return specialType;
            }

            /**
             * Sets the value of the specialType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecialType(String value) {
                this.specialType = value;
            }

            /**
             * Gets the value of the conjunctionBagTagInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isConjunctionBagTagInd() {
                return conjunctionBagTagInd;
            }

            /**
             * Sets the value of the conjunctionBagTagInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setConjunctionBagTagInd(Boolean value) {
                this.conjunctionBagTagInd = value;
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CheckedBagWeight {

            @XmlAttribute(name = "UnitOfMeasureQuantity")
            protected BigDecimal unitOfMeasureQuantity;
            @XmlAttribute(name = "UnitOfMeasure")
            protected String unitOfMeasure;
            @XmlAttribute(name = "UnitOfMeasureCode")
            protected String unitOfMeasureCode;

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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HandBagWeightTotal {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

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

}
