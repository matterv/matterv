
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceDeviceBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceDeviceBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingOption">
 *       <sequence>
 *         <element name="autoDetectAvailable" type="{urn:internalvim25}BoolOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceDeviceBackingOption", propOrder = {
    "autoDetectAvailable"
})
@XmlSeeAlso({
    VirtualCdromPassthroughBackingOption.class,
    VirtualCdromAtapiBackingOption.class,
    VirtualCdromRemoteAtapiBackingOption.class,
    VirtualDiskRawDiskVer2BackingOption.class,
    VirtualDiskRawDiskMappingVer1BackingOption.class,
    VirtualEthernetCardNetworkBackingOption.class,
    VirtualEthernetCardLegacyNetworkBackingOption.class,
    VirtualFloppyDeviceBackingOption.class,
    VirtualPCIPassthroughDeviceBackingOption.class,
    VirtualPCIPassthroughDynamicBackingOption.class,
    VirtualParallelPortDeviceBackingOption.class,
    VirtualPointingDeviceBackingOption.class,
    VirtualSCSIPassthroughDeviceBackingOption.class,
    VirtualSerialPortDeviceBackingOption.class,
    VirtualSoundCardDeviceBackingOption.class,
    VirtualUSBUSBBackingOption.class,
    VirtualUSBRemoteHostBackingOption.class
})
public class VirtualDeviceDeviceBackingOption
    extends VirtualDeviceBackingOption
{

    @XmlElement(required = true)
    protected BoolOption autoDetectAvailable;

    /**
     * Gets the value of the autoDetectAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getAutoDetectAvailable() {
        return autoDetectAvailable;
    }

    /**
     * Sets the value of the autoDetectAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setAutoDetectAvailable(BoolOption value) {
        this.autoDetectAvailable = value;
    }

}
