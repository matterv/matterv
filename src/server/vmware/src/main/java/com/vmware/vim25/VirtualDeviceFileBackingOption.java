
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceFileBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceFileBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingOption">
 *       <sequence>
 *         <element name="fileNameExtensions" type="{urn:internalvim25}ChoiceOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceFileBackingOption", propOrder = {
    "fileNameExtensions"
})
@XmlSeeAlso({
    VirtualCdromIsoBackingOption.class,
    VirtualDiskSparseVer1BackingOption.class,
    VirtualDiskSparseVer2BackingOption.class,
    VirtualDiskFlatVer1BackingOption.class,
    VirtualDiskFlatVer2BackingOption.class,
    VirtualDiskSeSparseBackingOption.class,
    VirtualDiskLocalPMemBackingOption.class,
    VirtualFloppyImageBackingOption.class,
    VirtualParallelPortFileBackingOption.class,
    VirtualSerialPortFileBackingOption.class
})
public class VirtualDeviceFileBackingOption
    extends VirtualDeviceBackingOption
{

    protected ChoiceOption fileNameExtensions;

    /**
     * Gets the value of the fileNameExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getFileNameExtensions() {
        return fileNameExtensions;
    }

    /**
     * Sets the value of the fileNameExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setFileNameExtensions(ChoiceOption value) {
        this.fileNameExtensions = value;
    }

}
