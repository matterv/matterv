
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskRawDiskMappingVer1BackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskRawDiskMappingVer1BackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceDeviceBackingOption">
 *       <sequence>
 *         <element name="descriptorFileNameExtensions" type="{urn:internalvim25}ChoiceOption" minOccurs="0"/>
 *         <element name="compatibilityMode" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="diskMode" type="{urn:internalvim25}ChoiceOption"/>
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
@XmlType(name = "VirtualDiskRawDiskMappingVer1BackingOption", propOrder = {
    "descriptorFileNameExtensions",
    "compatibilityMode",
    "diskMode",
    "uuid"
})
public class VirtualDiskRawDiskMappingVer1BackingOption
    extends VirtualDeviceDeviceBackingOption
{

    protected ChoiceOption descriptorFileNameExtensions;
    @XmlElement(required = true)
    protected ChoiceOption compatibilityMode;
    @XmlElement(required = true)
    protected ChoiceOption diskMode;
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
     * Gets the value of the compatibilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getCompatibilityMode() {
        return compatibilityMode;
    }

    /**
     * Sets the value of the compatibilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setCompatibilityMode(ChoiceOption value) {
        this.compatibilityMode = value;
    }

    /**
     * Gets the value of the diskMode property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getDiskMode() {
        return diskMode;
    }

    /**
     * Sets the value of the diskMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setDiskMode(ChoiceOption value) {
        this.diskMode = value;
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
