
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualHardwareOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualHardwareOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hwVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="virtualDeviceOption" type="{urn:internalvim25}VirtualDeviceOption" maxOccurs="unbounded"/>
 *         <element name="deviceListReadonly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="numCPU" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         <element name="numCoresPerSocket" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="autoCoresPerSocket" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="numCpuReadonly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="memoryMB" type="{urn:internalvim25}LongOption"/>
 *         <element name="numPCIControllers" type="{urn:internalvim25}IntOption"/>
 *         <element name="numIDEControllers" type="{urn:internalvim25}IntOption"/>
 *         <element name="numUSBControllers" type="{urn:internalvim25}IntOption"/>
 *         <element name="numUSBXHCIControllers" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numSIOControllers" type="{urn:internalvim25}IntOption"/>
 *         <element name="numPS2Controllers" type="{urn:internalvim25}IntOption"/>
 *         <element name="licensingLimit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="numSupportedWwnPorts" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numSupportedWwnNodes" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="resourceConfigOption" type="{urn:internalvim25}ResourceConfigOption" minOccurs="0"/>
 *         <element name="numNVDIMMControllers" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numTPMDevices" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numWDTDevices" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numPrecisionClockDevices" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="epcMemoryMB" type="{urn:internalvim25}LongOption" minOccurs="0"/>
 *         <element name="acpiHostBridgesFirmware" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="numCpuSimultaneousThreads" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numNumaNodes" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numDeviceGroups" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="deviceGroupTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualHardwareOption", propOrder = {
    "hwVersion",
    "virtualDeviceOption",
    "deviceListReadonly",
    "numCPU",
    "numCoresPerSocket",
    "autoCoresPerSocket",
    "numCpuReadonly",
    "memoryMB",
    "numPCIControllers",
    "numIDEControllers",
    "numUSBControllers",
    "numUSBXHCIControllers",
    "numSIOControllers",
    "numPS2Controllers",
    "licensingLimit",
    "numSupportedWwnPorts",
    "numSupportedWwnNodes",
    "resourceConfigOption",
    "numNVDIMMControllers",
    "numTPMDevices",
    "numWDTDevices",
    "numPrecisionClockDevices",
    "epcMemoryMB",
    "acpiHostBridgesFirmware",
    "numCpuSimultaneousThreads",
    "numNumaNodes",
    "numDeviceGroups",
    "deviceGroupTypes"
})
public class VirtualHardwareOption
    extends DynamicData
{

    protected int hwVersion;
    @XmlElement(required = true)
    protected List<VirtualDeviceOption> virtualDeviceOption;
    protected boolean deviceListReadonly;
    @XmlElement(type = Integer.class)
    protected List<Integer> numCPU;
    protected IntOption numCoresPerSocket;
    protected BoolOption autoCoresPerSocket;
    protected boolean numCpuReadonly;
    @XmlElement(required = true)
    protected LongOption memoryMB;
    @XmlElement(required = true)
    protected IntOption numPCIControllers;
    @XmlElement(required = true)
    protected IntOption numIDEControllers;
    @XmlElement(required = true)
    protected IntOption numUSBControllers;
    protected IntOption numUSBXHCIControllers;
    @XmlElement(required = true)
    protected IntOption numSIOControllers;
    @XmlElement(required = true)
    protected IntOption numPS2Controllers;
    protected List<String> licensingLimit;
    protected IntOption numSupportedWwnPorts;
    protected IntOption numSupportedWwnNodes;
    protected ResourceConfigOption resourceConfigOption;
    protected IntOption numNVDIMMControllers;
    protected IntOption numTPMDevices;
    protected IntOption numWDTDevices;
    protected IntOption numPrecisionClockDevices;
    protected LongOption epcMemoryMB;
    protected List<String> acpiHostBridgesFirmware;
    protected IntOption numCpuSimultaneousThreads;
    protected IntOption numNumaNodes;
    protected IntOption numDeviceGroups;
    protected List<String> deviceGroupTypes;

    /**
     * Gets the value of the hwVersion property.
     * 
     */
    public int getHwVersion() {
        return hwVersion;
    }

    /**
     * Sets the value of the hwVersion property.
     * 
     */
    public void setHwVersion(int value) {
        this.hwVersion = value;
    }

    /**
     * Gets the value of the virtualDeviceOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualDeviceOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualDeviceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualDeviceOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualDeviceOption property.
     */
    public List<VirtualDeviceOption> getVirtualDeviceOption() {
        if (virtualDeviceOption == null) {
            virtualDeviceOption = new ArrayList<>();
        }
        return this.virtualDeviceOption;
    }

    /**
     * Gets the value of the deviceListReadonly property.
     * 
     */
    public boolean isDeviceListReadonly() {
        return deviceListReadonly;
    }

    /**
     * Sets the value of the deviceListReadonly property.
     * 
     */
    public void setDeviceListReadonly(boolean value) {
        this.deviceListReadonly = value;
    }

    /**
     * Gets the value of the numCPU property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numCPU property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNumCPU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the numCPU property.
     */
    public List<Integer> getNumCPU() {
        if (numCPU == null) {
            numCPU = new ArrayList<>();
        }
        return this.numCPU;
    }

    /**
     * Gets the value of the numCoresPerSocket property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumCoresPerSocket() {
        return numCoresPerSocket;
    }

    /**
     * Sets the value of the numCoresPerSocket property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumCoresPerSocket(IntOption value) {
        this.numCoresPerSocket = value;
    }

    /**
     * Gets the value of the autoCoresPerSocket property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getAutoCoresPerSocket() {
        return autoCoresPerSocket;
    }

    /**
     * Sets the value of the autoCoresPerSocket property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setAutoCoresPerSocket(BoolOption value) {
        this.autoCoresPerSocket = value;
    }

    /**
     * Gets the value of the numCpuReadonly property.
     * 
     */
    public boolean isNumCpuReadonly() {
        return numCpuReadonly;
    }

    /**
     * Sets the value of the numCpuReadonly property.
     * 
     */
    public void setNumCpuReadonly(boolean value) {
        this.numCpuReadonly = value;
    }

    /**
     * Gets the value of the memoryMB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getMemoryMB() {
        return memoryMB;
    }

    /**
     * Sets the value of the memoryMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setMemoryMB(LongOption value) {
        this.memoryMB = value;
    }

    /**
     * Gets the value of the numPCIControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumPCIControllers() {
        return numPCIControllers;
    }

    /**
     * Sets the value of the numPCIControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumPCIControllers(IntOption value) {
        this.numPCIControllers = value;
    }

    /**
     * Gets the value of the numIDEControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumIDEControllers() {
        return numIDEControllers;
    }

    /**
     * Sets the value of the numIDEControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumIDEControllers(IntOption value) {
        this.numIDEControllers = value;
    }

    /**
     * Gets the value of the numUSBControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumUSBControllers() {
        return numUSBControllers;
    }

    /**
     * Sets the value of the numUSBControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumUSBControllers(IntOption value) {
        this.numUSBControllers = value;
    }

    /**
     * Gets the value of the numUSBXHCIControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumUSBXHCIControllers() {
        return numUSBXHCIControllers;
    }

    /**
     * Sets the value of the numUSBXHCIControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumUSBXHCIControllers(IntOption value) {
        this.numUSBXHCIControllers = value;
    }

    /**
     * Gets the value of the numSIOControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSIOControllers() {
        return numSIOControllers;
    }

    /**
     * Sets the value of the numSIOControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSIOControllers(IntOption value) {
        this.numSIOControllers = value;
    }

    /**
     * Gets the value of the numPS2Controllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumPS2Controllers() {
        return numPS2Controllers;
    }

    /**
     * Sets the value of the numPS2Controllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumPS2Controllers(IntOption value) {
        this.numPS2Controllers = value;
    }

    /**
     * Gets the value of the licensingLimit property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licensingLimit property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLicensingLimit().add(newItem);
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
     *     The value of the licensingLimit property.
     */
    public List<String> getLicensingLimit() {
        if (licensingLimit == null) {
            licensingLimit = new ArrayList<>();
        }
        return this.licensingLimit;
    }

    /**
     * Gets the value of the numSupportedWwnPorts property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSupportedWwnPorts() {
        return numSupportedWwnPorts;
    }

    /**
     * Sets the value of the numSupportedWwnPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSupportedWwnPorts(IntOption value) {
        this.numSupportedWwnPorts = value;
    }

    /**
     * Gets the value of the numSupportedWwnNodes property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSupportedWwnNodes() {
        return numSupportedWwnNodes;
    }

    /**
     * Sets the value of the numSupportedWwnNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSupportedWwnNodes(IntOption value) {
        this.numSupportedWwnNodes = value;
    }

    /**
     * Gets the value of the resourceConfigOption property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceConfigOption }
     *     
     */
    public ResourceConfigOption getResourceConfigOption() {
        return resourceConfigOption;
    }

    /**
     * Sets the value of the resourceConfigOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceConfigOption }
     *     
     */
    public void setResourceConfigOption(ResourceConfigOption value) {
        this.resourceConfigOption = value;
    }

    /**
     * Gets the value of the numNVDIMMControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumNVDIMMControllers() {
        return numNVDIMMControllers;
    }

    /**
     * Sets the value of the numNVDIMMControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumNVDIMMControllers(IntOption value) {
        this.numNVDIMMControllers = value;
    }

    /**
     * Gets the value of the numTPMDevices property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumTPMDevices() {
        return numTPMDevices;
    }

    /**
     * Sets the value of the numTPMDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumTPMDevices(IntOption value) {
        this.numTPMDevices = value;
    }

    /**
     * Gets the value of the numWDTDevices property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumWDTDevices() {
        return numWDTDevices;
    }

    /**
     * Sets the value of the numWDTDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumWDTDevices(IntOption value) {
        this.numWDTDevices = value;
    }

    /**
     * Gets the value of the numPrecisionClockDevices property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumPrecisionClockDevices() {
        return numPrecisionClockDevices;
    }

    /**
     * Sets the value of the numPrecisionClockDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumPrecisionClockDevices(IntOption value) {
        this.numPrecisionClockDevices = value;
    }

    /**
     * Gets the value of the epcMemoryMB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getEpcMemoryMB() {
        return epcMemoryMB;
    }

    /**
     * Sets the value of the epcMemoryMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setEpcMemoryMB(LongOption value) {
        this.epcMemoryMB = value;
    }

    /**
     * Gets the value of the acpiHostBridgesFirmware property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acpiHostBridgesFirmware property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAcpiHostBridgesFirmware().add(newItem);
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
     *     The value of the acpiHostBridgesFirmware property.
     */
    public List<String> getAcpiHostBridgesFirmware() {
        if (acpiHostBridgesFirmware == null) {
            acpiHostBridgesFirmware = new ArrayList<>();
        }
        return this.acpiHostBridgesFirmware;
    }

    /**
     * Gets the value of the numCpuSimultaneousThreads property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumCpuSimultaneousThreads() {
        return numCpuSimultaneousThreads;
    }

    /**
     * Sets the value of the numCpuSimultaneousThreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumCpuSimultaneousThreads(IntOption value) {
        this.numCpuSimultaneousThreads = value;
    }

    /**
     * Gets the value of the numNumaNodes property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumNumaNodes() {
        return numNumaNodes;
    }

    /**
     * Sets the value of the numNumaNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumNumaNodes(IntOption value) {
        this.numNumaNodes = value;
    }

    /**
     * Gets the value of the numDeviceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumDeviceGroups() {
        return numDeviceGroups;
    }

    /**
     * Sets the value of the numDeviceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumDeviceGroups(IntOption value) {
        this.numDeviceGroups = value;
    }

    /**
     * Gets the value of the deviceGroupTypes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceGroupTypes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeviceGroupTypes().add(newItem);
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
     *     The value of the deviceGroupTypes property.
     */
    public List<String> getDeviceGroupTypes() {
        if (deviceGroupTypes == null) {
            deviceGroupTypes = new ArrayList<>();
        }
        return this.deviceGroupTypes;
    }

}
