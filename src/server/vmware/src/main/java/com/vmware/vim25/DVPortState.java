
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVPortState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVPortState">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="runtimeInfo" type="{urn:internalvim25}DVPortStatus" minOccurs="0"/>
 *         <element name="stats" type="{urn:internalvim25}DistributedVirtualSwitchPortStatistics"/>
 *         <element name="vendorSpecificState" type="{urn:internalvim25}DistributedVirtualSwitchKeyedOpaqueBlob" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortState", propOrder = {
    "runtimeInfo",
    "stats",
    "vendorSpecificState"
})
public class DVPortState
    extends DynamicData
{

    protected DVPortStatus runtimeInfo;
    @XmlElement(required = true)
    protected DistributedVirtualSwitchPortStatistics stats;
    protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificState;

    /**
     * Gets the value of the runtimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortStatus }
     *     
     */
    public DVPortStatus getRuntimeInfo() {
        return runtimeInfo;
    }

    /**
     * Sets the value of the runtimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortStatus }
     *     
     */
    public void setRuntimeInfo(DVPortStatus value) {
        this.runtimeInfo = value;
    }

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchPortStatistics }
     *     
     */
    public DistributedVirtualSwitchPortStatistics getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchPortStatistics }
     *     
     */
    public void setStats(DistributedVirtualSwitchPortStatistics value) {
        this.stats = value;
    }

    /**
     * Gets the value of the vendorSpecificState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorSpecificState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVendorSpecificState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchKeyedOpaqueBlob }
     * </p>
     * 
     * 
     * @return
     *     The value of the vendorSpecificState property.
     */
    public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificState() {
        if (vendorSpecificState == null) {
            vendorSpecificState = new ArrayList<>();
        }
        return this.vendorSpecificState;
    }

}
