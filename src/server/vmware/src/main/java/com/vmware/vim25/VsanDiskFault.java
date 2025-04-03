
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanDiskFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanDiskFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VsanFault">
 *       <sequence>
 *         <element name="device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanDiskFault", propOrder = {
    "device"
})
@XmlSeeAlso({
    DiskHasPartitions.class,
    DiskIsLastRemainingNonSSD.class,
    DiskIsNonLocal.class,
    DiskIsUSB.class,
    DiskTooSmall.class,
    DuplicateDisks.class,
    InsufficientDisks.class,
    VsanIncompatibleDiskMapping.class
})
public class VsanDiskFault
    extends VsanFault
{

    protected String device;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

}
