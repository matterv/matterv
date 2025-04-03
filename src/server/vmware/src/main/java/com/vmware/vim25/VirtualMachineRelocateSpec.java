
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineRelocateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineRelocateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="service" type="{urn:internalvim25}ServiceLocator" minOccurs="0"/>
 *         <element name="folder" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="datastore" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="diskMoveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pool" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="disk" type="{urn:internalvim25}VirtualMachineRelocateSpecDiskLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="transform" type="{urn:internalvim25}VirtualMachineRelocateTransformation" minOccurs="0"/>
 *         <element name="deviceChange" type="{urn:internalvim25}VirtualDeviceConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="profile" type="{urn:internalvim25}VirtualMachineProfileSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="cryptoSpec" type="{urn:internalvim25}CryptoSpec" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRelocateSpec", propOrder = {
    "service",
    "folder",
    "datastore",
    "diskMoveType",
    "pool",
    "host",
    "disk",
    "transform",
    "deviceChange",
    "profile",
    "cryptoSpec"
})
public class VirtualMachineRelocateSpec
    extends DynamicData
{

    protected ServiceLocator service;
    protected ManagedObjectReference folder;
    protected ManagedObjectReference datastore;
    protected String diskMoveType;
    protected ManagedObjectReference pool;
    protected ManagedObjectReference host;
    protected List<VirtualMachineRelocateSpecDiskLocator> disk;
    @XmlSchemaType(name = "string")
    protected VirtualMachineRelocateTransformation transform;
    protected List<VirtualDeviceConfigSpec> deviceChange;
    protected List<VirtualMachineProfileSpec> profile;
    protected CryptoSpec cryptoSpec;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocator }
     *     
     */
    public ServiceLocator getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocator }
     *     
     */
    public void setService(ServiceLocator value) {
        this.service = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFolder(ManagedObjectReference value) {
        this.folder = value;
    }

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatastore(ManagedObjectReference value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the diskMoveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskMoveType() {
        return diskMoveType;
    }

    /**
     * Sets the value of the diskMoveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskMoveType(String value) {
        this.diskMoveType = value;
    }

    /**
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPool(ManagedObjectReference value) {
        this.pool = value;
    }

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
     * Gets the value of the disk property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disk property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineRelocateSpecDiskLocator }
     * </p>
     * 
     * 
     * @return
     *     The value of the disk property.
     */
    public List<VirtualMachineRelocateSpecDiskLocator> getDisk() {
        if (disk == null) {
            disk = new ArrayList<>();
        }
        return this.disk;
    }

    /**
     * Gets the value of the transform property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRelocateTransformation }
     *     
     */
    public VirtualMachineRelocateTransformation getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRelocateTransformation }
     *     
     */
    public void setTransform(VirtualMachineRelocateTransformation value) {
        this.transform = value;
    }

    /**
     * Gets the value of the deviceChange property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceChange property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeviceChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualDeviceConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the deviceChange property.
     */
    public List<VirtualDeviceConfigSpec> getDeviceChange() {
        if (deviceChange == null) {
            deviceChange = new ArrayList<>();
        }
        return this.deviceChange;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineProfileSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the profile property.
     */
    public List<VirtualMachineProfileSpec> getProfile() {
        if (profile == null) {
            profile = new ArrayList<>();
        }
        return this.profile;
    }

    /**
     * Gets the value of the cryptoSpec property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoSpec }
     *     
     */
    public CryptoSpec getCryptoSpec() {
        return cryptoSpec;
    }

    /**
     * Sets the value of the cryptoSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoSpec }
     *     
     */
    public void setCryptoSpec(CryptoSpec value) {
        this.cryptoSpec = value;
    }

}
