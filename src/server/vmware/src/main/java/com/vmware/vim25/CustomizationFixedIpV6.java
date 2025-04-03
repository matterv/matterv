
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationFixedIpV6 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationFixedIpV6">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomizationIpV6Generator">
 *       <sequence>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="subnetMask" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationFixedIpV6", propOrder = {
    "ipAddress",
    "subnetMask"
})
public class CustomizationFixedIpV6
    extends CustomizationIpV6Generator
{

    @XmlElement(required = true)
    protected String ipAddress;
    protected int subnetMask;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the subnetMask property.
     * 
     */
    public int getSubnetMask() {
        return subnetMask;
    }

    /**
     * Sets the value of the subnetMask property.
     * 
     */
    public void setSubnetMask(int value) {
        this.subnetMask = value;
    }

}
