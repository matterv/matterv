
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestOsDescriptor complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestOsDescriptor">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="family" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="supportedMaxCPUs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numSupportedPhysicalSockets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numSupportedCoresPerSocket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="supportedMinMemMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="supportedMaxMemMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="recommendedMemMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="recommendedColorDepth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="supportedDiskControllerList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="recommendedSCSIController" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="recommendedDiskController" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="supportedNumDisks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="recommendedDiskSizeMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="recommendedCdromController" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="supportedEthernetCard" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="recommendedEthernetCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="supportsSlaveDisk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="cpuFeatureMask" type="{urn:internalvim25}HostCpuIdInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="smcRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportsWakeOnLan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="supportsVMI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportsMemoryHotAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportsCpuHotAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportsCpuHotRemove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportedFirmware" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="recommendedFirmware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="supportedUSBControllerList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="recommendedUSBController" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="supports3D" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="recommended3D" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="smcRecommended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ich7mRecommended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="usbRecommended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="supportedForCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vRAMSizeInKB" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numSupportedFloppyDevices" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="wakeOnLanEthernetCard" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="supportsPvscsiControllerForBoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="diskUuidEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportsHotPlugPCI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportsSecureBoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="defaultSecureBoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="persistentMemorySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportedMinPersistentMemoryMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="supportedMaxPersistentMemoryMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="recommendedPersistentMemoryMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="persistentMemoryHotAddSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="persistentMemoryHotRemoveSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="persistentMemoryColdGrowthSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="persistentMemoryColdGrowthGranularityMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="persistentMemoryHotGrowthSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="persistentMemoryHotGrowthGranularityMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="numRecommendedPhysicalSockets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numRecommendedCoresPerSocket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="vvtdSupported" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="vbsSupported" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="vsgxSupported" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="vsgxRemoteAttestationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="supportsTPM20" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="recommendedTPM20" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vwdtSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestOsDescriptor", propOrder = {
    "id",
    "family",
    "fullName",
    "supportedMaxCPUs",
    "numSupportedPhysicalSockets",
    "numSupportedCoresPerSocket",
    "supportedMinMemMB",
    "supportedMaxMemMB",
    "recommendedMemMB",
    "recommendedColorDepth",
    "supportedDiskControllerList",
    "recommendedSCSIController",
    "recommendedDiskController",
    "supportedNumDisks",
    "recommendedDiskSizeMB",
    "recommendedCdromController",
    "supportedEthernetCard",
    "recommendedEthernetCard",
    "supportsSlaveDisk",
    "cpuFeatureMask",
    "smcRequired",
    "supportsWakeOnLan",
    "supportsVMI",
    "supportsMemoryHotAdd",
    "supportsCpuHotAdd",
    "supportsCpuHotRemove",
    "supportedFirmware",
    "recommendedFirmware",
    "supportedUSBControllerList",
    "recommendedUSBController",
    "supports3D",
    "recommended3D",
    "smcRecommended",
    "ich7MRecommended",
    "usbRecommended",
    "supportLevel",
    "supportedForCreate",
    "vramSizeInKB",
    "numSupportedFloppyDevices",
    "wakeOnLanEthernetCard",
    "supportsPvscsiControllerForBoot",
    "diskUuidEnabled",
    "supportsHotPlugPCI",
    "supportsSecureBoot",
    "defaultSecureBoot",
    "persistentMemorySupported",
    "supportedMinPersistentMemoryMB",
    "supportedMaxPersistentMemoryMB",
    "recommendedPersistentMemoryMB",
    "persistentMemoryHotAddSupported",
    "persistentMemoryHotRemoveSupported",
    "persistentMemoryColdGrowthSupported",
    "persistentMemoryColdGrowthGranularityMB",
    "persistentMemoryHotGrowthSupported",
    "persistentMemoryHotGrowthGranularityMB",
    "numRecommendedPhysicalSockets",
    "numRecommendedCoresPerSocket",
    "vvtdSupported",
    "vbsSupported",
    "vsgxSupported",
    "vsgxRemoteAttestationSupported",
    "supportsTPM20",
    "recommendedTPM20",
    "vwdtSupported"
})
public class GuestOsDescriptor
    extends DynamicData
{

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String family;
    @XmlElement(required = true)
    protected String fullName;
    protected int supportedMaxCPUs;
    protected Integer numSupportedPhysicalSockets;
    protected Integer numSupportedCoresPerSocket;
    protected int supportedMinMemMB;
    protected int supportedMaxMemMB;
    protected int recommendedMemMB;
    protected int recommendedColorDepth;
    @XmlElement(required = true)
    protected List<String> supportedDiskControllerList;
    protected String recommendedSCSIController;
    @XmlElement(required = true)
    protected String recommendedDiskController;
    protected int supportedNumDisks;
    protected int recommendedDiskSizeMB;
    protected String recommendedCdromController;
    @XmlElement(required = true)
    protected List<String> supportedEthernetCard;
    protected String recommendedEthernetCard;
    protected Boolean supportsSlaveDisk;
    protected List<HostCpuIdInfo> cpuFeatureMask;
    protected Boolean smcRequired;
    protected boolean supportsWakeOnLan;
    protected Boolean supportsVMI;
    protected Boolean supportsMemoryHotAdd;
    protected Boolean supportsCpuHotAdd;
    protected Boolean supportsCpuHotRemove;
    protected List<String> supportedFirmware;
    protected String recommendedFirmware;
    protected List<String> supportedUSBControllerList;
    protected String recommendedUSBController;
    protected Boolean supports3D;
    protected Boolean recommended3D;
    protected Boolean smcRecommended;
    @XmlElement(name = "ich7mRecommended")
    protected Boolean ich7MRecommended;
    protected Boolean usbRecommended;
    protected String supportLevel;
    protected Boolean supportedForCreate;
    @XmlElement(name = "vRAMSizeInKB")
    protected IntOption vramSizeInKB;
    protected Integer numSupportedFloppyDevices;
    protected List<String> wakeOnLanEthernetCard;
    protected Boolean supportsPvscsiControllerForBoot;
    protected Boolean diskUuidEnabled;
    protected Boolean supportsHotPlugPCI;
    protected Boolean supportsSecureBoot;
    protected Boolean defaultSecureBoot;
    protected Boolean persistentMemorySupported;
    protected Long supportedMinPersistentMemoryMB;
    protected Long supportedMaxPersistentMemoryMB;
    protected Long recommendedPersistentMemoryMB;
    protected Boolean persistentMemoryHotAddSupported;
    protected Boolean persistentMemoryHotRemoveSupported;
    protected Boolean persistentMemoryColdGrowthSupported;
    protected Long persistentMemoryColdGrowthGranularityMB;
    protected Boolean persistentMemoryHotGrowthSupported;
    protected Long persistentMemoryHotGrowthGranularityMB;
    protected Integer numRecommendedPhysicalSockets;
    protected Integer numRecommendedCoresPerSocket;
    protected BoolOption vvtdSupported;
    protected BoolOption vbsSupported;
    protected BoolOption vsgxSupported;
    protected Boolean vsgxRemoteAttestationSupported;
    protected Boolean supportsTPM20;
    protected Boolean recommendedTPM20;
    protected Boolean vwdtSupported;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the supportedMaxCPUs property.
     * 
     */
    public int getSupportedMaxCPUs() {
        return supportedMaxCPUs;
    }

    /**
     * Sets the value of the supportedMaxCPUs property.
     * 
     */
    public void setSupportedMaxCPUs(int value) {
        this.supportedMaxCPUs = value;
    }

    /**
     * Gets the value of the numSupportedPhysicalSockets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSupportedPhysicalSockets() {
        return numSupportedPhysicalSockets;
    }

    /**
     * Sets the value of the numSupportedPhysicalSockets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSupportedPhysicalSockets(Integer value) {
        this.numSupportedPhysicalSockets = value;
    }

    /**
     * Gets the value of the numSupportedCoresPerSocket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSupportedCoresPerSocket() {
        return numSupportedCoresPerSocket;
    }

    /**
     * Sets the value of the numSupportedCoresPerSocket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSupportedCoresPerSocket(Integer value) {
        this.numSupportedCoresPerSocket = value;
    }

    /**
     * Gets the value of the supportedMinMemMB property.
     * 
     */
    public int getSupportedMinMemMB() {
        return supportedMinMemMB;
    }

    /**
     * Sets the value of the supportedMinMemMB property.
     * 
     */
    public void setSupportedMinMemMB(int value) {
        this.supportedMinMemMB = value;
    }

    /**
     * Gets the value of the supportedMaxMemMB property.
     * 
     */
    public int getSupportedMaxMemMB() {
        return supportedMaxMemMB;
    }

    /**
     * Sets the value of the supportedMaxMemMB property.
     * 
     */
    public void setSupportedMaxMemMB(int value) {
        this.supportedMaxMemMB = value;
    }

    /**
     * Gets the value of the recommendedMemMB property.
     * 
     */
    public int getRecommendedMemMB() {
        return recommendedMemMB;
    }

    /**
     * Sets the value of the recommendedMemMB property.
     * 
     */
    public void setRecommendedMemMB(int value) {
        this.recommendedMemMB = value;
    }

    /**
     * Gets the value of the recommendedColorDepth property.
     * 
     */
    public int getRecommendedColorDepth() {
        return recommendedColorDepth;
    }

    /**
     * Sets the value of the recommendedColorDepth property.
     * 
     */
    public void setRecommendedColorDepth(int value) {
        this.recommendedColorDepth = value;
    }

    /**
     * Gets the value of the supportedDiskControllerList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedDiskControllerList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedDiskControllerList().add(newItem);
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
     *     The value of the supportedDiskControllerList property.
     */
    public List<String> getSupportedDiskControllerList() {
        if (supportedDiskControllerList == null) {
            supportedDiskControllerList = new ArrayList<>();
        }
        return this.supportedDiskControllerList;
    }

    /**
     * Gets the value of the recommendedSCSIController property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedSCSIController() {
        return recommendedSCSIController;
    }

    /**
     * Sets the value of the recommendedSCSIController property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedSCSIController(String value) {
        this.recommendedSCSIController = value;
    }

    /**
     * Gets the value of the recommendedDiskController property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedDiskController() {
        return recommendedDiskController;
    }

    /**
     * Sets the value of the recommendedDiskController property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedDiskController(String value) {
        this.recommendedDiskController = value;
    }

    /**
     * Gets the value of the supportedNumDisks property.
     * 
     */
    public int getSupportedNumDisks() {
        return supportedNumDisks;
    }

    /**
     * Sets the value of the supportedNumDisks property.
     * 
     */
    public void setSupportedNumDisks(int value) {
        this.supportedNumDisks = value;
    }

    /**
     * Gets the value of the recommendedDiskSizeMB property.
     * 
     */
    public int getRecommendedDiskSizeMB() {
        return recommendedDiskSizeMB;
    }

    /**
     * Sets the value of the recommendedDiskSizeMB property.
     * 
     */
    public void setRecommendedDiskSizeMB(int value) {
        this.recommendedDiskSizeMB = value;
    }

    /**
     * Gets the value of the recommendedCdromController property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedCdromController() {
        return recommendedCdromController;
    }

    /**
     * Sets the value of the recommendedCdromController property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedCdromController(String value) {
        this.recommendedCdromController = value;
    }

    /**
     * Gets the value of the supportedEthernetCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEthernetCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedEthernetCard().add(newItem);
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
     *     The value of the supportedEthernetCard property.
     */
    public List<String> getSupportedEthernetCard() {
        if (supportedEthernetCard == null) {
            supportedEthernetCard = new ArrayList<>();
        }
        return this.supportedEthernetCard;
    }

    /**
     * Gets the value of the recommendedEthernetCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedEthernetCard() {
        return recommendedEthernetCard;
    }

    /**
     * Sets the value of the recommendedEthernetCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedEthernetCard(String value) {
        this.recommendedEthernetCard = value;
    }

    /**
     * Gets the value of the supportsSlaveDisk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsSlaveDisk() {
        return supportsSlaveDisk;
    }

    /**
     * Sets the value of the supportsSlaveDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsSlaveDisk(Boolean value) {
        this.supportsSlaveDisk = value;
    }

    /**
     * Gets the value of the cpuFeatureMask property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuFeatureMask property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCpuFeatureMask().add(newItem);
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
     *     The value of the cpuFeatureMask property.
     */
    public List<HostCpuIdInfo> getCpuFeatureMask() {
        if (cpuFeatureMask == null) {
            cpuFeatureMask = new ArrayList<>();
        }
        return this.cpuFeatureMask;
    }

    /**
     * Gets the value of the smcRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmcRequired() {
        return smcRequired;
    }

    /**
     * Sets the value of the smcRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmcRequired(Boolean value) {
        this.smcRequired = value;
    }

    /**
     * Gets the value of the supportsWakeOnLan property.
     * 
     */
    public boolean isSupportsWakeOnLan() {
        return supportsWakeOnLan;
    }

    /**
     * Sets the value of the supportsWakeOnLan property.
     * 
     */
    public void setSupportsWakeOnLan(boolean value) {
        this.supportsWakeOnLan = value;
    }

    /**
     * Gets the value of the supportsVMI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsVMI() {
        return supportsVMI;
    }

    /**
     * Sets the value of the supportsVMI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsVMI(Boolean value) {
        this.supportsVMI = value;
    }

    /**
     * Gets the value of the supportsMemoryHotAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsMemoryHotAdd() {
        return supportsMemoryHotAdd;
    }

    /**
     * Sets the value of the supportsMemoryHotAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsMemoryHotAdd(Boolean value) {
        this.supportsMemoryHotAdd = value;
    }

    /**
     * Gets the value of the supportsCpuHotAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsCpuHotAdd() {
        return supportsCpuHotAdd;
    }

    /**
     * Sets the value of the supportsCpuHotAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsCpuHotAdd(Boolean value) {
        this.supportsCpuHotAdd = value;
    }

    /**
     * Gets the value of the supportsCpuHotRemove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsCpuHotRemove() {
        return supportsCpuHotRemove;
    }

    /**
     * Sets the value of the supportsCpuHotRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsCpuHotRemove(Boolean value) {
        this.supportsCpuHotRemove = value;
    }

    /**
     * Gets the value of the supportedFirmware property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedFirmware property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedFirmware().add(newItem);
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
     *     The value of the supportedFirmware property.
     */
    public List<String> getSupportedFirmware() {
        if (supportedFirmware == null) {
            supportedFirmware = new ArrayList<>();
        }
        return this.supportedFirmware;
    }

    /**
     * Gets the value of the recommendedFirmware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedFirmware() {
        return recommendedFirmware;
    }

    /**
     * Sets the value of the recommendedFirmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedFirmware(String value) {
        this.recommendedFirmware = value;
    }

    /**
     * Gets the value of the supportedUSBControllerList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedUSBControllerList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedUSBControllerList().add(newItem);
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
     *     The value of the supportedUSBControllerList property.
     */
    public List<String> getSupportedUSBControllerList() {
        if (supportedUSBControllerList == null) {
            supportedUSBControllerList = new ArrayList<>();
        }
        return this.supportedUSBControllerList;
    }

    /**
     * Gets the value of the recommendedUSBController property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedUSBController() {
        return recommendedUSBController;
    }

    /**
     * Sets the value of the recommendedUSBController property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedUSBController(String value) {
        this.recommendedUSBController = value;
    }

    /**
     * Gets the value of the supports3D property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupports3D() {
        return supports3D;
    }

    /**
     * Sets the value of the supports3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupports3D(Boolean value) {
        this.supports3D = value;
    }

    /**
     * Gets the value of the recommended3D property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecommended3D() {
        return recommended3D;
    }

    /**
     * Sets the value of the recommended3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecommended3D(Boolean value) {
        this.recommended3D = value;
    }

    /**
     * Gets the value of the smcRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmcRecommended() {
        return smcRecommended;
    }

    /**
     * Sets the value of the smcRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmcRecommended(Boolean value) {
        this.smcRecommended = value;
    }

    /**
     * Gets the value of the ich7MRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIch7MRecommended() {
        return ich7MRecommended;
    }

    /**
     * Sets the value of the ich7MRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIch7MRecommended(Boolean value) {
        this.ich7MRecommended = value;
    }

    /**
     * Gets the value of the usbRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsbRecommended() {
        return usbRecommended;
    }

    /**
     * Sets the value of the usbRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsbRecommended(Boolean value) {
        this.usbRecommended = value;
    }

    /**
     * Gets the value of the supportLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportLevel() {
        return supportLevel;
    }

    /**
     * Sets the value of the supportLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportLevel(String value) {
        this.supportLevel = value;
    }

    /**
     * Gets the value of the supportedForCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportedForCreate() {
        return supportedForCreate;
    }

    /**
     * Sets the value of the supportedForCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportedForCreate(Boolean value) {
        this.supportedForCreate = value;
    }

    /**
     * Gets the value of the vramSizeInKB property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getVRAMSizeInKB() {
        return vramSizeInKB;
    }

    /**
     * Sets the value of the vramSizeInKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setVRAMSizeInKB(IntOption value) {
        this.vramSizeInKB = value;
    }

    /**
     * Gets the value of the numSupportedFloppyDevices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSupportedFloppyDevices() {
        return numSupportedFloppyDevices;
    }

    /**
     * Sets the value of the numSupportedFloppyDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSupportedFloppyDevices(Integer value) {
        this.numSupportedFloppyDevices = value;
    }

    /**
     * Gets the value of the wakeOnLanEthernetCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wakeOnLanEthernetCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWakeOnLanEthernetCard().add(newItem);
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
     *     The value of the wakeOnLanEthernetCard property.
     */
    public List<String> getWakeOnLanEthernetCard() {
        if (wakeOnLanEthernetCard == null) {
            wakeOnLanEthernetCard = new ArrayList<>();
        }
        return this.wakeOnLanEthernetCard;
    }

    /**
     * Gets the value of the supportsPvscsiControllerForBoot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsPvscsiControllerForBoot() {
        return supportsPvscsiControllerForBoot;
    }

    /**
     * Sets the value of the supportsPvscsiControllerForBoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsPvscsiControllerForBoot(Boolean value) {
        this.supportsPvscsiControllerForBoot = value;
    }

    /**
     * Gets the value of the diskUuidEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiskUuidEnabled() {
        return diskUuidEnabled;
    }

    /**
     * Sets the value of the diskUuidEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiskUuidEnabled(Boolean value) {
        this.diskUuidEnabled = value;
    }

    /**
     * Gets the value of the supportsHotPlugPCI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsHotPlugPCI() {
        return supportsHotPlugPCI;
    }

    /**
     * Sets the value of the supportsHotPlugPCI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsHotPlugPCI(Boolean value) {
        this.supportsHotPlugPCI = value;
    }

    /**
     * Gets the value of the supportsSecureBoot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsSecureBoot() {
        return supportsSecureBoot;
    }

    /**
     * Sets the value of the supportsSecureBoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsSecureBoot(Boolean value) {
        this.supportsSecureBoot = value;
    }

    /**
     * Gets the value of the defaultSecureBoot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultSecureBoot() {
        return defaultSecureBoot;
    }

    /**
     * Sets the value of the defaultSecureBoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultSecureBoot(Boolean value) {
        this.defaultSecureBoot = value;
    }

    /**
     * Gets the value of the persistentMemorySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersistentMemorySupported() {
        return persistentMemorySupported;
    }

    /**
     * Sets the value of the persistentMemorySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistentMemorySupported(Boolean value) {
        this.persistentMemorySupported = value;
    }

    /**
     * Gets the value of the supportedMinPersistentMemoryMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupportedMinPersistentMemoryMB() {
        return supportedMinPersistentMemoryMB;
    }

    /**
     * Sets the value of the supportedMinPersistentMemoryMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupportedMinPersistentMemoryMB(Long value) {
        this.supportedMinPersistentMemoryMB = value;
    }

    /**
     * Gets the value of the supportedMaxPersistentMemoryMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupportedMaxPersistentMemoryMB() {
        return supportedMaxPersistentMemoryMB;
    }

    /**
     * Sets the value of the supportedMaxPersistentMemoryMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupportedMaxPersistentMemoryMB(Long value) {
        this.supportedMaxPersistentMemoryMB = value;
    }

    /**
     * Gets the value of the recommendedPersistentMemoryMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecommendedPersistentMemoryMB() {
        return recommendedPersistentMemoryMB;
    }

    /**
     * Sets the value of the recommendedPersistentMemoryMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecommendedPersistentMemoryMB(Long value) {
        this.recommendedPersistentMemoryMB = value;
    }

    /**
     * Gets the value of the persistentMemoryHotAddSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersistentMemoryHotAddSupported() {
        return persistentMemoryHotAddSupported;
    }

    /**
     * Sets the value of the persistentMemoryHotAddSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistentMemoryHotAddSupported(Boolean value) {
        this.persistentMemoryHotAddSupported = value;
    }

    /**
     * Gets the value of the persistentMemoryHotRemoveSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersistentMemoryHotRemoveSupported() {
        return persistentMemoryHotRemoveSupported;
    }

    /**
     * Sets the value of the persistentMemoryHotRemoveSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistentMemoryHotRemoveSupported(Boolean value) {
        this.persistentMemoryHotRemoveSupported = value;
    }

    /**
     * Gets the value of the persistentMemoryColdGrowthSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersistentMemoryColdGrowthSupported() {
        return persistentMemoryColdGrowthSupported;
    }

    /**
     * Sets the value of the persistentMemoryColdGrowthSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistentMemoryColdGrowthSupported(Boolean value) {
        this.persistentMemoryColdGrowthSupported = value;
    }

    /**
     * Gets the value of the persistentMemoryColdGrowthGranularityMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersistentMemoryColdGrowthGranularityMB() {
        return persistentMemoryColdGrowthGranularityMB;
    }

    /**
     * Sets the value of the persistentMemoryColdGrowthGranularityMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersistentMemoryColdGrowthGranularityMB(Long value) {
        this.persistentMemoryColdGrowthGranularityMB = value;
    }

    /**
     * Gets the value of the persistentMemoryHotGrowthSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersistentMemoryHotGrowthSupported() {
        return persistentMemoryHotGrowthSupported;
    }

    /**
     * Sets the value of the persistentMemoryHotGrowthSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersistentMemoryHotGrowthSupported(Boolean value) {
        this.persistentMemoryHotGrowthSupported = value;
    }

    /**
     * Gets the value of the persistentMemoryHotGrowthGranularityMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersistentMemoryHotGrowthGranularityMB() {
        return persistentMemoryHotGrowthGranularityMB;
    }

    /**
     * Sets the value of the persistentMemoryHotGrowthGranularityMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersistentMemoryHotGrowthGranularityMB(Long value) {
        this.persistentMemoryHotGrowthGranularityMB = value;
    }

    /**
     * Gets the value of the numRecommendedPhysicalSockets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRecommendedPhysicalSockets() {
        return numRecommendedPhysicalSockets;
    }

    /**
     * Sets the value of the numRecommendedPhysicalSockets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRecommendedPhysicalSockets(Integer value) {
        this.numRecommendedPhysicalSockets = value;
    }

    /**
     * Gets the value of the numRecommendedCoresPerSocket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRecommendedCoresPerSocket() {
        return numRecommendedCoresPerSocket;
    }

    /**
     * Sets the value of the numRecommendedCoresPerSocket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRecommendedCoresPerSocket(Integer value) {
        this.numRecommendedCoresPerSocket = value;
    }

    /**
     * Gets the value of the vvtdSupported property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getVvtdSupported() {
        return vvtdSupported;
    }

    /**
     * Sets the value of the vvtdSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setVvtdSupported(BoolOption value) {
        this.vvtdSupported = value;
    }

    /**
     * Gets the value of the vbsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getVbsSupported() {
        return vbsSupported;
    }

    /**
     * Sets the value of the vbsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setVbsSupported(BoolOption value) {
        this.vbsSupported = value;
    }

    /**
     * Gets the value of the vsgxSupported property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getVsgxSupported() {
        return vsgxSupported;
    }

    /**
     * Sets the value of the vsgxSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setVsgxSupported(BoolOption value) {
        this.vsgxSupported = value;
    }

    /**
     * Gets the value of the vsgxRemoteAttestationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsgxRemoteAttestationSupported() {
        return vsgxRemoteAttestationSupported;
    }

    /**
     * Sets the value of the vsgxRemoteAttestationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsgxRemoteAttestationSupported(Boolean value) {
        this.vsgxRemoteAttestationSupported = value;
    }

    /**
     * Gets the value of the supportsTPM20 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsTPM20() {
        return supportsTPM20;
    }

    /**
     * Sets the value of the supportsTPM20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsTPM20(Boolean value) {
        this.supportsTPM20 = value;
    }

    /**
     * Gets the value of the recommendedTPM20 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecommendedTPM20() {
        return recommendedTPM20;
    }

    /**
     * Sets the value of the recommendedTPM20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecommendedTPM20(Boolean value) {
        this.recommendedTPM20 = value;
    }

    /**
     * Gets the value of the vwdtSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVwdtSupported() {
        return vwdtSupported;
    }

    /**
     * Sets the value of the vwdtSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVwdtSupported(Boolean value) {
        this.vwdtSupported = value;
    }

}
