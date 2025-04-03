
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineRelocateSpecDiskLocator complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineRelocateSpecDiskLocator">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="diskId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="datastore" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="diskMoveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="diskBackingInfo" type="{urn:internalvim25}VirtualDeviceBackingInfo" minOccurs="0"/>
 *         <element name="profile" type="{urn:internalvim25}VirtualMachineProfileSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="backing" type="{urn:internalvim25}VirtualMachineRelocateSpecDiskLocatorBackingSpec" minOccurs="0"/>
 *         <element name="filterSpec" type="{urn:internalvim25}VirtualMachineBaseIndependentFilterSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRelocateSpecDiskLocator", propOrder = {
    "diskId",
    "datastore",
    "diskMoveType",
    "diskBackingInfo",
    "profile",
    "backing",
    "filterSpec"
})
public class VirtualMachineRelocateSpecDiskLocator
    extends DynamicData
{

    protected int diskId;
    @XmlElement(required = true)
    protected ManagedObjectReference datastore;
    protected String diskMoveType;
    protected VirtualDeviceBackingInfo diskBackingInfo;
    protected List<VirtualMachineProfileSpec> profile;
    protected VirtualMachineRelocateSpecDiskLocatorBackingSpec backing;
    protected List<VirtualMachineBaseIndependentFilterSpec> filterSpec;

    /**
     * Gets the value of the diskId property.
     * 
     */
    public int getDiskId() {
        return diskId;
    }

    /**
     * Sets the value of the diskId property.
     * 
     */
    public void setDiskId(int value) {
        this.diskId = value;
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
     * Gets the value of the diskBackingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceBackingInfo }
     *     
     */
    public VirtualDeviceBackingInfo getDiskBackingInfo() {
        return diskBackingInfo;
    }

    /**
     * Sets the value of the diskBackingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceBackingInfo }
     *     
     */
    public void setDiskBackingInfo(VirtualDeviceBackingInfo value) {
        this.diskBackingInfo = value;
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
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRelocateSpecDiskLocatorBackingSpec }
     *     
     */
    public VirtualMachineRelocateSpecDiskLocatorBackingSpec getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRelocateSpecDiskLocatorBackingSpec }
     *     
     */
    public void setBacking(VirtualMachineRelocateSpecDiskLocatorBackingSpec value) {
        this.backing = value;
    }

    /**
     * Gets the value of the filterSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFilterSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineBaseIndependentFilterSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the filterSpec property.
     */
    public List<VirtualMachineBaseIndependentFilterSpec> getFilterSpec() {
        if (filterSpec == null) {
            filterSpec = new ArrayList<>();
        }
        return this.filterSpec;
    }

}
