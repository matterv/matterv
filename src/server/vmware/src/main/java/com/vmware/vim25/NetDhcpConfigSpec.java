
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetDhcpConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetDhcpConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ipv6" type="{urn:internalvim25}NetDhcpConfigSpecDhcpOptionsSpec" minOccurs="0"/>
 *         <element name="ipv4" type="{urn:internalvim25}NetDhcpConfigSpecDhcpOptionsSpec" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDhcpConfigSpec", propOrder = {
    "ipv6",
    "ipv4"
})
public class NetDhcpConfigSpec
    extends DynamicData
{

    protected NetDhcpConfigSpecDhcpOptionsSpec ipv6;
    protected NetDhcpConfigSpecDhcpOptionsSpec ipv4;

    /**
     * Gets the value of the ipv6 property.
     * 
     * @return
     *     possible object is
     *     {@link NetDhcpConfigSpecDhcpOptionsSpec }
     *     
     */
    public NetDhcpConfigSpecDhcpOptionsSpec getIpv6() {
        return ipv6;
    }

    /**
     * Sets the value of the ipv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDhcpConfigSpecDhcpOptionsSpec }
     *     
     */
    public void setIpv6(NetDhcpConfigSpecDhcpOptionsSpec value) {
        this.ipv6 = value;
    }

    /**
     * Gets the value of the ipv4 property.
     * 
     * @return
     *     possible object is
     *     {@link NetDhcpConfigSpecDhcpOptionsSpec }
     *     
     */
    public NetDhcpConfigSpecDhcpOptionsSpec getIpv4() {
        return ipv4;
    }

    /**
     * Sets the value of the ipv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDhcpConfigSpecDhcpOptionsSpec }
     *     
     */
    public void setIpv4(NetDhcpConfigSpecDhcpOptionsSpec value) {
        this.ipv4 = value;
    }

}
