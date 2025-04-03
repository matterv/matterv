
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineDefaultPowerOpInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineDefaultPowerOpInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="powerOffType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="suspendType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="resetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="defaultPowerOffType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="defaultSuspendType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="defaultResetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="standbyAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDefaultPowerOpInfo", propOrder = {
    "powerOffType",
    "suspendType",
    "resetType",
    "defaultPowerOffType",
    "defaultSuspendType",
    "defaultResetType",
    "standbyAction"
})
public class VirtualMachineDefaultPowerOpInfo
    extends DynamicData
{

    protected String powerOffType;
    protected String suspendType;
    protected String resetType;
    protected String defaultPowerOffType;
    protected String defaultSuspendType;
    protected String defaultResetType;
    protected String standbyAction;

    /**
     * Gets the value of the powerOffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerOffType() {
        return powerOffType;
    }

    /**
     * Sets the value of the powerOffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerOffType(String value) {
        this.powerOffType = value;
    }

    /**
     * Gets the value of the suspendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendType() {
        return suspendType;
    }

    /**
     * Sets the value of the suspendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendType(String value) {
        this.suspendType = value;
    }

    /**
     * Gets the value of the resetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetType() {
        return resetType;
    }

    /**
     * Sets the value of the resetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetType(String value) {
        this.resetType = value;
    }

    /**
     * Gets the value of the defaultPowerOffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPowerOffType() {
        return defaultPowerOffType;
    }

    /**
     * Sets the value of the defaultPowerOffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPowerOffType(String value) {
        this.defaultPowerOffType = value;
    }

    /**
     * Gets the value of the defaultSuspendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSuspendType() {
        return defaultSuspendType;
    }

    /**
     * Sets the value of the defaultSuspendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSuspendType(String value) {
        this.defaultSuspendType = value;
    }

    /**
     * Gets the value of the defaultResetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultResetType() {
        return defaultResetType;
    }

    /**
     * Sets the value of the defaultResetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultResetType(String value) {
        this.defaultResetType = value;
    }

    /**
     * Gets the value of the standbyAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandbyAction() {
        return standbyAction;
    }

    /**
     * Sets the value of the standbyAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandbyAction(String value) {
        this.standbyAction = value;
    }

}
