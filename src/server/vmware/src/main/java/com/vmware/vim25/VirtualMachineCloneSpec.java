
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineCloneSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineCloneSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="location" type="{urn:internalvim25}VirtualMachineRelocateSpec"/>
 *         <element name="template" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="config" type="{urn:internalvim25}VirtualMachineConfigSpec" minOccurs="0"/>
 *         <element name="customization" type="{urn:internalvim25}CustomizationSpec" minOccurs="0"/>
 *         <element name="powerOn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="snapshot" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="memory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="tpmProvisionPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineCloneSpec", propOrder = {
    "location",
    "template",
    "config",
    "customization",
    "powerOn",
    "snapshot",
    "memory",
    "tpmProvisionPolicy"
})
public class VirtualMachineCloneSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected VirtualMachineRelocateSpec location;
    protected boolean template;
    protected VirtualMachineConfigSpec config;
    protected CustomizationSpec customization;
    protected boolean powerOn;
    protected ManagedObjectReference snapshot;
    protected Boolean memory;
    protected String tpmProvisionPolicy;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRelocateSpec }
     *     
     */
    public VirtualMachineRelocateSpec getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRelocateSpec }
     *     
     */
    public void setLocation(VirtualMachineRelocateSpec value) {
        this.location = value;
    }

    /**
     * Gets the value of the template property.
     * 
     */
    public boolean isTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     */
    public void setTemplate(boolean value) {
        this.template = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineConfigSpec }
     *     
     */
    public VirtualMachineConfigSpec getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineConfigSpec }
     *     
     */
    public void setConfig(VirtualMachineConfigSpec value) {
        this.config = value;
    }

    /**
     * Gets the value of the customization property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationSpec }
     *     
     */
    public CustomizationSpec getCustomization() {
        return customization;
    }

    /**
     * Sets the value of the customization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationSpec }
     *     
     */
    public void setCustomization(CustomizationSpec value) {
        this.customization = value;
    }

    /**
     * Gets the value of the powerOn property.
     * 
     */
    public boolean isPowerOn() {
        return powerOn;
    }

    /**
     * Sets the value of the powerOn property.
     * 
     */
    public void setPowerOn(boolean value) {
        this.powerOn = value;
    }

    /**
     * Gets the value of the snapshot property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of the snapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSnapshot(ManagedObjectReference value) {
        this.snapshot = value;
    }

    /**
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemory(Boolean value) {
        this.memory = value;
    }

    /**
     * Gets the value of the tpmProvisionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpmProvisionPolicy() {
        return tpmProvisionPolicy;
    }

    /**
     * Sets the value of the tpmProvisionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpmProvisionPolicy(String value) {
        this.tpmProvisionPolicy = value;
    }

}
