
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeIoFilterRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpgradeIoFilterRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="filterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="compRes" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="vibUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vibSslTrust" type="{urn:internalvim25}IoFilterManagerSslTrust" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeIoFilterRequestType", propOrder = {
    "_this",
    "filterId",
    "compRes",
    "vibUrl",
    "vibSslTrust"
})
public class UpgradeIoFilterRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String filterId;
    @XmlElement(required = true)
    protected ManagedObjectReference compRes;
    @XmlElement(required = true)
    protected String vibUrl;
    protected IoFilterManagerSslTrust vibSslTrust;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the filterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * Sets the value of the filterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterId(String value) {
        this.filterId = value;
    }

    /**
     * Gets the value of the compRes property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCompRes() {
        return compRes;
    }

    /**
     * Sets the value of the compRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCompRes(ManagedObjectReference value) {
        this.compRes = value;
    }

    /**
     * Gets the value of the vibUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVibUrl() {
        return vibUrl;
    }

    /**
     * Sets the value of the vibUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVibUrl(String value) {
        this.vibUrl = value;
    }

    /**
     * Gets the value of the vibSslTrust property.
     * 
     * @return
     *     possible object is
     *     {@link IoFilterManagerSslTrust }
     *     
     */
    public IoFilterManagerSslTrust getVibSslTrust() {
        return vibSslTrust;
    }

    /**
     * Sets the value of the vibSslTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link IoFilterManagerSslTrust }
     *     
     */
    public void setVibSslTrust(IoFilterManagerSslTrust value) {
        this.vibSslTrust = value;
    }

}
