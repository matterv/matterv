
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetIpConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetIpConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ipAddress" type="{urn:internalvim25}NetIpConfigSpecIpAddressSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dhcp" type="{urn:internalvim25}NetDhcpConfigSpec" minOccurs="0"/>
 *         <element name="autoConfigurationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpConfigSpec", propOrder = {
    "ipAddress",
    "dhcp",
    "autoConfigurationEnabled"
})
public class NetIpConfigSpec
    extends DynamicData
{

    protected List<NetIpConfigSpecIpAddressSpec> ipAddress;
    protected NetDhcpConfigSpec dhcp;
    protected Boolean autoConfigurationEnabled;

    /**
     * Gets the value of the ipAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIpAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetIpConfigSpecIpAddressSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the ipAddress property.
     */
    public List<NetIpConfigSpecIpAddressSpec> getIpAddress() {
        if (ipAddress == null) {
            ipAddress = new ArrayList<>();
        }
        return this.ipAddress;
    }

    /**
     * Gets the value of the dhcp property.
     * 
     * @return
     *     possible object is
     *     {@link NetDhcpConfigSpec }
     *     
     */
    public NetDhcpConfigSpec getDhcp() {
        return dhcp;
    }

    /**
     * Sets the value of the dhcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDhcpConfigSpec }
     *     
     */
    public void setDhcp(NetDhcpConfigSpec value) {
        this.dhcp = value;
    }

    /**
     * Gets the value of the autoConfigurationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoConfigurationEnabled() {
        return autoConfigurationEnabled;
    }

    /**
     * Sets the value of the autoConfigurationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoConfigurationEnabled(Boolean value) {
        this.autoConfigurationEnabled = value;
    }

}
