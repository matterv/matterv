
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalNic complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PhysicalNic">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pci" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="driver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="driverVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="firmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="linkSpeed" type="{urn:internalvim25}PhysicalNicLinkInfo" minOccurs="0"/>
 *         <element name="validLinkSpecification" type="{urn:internalvim25}PhysicalNicLinkInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="spec" type="{urn:internalvim25}PhysicalNicSpec"/>
 *         <element name="wakeOnLanSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fcoeConfiguration" type="{urn:internalvim25}FcoeConfig" minOccurs="0"/>
 *         <element name="vmDirectPathGen2Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmDirectPathGen2SupportedMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="resourcePoolSchedulerAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="resourcePoolSchedulerDisallowedReason" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="autoNegotiateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="enhancedNetworkingStackSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ensInterruptSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rdmaDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dpuId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNic", propOrder = {
    "key",
    "device",
    "pci",
    "driver",
    "driverVersion",
    "firmwareVersion",
    "linkSpeed",
    "validLinkSpecification",
    "spec",
    "wakeOnLanSupported",
    "mac",
    "fcoeConfiguration",
    "vmDirectPathGen2Supported",
    "vmDirectPathGen2SupportedMode",
    "resourcePoolSchedulerAllowed",
    "resourcePoolSchedulerDisallowedReason",
    "autoNegotiateSupported",
    "enhancedNetworkingStackSupported",
    "ensInterruptSupported",
    "rdmaDevice",
    "dpuId"
})
public class PhysicalNic
    extends DynamicData
{

    protected String key;
    @XmlElement(required = true)
    protected String device;
    @XmlElement(required = true)
    protected String pci;
    protected String driver;
    protected String driverVersion;
    protected String firmwareVersion;
    protected PhysicalNicLinkInfo linkSpeed;
    protected List<PhysicalNicLinkInfo> validLinkSpecification;
    @XmlElement(required = true)
    protected PhysicalNicSpec spec;
    protected boolean wakeOnLanSupported;
    @XmlElement(required = true)
    protected String mac;
    protected FcoeConfig fcoeConfiguration;
    protected Boolean vmDirectPathGen2Supported;
    protected String vmDirectPathGen2SupportedMode;
    protected Boolean resourcePoolSchedulerAllowed;
    protected List<String> resourcePoolSchedulerDisallowedReason;
    protected Boolean autoNegotiateSupported;
    protected Boolean enhancedNetworkingStackSupported;
    protected Boolean ensInterruptSupported;
    protected String rdmaDevice;
    protected String dpuId;

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
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the pci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPci() {
        return pci;
    }

    /**
     * Sets the value of the pci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPci(String value) {
        this.pci = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * Gets the value of the driverVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverVersion() {
        return driverVersion;
    }

    /**
     * Sets the value of the driverVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverVersion(String value) {
        this.driverVersion = value;
    }

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Gets the value of the linkSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalNicLinkInfo }
     *     
     */
    public PhysicalNicLinkInfo getLinkSpeed() {
        return linkSpeed;
    }

    /**
     * Sets the value of the linkSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalNicLinkInfo }
     *     
     */
    public void setLinkSpeed(PhysicalNicLinkInfo value) {
        this.linkSpeed = value;
    }

    /**
     * Gets the value of the validLinkSpecification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validLinkSpecification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValidLinkSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalNicLinkInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the validLinkSpecification property.
     */
    public List<PhysicalNicLinkInfo> getValidLinkSpecification() {
        if (validLinkSpecification == null) {
            validLinkSpecification = new ArrayList<>();
        }
        return this.validLinkSpecification;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalNicSpec }
     *     
     */
    public PhysicalNicSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalNicSpec }
     *     
     */
    public void setSpec(PhysicalNicSpec value) {
        this.spec = value;
    }

    /**
     * Gets the value of the wakeOnLanSupported property.
     * 
     */
    public boolean isWakeOnLanSupported() {
        return wakeOnLanSupported;
    }

    /**
     * Sets the value of the wakeOnLanSupported property.
     * 
     */
    public void setWakeOnLanSupported(boolean value) {
        this.wakeOnLanSupported = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the fcoeConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link FcoeConfig }
     *     
     */
    public FcoeConfig getFcoeConfiguration() {
        return fcoeConfiguration;
    }

    /**
     * Sets the value of the fcoeConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FcoeConfig }
     *     
     */
    public void setFcoeConfiguration(FcoeConfig value) {
        this.fcoeConfiguration = value;
    }

    /**
     * Gets the value of the vmDirectPathGen2Supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }

    /**
     * Sets the value of the vmDirectPathGen2Supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmDirectPathGen2Supported(Boolean value) {
        this.vmDirectPathGen2Supported = value;
    }

    /**
     * Gets the value of the vmDirectPathGen2SupportedMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmDirectPathGen2SupportedMode() {
        return vmDirectPathGen2SupportedMode;
    }

    /**
     * Sets the value of the vmDirectPathGen2SupportedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmDirectPathGen2SupportedMode(String value) {
        this.vmDirectPathGen2SupportedMode = value;
    }

    /**
     * Gets the value of the resourcePoolSchedulerAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResourcePoolSchedulerAllowed() {
        return resourcePoolSchedulerAllowed;
    }

    /**
     * Sets the value of the resourcePoolSchedulerAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResourcePoolSchedulerAllowed(Boolean value) {
        this.resourcePoolSchedulerAllowed = value;
    }

    /**
     * Gets the value of the resourcePoolSchedulerDisallowedReason property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourcePoolSchedulerDisallowedReason property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResourcePoolSchedulerDisallowedReason().add(newItem);
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
     *     The value of the resourcePoolSchedulerDisallowedReason property.
     */
    public List<String> getResourcePoolSchedulerDisallowedReason() {
        if (resourcePoolSchedulerDisallowedReason == null) {
            resourcePoolSchedulerDisallowedReason = new ArrayList<>();
        }
        return this.resourcePoolSchedulerDisallowedReason;
    }

    /**
     * Gets the value of the autoNegotiateSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoNegotiateSupported() {
        return autoNegotiateSupported;
    }

    /**
     * Sets the value of the autoNegotiateSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoNegotiateSupported(Boolean value) {
        this.autoNegotiateSupported = value;
    }

    /**
     * Gets the value of the enhancedNetworkingStackSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnhancedNetworkingStackSupported() {
        return enhancedNetworkingStackSupported;
    }

    /**
     * Sets the value of the enhancedNetworkingStackSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnhancedNetworkingStackSupported(Boolean value) {
        this.enhancedNetworkingStackSupported = value;
    }

    /**
     * Gets the value of the ensInterruptSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnsInterruptSupported() {
        return ensInterruptSupported;
    }

    /**
     * Sets the value of the ensInterruptSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnsInterruptSupported(Boolean value) {
        this.ensInterruptSupported = value;
    }

    /**
     * Gets the value of the rdmaDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdmaDevice() {
        return rdmaDevice;
    }

    /**
     * Sets the value of the rdmaDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdmaDevice(String value) {
        this.rdmaDevice = value;
    }

    /**
     * Gets the value of the dpuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpuId() {
        return dpuId;
    }

    /**
     * Sets the value of the dpuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpuId(String value) {
        this.dpuId = value;
    }

}
