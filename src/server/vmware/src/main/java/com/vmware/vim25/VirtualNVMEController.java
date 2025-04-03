
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVMEController complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualNVMEController">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualController">
 *       <sequence>
 *         <element name="sharedBus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVMEController", propOrder = {
    "sharedBus"
})
public class VirtualNVMEController
    extends VirtualController
{

    protected String sharedBus;

    /**
     * Gets the value of the sharedBus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedBus() {
        return sharedBus;
    }

    /**
     * Sets the value of the sharedBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedBus(String value) {
        this.sharedBus = value;
    }

}
