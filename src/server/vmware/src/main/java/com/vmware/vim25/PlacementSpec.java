
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PlacementSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="priority" type="{urn:internalvim25}VirtualMachineMovePriority" minOccurs="0"/>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="configSpec" type="{urn:internalvim25}VirtualMachineConfigSpec" minOccurs="0"/>
 *         <element name="relocateSpec" type="{urn:internalvim25}VirtualMachineRelocateSpec" minOccurs="0"/>
 *         <element name="hosts" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="datastores" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="storagePods" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="disallowPrerequisiteMoves" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rules" type="{urn:internalvim25}ClusterRuleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="placementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cloneSpec" type="{urn:internalvim25}VirtualMachineCloneSpec" minOccurs="0"/>
 *         <element name="cloneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementSpec", propOrder = {
    "priority",
    "vm",
    "configSpec",
    "relocateSpec",
    "hosts",
    "datastores",
    "storagePods",
    "disallowPrerequisiteMoves",
    "rules",
    "key",
    "placementType",
    "cloneSpec",
    "cloneName"
})
public class PlacementSpec
    extends DynamicData
{

    @XmlSchemaType(name = "string")
    protected VirtualMachineMovePriority priority;
    protected ManagedObjectReference vm;
    protected VirtualMachineConfigSpec configSpec;
    protected VirtualMachineRelocateSpec relocateSpec;
    protected List<ManagedObjectReference> hosts;
    protected List<ManagedObjectReference> datastores;
    protected List<ManagedObjectReference> storagePods;
    protected Boolean disallowPrerequisiteMoves;
    protected List<ClusterRuleInfo> rules;
    protected String key;
    protected String placementType;
    protected VirtualMachineCloneSpec cloneSpec;
    protected String cloneName;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineMovePriority }
     *     
     */
    public VirtualMachineMovePriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineMovePriority }
     *     
     */
    public void setPriority(VirtualMachineMovePriority value) {
        this.priority = value;
    }

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
     * Gets the value of the configSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineConfigSpec }
     *     
     */
    public VirtualMachineConfigSpec getConfigSpec() {
        return configSpec;
    }

    /**
     * Sets the value of the configSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineConfigSpec }
     *     
     */
    public void setConfigSpec(VirtualMachineConfigSpec value) {
        this.configSpec = value;
    }

    /**
     * Gets the value of the relocateSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRelocateSpec }
     *     
     */
    public VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }

    /**
     * Sets the value of the relocateSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRelocateSpec }
     *     
     */
    public void setRelocateSpec(VirtualMachineRelocateSpec value) {
        this.relocateSpec = value;
    }

    /**
     * Gets the value of the hosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the hosts property.
     */
    public List<ManagedObjectReference> getHosts() {
        if (hosts == null) {
            hosts = new ArrayList<>();
        }
        return this.hosts;
    }

    /**
     * Gets the value of the datastores property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastores property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastores property.
     */
    public List<ManagedObjectReference> getDatastores() {
        if (datastores == null) {
            datastores = new ArrayList<>();
        }
        return this.datastores;
    }

    /**
     * Gets the value of the storagePods property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storagePods property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStoragePods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the storagePods property.
     */
    public List<ManagedObjectReference> getStoragePods() {
        if (storagePods == null) {
            storagePods = new ArrayList<>();
        }
        return this.storagePods;
    }

    /**
     * Gets the value of the disallowPrerequisiteMoves property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisallowPrerequisiteMoves() {
        return disallowPrerequisiteMoves;
    }

    /**
     * Sets the value of the disallowPrerequisiteMoves property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisallowPrerequisiteMoves(Boolean value) {
        this.disallowPrerequisiteMoves = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRuleInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the rules property.
     */
    public List<ClusterRuleInfo> getRules() {
        if (rules == null) {
            rules = new ArrayList<>();
        }
        return this.rules;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the placementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementType() {
        return placementType;
    }

    /**
     * Sets the value of the placementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementType(String value) {
        this.placementType = value;
    }

    /**
     * Gets the value of the cloneSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineCloneSpec }
     *     
     */
    public VirtualMachineCloneSpec getCloneSpec() {
        return cloneSpec;
    }

    /**
     * Sets the value of the cloneSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineCloneSpec }
     *     
     */
    public void setCloneSpec(VirtualMachineCloneSpec value) {
        this.cloneSpec = value;
    }

    /**
     * Gets the value of the cloneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloneName() {
        return cloneName;
    }

    /**
     * Sets the value of the cloneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloneName(String value) {
        this.cloneName = value;
    }

}
