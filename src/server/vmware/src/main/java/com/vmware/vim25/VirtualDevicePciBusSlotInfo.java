
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDevicePciBusSlotInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDevicePciBusSlotInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBusSlotInfo">
 *       <sequence>
 *         <element name="pciSlotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDevicePciBusSlotInfo", propOrder = {
    "pciSlotNumber"
})
@XmlSeeAlso({
    VirtualUSBControllerPciBusSlotInfo.class
})
public class VirtualDevicePciBusSlotInfo
    extends VirtualDeviceBusSlotInfo
{

    protected int pciSlotNumber;

    /**
     * Gets the value of the pciSlotNumber property.
     * 
     */
    public int getPciSlotNumber() {
        return pciSlotNumber;
    }

    /**
     * Sets the value of the pciSlotNumber property.
     * 
     */
    public void setPciSlotNumber(int value) {
        this.pciSlotNumber = value;
    }

}
