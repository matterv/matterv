
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestStackInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestStackInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dnsConfig" type="{urn:internalvim25}NetDnsConfigInfo" minOccurs="0"/>
 *         <element name="ipRouteConfig" type="{urn:internalvim25}NetIpRouteConfigInfo" minOccurs="0"/>
 *         <element name="ipStackConfig" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dhcpConfig" type="{urn:internalvim25}NetDhcpConfigInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestStackInfo", propOrder = {
    "dnsConfig",
    "ipRouteConfig",
    "ipStackConfig",
    "dhcpConfig"
})
public class GuestStackInfo
    extends DynamicData
{

    protected NetDnsConfigInfo dnsConfig;
    protected NetIpRouteConfigInfo ipRouteConfig;
    protected List<KeyValue> ipStackConfig;
    protected NetDhcpConfigInfo dhcpConfig;

    /**
     * Gets the value of the dnsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NetDnsConfigInfo }
     *     
     */
    public NetDnsConfigInfo getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Sets the value of the dnsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDnsConfigInfo }
     *     
     */
    public void setDnsConfig(NetDnsConfigInfo value) {
        this.dnsConfig = value;
    }

    /**
     * Gets the value of the ipRouteConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NetIpRouteConfigInfo }
     *     
     */
    public NetIpRouteConfigInfo getIpRouteConfig() {
        return ipRouteConfig;
    }

    /**
     * Sets the value of the ipRouteConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetIpRouteConfigInfo }
     *     
     */
    public void setIpRouteConfig(NetIpRouteConfigInfo value) {
        this.ipRouteConfig = value;
    }

    /**
     * Gets the value of the ipStackConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipStackConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIpStackConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the ipStackConfig property.
     */
    public List<KeyValue> getIpStackConfig() {
        if (ipStackConfig == null) {
            ipStackConfig = new ArrayList<>();
        }
        return this.ipStackConfig;
    }

    /**
     * Gets the value of the dhcpConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NetDhcpConfigInfo }
     *     
     */
    public NetDhcpConfigInfo getDhcpConfig() {
        return dhcpConfig;
    }

    /**
     * Sets the value of the dhcpConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDhcpConfigInfo }
     *     
     */
    public void setDhcpConfig(NetDhcpConfigInfo value) {
        this.dhcpConfig = value;
    }

}
