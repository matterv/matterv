
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachinePciSharedGpuPassthroughInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachinePciSharedGpuPassthroughInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="vgpu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePciSharedGpuPassthroughInfo", propOrder = {
    "vgpu"
})
public class VirtualMachinePciSharedGpuPassthroughInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected String vgpu;

    /**
     * Gets the value of the vgpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgpu() {
        return vgpu;
    }

    /**
     * Sets the value of the vgpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgpu(String value) {
        this.vgpu = value;
    }

}
