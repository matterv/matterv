
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
 *       <sequence>
 *         <element name="capacityInKB" type="{urn:internalvim25}LongOption"/>
 *         <element name="ioAllocationOption" type="{urn:internalvim25}StorageIOAllocationOption" minOccurs="0"/>
 *         <element name="vFlashCacheConfigOption" type="{urn:internalvim25}VirtualDiskOptionVFlashCacheConfigOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskOption", propOrder = {
    "capacityInKB",
    "ioAllocationOption",
    "vFlashCacheConfigOption"
})
public class VirtualDiskOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected LongOption capacityInKB;
    protected StorageIOAllocationOption ioAllocationOption;
    protected VirtualDiskOptionVFlashCacheConfigOption vFlashCacheConfigOption;

    /**
     * Gets the value of the capacityInKB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getCapacityInKB() {
        return capacityInKB;
    }

    /**
     * Sets the value of the capacityInKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setCapacityInKB(LongOption value) {
        this.capacityInKB = value;
    }

    /**
     * Gets the value of the ioAllocationOption property.
     * 
     * @return
     *     possible object is
     *     {@link StorageIOAllocationOption }
     *     
     */
    public StorageIOAllocationOption getIoAllocationOption() {
        return ioAllocationOption;
    }

    /**
     * Sets the value of the ioAllocationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageIOAllocationOption }
     *     
     */
    public void setIoAllocationOption(StorageIOAllocationOption value) {
        this.ioAllocationOption = value;
    }

    /**
     * Gets the value of the vFlashCacheConfigOption property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDiskOptionVFlashCacheConfigOption }
     *     
     */
    public VirtualDiskOptionVFlashCacheConfigOption getVFlashCacheConfigOption() {
        return vFlashCacheConfigOption;
    }

    /**
     * Sets the value of the vFlashCacheConfigOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDiskOptionVFlashCacheConfigOption }
     *     
     */
    public void setVFlashCacheConfigOption(VirtualDiskOptionVFlashCacheConfigOption value) {
        this.vFlashCacheConfigOption = value;
    }

}
