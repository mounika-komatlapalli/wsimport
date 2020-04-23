
package com.hp.airlinesoaschema.aircommontypes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.opentravel.ota._2003._05.aircommontypes.PassengerTypeQuantityType;
import org.opentravel.ota._2003._05.commontypes.PersonNameType;
import org.opentravel.ota._2003._05.simpletypes.GenderType;


/**
 * <p>Java class for PassengerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerName" type="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PersonNameType" minOccurs="0"/>
 *         &lt;element name="PassengerWeight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerType" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}PassengerTypeQuantityType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}GenderGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="GivenNameRefNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to99" />
 *       &lt;attribute name="SurnameRefNumber" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to99" />
 *       &lt;attribute name="JumpSeatAuthority" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="SecurityCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *       &lt;attribute name="GroupReference" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to8" />
 *       &lt;attribute name="AddToModifySeatMapDateTime" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}DateOrDateTimeType" />
 *       &lt;attribute name="InfantIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EmployeeSeniorityDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="EmployeeLengthOfService" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInfoType", propOrder = {
    "passengerName",
    "passengerWeight",
    "passengerType"
})
public class PassengerInfoType {

    @XmlElement(name = "PassengerName")
    protected PersonNameType passengerName;
    @XmlElement(name = "PassengerWeight")
    protected PassengerInfoType.PassengerWeight passengerWeight;
    @XmlElement(name = "PassengerType")
    protected List<PassengerInfoType.PassengerType> passengerType;
    @XmlAttribute(name = "RPH", required = true)
    protected String rph;
    @XmlAttribute(name = "PassengerRPH")
    protected String passengerRPH;
    @XmlAttribute(name = "GivenNameRefNumber")
    protected Integer givenNameRefNumber;
    @XmlAttribute(name = "SurnameRefNumber")
    protected Integer surnameRefNumber;
    @XmlAttribute(name = "JumpSeatAuthority")
    protected String jumpSeatAuthority;
    @XmlAttribute(name = "SecurityCode")
    protected String securityCode;
    @XmlAttribute(name = "GroupReference")
    protected String groupReference;
    @XmlAttribute(name = "AddToModifySeatMapDateTime")
    protected String addToModifySeatMapDateTime;
    @XmlAttribute(name = "InfantIndicator")
    protected Boolean infantIndicator;
    @XmlAttribute(name = "EmployeeSeniorityDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar employeeSeniorityDate;
    @XmlAttribute(name = "EmployeeLengthOfService")
    protected Duration employeeLengthOfService;

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPassengerName(PersonNameType value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the passengerWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfoType.PassengerWeight }
     *     
     */
    public PassengerInfoType.PassengerWeight getPassengerWeight() {
        return passengerWeight;
    }

    /**
     * Sets the value of the passengerWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfoType.PassengerWeight }
     *     
     */
    public void setPassengerWeight(PassengerInfoType.PassengerWeight value) {
        this.passengerWeight = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInfoType.PassengerType }
     * 
     * 
     */
    public List<PassengerInfoType.PassengerType> getPassengerType() {
        if (passengerType == null) {
            passengerType = new ArrayList<PassengerInfoType.PassengerType>();
        }
        return this.passengerType;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
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
     * Gets the value of the givenNameRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGivenNameRefNumber() {
        return givenNameRefNumber;
    }

    /**
     * Sets the value of the givenNameRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGivenNameRefNumber(Integer value) {
        this.givenNameRefNumber = value;
    }

    /**
     * Gets the value of the surnameRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSurnameRefNumber() {
        return surnameRefNumber;
    }

    /**
     * Sets the value of the surnameRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSurnameRefNumber(Integer value) {
        this.surnameRefNumber = value;
    }

    /**
     * Gets the value of the jumpSeatAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJumpSeatAuthority() {
        return jumpSeatAuthority;
    }

    /**
     * Sets the value of the jumpSeatAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJumpSeatAuthority(String value) {
        this.jumpSeatAuthority = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the groupReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupReference() {
        return groupReference;
    }

    /**
     * Sets the value of the groupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupReference(String value) {
        this.groupReference = value;
    }

    /**
     * Gets the value of the addToModifySeatMapDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddToModifySeatMapDateTime() {
        return addToModifySeatMapDateTime;
    }

    /**
     * Sets the value of the addToModifySeatMapDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddToModifySeatMapDateTime(String value) {
        this.addToModifySeatMapDateTime = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfantIndicator(Boolean value) {
        this.infantIndicator = value;
    }

    /**
     * Gets the value of the employeeSeniorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmployeeSeniorityDate() {
        return employeeSeniorityDate;
    }

    /**
     * Sets the value of the employeeSeniorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmployeeSeniorityDate(XMLGregorianCalendar value) {
        this.employeeSeniorityDate = value;
    }

    /**
     * Gets the value of the employeeLengthOfService property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEmployeeLengthOfService() {
        return employeeLengthOfService;
    }

    /**
     * Sets the value of the employeeLengthOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEmployeeLengthOfService(Duration value) {
        this.employeeLengthOfService = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/AirCommonTypes}PassengerTypeQuantityType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}GenderGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerType
        extends PassengerTypeQuantityType
    {

        @XmlAttribute(name = "Gender")
        protected GenderType gender;

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link GenderType }
         *     
         */
        public GenderType getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenderType }
         *     
         */
        public void setGender(GenderType value) {
            this.gender = value;
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
    public static class PassengerWeight {

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
