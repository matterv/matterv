
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostHardwareInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostHardwareInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="systemInfo" type="{urn:internalvim25}HostSystemInfo"/>
 *         <element name="cpuPowerManagementInfo" type="{urn:internalvim25}HostCpuPowerManagementInfo" minOccurs="0"/>
 *         <element name="cpuInfo" type="{urn:internalvim25}HostCpuInfo"/>
 *         <element name="cpuPkg" type="{urn:internalvim25}HostCpuPackage" maxOccurs="unbounded"/>
 *         <element name="memorySize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="numaInfo" type="{urn:internalvim25}HostNumaInfo" minOccurs="0"/>
 *         <element name="smcPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="pciDevice" type="{urn:internalvim25}HostPciDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dvxClasses" type="{urn:internalvim25}HostDvxClass" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="cpuFeature" type="{urn:internalvim25}HostCpuIdInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="biosInfo" type="{urn:internalvim25}HostBIOSInfo" minOccurs="0"/>
 *         <element name="reliableMemoryInfo" type="{urn:internalvim25}HostReliableMemoryInfo" minOccurs="0"/>
 *         <element name="persistentMemoryInfo" type="{urn:internalvim25}HostPersistentMemoryInfo" minOccurs="0"/>
 *         <element name="sgxInfo" type="{urn:internalvim25}HostSgxInfo" minOccurs="0"/>
 *         <element name="sevInfo" type="{urn:internalvim25}HostSevInfo" minOccurs="0"/>
 *         <element name="memoryTieringType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="memoryTierInfo" type="{urn:internalvim25}HostMemoryTierInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHardwareInfo", propOrder = {
    "systemInfo",
    "cpuPowerManagementInfo",
    "cpuInfo",
    "cpuPkg",
    "memorySize",
    "numaInfo",
    "smcPresent",
    "pciDevice",
    "dvxClasses",
    "cpuFeature",
    "biosInfo",
    "reliableMemoryInfo",
    "persistentMemoryInfo",
    "sgxInfo",
    "sevInfo",
    "memoryTieringType",
    "memoryTierInfo"
})
public class HostHardwareInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostSystemInfo systemInfo;
    protected HostCpuPowerManagementInfo cpuPowerManagementInfo;
    @XmlElement(required = true)
    protected HostCpuInfo cpuInfo;
    @XmlElement(required = true)
    protected List<HostCpuPackage> cpuPkg;
    protected long memorySize;
    protected HostNumaInfo numaInfo;
    protected Boolean smcPresent;
    protected List<HostPciDevice> pciDevice;
    protected List<HostDvxClass> dvxClasses;
    protected List<HostCpuIdInfo> cpuFeature;
    protected HostBIOSInfo biosInfo;
    protected HostReliableMemoryInfo reliableMemoryInfo;
    protected HostPersistentMemoryInfo persistentMemoryInfo;
    protected HostSgxInfo sgxInfo;
    protected HostSevInfo sevInfo;
    protected String memoryTieringType;
    protected List<HostMemoryTierInfo> memoryTierInfo;

    /**
     * Gets the value of the systemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemInfo }
     *     
     */
    public HostSystemInfo getSystemInfo() {
        return systemInfo;
    }

    /**
     * Sets the value of the systemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemInfo }
     *     
     */
    public void setSystemInfo(HostSystemInfo value) {
        this.systemInfo = value;
    }

    /**
     * Gets the value of the cpuPowerManagementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostCpuPowerManagementInfo }
     *     
     */
    public HostCpuPowerManagementInfo getCpuPowerManagementInfo() {
        return cpuPowerManagementInfo;
    }

    /**
     * Sets the value of the cpuPowerManagementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostCpuPowerManagementInfo }
     *     
     */
    public void setCpuPowerManagementInfo(HostCpuPowerManagementInfo value) {
        this.cpuPowerManagementInfo = value;
    }

    /**
     * Gets the value of the cpuInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostCpuInfo }
     *     
     */
    public HostCpuInfo getCpuInfo() {
        return cpuInfo;
    }

    /**
     * Sets the value of the cpuInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostCpuInfo }
     *     
     */
    public void setCpuInfo(HostCpuInfo value) {
        this.cpuInfo = value;
    }

    /**
     * Gets the value of the cpuPkg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuPkg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCpuPkg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostCpuPackage }
     * </p>
     * 
     * 
     * @return
     *     The value of the cpuPkg property.
     */
    public List<HostCpuPackage> getCpuPkg() {
        if (cpuPkg == null) {
            cpuPkg = new ArrayList<>();
        }
        return this.cpuPkg;
    }

    /**
     * Gets the value of the memorySize property.
     * 
     */
    public long getMemorySize() {
        return memorySize;
    }

    /**
     * Sets the value of the memorySize property.
     * 
     */
    public void setMemorySize(long value) {
        this.memorySize = value;
    }

    /**
     * Gets the value of the numaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostNumaInfo }
     *     
     */
    public HostNumaInfo getNumaInfo() {
        return numaInfo;
    }

    /**
     * Sets the value of the numaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNumaInfo }
     *     
     */
    public void setNumaInfo(HostNumaInfo value) {
        this.numaInfo = value;
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
     * Gets the value of the pciDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pciDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPciDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPciDevice }
     * </p>
     * 
     * 
     * @return
     *     The value of the pciDevice property.
     */
    public List<HostPciDevice> getPciDevice() {
        if (pciDevice == null) {
            pciDevice = new ArrayList<>();
        }
        return this.pciDevice;
    }

    /**
     * Gets the value of the dvxClasses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvxClasses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDvxClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostDvxClass }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvxClasses property.
     */
    public List<HostDvxClass> getDvxClasses() {
        if (dvxClasses == null) {
            dvxClasses = new ArrayList<>();
        }
        return this.dvxClasses;
    }

    /**
     * Gets the value of the cpuFeature property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuFeature property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCpuFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostCpuIdInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the cpuFeature property.
     */
    public List<HostCpuIdInfo> getCpuFeature() {
        if (cpuFeature == null) {
            cpuFeature = new ArrayList<>();
        }
        return this.cpuFeature;
    }

    /**
     * Gets the value of the biosInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostBIOSInfo }
     *     
     */
    public HostBIOSInfo getBiosInfo() {
        return biosInfo;
    }

    /**
     * Sets the value of the biosInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostBIOSInfo }
     *     
     */
    public void setBiosInfo(HostBIOSInfo value) {
        this.biosInfo = value;
    }

    /**
     * Gets the value of the reliableMemoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostReliableMemoryInfo }
     *     
     */
    public HostReliableMemoryInfo getReliableMemoryInfo() {
        return reliableMemoryInfo;
    }

    /**
     * Sets the value of the reliableMemoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostReliableMemoryInfo }
     *     
     */
    public void setReliableMemoryInfo(HostReliableMemoryInfo value) {
        this.reliableMemoryInfo = value;
    }

    /**
     * Gets the value of the persistentMemoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostPersistentMemoryInfo }
     *     
     */
    public HostPersistentMemoryInfo getPersistentMemoryInfo() {
        return persistentMemoryInfo;
    }

    /**
     * Sets the value of the persistentMemoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPersistentMemoryInfo }
     *     
     */
    public void setPersistentMemoryInfo(HostPersistentMemoryInfo value) {
        this.persistentMemoryInfo = value;
    }

    /**
     * Gets the value of the sgxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostSgxInfo }
     *     
     */
    public HostSgxInfo getSgxInfo() {
        return sgxInfo;
    }

    /**
     * Sets the value of the sgxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSgxInfo }
     *     
     */
    public void setSgxInfo(HostSgxInfo value) {
        this.sgxInfo = value;
    }

    /**
     * Gets the value of the sevInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostSevInfo }
     *     
     */
    public HostSevInfo getSevInfo() {
        return sevInfo;
    }

    /**
     * Sets the value of the sevInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSevInfo }
     *     
     */
    public void setSevInfo(HostSevInfo value) {
        this.sevInfo = value;
    }

    /**
     * Gets the value of the memoryTieringType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryTieringType() {
        return memoryTieringType;
    }

    /**
     * Sets the value of the memoryTieringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryTieringType(String value) {
        this.memoryTieringType = value;
    }

    /**
     * Gets the value of the memoryTierInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memoryTierInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMemoryTierInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostMemoryTierInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the memoryTierInfo property.
     */
    public List<HostMemoryTierInfo> getMemoryTierInfo() {
        if (memoryTierInfo == null) {
            memoryTierInfo = new ArrayList<>();
        }
        return this.memoryTierInfo;
    }

}
