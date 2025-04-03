
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualCdromRemotePassthroughBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualCdromRemotePassthroughBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceRemoteDeviceBackingInfo">
 *       <sequence>
 *         <element name="exclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCdromRemotePassthroughBackingInfo", propOrder = {
    "exclusive"
})
public class VirtualCdromRemotePassthroughBackingInfo
    extends VirtualDeviceRemoteDeviceBackingInfo
{

    protected boolean exclusive;

    /**
     * Gets the value of the exclusive property.
     * 
     */
    public boolean isExclusive() {
        return exclusive;
    }

    /**
     * Sets the value of the exclusive property.
     * 
     */
    public void setExclusive(boolean value) {
        this.exclusive = value;
    }

}
