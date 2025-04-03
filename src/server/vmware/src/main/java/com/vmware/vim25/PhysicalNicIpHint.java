
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalNicIpHint complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PhysicalNicIpHint">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}PhysicalNicHint">
 *       <sequence>
 *         <element name="ipSubnet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicIpHint", propOrder = {
    "ipSubnet"
})
public class PhysicalNicIpHint
    extends PhysicalNicHint
{

    @XmlElement(required = true)
    protected String ipSubnet;

    /**
     * Gets the value of the ipSubnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpSubnet() {
        return ipSubnet;
    }

    /**
     * Sets the value of the ipSubnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpSubnet(String value) {
        this.ipSubnet = value;
    }

}
