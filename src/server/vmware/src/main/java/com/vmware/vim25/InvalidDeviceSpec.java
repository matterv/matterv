
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidDeviceSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InvalidDeviceSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidVmConfig">
 *       <sequence>
 *         <element name="deviceIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDeviceSpec", propOrder = {
    "deviceIndex"
})
@XmlSeeAlso({
    DeviceHotPlugNotSupported.class,
    DeviceNotFound.class,
    DeviceUnsupportedForVmPlatform.class,
    DeviceUnsupportedForVmVersion.class,
    DisallowedDiskModeChange.class,
    InvalidController.class,
    InvalidDeviceBacking.class,
    InvalidDeviceOperation.class,
    MissingController.class
})
public class InvalidDeviceSpec
    extends InvalidVmConfig
{

    protected int deviceIndex;

    /**
     * Gets the value of the deviceIndex property.
     * 
     */
    public int getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * Sets the value of the deviceIndex property.
     * 
     */
    public void setDeviceIndex(int value) {
        this.deviceIndex = value;
    }

}
