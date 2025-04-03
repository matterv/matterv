
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="runtime" type="{urn:internalvim25}VirtualMachineRuntimeInfo"/>
 *         <element name="guest" type="{urn:internalvim25}VirtualMachineGuestSummary" minOccurs="0"/>
 *         <element name="config" type="{urn:internalvim25}VirtualMachineConfigSummary"/>
 *         <element name="storage" type="{urn:internalvim25}VirtualMachineStorageSummary" minOccurs="0"/>
 *         <element name="quickStats" type="{urn:internalvim25}VirtualMachineQuickStats"/>
 *         <element name="overallStatus" type="{urn:internalvim25}ManagedEntityStatus"/>
 *         <element name="customValue" type="{urn:internalvim25}CustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSummary", propOrder = {
    "vm",
    "runtime",
    "guest",
    "config",
    "storage",
    "quickStats",
    "overallStatus",
    "customValue"
})
public class VirtualMachineSummary
    extends DynamicData
{

    protected ManagedObjectReference vm;
    @XmlElement(required = true)
    protected VirtualMachineRuntimeInfo runtime;
    protected VirtualMachineGuestSummary guest;
    @XmlElement(required = true)
    protected VirtualMachineConfigSummary config;
    protected VirtualMachineStorageSummary storage;
    @XmlElement(required = true)
    protected VirtualMachineQuickStats quickStats;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus overallStatus;
    protected List<CustomFieldValue> customValue;

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVm(ManagedObjectReference value) {
        this.vm = value;
    }

    /**
     * Gets the value of the runtime property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRuntimeInfo }
     *     
     */
    public VirtualMachineRuntimeInfo getRuntime() {
        return runtime;
    }

    /**
     * Sets the value of the runtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRuntimeInfo }
     *     
     */
    public void setRuntime(VirtualMachineRuntimeInfo value) {
        this.runtime = value;
    }

    /**
     * Gets the value of the guest property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineGuestSummary }
     *     
     */
    public VirtualMachineGuestSummary getGuest() {
        return guest;
    }

    /**
     * Sets the value of the guest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineGuestSummary }
     *     
     */
    public void setGuest(VirtualMachineGuestSummary value) {
        this.guest = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineConfigSummary }
     *     
     */
    public VirtualMachineConfigSummary getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineConfigSummary }
     *     
     */
    public void setConfig(VirtualMachineConfigSummary value) {
        this.config = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineStorageSummary }
     *     
     */
    public VirtualMachineStorageSummary getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineStorageSummary }
     *     
     */
    public void setStorage(VirtualMachineStorageSummary value) {
        this.storage = value;
    }

    /**
     * Gets the value of the quickStats property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineQuickStats }
     *     
     */
    public VirtualMachineQuickStats getQuickStats() {
        return quickStats;
    }

    /**
     * Sets the value of the quickStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineQuickStats }
     *     
     */
    public void setQuickStats(VirtualMachineQuickStats value) {
        this.quickStats = value;
    }

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setOverallStatus(ManagedEntityStatus value) {
        this.overallStatus = value;
    }

    /**
     * Gets the value of the customValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCustomValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the customValue property.
     */
    public List<CustomFieldValue> getCustomValue() {
        if (customValue == null) {
            customValue = new ArrayList<>();
        }
        return this.customValue;
    }

}
