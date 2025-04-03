
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDevicePipeBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDevicePipeBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingInfo">
 *       <sequence>
 *         <element name="pipeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDevicePipeBackingInfo", propOrder = {
    "pipeName"
})
@XmlSeeAlso({
    VirtualSerialPortPipeBackingInfo.class
})
public class VirtualDevicePipeBackingInfo
    extends VirtualDeviceBackingInfo
{

    @XmlElement(required = true)
    protected String pipeName;

    /**
     * Gets the value of the pipeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeName() {
        return pipeName;
    }

    /**
     * Sets the value of the pipeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeName(String value) {
        this.pipeName = value;
    }

}
