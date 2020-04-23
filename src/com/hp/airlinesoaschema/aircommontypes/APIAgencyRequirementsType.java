
package com.hp.airlinesoaschema.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_AgencyRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_AgencyRequirementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequiredDocuments" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_RequiredDocumentInfoType" minOccurs="0"/>
 *         &lt;element name="API_Info" type="{http://www.hp.com/AirlineSOASchema/AirCommonTypes}API_InfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DocLevelInd" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Numeric1to99" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_AgencyRequirementsType", propOrder = {
    "requiredDocuments",
    "apiInfo"
})
public class APIAgencyRequirementsType {

    @XmlElement(name = "RequiredDocuments")
    protected APIRequiredDocumentInfoType requiredDocuments;
    @XmlElement(name = "API_Info", required = true)
    protected List<APIInfoType> apiInfo;
    @XmlAttribute(name = "AgencyName")
    @XmlSchemaType(name = "anySimpleType")
    protected String agencyName;
    @XmlAttribute(name = "DocLevelInd")
    protected Integer docLevelInd;

    /**
     * Gets the value of the requiredDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link APIRequiredDocumentInfoType }
     *     
     */
    public APIRequiredDocumentInfoType getRequiredDocuments() {
        return requiredDocuments;
    }

    /**
     * Sets the value of the requiredDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIRequiredDocumentInfoType }
     *     
     */
    public void setRequiredDocuments(APIRequiredDocumentInfoType value) {
        this.requiredDocuments = value;
    }

    /**
     * Gets the value of the apiInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPIInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIInfoType }
     * 
     * 
     */
    public List<APIInfoType> getAPIInfo() {
        if (apiInfo == null) {
            apiInfo = new ArrayList<APIInfoType>();
        }
        return this.apiInfo;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the docLevelInd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocLevelInd() {
        return docLevelInd;
    }

    /**
     * Sets the value of the docLevelInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocLevelInd(Integer value) {
        this.docLevelInd = value;
    }

}
