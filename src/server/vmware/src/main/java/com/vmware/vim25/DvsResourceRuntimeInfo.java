
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsResourceRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsResourceRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="usage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="available" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="allocatedResource" type="{urn:internalvim25}DvsVnicAllocatedResource" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vmVnicNetworkResourcePoolRuntime" type="{urn:internalvim25}DvsVmVnicNetworkResourcePoolRuntimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsResourceRuntimeInfo", propOrder = {
    "capacity",
    "usage",
    "available",
    "allocatedResource",
    "vmVnicNetworkResourcePoolRuntime"
})
public class DvsResourceRuntimeInfo
    extends DynamicData
{

    protected Integer capacity;
    protected Integer usage;
    protected Integer available;
    protected List<DvsVnicAllocatedResource> allocatedResource;
    protected List<DvsVmVnicNetworkResourcePoolRuntimeInfo> vmVnicNetworkResourcePoolRuntime;

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacity(Integer value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsage(Integer value) {
        this.usage = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailable(Integer value) {
        this.available = value;
    }

    /**
     * Gets the value of the allocatedResource property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocatedResource property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAllocatedResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsVnicAllocatedResource }
     * </p>
     * 
     * 
     * @return
     *     The value of the allocatedResource property.
     */
    public List<DvsVnicAllocatedResource> getAllocatedResource() {
        if (allocatedResource == null) {
            allocatedResource = new ArrayList<>();
        }
        return this.allocatedResource;
    }

    /**
     * Gets the value of the vmVnicNetworkResourcePoolRuntime property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmVnicNetworkResourcePoolRuntime property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmVnicNetworkResourcePoolRuntime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsVmVnicNetworkResourcePoolRuntimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmVnicNetworkResourcePoolRuntime property.
     */
    public List<DvsVmVnicNetworkResourcePoolRuntimeInfo> getVmVnicNetworkResourcePoolRuntime() {
        if (vmVnicNetworkResourcePoolRuntime == null) {
            vmVnicNetworkResourcePoolRuntime = new ArrayList<>();
        }
        return this.vmVnicNetworkResourcePoolRuntime;
    }

}
