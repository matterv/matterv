
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourcePoolRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResourcePoolRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="memory" type="{urn:internalvim25}ResourcePoolResourceUsage"/>
 *         <element name="cpu" type="{urn:internalvim25}ResourcePoolResourceUsage"/>
 *         <element name="overallStatus" type="{urn:internalvim25}ManagedEntityStatus"/>
 *         <element name="sharesScalable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolRuntimeInfo", propOrder = {
    "memory",
    "cpu",
    "overallStatus",
    "sharesScalable"
})
public class ResourcePoolRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ResourcePoolResourceUsage memory;
    @XmlElement(required = true)
    protected ResourcePoolResourceUsage cpu;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus overallStatus;
    protected String sharesScalable;

    /**
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcePoolResourceUsage }
     *     
     */
    public ResourcePoolResourceUsage getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcePoolResourceUsage }
     *     
     */
    public void setMemory(ResourcePoolResourceUsage value) {
        this.memory = value;
    }

    /**
     * Gets the value of the cpu property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcePoolResourceUsage }
     *     
     */
    public ResourcePoolResourceUsage getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcePoolResourceUsage }
     *     
     */
    public void setCpu(ResourcePoolResourceUsage value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setOverallStatus(ManagedEntityStatus value) {
        this.overallStatus = value;
    }

    /**
     * Gets the value of the sharesScalable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharesScalable() {
        return sharesScalable;
    }

    /**
     * Sets the value of the sharesScalable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharesScalable(String value) {
        this.sharesScalable = value;
    }

}
