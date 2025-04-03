
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVFlashModuleInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVFlashModuleInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="vFlashModule" type="{urn:internalvim25}HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVFlashModuleInfo", propOrder = {
    "vFlashModule"
})
public class VirtualMachineVFlashModuleInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption vFlashModule;

    /**
     * Gets the value of the vFlashModule property.
     * 
     * @return
     *     possible object is
     *     {@link HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption }
     *     
     */
    public HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption getVFlashModule() {
        return vFlashModule;
    }

    /**
     * Sets the value of the vFlashModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption }
     *     
     */
    public void setVFlashModule(HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption value) {
        this.vFlashModule = value;
    }

}
