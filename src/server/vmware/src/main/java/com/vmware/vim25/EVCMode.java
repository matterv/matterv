
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVCMode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EVCMode">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ElementDescription">
 *       <sequence>
 *         <element name="guaranteedCPUFeatures" type="{urn:internalvim25}HostCpuIdInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureCapability" type="{urn:internalvim25}HostFeatureCapability" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureMask" type="{urn:internalvim25}HostFeatureMask" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureRequirement" type="{urn:internalvim25}VirtualMachineFeatureRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="track" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vendorTier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCMode", propOrder = {
    "guaranteedCPUFeatures",
    "featureCapability",
    "featureMask",
    "featureRequirement",
    "vendor",
    "track",
    "vendorTier"
})
public class EVCMode
    extends ElementDescription
{

    protected List<HostCpuIdInfo> guaranteedCPUFeatures;
    protected List<HostFeatureCapability> featureCapability;
    protected List<HostFeatureMask> featureMask;
    protected List<VirtualMachineFeatureRequirement> featureRequirement;
    @XmlElement(required = true)
    protected String vendor;
    protected List<String> track;
    protected int vendorTier;

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

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the track property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTrack().add(newItem);
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
     *     The value of the track property.
     */
    public List<String> getTrack() {
        if (track == null) {
            track = new ArrayList<>();
        }
        return this.track;
    }

    /**
     * Gets the value of the vendorTier property.
     * 
     */
    public int getVendorTier() {
        return vendorTier;
    }

    /**
     * Sets the value of the vendorTier property.
     * 
     */
    public void setVendorTier(int value) {
        this.vendorTier = value;
    }

}
