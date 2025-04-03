
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPCIPassthroughVmiopBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPCIPassthroughVmiopBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualPCIPassthroughPluginBackingOption">
 *       <sequence>
 *         <element name="vgpu" type="{urn:internalvim25}StringOption"/>
 *         <element name="maxInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughVmiopBackingOption", propOrder = {
    "vgpu",
    "maxInstances"
})
public class VirtualPCIPassthroughVmiopBackingOption
    extends VirtualPCIPassthroughPluginBackingOption
{

    @XmlElement(required = true)
    protected StringOption vgpu;
    protected int maxInstances;

    /**
     * Gets the value of the vgpu property.
     * 
     * @return
     *     possible object is
     *     {@link StringOption }
     *     
     */
    public StringOption getVgpu() {
        return vgpu;
    }

    /**
     * Sets the value of the vgpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOption }
     *     
     */
    public void setVgpu(StringOption value) {
        this.vgpu = value;
    }

    /**
     * Gets the value of the maxInstances property.
     * 
     */
    public int getMaxInstances() {
        return maxInstances;
    }

    /**
     * Sets the value of the maxInstances property.
     * 
     */
    public void setMaxInstances(int value) {
        this.maxInstances = value;
    }

}
