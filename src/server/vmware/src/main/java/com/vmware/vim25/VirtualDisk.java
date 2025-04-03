
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDisk complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDisk">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDevice">
 *       <sequence>
 *         <element name="capacityInKB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="capacityInBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="shares" type="{urn:internalvim25}SharesInfo" minOccurs="0"/>
 *         <element name="storageIOAllocation" type="{urn:internalvim25}StorageIOAllocationInfo" minOccurs="0"/>
 *         <element name="diskObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vFlashCacheConfigInfo" type="{urn:internalvim25}VirtualDiskVFlashCacheConfigInfo" minOccurs="0"/>
 *         <element name="iofilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vDiskId" type="{urn:internalvim25}ID" minOccurs="0"/>
 *         <element name="vDiskVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="nativeUnmanagedLinkedClone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="independentFilters" type="{urn:internalvim25}VirtualMachineBaseIndependentFilterSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="guestReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDisk", propOrder = {
    "capacityInKB",
    "capacityInBytes",
    "shares",
    "storageIOAllocation",
    "diskObjectId",
    "vFlashCacheConfigInfo",
    "iofilter",
    "vDiskId",
    "vDiskVersion",
    "nativeUnmanagedLinkedClone",
    "independentFilters",
    "guestReadOnly"
})
public class VirtualDisk
    extends VirtualDevice
{

    protected long capacityInKB;
    protected Long capacityInBytes;
    protected SharesInfo shares;
    protected StorageIOAllocationInfo storageIOAllocation;
    protected String diskObjectId;
    protected VirtualDiskVFlashCacheConfigInfo vFlashCacheConfigInfo;
    protected List<String> iofilter;
    protected ID vDiskId;
    protected Integer vDiskVersion;
    protected Boolean nativeUnmanagedLinkedClone;
    protected List<VirtualMachineBaseIndependentFilterSpec> independentFilters;
    protected Boolean guestReadOnly;

    /**
     * Gets the value of the capacityInKB property.
     * 
     */
    public long getCapacityInKB() {
        return capacityInKB;
    }

    /**
     * Sets the value of the capacityInKB property.
     * 
     */
    public void setCapacityInKB(long value) {
        this.capacityInKB = value;
    }

    /**
     * Gets the value of the capacityInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacityInBytes() {
        return capacityInBytes;
    }

    /**
     * Sets the value of the capacityInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacityInBytes(Long value) {
        this.capacityInBytes = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link SharesInfo }
     *     
     */
    public SharesInfo getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesInfo }
     *     
     */
    public void setShares(SharesInfo value) {
        this.shares = value;
    }

    /**
     * Gets the value of the storageIOAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StorageIOAllocationInfo }
     *     
     */
    public StorageIOAllocationInfo getStorageIOAllocation() {
        return storageIOAllocation;
    }

    /**
     * Sets the value of the storageIOAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageIOAllocationInfo }
     *     
     */
    public void setStorageIOAllocation(StorageIOAllocationInfo value) {
        this.storageIOAllocation = value;
    }

    /**
     * Gets the value of the diskObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskObjectId() {
        return diskObjectId;
    }

    /**
     * Sets the value of the diskObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskObjectId(String value) {
        this.diskObjectId = value;
    }

    /**
     * Gets the value of the vFlashCacheConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDiskVFlashCacheConfigInfo }
     *     
     */
    public VirtualDiskVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
        return vFlashCacheConfigInfo;
    }

    /**
     * Sets the value of the vFlashCacheConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDiskVFlashCacheConfigInfo }
     *     
     */
    public void setVFlashCacheConfigInfo(VirtualDiskVFlashCacheConfigInfo value) {
        this.vFlashCacheConfigInfo = value;
    }

    /**
     * Gets the value of the iofilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iofilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIofilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the iofilter property.
     */
    public List<String> getIofilter() {
        if (iofilter == null) {
            iofilter = new ArrayList<>();
        }
        return this.iofilter;
    }

    /**
     * Gets the value of the vDiskId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getVDiskId() {
        return vDiskId;
    }

    /**
     * Sets the value of the vDiskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setVDiskId(ID value) {
        this.vDiskId = value;
    }

    /**
     * Gets the value of the vDiskVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVDiskVersion() {
        return vDiskVersion;
    }

    /**
     * Sets the value of the vDiskVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVDiskVersion(Integer value) {
        this.vDiskVersion = value;
    }

    /**
     * Gets the value of the nativeUnmanagedLinkedClone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNativeUnmanagedLinkedClone() {
        return nativeUnmanagedLinkedClone;
    }

    /**
     * Sets the value of the nativeUnmanagedLinkedClone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNativeUnmanagedLinkedClone(Boolean value) {
        this.nativeUnmanagedLinkedClone = value;
    }

    /**
     * Gets the value of the independentFilters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentFilters property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndependentFilters().add(newItem);
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
     *     The value of the independentFilters property.
     */
    public List<VirtualMachineBaseIndependentFilterSpec> getIndependentFilters() {
        if (independentFilters == null) {
            independentFilters = new ArrayList<>();
        }
        return this.independentFilters;
    }

    /**
     * Gets the value of the guestReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestReadOnly() {
        return guestReadOnly;
    }

    /**
     * Sets the value of the guestReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestReadOnly(Boolean value) {
        this.guestReadOnly = value;
    }

}
