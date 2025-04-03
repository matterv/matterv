
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaDeviceCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRdmaDeviceCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="roceV1Capable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="roceV2Capable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="iWarpCapable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDeviceCapability", propOrder = {
    "roceV1Capable",
    "roceV2Capable",
    "iWarpCapable"
})
public class HostRdmaDeviceCapability
    extends DynamicData
{

    protected boolean roceV1Capable;
    protected boolean roceV2Capable;
    protected boolean iWarpCapable;

    /**
     * Gets the value of the roceV1Capable property.
     * 
     */
    public boolean isRoceV1Capable() {
        return roceV1Capable;
    }

    /**
     * Sets the value of the roceV1Capable property.
     * 
     */
    public void setRoceV1Capable(boolean value) {
        this.roceV1Capable = value;
    }

    /**
     * Gets the value of the roceV2Capable property.
     * 
     */
    public boolean isRoceV2Capable() {
        return roceV2Capable;
    }

    /**
     * Sets the value of the roceV2Capable property.
     * 
     */
    public void setRoceV2Capable(boolean value) {
        this.roceV2Capable = value;
    }

    /**
     * Gets the value of the iWarpCapable property.
     * 
     */
    public boolean isIWarpCapable() {
        return iWarpCapable;
    }

    /**
     * Sets the value of the iWarpCapable property.
     * 
     */
    public void setIWarpCapable(boolean value) {
        this.iWarpCapable = value;
    }

}
