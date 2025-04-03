
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmwareDistributedVirtualSwitchNetworkOffloadConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmwareDistributedVirtualSwitchNetworkOffloadConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dpuFailoverPolicy" type="{urn:internalvim25}VmwareDistributedVirtualSwitchDpuFailoverPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareDistributedVirtualSwitchNetworkOffloadConfig", propOrder = {
    "dpuFailoverPolicy"
})
public class VmwareDistributedVirtualSwitchNetworkOffloadConfig
    extends DynamicData
{

    protected VmwareDistributedVirtualSwitchDpuFailoverPolicy dpuFailoverPolicy;

    /**
     * Gets the value of the dpuFailoverPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link VmwareDistributedVirtualSwitchDpuFailoverPolicy }
     *     
     */
    public VmwareDistributedVirtualSwitchDpuFailoverPolicy getDpuFailoverPolicy() {
        return dpuFailoverPolicy;
    }

    /**
     * Sets the value of the dpuFailoverPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmwareDistributedVirtualSwitchDpuFailoverPolicy }
     *     
     */
    public void setDpuFailoverPolicy(VmwareDistributedVirtualSwitchDpuFailoverPolicy value) {
        this.dpuFailoverPolicy = value;
    }

}
