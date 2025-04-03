
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaIPProperties complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHbaIPProperties">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="mac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dhcpConfigurationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="subnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="defaultGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="primaryDnsServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alternateDnsServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipv6Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipv6SubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipv6DefaultGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="arpRedirectEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="jumboFramesEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv4Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6properties" type="{urn:internalvim25}HostInternetScsiHbaIPv6Properties" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaIPProperties", propOrder = {
    "mac",
    "address",
    "dhcpConfigurationEnabled",
    "subnetMask",
    "defaultGateway",
    "primaryDnsServerAddress",
    "alternateDnsServerAddress",
    "ipv6Address",
    "ipv6SubnetMask",
    "ipv6DefaultGateway",
    "arpRedirectEnabled",
    "mtu",
    "jumboFramesEnabled",
    "ipv4Enabled",
    "ipv6Enabled",
    "ipv6Properties"
})
public class HostInternetScsiHbaIPProperties
    extends DynamicData
{

    protected String mac;
    protected String address;
    protected boolean dhcpConfigurationEnabled;
    protected String subnetMask;
    protected String defaultGateway;
    protected String primaryDnsServerAddress;
    protected String alternateDnsServerAddress;
    protected String ipv6Address;
    protected String ipv6SubnetMask;
    protected String ipv6DefaultGateway;
    protected Boolean arpRedirectEnabled;
    protected Integer mtu;
    protected Boolean jumboFramesEnabled;
    protected Boolean ipv4Enabled;
    protected Boolean ipv6Enabled;
    @XmlElement(name = "ipv6properties")
    protected HostInternetScsiHbaIPv6Properties ipv6Properties;

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the dhcpConfigurationEnabled property.
     * 
     */
    public boolean isDhcpConfigurationEnabled() {
        return dhcpConfigurationEnabled;
    }

    /**
     * Sets the value of the dhcpConfigurationEnabled property.
     * 
     */
    public void setDhcpConfigurationEnabled(boolean value) {
        this.dhcpConfigurationEnabled = value;
    }

    /**
     * Gets the value of the subnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetMask() {
        return subnetMask;
    }

    /**
     * Sets the value of the subnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetMask(String value) {
        this.subnetMask = value;
    }

    /**
     * Gets the value of the defaultGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultGateway() {
        return defaultGateway;
    }

    /**
     * Sets the value of the defaultGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultGateway(String value) {
        this.defaultGateway = value;
    }

    /**
     * Gets the value of the primaryDnsServerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDnsServerAddress() {
        return primaryDnsServerAddress;
    }

    /**
     * Sets the value of the primaryDnsServerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDnsServerAddress(String value) {
        this.primaryDnsServerAddress = value;
    }

    /**
     * Gets the value of the alternateDnsServerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateDnsServerAddress() {
        return alternateDnsServerAddress;
    }

    /**
     * Sets the value of the alternateDnsServerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateDnsServerAddress(String value) {
        this.alternateDnsServerAddress = value;
    }

    /**
     * Gets the value of the ipv6Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * Sets the value of the ipv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6Address(String value) {
        this.ipv6Address = value;
    }

    /**
     * Gets the value of the ipv6SubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6SubnetMask() {
        return ipv6SubnetMask;
    }

    /**
     * Sets the value of the ipv6SubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6SubnetMask(String value) {
        this.ipv6SubnetMask = value;
    }

    /**
     * Gets the value of the ipv6DefaultGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6DefaultGateway() {
        return ipv6DefaultGateway;
    }

    /**
     * Sets the value of the ipv6DefaultGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6DefaultGateway(String value) {
        this.ipv6DefaultGateway = value;
    }

    /**
     * Gets the value of the arpRedirectEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArpRedirectEnabled() {
        return arpRedirectEnabled;
    }

    /**
     * Sets the value of the arpRedirectEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArpRedirectEnabled(Boolean value) {
        this.arpRedirectEnabled = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMtu(Integer value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the jumboFramesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJumboFramesEnabled() {
        return jumboFramesEnabled;
    }

    /**
     * Sets the value of the jumboFramesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJumboFramesEnabled(Boolean value) {
        this.jumboFramesEnabled = value;
    }

    /**
     * Gets the value of the ipv4Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv4Enabled() {
        return ipv4Enabled;
    }

    /**
     * Sets the value of the ipv4Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv4Enabled(Boolean value) {
        this.ipv4Enabled = value;
    }

    /**
     * Gets the value of the ipv6Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6Enabled() {
        return ipv6Enabled;
    }

    /**
     * Sets the value of the ipv6Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6Enabled(Boolean value) {
        this.ipv6Enabled = value;
    }

    /**
     * Gets the value of the ipv6Properties property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaIPv6Properties }
     *     
     */
    public HostInternetScsiHbaIPv6Properties getIpv6Properties() {
        return ipv6Properties;
    }

    /**
     * Sets the value of the ipv6Properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaIPv6Properties }
     *     
     */
    public void setIpv6Properties(HostInternetScsiHbaIPv6Properties value) {
        this.ipv6Properties = value;
    }

}
