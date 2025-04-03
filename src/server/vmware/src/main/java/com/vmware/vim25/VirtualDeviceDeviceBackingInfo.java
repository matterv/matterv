
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceDeviceBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceDeviceBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingInfo">
 *       <sequence>
 *         <element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="useAutoDetect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceDeviceBackingInfo", propOrder = {
    "deviceName",
    "useAutoDetect"
})
@XmlSeeAlso({
    VirtualCdromPassthroughBackingInfo.class,
    VirtualCdromAtapiBackingInfo.class,
    VirtualDiskRawDiskVer2BackingInfo.class,
    VirtualEthernetCardNetworkBackingInfo.class,
    VirtualEthernetCardLegacyNetworkBackingInfo.class,
    VirtualFloppyDeviceBackingInfo.class,
    VirtualPCIPassthroughDeviceBackingInfo.class,
    VirtualPCIPassthroughDynamicBackingInfo.class,
    VirtualParallelPortDeviceBackingInfo.class,
    VirtualPointingDeviceDeviceBackingInfo.class,
    VirtualSCSIPassthroughDeviceBackingInfo.class,
    VirtualSerialPortDeviceBackingInfo.class,
    VirtualSoundCardDeviceBackingInfo.class,
    VirtualUSBUSBBackingInfo.class,
    VirtualUSBRemoteHostBackingInfo.class
})
public class VirtualDeviceDeviceBackingInfo
    extends VirtualDeviceBackingInfo
{

    @XmlElement(required = true)
    protected String deviceName;
    protected Boolean useAutoDetect;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the useAutoDetect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAutoDetect() {
        return useAutoDetect;
    }

    /**
     * Sets the value of the useAutoDetect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAutoDetect(Boolean value) {
        this.useAutoDetect = value;
    }

}
