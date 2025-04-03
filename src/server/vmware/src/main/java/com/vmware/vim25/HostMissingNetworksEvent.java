
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMissingNetworksEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostMissingNetworksEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDasEvent">
 *       <sequence>
 *         <element name="ips" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMissingNetworksEvent", propOrder = {
    "ips"
})
public class HostMissingNetworksEvent
    extends HostDasEvent
{

    protected String ips;

    /**
     * Gets the value of the ips property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIps() {
        return ips;
    }

    /**
     * Sets the value of the ips property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIps(String value) {
        this.ips = value;
    }

}
