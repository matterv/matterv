
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVmxnet3Vrdma complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualVmxnet3Vrdma">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualVmxnet3">
 *       <sequence>
 *         <element name="deviceProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet3Vrdma", propOrder = {
    "deviceProtocol"
})
public class VirtualVmxnet3Vrdma
    extends VirtualVmxnet3
{

    protected String deviceProtocol;

    /**
     * Gets the value of the deviceProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceProtocol() {
        return deviceProtocol;
    }

    /**
     * Sets the value of the deviceProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceProtocol(String value) {
        this.deviceProtocol = value;
    }

}
