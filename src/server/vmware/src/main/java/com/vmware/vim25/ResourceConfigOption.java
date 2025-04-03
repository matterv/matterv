
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceConfigOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResourceConfigOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="cpuAllocationOption" type="{urn:internalvim25}ResourceAllocationOption"/>
 *         <element name="memoryAllocationOption" type="{urn:internalvim25}ResourceAllocationOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceConfigOption", propOrder = {
    "cpuAllocationOption",
    "memoryAllocationOption"
})
public class ResourceConfigOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected ResourceAllocationOption cpuAllocationOption;
    @XmlElement(required = true)
    protected ResourceAllocationOption memoryAllocationOption;

    /**
     * Gets the value of the cpuAllocationOption property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAllocationOption }
     *     
     */
    public ResourceAllocationOption getCpuAllocationOption() {
        return cpuAllocationOption;
    }

    /**
     * Sets the value of the cpuAllocationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAllocationOption }
     *     
     */
    public void setCpuAllocationOption(ResourceAllocationOption value) {
        this.cpuAllocationOption = value;
    }

    /**
     * Gets the value of the memoryAllocationOption property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAllocationOption }
     *     
     */
    public ResourceAllocationOption getMemoryAllocationOption() {
        return memoryAllocationOption;
    }

    /**
     * Sets the value of the memoryAllocationOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAllocationOption }
     *     
     */
    public void setMemoryAllocationOption(ResourceAllocationOption value) {
        this.memoryAllocationOption = value;
    }

}
