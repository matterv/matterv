
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDevice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDevice">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="deviceInfo" type="{urn:internalvim25}Description" minOccurs="0"/>
 *         <element name="backing" type="{urn:internalvim25}VirtualDeviceBackingInfo" minOccurs="0"/>
 *         <element name="connectable" type="{urn:internalvim25}VirtualDeviceConnectInfo" minOccurs="0"/>
 *         <element name="slotInfo" type="{urn:internalvim25}VirtualDeviceBusSlotInfo" minOccurs="0"/>
 *         <element name="controllerKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="unitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numaNode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="deviceGroupInfo" type="{urn:internalvim25}VirtualDeviceDeviceGroupInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDevice", propOrder = {
    "key",
    "deviceInfo",
    "backing",
    "connectable",
    "slotInfo",
    "controllerKey",
    "unitNumber",
    "numaNode",
    "deviceGroupInfo"
})
@XmlSeeAlso({
    VirtualCdrom.class,
    VirtualDisk.class,
    VirtualFloppy.class,
    VirtualKeyboard.class,
    VirtualNVDIMM.class,
    VirtualPCIPassthrough.class,
    VirtualParallelPort.class,
    VirtualPointingDevice.class,
    VirtualPrecisionClock.class,
    VirtualSCSIPassthrough.class,
    VirtualSerialPort.class,
    VirtualSoundCard.class,
    VirtualTPM.class,
    VirtualUSB.class,
    VirtualController.class,
    VirtualMachineVMCIDevice.class,
    VirtualMachineVMIROM.class,
    VirtualMachineVideoCard.class,
    VirtualEthernetCard.class,
    VirtualWDT.class
})
public class VirtualDevice
    extends DynamicData
{

    protected int key;
    protected Description deviceInfo;
    protected VirtualDeviceBackingInfo backing;
    protected VirtualDeviceConnectInfo connectable;
    protected VirtualDeviceBusSlotInfo slotInfo;
    protected Integer controllerKey;
    protected Integer unitNumber;
    protected Integer numaNode;
    protected VirtualDeviceDeviceGroupInfo deviceGroupInfo;

    /**
     * Gets the value of the key property.
     * 
     */
    public int getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(int value) {
        this.key = value;
    }

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDeviceInfo(Description value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceBackingInfo }
     *     
     */
    public VirtualDeviceBackingInfo getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceBackingInfo }
     *     
     */
    public void setBacking(VirtualDeviceBackingInfo value) {
        this.backing = value;
    }

    /**
     * Gets the value of the connectable property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceConnectInfo }
     *     
     */
    public VirtualDeviceConnectInfo getConnectable() {
        return connectable;
    }

    /**
     * Sets the value of the connectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceConnectInfo }
     *     
     */
    public void setConnectable(VirtualDeviceConnectInfo value) {
        this.connectable = value;
    }

    /**
     * Gets the value of the slotInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceBusSlotInfo }
     *     
     */
    public VirtualDeviceBusSlotInfo getSlotInfo() {
        return slotInfo;
    }

    /**
     * Sets the value of the slotInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceBusSlotInfo }
     *     
     */
    public void setSlotInfo(VirtualDeviceBusSlotInfo value) {
        this.slotInfo = value;
    }

    /**
     * Gets the value of the controllerKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getControllerKey() {
        return controllerKey;
    }

    /**
     * Sets the value of the controllerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setControllerKey(Integer value) {
        this.controllerKey = value;
    }

    /**
     * Gets the value of the unitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitNumber(Integer value) {
        this.unitNumber = value;
    }

    /**
     * Gets the value of the numaNode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumaNode() {
        return numaNode;
    }

    /**
     * Sets the value of the numaNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumaNode(Integer value) {
        this.numaNode = value;
    }

    /**
     * Gets the value of the deviceGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceDeviceGroupInfo }
     *     
     */
    public VirtualDeviceDeviceGroupInfo getDeviceGroupInfo() {
        return deviceGroupInfo;
    }

    /**
     * Sets the value of the deviceGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceDeviceGroupInfo }
     *     
     */
    public void setDeviceGroupInfo(VirtualDeviceDeviceGroupInfo value) {
        this.deviceGroupInfo = value;
    }

}
