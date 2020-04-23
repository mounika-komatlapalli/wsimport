
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_RequiredDocumentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_RequiredDocumentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Override" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="OverrideType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to32" />
 *                 &lt;attribute name="DocHolderNationalityList" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfISO3166" />
 *                 &lt;attribute name="ICAODocHolderNationalityList" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_ListOfICAOCountry" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequiredDocument" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="DocType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
 *                 &lt;attribute name="RequiredItemCodeList" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfOTA_CodeType" />
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
@XmlType(name = "API_RequiredDocumentInfoType", propOrder = {
    "override",
    "requiredDocument"
})
public class APIRequiredDocumentInfoType {

    @XmlElement(name = "Override")
    protected List<APIRequiredDocumentInfoType.Override> override;
    @XmlElement(name = "RequiredDocument", required = true)
    protected List<APIRequiredDocumentInfoType.RequiredDocument> requiredDocument;

    /**
     * Gets the value of the override property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the override property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIRequiredDocumentInfoType.Override }
     * 
     * 
     */
    public List<APIRequiredDocumentInfoType.Override> getOverride() {
        if (override == null) {
            override = new ArrayList<APIRequiredDocumentInfoType.Override>();
        }
        return this.override;
    }

    /**
     * Gets the value of the requiredDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIRequiredDocumentInfoType.RequiredDocument }
     * 
     * 
     */
    public List<APIRequiredDocumentInfoType.RequiredDocument> getRequiredDocument() {
        if (requiredDocument == null) {
            requiredDocument = new ArrayList<APIRequiredDocumentInfoType.RequiredDocument>();
        }
        return this.requiredDocument;
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
     *       &lt;attribute name="OverrideType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength0to32" />
     *       &lt;attribute name="DocHolderNationalityList" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfISO3166" />
     *       &lt;attribute name="ICAODocHolderNationalityList" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_ListOfICAOCountry" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Override {

        @XmlAttribute(name = "OverrideType")
        protected String overrideType;
        @XmlAttribute(name = "DocHolderNationalityList")
        protected List<String> docHolderNationalityList;
        @XmlAttribute(name = "ICAODocHolderNationalityList")
        protected List<String> icaoDocHolderNationalityList;

        /**
         * Gets the value of the overrideType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverrideType() {
            return overrideType;
        }

        /**
         * Sets the value of the overrideType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverrideType(String value) {
            this.overrideType = value;
        }

        /**
         * Gets the value of the docHolderNationalityList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docHolderNationalityList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocHolderNationalityList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDocHolderNationalityList() {
            if (docHolderNationalityList == null) {
                docHolderNationalityList = new ArrayList<String>();
            }
            return this.docHolderNationalityList;
        }

        /**
         * Gets the value of the icaoDocHolderNationalityList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the icaoDocHolderNationalityList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getICAODocHolderNationalityList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getICAODocHolderNationalityList() {
            if (icaoDocHolderNationalityList == null) {
                icaoDocHolderNationalityList = new ArrayList<String>();
            }
            return this.icaoDocHolderNationalityList;
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
     *       &lt;attribute name="DocType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
     *       &lt;attribute name="RequiredItemCodeList" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ListOfOTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequiredDocument {

        @XmlAttribute(name = "DocType")
        protected String docType;
        @XmlAttribute(name = "RequiredItemCodeList")
        protected List<String> requiredItemCodeList;

        /**
         * Gets the value of the docType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocType() {
            return docType;
        }

        /**
         * Sets the value of the docType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocType(String value) {
            this.docType = value;
        }

        /**
         * Gets the value of the requiredItemCodeList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requiredItemCodeList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequiredItemCodeList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRequiredItemCodeList() {
            if (requiredItemCodeList == null) {
                requiredItemCodeList = new ArrayList<String>();
            }
            return this.requiredItemCodeList;
        }

    }

}
