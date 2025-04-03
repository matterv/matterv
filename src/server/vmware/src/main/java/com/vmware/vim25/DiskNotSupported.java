
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiskNotSupported complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DiskNotSupported">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualHardwareCompatibilityIssue">
 *       <sequence>
 *         <element name="disk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskNotSupported", propOrder = {
    "disk"
})
@XmlSeeAlso({
    IDEDiskNotSupported.class
})
public class DiskNotSupported
    extends VirtualHardwareCompatibilityIssue
{

    protected int disk;

    /**
     * Gets the value of the disk property.
     * 
     */
    public int getDisk() {
        return disk;
    }

    /**
     * Sets the value of the disk property.
     * 
     */
    public void setDisk(int value) {
        this.disk = value;
    }

}
