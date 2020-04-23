
package org.opentravel.ota._2003._05.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.opentravel.ota._2003._05.simpletypes.ShareMarketIndType;
import org.opentravel.ota._2003._05.simpletypes.ShareSynchIndType;


/**
 * Electronic email addresses, in IETF specified format.
 * 
 * <p>Java class for EmailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/SimpleTypes>StringLength1to128">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}DefaultIndGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}PrivacyGroup"/>
 *       &lt;attribute name="EmailType" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}OTA_CodeType" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}RPH_Type" />
 *       &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to128" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailType", propOrder = {
    "value"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.commontypes.CustomerType.Email.class
})
public class EmailType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "EmailType")
    protected String emailType;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;
    @XmlAttribute(name = "ShareSynchInd")
    protected ShareSynchIndType shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected ShareMarketIndType shareMarketInd;

    /**
     * Used for Character Strings, length 1 to 128.
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
     * Gets the value of the emailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailType() {
        return emailType;
    }

    /**
     * Sets the value of the emailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailType(String value) {
        this.emailType = value;
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
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultInd() {
        return defaultInd;
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
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

}
