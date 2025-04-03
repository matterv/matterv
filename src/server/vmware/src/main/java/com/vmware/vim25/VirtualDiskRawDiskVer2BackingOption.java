
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskRawDiskVer2BackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskRawDiskVer2BackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceDeviceBackingOption">
 *       <sequence>
 *         <element name="descriptorFileNameExtensions" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskRawDiskVer2BackingOption", propOrder = {
    "descriptorFileNameExtensions",
    "uuid"
})
@XmlSeeAlso({
    VirtualDiskPartitionedRawDiskVer2BackingOption.class
})
public class VirtualDiskRawDiskVer2BackingOption
    extends VirtualDeviceDeviceBackingOption
{

    @XmlElement(required = true)
    protected ChoiceOption descriptorFileNameExtensions;
    protected boolean uuid;

    /**
     * Gets the value of the descriptorFileNameExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getDescriptorFileNameExtensions() {
        return descriptorFileNameExtensions;
    }

    /**
     * Sets the value of the descriptorFileNameExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setDescriptorFileNameExtensions(ChoiceOption value) {
        this.descriptorFileNameExtensions = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     */
    public boolean isUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     */
    public void setUuid(boolean value) {
        this.uuid = value;
    }

}
