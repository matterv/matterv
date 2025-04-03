
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigTarget complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConfigTarget">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="numCpus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numCpuCores" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numNumaNodes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxCpusPerHost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="smcPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="datastore" type="{urn:internalvim25}VirtualMachineDatastoreInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="network" type="{urn:internalvim25}VirtualMachineNetworkInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="opaqueNetwork" type="{urn:internalvim25}OpaqueNetworkTargetInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="distributedVirtualPortgroup" type="{urn:internalvim25}DistributedVirtualPortgroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="distributedVirtualSwitch" type="{urn:internalvim25}DistributedVirtualSwitchInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="cdRom" type="{urn:internalvim25}VirtualMachineCdromInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="serial" type="{urn:internalvim25}VirtualMachineSerialInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="parallel" type="{urn:internalvim25}VirtualMachineParallelInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sound" type="{urn:internalvim25}VirtualMachineSoundInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="usb" type="{urn:internalvim25}VirtualMachineUsbInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="floppy" type="{urn:internalvim25}VirtualMachineFloppyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="legacyNetworkInfo" type="{urn:internalvim25}VirtualMachineLegacyNetworkSwitchInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="scsiPassthrough" type="{urn:internalvim25}VirtualMachineScsiPassthroughInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="scsiDisk" type="{urn:internalvim25}VirtualMachineScsiDiskDeviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ideDisk" type="{urn:internalvim25}VirtualMachineIdeDiskDeviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxMemMBOptimalPerf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="supportedMaxMemMB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="resourcePool" type="{urn:internalvim25}ResourcePoolRuntimeInfo" minOccurs="0"/>
 *         <element name="autoVmotion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="pciPassthrough" type="{urn:internalvim25}VirtualMachinePciPassthroughInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sriov" type="{urn:internalvim25}VirtualMachineSriovInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vFlashModule" type="{urn:internalvim25}VirtualMachineVFlashModuleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sharedGpuPassthroughTypes" type="{urn:internalvim25}VirtualMachinePciSharedGpuPassthroughInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="availablePersistentMemoryReservationMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="dynamicPassthrough" type="{urn:internalvim25}VirtualMachineDynamicPassthroughInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sgxTargetInfo" type="{urn:internalvim25}VirtualMachineSgxTargetInfo" minOccurs="0"/>
 *         <element name="precisionClockInfo" type="{urn:internalvim25}VirtualMachinePrecisionClockInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sevSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vgpuDeviceInfo" type="{urn:internalvim25}VirtualMachineVgpuDeviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vgpuProfileInfo" type="{urn:internalvim25}VirtualMachineVgpuProfileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vendorDeviceGroupInfo" type="{urn:internalvim25}VirtualMachineVendorDeviceGroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxSimultaneousThreads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="dvxClassInfo" type="{urn:internalvim25}VirtualMachineDvxClassInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigTarget", propOrder = {
    "numCpus",
    "numCpuCores",
    "numNumaNodes",
    "maxCpusPerHost",
    "smcPresent",
    "datastore",
    "network",
    "opaqueNetwork",
    "distributedVirtualPortgroup",
    "distributedVirtualSwitch",
    "cdRom",
    "serial",
    "parallel",
    "sound",
    "usb",
    "floppy",
    "legacyNetworkInfo",
    "scsiPassthrough",
    "scsiDisk",
    "ideDisk",
    "maxMemMBOptimalPerf",
    "supportedMaxMemMB",
    "resourcePool",
    "autoVmotion",
    "pciPassthrough",
    "sriov",
    "vFlashModule",
    "sharedGpuPassthroughTypes",
    "availablePersistentMemoryReservationMB",
    "dynamicPassthrough",
    "sgxTargetInfo",
    "precisionClockInfo",
    "sevSupported",
    "vgpuDeviceInfo",
    "vgpuProfileInfo",
    "vendorDeviceGroupInfo",
    "maxSimultaneousThreads",
    "dvxClassInfo"
})
public class ConfigTarget
    extends DynamicData
{

    protected int numCpus;
    protected int numCpuCores;
    protected int numNumaNodes;
    protected Integer maxCpusPerHost;
    protected Boolean smcPresent;
    protected List<VirtualMachineDatastoreInfo> datastore;
    protected List<VirtualMachineNetworkInfo> network;
    protected List<OpaqueNetworkTargetInfo> opaqueNetwork;
    protected List<DistributedVirtualPortgroupInfo> distributedVirtualPortgroup;
    protected List<DistributedVirtualSwitchInfo> distributedVirtualSwitch;
    protected List<VirtualMachineCdromInfo> cdRom;
    protected List<VirtualMachineSerialInfo> serial;
    protected List<VirtualMachineParallelInfo> parallel;
    protected List<VirtualMachineSoundInfo> sound;
    protected List<VirtualMachineUsbInfo> usb;
    protected List<VirtualMachineFloppyInfo> floppy;
    protected List<VirtualMachineLegacyNetworkSwitchInfo> legacyNetworkInfo;
    protected List<VirtualMachineScsiPassthroughInfo> scsiPassthrough;
    protected List<VirtualMachineScsiDiskDeviceInfo> scsiDisk;
    protected List<VirtualMachineIdeDiskDeviceInfo> ideDisk;
    protected int maxMemMBOptimalPerf;
    protected Integer supportedMaxMemMB;
    protected ResourcePoolRuntimeInfo resourcePool;
    protected Boolean autoVmotion;
    protected List<VirtualMachinePciPassthroughInfo> pciPassthrough;
    protected List<VirtualMachineSriovInfo> sriov;
    protected List<VirtualMachineVFlashModuleInfo> vFlashModule;
    protected List<VirtualMachinePciSharedGpuPassthroughInfo> sharedGpuPassthroughTypes;
    protected Long availablePersistentMemoryReservationMB;
    protected List<VirtualMachineDynamicPassthroughInfo> dynamicPassthrough;
    protected VirtualMachineSgxTargetInfo sgxTargetInfo;
    protected List<VirtualMachinePrecisionClockInfo> precisionClockInfo;
    protected Boolean sevSupported;
    protected List<VirtualMachineVgpuDeviceInfo> vgpuDeviceInfo;
    protected List<VirtualMachineVgpuProfileInfo> vgpuProfileInfo;
    protected List<VirtualMachineVendorDeviceGroupInfo> vendorDeviceGroupInfo;
    protected Integer maxSimultaneousThreads;
    protected List<VirtualMachineDvxClassInfo> dvxClassInfo;

    /**
     * Gets the value of the numCpus property.
     * 
     */
    public int getNumCpus() {
        return numCpus;
    }

    /**
     * Sets the value of the numCpus property.
     * 
     */
    public void setNumCpus(int value) {
        this.numCpus = value;
    }

    /**
     * Gets the value of the numCpuCores property.
     * 
     */
    public int getNumCpuCores() {
        return numCpuCores;
    }

    /**
     * Sets the value of the numCpuCores property.
     * 
     */
    public void setNumCpuCores(int value) {
        this.numCpuCores = value;
    }

    /**
     * Gets the value of the numNumaNodes property.
     * 
     */
    public int getNumNumaNodes() {
        return numNumaNodes;
    }

    /**
     * Sets the value of the numNumaNodes property.
     * 
     */
    public void setNumNumaNodes(int value) {
        this.numNumaNodes = value;
    }

    /**
     * Gets the value of the maxCpusPerHost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCpusPerHost() {
        return maxCpusPerHost;
    }

    /**
     * Sets the value of the maxCpusPerHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCpusPerHost(Integer value) {
        this.maxCpusPerHost = value;
    }

    /**
     * Gets the value of the smcPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmcPresent() {
        return smcPresent;
    }

    /**
     * Sets the value of the smcPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmcPresent(Boolean value) {
        this.smcPresent = value;
    }

    /**
     * Gets the value of the datastore property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastore property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineDatastoreInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastore property.
     */
    public List<VirtualMachineDatastoreInfo> getDatastore() {
        if (datastore == null) {
            datastore = new ArrayList<>();
        }
        return this.datastore;
    }

    /**
     * Gets the value of the network property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the network property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineNetworkInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the network property.
     */
    public List<VirtualMachineNetworkInfo> getNetwork() {
        if (network == null) {
            network = new ArrayList<>();
        }
        return this.network;
    }

    /**
     * Gets the value of the opaqueNetwork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opaqueNetwork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOpaqueNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpaqueNetworkTargetInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the opaqueNetwork property.
     */
    public List<OpaqueNetworkTargetInfo> getOpaqueNetwork() {
        if (opaqueNetwork == null) {
            opaqueNetwork = new ArrayList<>();
        }
        return this.opaqueNetwork;
    }

    /**
     * Gets the value of the distributedVirtualPortgroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualPortgroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistributedVirtualPortgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualPortgroupInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the distributedVirtualPortgroup property.
     */
    public List<DistributedVirtualPortgroupInfo> getDistributedVirtualPortgroup() {
        if (distributedVirtualPortgroup == null) {
            distributedVirtualPortgroup = new ArrayList<>();
        }
        return this.distributedVirtualPortgroup;
    }

    /**
     * Gets the value of the distributedVirtualSwitch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualSwitch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistributedVirtualSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the distributedVirtualSwitch property.
     */
    public List<DistributedVirtualSwitchInfo> getDistributedVirtualSwitch() {
        if (distributedVirtualSwitch == null) {
            distributedVirtualSwitch = new ArrayList<>();
        }
        return this.distributedVirtualSwitch;
    }

    /**
     * Gets the value of the cdRom property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdRom property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCdRom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineCdromInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the cdRom property.
     */
    public List<VirtualMachineCdromInfo> getCdRom() {
        if (cdRom == null) {
            cdRom = new ArrayList<>();
        }
        return this.cdRom;
    }

    /**
     * Gets the value of the serial property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serial property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSerial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineSerialInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the serial property.
     */
    public List<VirtualMachineSerialInfo> getSerial() {
        if (serial == null) {
            serial = new ArrayList<>();
        }
        return this.serial;
    }

    /**
     * Gets the value of the parallel property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parallel property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParallel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineParallelInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the parallel property.
     */
    public List<VirtualMachineParallelInfo> getParallel() {
        if (parallel == null) {
            parallel = new ArrayList<>();
        }
        return this.parallel;
    }

    /**
     * Gets the value of the sound property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sound property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSound().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineSoundInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the sound property.
     */
    public List<VirtualMachineSoundInfo> getSound() {
        if (sound == null) {
            sound = new ArrayList<>();
        }
        return this.sound;
    }

    /**
     * Gets the value of the usb property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usb property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineUsbInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the usb property.
     */
    public List<VirtualMachineUsbInfo> getUsb() {
        if (usb == null) {
            usb = new ArrayList<>();
        }
        return this.usb;
    }

    /**
     * Gets the value of the floppy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floppy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFloppy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFloppyInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the floppy property.
     */
    public List<VirtualMachineFloppyInfo> getFloppy() {
        if (floppy == null) {
            floppy = new ArrayList<>();
        }
        return this.floppy;
    }

    /**
     * Gets the value of the legacyNetworkInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legacyNetworkInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLegacyNetworkInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineLegacyNetworkSwitchInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the legacyNetworkInfo property.
     */
    public List<VirtualMachineLegacyNetworkSwitchInfo> getLegacyNetworkInfo() {
        if (legacyNetworkInfo == null) {
            legacyNetworkInfo = new ArrayList<>();
        }
        return this.legacyNetworkInfo;
    }

    /**
     * Gets the value of the scsiPassthrough property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scsiPassthrough property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getScsiPassthrough().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineScsiPassthroughInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the scsiPassthrough property.
     */
    public List<VirtualMachineScsiPassthroughInfo> getScsiPassthrough() {
        if (scsiPassthrough == null) {
            scsiPassthrough = new ArrayList<>();
        }
        return this.scsiPassthrough;
    }

    /**
     * Gets the value of the scsiDisk property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scsiDisk property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getScsiDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineScsiDiskDeviceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the scsiDisk property.
     */
    public List<VirtualMachineScsiDiskDeviceInfo> getScsiDisk() {
        if (scsiDisk == null) {
            scsiDisk = new ArrayList<>();
        }
        return this.scsiDisk;
    }

    /**
     * Gets the value of the ideDisk property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ideDisk property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIdeDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineIdeDiskDeviceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the ideDisk property.
     */
    public List<VirtualMachineIdeDiskDeviceInfo> getIdeDisk() {
        if (ideDisk == null) {
            ideDisk = new ArrayList<>();
        }
        return this.ideDisk;
    }

    /**
     * Gets the value of the maxMemMBOptimalPerf property.
     * 
     */
    public int getMaxMemMBOptimalPerf() {
        return maxMemMBOptimalPerf;
    }

    /**
     * Sets the value of the maxMemMBOptimalPerf property.
     * 
     */
    public void setMaxMemMBOptimalPerf(int value) {
        this.maxMemMBOptimalPerf = value;
    }

    /**
     * Gets the value of the supportedMaxMemMB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupportedMaxMemMB() {
        return supportedMaxMemMB;
    }

    /**
     * Sets the value of the supportedMaxMemMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupportedMaxMemMB(Integer value) {
        this.supportedMaxMemMB = value;
    }

    /**
     * Gets the value of the resourcePool property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcePoolRuntimeInfo }
     *     
     */
    public ResourcePoolRuntimeInfo getResourcePool() {
        return resourcePool;
    }

    /**
     * Sets the value of the resourcePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcePoolRuntimeInfo }
     *     
     */
    public void setResourcePool(ResourcePoolRuntimeInfo value) {
        this.resourcePool = value;
    }

    /**
     * Gets the value of the autoVmotion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoVmotion() {
        return autoVmotion;
    }

    /**
     * Sets the value of the autoVmotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoVmotion(Boolean value) {
        this.autoVmotion = value;
    }

    /**
     * Gets the value of the pciPassthrough property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pciPassthrough property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPciPassthrough().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachinePciPassthroughInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the pciPassthrough property.
     */
    public List<VirtualMachinePciPassthroughInfo> getPciPassthrough() {
        if (pciPassthrough == null) {
            pciPassthrough = new ArrayList<>();
        }
        return this.pciPassthrough;
    }

    /**
     * Gets the value of the sriov property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sriov property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSriov().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineSriovInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the sriov property.
     */
    public List<VirtualMachineSriovInfo> getSriov() {
        if (sriov == null) {
            sriov = new ArrayList<>();
        }
        return this.sriov;
    }

    /**
     * Gets the value of the vFlashModule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vFlashModule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVFlashModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVFlashModuleInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vFlashModule property.
     */
    public List<VirtualMachineVFlashModuleInfo> getVFlashModule() {
        if (vFlashModule == null) {
            vFlashModule = new ArrayList<>();
        }
        return this.vFlashModule;
    }

    /**
     * Gets the value of the sharedGpuPassthroughTypes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedGpuPassthroughTypes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSharedGpuPassthroughTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachinePciSharedGpuPassthroughInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the sharedGpuPassthroughTypes property.
     */
    public List<VirtualMachinePciSharedGpuPassthroughInfo> getSharedGpuPassthroughTypes() {
        if (sharedGpuPassthroughTypes == null) {
            sharedGpuPassthroughTypes = new ArrayList<>();
        }
        return this.sharedGpuPassthroughTypes;
    }

    /**
     * Gets the value of the availablePersistentMemoryReservationMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailablePersistentMemoryReservationMB() {
        return availablePersistentMemoryReservationMB;
    }

    /**
     * Sets the value of the availablePersistentMemoryReservationMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailablePersistentMemoryReservationMB(Long value) {
        this.availablePersistentMemoryReservationMB = value;
    }

    /**
     * Gets the value of the dynamicPassthrough property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicPassthrough property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDynamicPassthrough().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineDynamicPassthroughInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the dynamicPassthrough property.
     */
    public List<VirtualMachineDynamicPassthroughInfo> getDynamicPassthrough() {
        if (dynamicPassthrough == null) {
            dynamicPassthrough = new ArrayList<>();
        }
        return this.dynamicPassthrough;
    }

    /**
     * Gets the value of the sgxTargetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineSgxTargetInfo }
     *     
     */
    public VirtualMachineSgxTargetInfo getSgxTargetInfo() {
        return sgxTargetInfo;
    }

    /**
     * Sets the value of the sgxTargetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineSgxTargetInfo }
     *     
     */
    public void setSgxTargetInfo(VirtualMachineSgxTargetInfo value) {
        this.sgxTargetInfo = value;
    }

    /**
     * Gets the value of the precisionClockInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precisionClockInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrecisionClockInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachinePrecisionClockInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the precisionClockInfo property.
     */
    public List<VirtualMachinePrecisionClockInfo> getPrecisionClockInfo() {
        if (precisionClockInfo == null) {
            precisionClockInfo = new ArrayList<>();
        }
        return this.precisionClockInfo;
    }

    /**
     * Gets the value of the sevSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSevSupported() {
        return sevSupported;
    }

    /**
     * Sets the value of the sevSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSevSupported(Boolean value) {
        this.sevSupported = value;
    }

    /**
     * Gets the value of the vgpuDeviceInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vgpuDeviceInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVgpuDeviceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVgpuDeviceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vgpuDeviceInfo property.
     */
    public List<VirtualMachineVgpuDeviceInfo> getVgpuDeviceInfo() {
        if (vgpuDeviceInfo == null) {
            vgpuDeviceInfo = new ArrayList<>();
        }
        return this.vgpuDeviceInfo;
    }

    /**
     * Gets the value of the vgpuProfileInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vgpuProfileInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVgpuProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVgpuProfileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vgpuProfileInfo property.
     */
    public List<VirtualMachineVgpuProfileInfo> getVgpuProfileInfo() {
        if (vgpuProfileInfo == null) {
            vgpuProfileInfo = new ArrayList<>();
        }
        return this.vgpuProfileInfo;
    }

    /**
     * Gets the value of the vendorDeviceGroupInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorDeviceGroupInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVendorDeviceGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVendorDeviceGroupInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vendorDeviceGroupInfo property.
     */
    public List<VirtualMachineVendorDeviceGroupInfo> getVendorDeviceGroupInfo() {
        if (vendorDeviceGroupInfo == null) {
            vendorDeviceGroupInfo = new ArrayList<>();
        }
        return this.vendorDeviceGroupInfo;
    }

    /**
     * Gets the value of the maxSimultaneousThreads property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSimultaneousThreads() {
        return maxSimultaneousThreads;
    }

    /**
     * Sets the value of the maxSimultaneousThreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSimultaneousThreads(Integer value) {
        this.maxSimultaneousThreads = value;
    }

    /**
     * Gets the value of the dvxClassInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvxClassInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDvxClassInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineDvxClassInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvxClassInfo property.
     */
    public List<VirtualMachineDvxClassInfo> getDvxClassInfo() {
        if (dvxClassInfo == null) {
            dvxClassInfo = new ArrayList<>();
        }
        return this.dvxClassInfo;
    }

}
