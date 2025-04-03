
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVPortSetting complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVPortSetting">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="blocked" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="vmDirectPathGen2Allowed" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="inShapingPolicy" type="{urn:internalvim25}DVSTrafficShapingPolicy" minOccurs="0"/>
 *         <element name="outShapingPolicy" type="{urn:internalvim25}DVSTrafficShapingPolicy" minOccurs="0"/>
 *         <element name="vendorSpecificConfig" type="{urn:internalvim25}DVSVendorSpecificConfig" minOccurs="0"/>
 *         <element name="networkResourcePoolKey" type="{urn:internalvim25}StringPolicy" minOccurs="0"/>
 *         <element name="filterPolicy" type="{urn:internalvim25}DvsFilterPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortSetting", propOrder = {
    "blocked",
    "vmDirectPathGen2Allowed",
    "inShapingPolicy",
    "outShapingPolicy",
    "vendorSpecificConfig",
    "networkResourcePoolKey",
    "filterPolicy"
})
@XmlSeeAlso({
    VMwareDVSPortSetting.class
})
public class DVPortSetting
    extends DynamicData
{

    protected BoolPolicy blocked;
    protected BoolPolicy vmDirectPathGen2Allowed;
    protected DVSTrafficShapingPolicy inShapingPolicy;
    protected DVSTrafficShapingPolicy outShapingPolicy;
    protected DVSVendorSpecificConfig vendorSpecificConfig;
    protected StringPolicy networkResourcePoolKey;
    protected DvsFilterPolicy filterPolicy;

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setBlocked(BoolPolicy value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the vmDirectPathGen2Allowed property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getVmDirectPathGen2Allowed() {
        return vmDirectPathGen2Allowed;
    }

    /**
     * Sets the value of the vmDirectPathGen2Allowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setVmDirectPathGen2Allowed(BoolPolicy value) {
        this.vmDirectPathGen2Allowed = value;
    }

    /**
     * Gets the value of the inShapingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DVSTrafficShapingPolicy }
     *     
     */
    public DVSTrafficShapingPolicy getInShapingPolicy() {
        return inShapingPolicy;
    }

    /**
     * Sets the value of the inShapingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSTrafficShapingPolicy }
     *     
     */
    public void setInShapingPolicy(DVSTrafficShapingPolicy value) {
        this.inShapingPolicy = value;
    }

    /**
     * Gets the value of the outShapingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DVSTrafficShapingPolicy }
     *     
     */
    public DVSTrafficShapingPolicy getOutShapingPolicy() {
        return outShapingPolicy;
    }

    /**
     * Sets the value of the outShapingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSTrafficShapingPolicy }
     *     
     */
    public void setOutShapingPolicy(DVSTrafficShapingPolicy value) {
        this.outShapingPolicy = value;
    }

    /**
     * Gets the value of the vendorSpecificConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DVSVendorSpecificConfig }
     *     
     */
    public DVSVendorSpecificConfig getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }

    /**
     * Sets the value of the vendorSpecificConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSVendorSpecificConfig }
     *     
     */
    public void setVendorSpecificConfig(DVSVendorSpecificConfig value) {
        this.vendorSpecificConfig = value;
    }

    /**
     * Gets the value of the networkResourcePoolKey property.
     * 
     * @return
     *     possible object is
     *     {@link StringPolicy }
     *     
     */
    public StringPolicy getNetworkResourcePoolKey() {
        return networkResourcePoolKey;
    }

    /**
     * Sets the value of the networkResourcePoolKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPolicy }
     *     
     */
    public void setNetworkResourcePoolKey(StringPolicy value) {
        this.networkResourcePoolKey = value;
    }

    /**
     * Gets the value of the filterPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DvsFilterPolicy }
     *     
     */
    public DvsFilterPolicy getFilterPolicy() {
        return filterPolicy;
    }

    /**
     * Sets the value of the filterPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsFilterPolicy }
     *     
     */
    public void setFilterPolicy(DvsFilterPolicy value) {
        this.filterPolicy = value;
    }

}
