
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterEVCManagerEVCState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterEVCManagerEVCState">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="supportedEVCMode" type="{urn:internalvim25}EVCMode" maxOccurs="unbounded"/>
 *         <element name="currentEVCModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guaranteedCPUFeatures" type="{urn:internalvim25}HostCpuIdInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureCapability" type="{urn:internalvim25}HostFeatureCapability" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureMask" type="{urn:internalvim25}HostFeatureMask" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureRequirement" type="{urn:internalvim25}VirtualMachineFeatureRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterEVCManagerEVCState", propOrder = {
    "supportedEVCMode",
    "currentEVCModeKey",
    "guaranteedCPUFeatures",
    "featureCapability",
    "featureMask",
    "featureRequirement"
})
public class ClusterEVCManagerEVCState
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<EVCMode> supportedEVCMode;
    protected String currentEVCModeKey;
    protected List<HostCpuIdInfo> guaranteedCPUFeatures;
    protected List<HostFeatureCapability> featureCapability;
    protected List<HostFeatureMask> featureMask;
    protected List<VirtualMachineFeatureRequirement> featureRequirement;

    /**
     * Gets the value of the supportedEVCMode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEVCMode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedEVCMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EVCMode }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedEVCMode property.
     */
    public List<EVCMode> getSupportedEVCMode() {
        if (supportedEVCMode == null) {
            supportedEVCMode = new ArrayList<>();
        }
        return this.supportedEVCMode;
    }

    /**
     * Gets the value of the currentEVCModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentEVCModeKey() {
        return currentEVCModeKey;
    }

    /**
     * Sets the value of the currentEVCModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentEVCModeKey(String value) {
        this.currentEVCModeKey = value;
    }

    /**
     * Gets the value of the guaranteedCPUFeatures property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteedCPUFeatures property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGuaranteedCPUFeatures().add(newItem);
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
     *     The value of the guaranteedCPUFeatures property.
     */
    public List<HostCpuIdInfo> getGuaranteedCPUFeatures() {
        if (guaranteedCPUFeatures == null) {
            guaranteedCPUFeatures = new ArrayList<>();
        }
        return this.guaranteedCPUFeatures;
    }

    /**
     * Gets the value of the featureCapability property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureCapability property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureCapability }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureCapability property.
     */
    public List<HostFeatureCapability> getFeatureCapability() {
        if (featureCapability == null) {
            featureCapability = new ArrayList<>();
        }
        return this.featureCapability;
    }

    /**
     * Gets the value of the featureMask property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureMask property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureMask }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureMask property.
     */
    public List<HostFeatureMask> getFeatureMask() {
        if (featureMask == null) {
            featureMask = new ArrayList<>();
        }
        return this.featureMask;
    }

    /**
     * Gets the value of the featureRequirement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureRequirement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFeatureRequirement }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureRequirement property.
     */
    public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
        if (featureRequirement == null) {
            featureRequirement = new ArrayList<>();
        }
        return this.featureRequirement;
    }

}
