
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVirtualSwitchSimpleBridge complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVirtualSwitchSimpleBridge">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostVirtualSwitchBridge">
 *       <sequence>
 *         <element name="nicDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchSimpleBridge", propOrder = {
    "nicDevice"
})
public class HostVirtualSwitchSimpleBridge
    extends HostVirtualSwitchBridge
{

    @XmlElement(required = true)
    protected String nicDevice;

    /**
     * Gets the value of the nicDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNicDevice() {
        return nicDevice;
    }

    /**
     * Sets the value of the nicDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNicDevice(String value) {
        this.nicDevice = value;
    }

}
