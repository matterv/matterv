
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputeResourceConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComputeResourceConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vmSwapPlacement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="spbmEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="defaultHardwareVersionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="desiredSoftwareSpec" type="{urn:internalvim25}DesiredSoftwareSpec" minOccurs="0"/>
 *         <element name="maximumHardwareVersionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="enableConfigManager" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hostSeedSpec" type="{urn:internalvim25}ComputeResourceHostSeedSpec" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceConfigSpec", propOrder = {
    "vmSwapPlacement",
    "spbmEnabled",
    "defaultHardwareVersionKey",
    "desiredSoftwareSpec",
    "maximumHardwareVersionKey",
    "enableConfigManager",
    "hostSeedSpec"
})
@XmlSeeAlso({
    ClusterConfigSpecEx.class
})
public class ComputeResourceConfigSpec
    extends DynamicData
{

    protected String vmSwapPlacement;
    protected Boolean spbmEnabled;
    protected String defaultHardwareVersionKey;
    protected DesiredSoftwareSpec desiredSoftwareSpec;
    protected String maximumHardwareVersionKey;
    protected Boolean enableConfigManager;
    protected ComputeResourceHostSeedSpec hostSeedSpec;

    /**
     * Gets the value of the vmSwapPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmSwapPlacement() {
        return vmSwapPlacement;
    }

    /**
     * Sets the value of the vmSwapPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmSwapPlacement(String value) {
        this.vmSwapPlacement = value;
    }

    /**
     * Gets the value of the spbmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpbmEnabled() {
        return spbmEnabled;
    }

    /**
     * Sets the value of the spbmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpbmEnabled(Boolean value) {
        this.spbmEnabled = value;
    }

    /**
     * Gets the value of the defaultHardwareVersionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultHardwareVersionKey() {
        return defaultHardwareVersionKey;
    }

    /**
     * Sets the value of the defaultHardwareVersionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultHardwareVersionKey(String value) {
        this.defaultHardwareVersionKey = value;
    }

    /**
     * Gets the value of the desiredSoftwareSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DesiredSoftwareSpec }
     *     
     */
    public DesiredSoftwareSpec getDesiredSoftwareSpec() {
        return desiredSoftwareSpec;
    }

    /**
     * Sets the value of the desiredSoftwareSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesiredSoftwareSpec }
     *     
     */
    public void setDesiredSoftwareSpec(DesiredSoftwareSpec value) {
        this.desiredSoftwareSpec = value;
    }

    /**
     * Gets the value of the maximumHardwareVersionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumHardwareVersionKey() {
        return maximumHardwareVersionKey;
    }

    /**
     * Sets the value of the maximumHardwareVersionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumHardwareVersionKey(String value) {
        this.maximumHardwareVersionKey = value;
    }

    /**
     * Gets the value of the enableConfigManager property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableConfigManager() {
        return enableConfigManager;
    }

    /**
     * Sets the value of the enableConfigManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableConfigManager(Boolean value) {
        this.enableConfigManager = value;
    }

    /**
     * Gets the value of the hostSeedSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ComputeResourceHostSeedSpec }
     *     
     */
    public ComputeResourceHostSeedSpec getHostSeedSpec() {
        return hostSeedSpec;
    }

    /**
     * Sets the value of the hostSeedSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputeResourceHostSeedSpec }
     *     
     */
    public void setHostSeedSpec(ComputeResourceHostSeedSpec value) {
        this.hostSeedSpec = value;
    }

}
