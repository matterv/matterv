
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaDevicePnicBacking complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRdmaDevicePnicBacking">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostRdmaDeviceBacking">
 *       <sequence>
 *         <element name="pairedUplink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDevicePnicBacking", propOrder = {
    "pairedUplink"
})
public class HostRdmaDevicePnicBacking
    extends HostRdmaDeviceBacking
{

    @XmlElement(required = true)
    protected String pairedUplink;

    /**
     * Gets the value of the pairedUplink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairedUplink() {
        return pairedUplink;
    }

    /**
     * Sets the value of the pairedUplink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairedUplink(String value) {
        this.pairedUplink = value;
    }

}
