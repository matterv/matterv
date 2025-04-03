
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDrsFaultsFaultsByVirtualDisk complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDrsFaultsFaultsByVirtualDisk">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterDrsFaultsFaultsByVm">
 *       <sequence>
 *         <element name="disk" type="{urn:internalvim25}VirtualDiskId" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsFaultsFaultsByVirtualDisk", propOrder = {
    "disk"
})
public class ClusterDrsFaultsFaultsByVirtualDisk
    extends ClusterDrsFaultsFaultsByVm
{

    protected VirtualDiskId disk;

    /**
     * Gets the value of the disk property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDiskId }
     *     
     */
    public VirtualDiskId getDisk() {
        return disk;
    }

    /**
     * Sets the value of the disk property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDiskId }
     *     
     */
    public void setDisk(VirtualDiskId value) {
        this.disk = value;
    }

}
