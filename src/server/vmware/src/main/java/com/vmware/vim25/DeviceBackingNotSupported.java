
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceBackingNotSupported complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceBackingNotSupported">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DeviceNotSupported">
 *       <sequence>
 *         <element name="backing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceBackingNotSupported", propOrder = {
    "backing"
})
@XmlSeeAlso({
    DVPortNotSupported.class,
    UnusedVirtualDiskBlocksNotScrubbed.class,
    VirtualDiskBlocksNotFullyProvisioned.class
})
public class DeviceBackingNotSupported
    extends DeviceNotSupported
{

    @XmlElement(required = true)
    protected String backing;

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBacking(String value) {
        this.backing = value;
    }

}
