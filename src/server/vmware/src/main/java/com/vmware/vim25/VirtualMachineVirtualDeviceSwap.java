
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVirtualDeviceSwap complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVirtualDeviceSwap">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="lsiToPvscsi" type="{urn:internalvim25}VirtualMachineVirtualDeviceSwapDeviceSwapInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVirtualDeviceSwap", propOrder = {
    "lsiToPvscsi"
})
public class VirtualMachineVirtualDeviceSwap
    extends DynamicData
{

    protected VirtualMachineVirtualDeviceSwapDeviceSwapInfo lsiToPvscsi;

    /**
     * Gets the value of the lsiToPvscsi property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineVirtualDeviceSwapDeviceSwapInfo }
     *     
     */
    public VirtualMachineVirtualDeviceSwapDeviceSwapInfo getLsiToPvscsi() {
        return lsiToPvscsi;
    }

    /**
     * Sets the value of the lsiToPvscsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineVirtualDeviceSwapDeviceSwapInfo }
     *     
     */
    public void setLsiToPvscsi(VirtualMachineVirtualDeviceSwapDeviceSwapInfo value) {
        this.lsiToPvscsi = value;
    }

}
