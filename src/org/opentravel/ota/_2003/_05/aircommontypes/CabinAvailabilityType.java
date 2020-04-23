
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
import org.opentravel.ota._2003._05.simpletypes.CabinType;


/**
 * Construct for holding cabin class information, such as seat availability or meal codes. Can be up to three of these per flight segment or air leg - First, Business and Economy.
 * 
 * <p>Java class for CabinAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Meal" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MealCode" use="required" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}MealServiceType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BaggageAllowance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Entertainment" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightLoadInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AuthorizedSeatQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="NRSA_ModifySeatMapPaxQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="RevenuePaxQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CabinType" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}CabinType" />
 *       &lt;attribute name="CabinCapacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinAvailabilityType", propOrder = {
    "meal",
    "baggageAllowance",
    "entertainment",
    "flightLoadInfo"
})
@XmlSeeAlso({
    MarketingCabinType.class
})
public class CabinAvailabilityType {

    @XmlElement(name = "Meal")
    protected List<CabinAvailabilityType.Meal> meal;
    @XmlElement(name = "BaggageAllowance")
    protected CabinAvailabilityType.BaggageAllowance baggageAllowance;
    @XmlElement(name = "Entertainment")
    protected List<CabinAvailabilityType.Entertainment> entertainment;
    @XmlElement(name = "FlightLoadInfo")
    protected CabinAvailabilityType.FlightLoadInfo flightLoadInfo;
    @XmlAttribute(name = "CabinType", required = true)
    protected CabinType cabinType;
    @XmlAttribute(name = "CabinCapacity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cabinCapacity;

    /**
     * Gets the value of the meal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinAvailabilityType.Meal }
     * 
     * 
     */
    public List<CabinAvailabilityType.Meal> getMeal() {
        if (meal == null) {
            meal = new ArrayList<CabinAvailabilityType.Meal>();
        }
        return this.meal;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link CabinAvailabilityType.BaggageAllowance }
     *     
     */
    public CabinAvailabilityType.BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinAvailabilityType.BaggageAllowance }
     *     
     */
    public void setBaggageAllowance(CabinAvailabilityType.BaggageAllowance value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the entertainment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entertainment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntertainment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinAvailabilityType.Entertainment }
     * 
     * 
     */
    public List<CabinAvailabilityType.Entertainment> getEntertainment() {
        if (entertainment == null) {
            entertainment = new ArrayList<CabinAvailabilityType.Entertainment>();
        }
        return this.entertainment;
    }

    /**
     * Gets the value of the flightLoadInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CabinAvailabilityType.FlightLoadInfo }
     *     
     */
    public CabinAvailabilityType.FlightLoadInfo getFlightLoadInfo() {
        return flightLoadInfo;
    }

    /**
     * Sets the value of the flightLoadInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinAvailabilityType.FlightLoadInfo }
     *     
     */
    public void setFlightLoadInfo(CabinAvailabilityType.FlightLoadInfo value) {
        this.flightLoadInfo = value;
    }

    /**
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the cabinCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinCapacity() {
        return cabinCapacity;
    }

    /**
     * Sets the value of the cabinCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinCapacity(BigInteger value) {
        this.cabinCapacity = value;
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
    public static class BaggageAllowance {

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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Entertainment {

        @XmlAttribute(name = "Code")
        protected String code;

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="AuthorizedSeatQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="NRSA_ModifySeatMapPaxQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="RevenuePaxQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightLoadInfo {

        @XmlAttribute(name = "AuthorizedSeatQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger authorizedSeatQty;
        @XmlAttribute(name = "NRSA_ModifySeatMapPaxQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger nrsaModifySeatMapPaxQty;
        @XmlAttribute(name = "RevenuePaxQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger revenuePaxQty;

        /**
         * Gets the value of the authorizedSeatQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAuthorizedSeatQty() {
            return authorizedSeatQty;
        }

        /**
         * Sets the value of the authorizedSeatQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAuthorizedSeatQty(BigInteger value) {
            this.authorizedSeatQty = value;
        }

        /**
         * Gets the value of the nrsaModifySeatMapPaxQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNRSAModifySeatMapPaxQty() {
            return nrsaModifySeatMapPaxQty;
        }

        /**
         * Sets the value of the nrsaModifySeatMapPaxQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNRSAModifySeatMapPaxQty(BigInteger value) {
            this.nrsaModifySeatMapPaxQty = value;
        }

        /**
         * Gets the value of the revenuePaxQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRevenuePaxQty() {
            return revenuePaxQty;
        }

        /**
         * Sets the value of the revenuePaxQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRevenuePaxQty(BigInteger value) {
            this.revenuePaxQty = value;
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
     *       &lt;attribute name="MealCode" use="required" type="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}MealServiceType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Meal {

        @XmlAttribute(name = "MealCode", required = true)
        protected String mealCode;

        /**
         * Gets the value of the mealCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMealCode() {
            return mealCode;
        }

        /**
         * Sets the value of the mealCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMealCode(String value) {
            this.mealCode = value;
        }

    }

}
