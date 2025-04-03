
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineQuickStatsMemoryTierStats complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineQuickStatsMemoryTierStats">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="memoryTierType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="readBandwidth" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineQuickStatsMemoryTierStats", propOrder = {
    "memoryTierType",
    "readBandwidth"
})
public class VirtualMachineQuickStatsMemoryTierStats
    extends DynamicData
{

    @XmlElement(required = true)
    protected String memoryTierType;
    protected long readBandwidth;

    /**
     * Gets the value of the memoryTierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryTierType() {
        return memoryTierType;
    }

    /**
     * Sets the value of the memoryTierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryTierType(String value) {
        this.memoryTierType = value;
    }

    /**
     * Gets the value of the readBandwidth property.
     * 
     */
    public long getReadBandwidth() {
        return readBandwidth;
    }

    /**
     * Sets the value of the readBandwidth property.
     * 
     */
    public void setReadBandwidth(long value) {
        this.readBandwidth = value;
    }

}
