
package com.hp.airlinesoaschema.aircommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerProcessingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerProcessingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DeniedBoardingVolunteerInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ModifySeatMapInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ModifySeatMapForUpgradeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NoShowInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MisconnectInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NoMealInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HighYieldInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CrewInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DiplomatOrLEO_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ArmedPassengerInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EticketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CabinBagInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="UnaccompaniedMinorInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DisabledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IncapacitatedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PrisonerGuardInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OxygenInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NoRecInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GoShowInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerProcessingInfoType")
public class PassengerProcessingInfoType {

    @XmlAttribute(name = "DeniedBoardingVolunteerInd")
    protected Boolean deniedBoardingVolunteerInd;
    @XmlAttribute(name = "ModifySeatMapInd")
    protected Boolean modifySeatMapInd;
    @XmlAttribute(name = "ModifySeatMapForUpgradeInd")
    protected Boolean modifySeatMapForUpgradeInd;
    @XmlAttribute(name = "NoShowInd")
    protected Boolean noShowInd;
    @XmlAttribute(name = "MisconnectInd")
    protected Boolean misconnectInd;
    @XmlAttribute(name = "NoMealInd")
    protected Boolean noMealInd;
    @XmlAttribute(name = "HighYieldInd")
    protected Boolean highYieldInd;
    @XmlAttribute(name = "CrewInd")
    protected Boolean crewInd;
    @XmlAttribute(name = "DiplomatOrLEO_Ind")
    protected Boolean diplomatOrLEOInd;
    @XmlAttribute(name = "ArmedPassengerInd")
    protected Boolean armedPassengerInd;
    @XmlAttribute(name = "EticketInd")
    protected Boolean eticketInd;
    @XmlAttribute(name = "CabinBagInd")
    protected Boolean cabinBagInd;
    @XmlAttribute(name = "UnaccompaniedMinorInd")
    protected Boolean unaccompaniedMinorInd;
    @XmlAttribute(name = "DisabledInd")
    protected Boolean disabledInd;
    @XmlAttribute(name = "IncapacitatedInd")
    protected Boolean incapacitatedInd;
    @XmlAttribute(name = "PrisonerGuardInd")
    protected Boolean prisonerGuardInd;
    @XmlAttribute(name = "OxygenInd")
    protected Boolean oxygenInd;
    @XmlAttribute(name = "NoRecInd")
    protected Boolean noRecInd;
    @XmlAttribute(name = "GoShowInd")
    protected Boolean goShowInd;

    /**
     * Gets the value of the deniedBoardingVolunteerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeniedBoardingVolunteerInd() {
        return deniedBoardingVolunteerInd;
    }

    /**
     * Sets the value of the deniedBoardingVolunteerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeniedBoardingVolunteerInd(Boolean value) {
        this.deniedBoardingVolunteerInd = value;
    }

    /**
     * Gets the value of the modifySeatMapInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifySeatMapInd() {
        return modifySeatMapInd;
    }

    /**
     * Sets the value of the modifySeatMapInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifySeatMapInd(Boolean value) {
        this.modifySeatMapInd = value;
    }

    /**
     * Gets the value of the modifySeatMapForUpgradeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifySeatMapForUpgradeInd() {
        return modifySeatMapForUpgradeInd;
    }

    /**
     * Sets the value of the modifySeatMapForUpgradeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifySeatMapForUpgradeInd(Boolean value) {
        this.modifySeatMapForUpgradeInd = value;
    }

    /**
     * Gets the value of the noShowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShowInd() {
        return noShowInd;
    }

    /**
     * Sets the value of the noShowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoShowInd(Boolean value) {
        this.noShowInd = value;
    }

    /**
     * Gets the value of the misconnectInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMisconnectInd() {
        return misconnectInd;
    }

    /**
     * Sets the value of the misconnectInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMisconnectInd(Boolean value) {
        this.misconnectInd = value;
    }

    /**
     * Gets the value of the noMealInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoMealInd() {
        return noMealInd;
    }

    /**
     * Sets the value of the noMealInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoMealInd(Boolean value) {
        this.noMealInd = value;
    }

    /**
     * Gets the value of the highYieldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighYieldInd() {
        return highYieldInd;
    }

    /**
     * Sets the value of the highYieldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighYieldInd(Boolean value) {
        this.highYieldInd = value;
    }

    /**
     * Gets the value of the crewInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrewInd() {
        return crewInd;
    }

    /**
     * Sets the value of the crewInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrewInd(Boolean value) {
        this.crewInd = value;
    }

    /**
     * Gets the value of the diplomatOrLEOInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiplomatOrLEOInd() {
        return diplomatOrLEOInd;
    }

    /**
     * Sets the value of the diplomatOrLEOInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiplomatOrLEOInd(Boolean value) {
        this.diplomatOrLEOInd = value;
    }

    /**
     * Gets the value of the armedPassengerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArmedPassengerInd() {
        return armedPassengerInd;
    }

    /**
     * Sets the value of the armedPassengerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArmedPassengerInd(Boolean value) {
        this.armedPassengerInd = value;
    }

    /**
     * Gets the value of the eticketInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEticketInd() {
        return eticketInd;
    }

    /**
     * Sets the value of the eticketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEticketInd(Boolean value) {
        this.eticketInd = value;
    }

    /**
     * Gets the value of the cabinBagInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCabinBagInd() {
        return cabinBagInd;
    }

    /**
     * Sets the value of the cabinBagInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCabinBagInd(Boolean value) {
        this.cabinBagInd = value;
    }

    /**
     * Gets the value of the unaccompaniedMinorInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnaccompaniedMinorInd() {
        return unaccompaniedMinorInd;
    }

    /**
     * Sets the value of the unaccompaniedMinorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnaccompaniedMinorInd(Boolean value) {
        this.unaccompaniedMinorInd = value;
    }

    /**
     * Gets the value of the disabledInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledInd() {
        return disabledInd;
    }

    /**
     * Sets the value of the disabledInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledInd(Boolean value) {
        this.disabledInd = value;
    }

    /**
     * Gets the value of the incapacitatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncapacitatedInd() {
        return incapacitatedInd;
    }

    /**
     * Sets the value of the incapacitatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncapacitatedInd(Boolean value) {
        this.incapacitatedInd = value;
    }

    /**
     * Gets the value of the prisonerGuardInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrisonerGuardInd() {
        return prisonerGuardInd;
    }

    /**
     * Sets the value of the prisonerGuardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrisonerGuardInd(Boolean value) {
        this.prisonerGuardInd = value;
    }

    /**
     * Gets the value of the oxygenInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOxygenInd() {
        return oxygenInd;
    }

    /**
     * Sets the value of the oxygenInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOxygenInd(Boolean value) {
        this.oxygenInd = value;
    }

    /**
     * Gets the value of the noRecInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRecInd() {
        return noRecInd;
    }

    /**
     * Sets the value of the noRecInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoRecInd(Boolean value) {
        this.noRecInd = value;
    }

    /**
     * Gets the value of the goShowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoShowInd() {
        return goShowInd;
    }

    /**
     * Sets the value of the goShowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoShowInd(Boolean value) {
        this.goShowInd = value;
    }

}
