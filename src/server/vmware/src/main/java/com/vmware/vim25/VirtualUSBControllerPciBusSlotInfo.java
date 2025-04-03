
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualUSBControllerPciBusSlotInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualUSBControllerPciBusSlotInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDevicePciBusSlotInfo">
 *       <sequence>
 *         <element name="ehciPciSlotNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualUSBControllerPciBusSlotInfo", propOrder = {
    "ehciPciSlotNumber"
})
public class VirtualUSBControllerPciBusSlotInfo
    extends VirtualDevicePciBusSlotInfo
{

    protected Integer ehciPciSlotNumber;

    /**
     * Gets the value of the ehciPciSlotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEhciPciSlotNumber() {
        return ehciPciSlotNumber;
    }

    /**
     * Sets the value of the ehciPciSlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEhciPciSlotNumber(Integer value) {
        this.ehciPciSlotNumber = value;
    }

}
