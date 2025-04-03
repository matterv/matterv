
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchHostMemberConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchHostMemberConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="backing" type="{urn:internalvim25}DistributedVirtualSwitchHostMemberBacking" minOccurs="0"/>
 *         <element name="maxProxySwitchPorts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="vendorSpecificConfig" type="{urn:internalvim25}DistributedVirtualSwitchKeyedOpaqueBlob" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberConfigSpec", propOrder = {
    "operation",
    "host",
    "backing",
    "maxProxySwitchPorts",
    "vendorSpecificConfig"
})
public class DistributedVirtualSwitchHostMemberConfigSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String operation;
    @XmlElement(required = true)
    protected ManagedObjectReference host;
    protected DistributedVirtualSwitchHostMemberBacking backing;
    protected Integer maxProxySwitchPorts;
    protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchHostMemberBacking }
     *     
     */
    public DistributedVirtualSwitchHostMemberBacking getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchHostMemberBacking }
     *     
     */
    public void setBacking(DistributedVirtualSwitchHostMemberBacking value) {
        this.backing = value;
    }

    /**
     * Gets the value of the maxProxySwitchPorts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxProxySwitchPorts() {
        return maxProxySwitchPorts;
    }

    /**
     * Sets the value of the maxProxySwitchPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxProxySwitchPorts(Integer value) {
        this.maxProxySwitchPorts = value;
    }

    /**
     * Gets the value of the vendorSpecificConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorSpecificConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVendorSpecificConfig().add(newItem);
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
     *     The value of the vendorSpecificConfig property.
     */
    public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
        if (vendorSpecificConfig == null) {
            vendorSpecificConfig = new ArrayList<>();
        }
        return this.vendorSpecificConfig;
    }

}
