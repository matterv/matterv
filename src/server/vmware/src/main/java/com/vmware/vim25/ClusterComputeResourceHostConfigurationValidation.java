
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceHostConfigurationValidation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceHostConfigurationValidation">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterComputeResourceValidationResultBase">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="isDvsSettingValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="isVmknicSettingValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="isNtpSettingValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="isLockdownModeValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHostConfigurationValidation", propOrder = {
    "host",
    "isDvsSettingValid",
    "isVmknicSettingValid",
    "isNtpSettingValid",
    "isLockdownModeValid"
})
public class ClusterComputeResourceHostConfigurationValidation
    extends ClusterComputeResourceValidationResultBase
{

    @XmlElement(required = true)
    protected ManagedObjectReference host;
    protected Boolean isDvsSettingValid;
    protected Boolean isVmknicSettingValid;
    protected Boolean isNtpSettingValid;
    protected Boolean isLockdownModeValid;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the isDvsSettingValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDvsSettingValid() {
        return isDvsSettingValid;
    }

    /**
     * Sets the value of the isDvsSettingValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDvsSettingValid(Boolean value) {
        this.isDvsSettingValid = value;
    }

    /**
     * Gets the value of the isVmknicSettingValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVmknicSettingValid() {
        return isVmknicSettingValid;
    }

    /**
     * Sets the value of the isVmknicSettingValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVmknicSettingValid(Boolean value) {
        this.isVmknicSettingValid = value;
    }

    /**
     * Gets the value of the isNtpSettingValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNtpSettingValid() {
        return isNtpSettingValid;
    }

    /**
     * Sets the value of the isNtpSettingValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNtpSettingValid(Boolean value) {
        this.isNtpSettingValid = value;
    }

    /**
     * Gets the value of the isLockdownModeValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLockdownModeValid() {
        return isLockdownModeValid;
    }

    /**
     * Sets the value of the isLockdownModeValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLockdownModeValid(Boolean value) {
        this.isLockdownModeValid = value;
    }

}
