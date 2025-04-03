
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaIPCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHbaIPCapabilities">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="addressSettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ipConfigurationMethodSettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="subnetMaskSettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="defaultGatewaySettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="primaryDnsServerAddressSettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="alternateDnsServerAddressSettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ipv6Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="arpRedirectSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mtuSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hostNameAsTargetAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="nameAliasSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv4EnableSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6EnableSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6PrefixLengthSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6PrefixLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ipv6DhcpConfigurationSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6LinkLocalAutoConfigurationSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6RouterAdvertisementConfigurationSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6DefaultGatewaySettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6MaxStaticAddressesSupported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaIPCapabilities", propOrder = {
    "addressSettable",
    "ipConfigurationMethodSettable",
    "subnetMaskSettable",
    "defaultGatewaySettable",
    "primaryDnsServerAddressSettable",
    "alternateDnsServerAddressSettable",
    "ipv6Supported",
    "arpRedirectSettable",
    "mtuSettable",
    "hostNameAsTargetAddress",
    "nameAliasSettable",
    "ipv4EnableSettable",
    "ipv6EnableSettable",
    "ipv6PrefixLengthSettable",
    "ipv6PrefixLength",
    "ipv6DhcpConfigurationSettable",
    "ipv6LinkLocalAutoConfigurationSettable",
    "ipv6RouterAdvertisementConfigurationSettable",
    "ipv6DefaultGatewaySettable",
    "ipv6MaxStaticAddressesSupported"
})
public class HostInternetScsiHbaIPCapabilities
    extends DynamicData
{

    protected boolean addressSettable;
    protected boolean ipConfigurationMethodSettable;
    protected boolean subnetMaskSettable;
    protected boolean defaultGatewaySettable;
    protected boolean primaryDnsServerAddressSettable;
    protected boolean alternateDnsServerAddressSettable;
    protected Boolean ipv6Supported;
    protected Boolean arpRedirectSettable;
    protected Boolean mtuSettable;
    protected Boolean hostNameAsTargetAddress;
    protected Boolean nameAliasSettable;
    protected Boolean ipv4EnableSettable;
    protected Boolean ipv6EnableSettable;
    protected Boolean ipv6PrefixLengthSettable;
    protected Integer ipv6PrefixLength;
    protected Boolean ipv6DhcpConfigurationSettable;
    protected Boolean ipv6LinkLocalAutoConfigurationSettable;
    protected Boolean ipv6RouterAdvertisementConfigurationSettable;
    protected Boolean ipv6DefaultGatewaySettable;
    protected Integer ipv6MaxStaticAddressesSupported;

    /**
     * Gets the value of the addressSettable property.
     * 
     */
    public boolean isAddressSettable() {
        return addressSettable;
    }

    /**
     * Sets the value of the addressSettable property.
     * 
     */
    public void setAddressSettable(boolean value) {
        this.addressSettable = value;
    }

    /**
     * Gets the value of the ipConfigurationMethodSettable property.
     * 
     */
    public boolean isIpConfigurationMethodSettable() {
        return ipConfigurationMethodSettable;
    }

    /**
     * Sets the value of the ipConfigurationMethodSettable property.
     * 
     */
    public void setIpConfigurationMethodSettable(boolean value) {
        this.ipConfigurationMethodSettable = value;
    }

    /**
     * Gets the value of the subnetMaskSettable property.
     * 
     */
    public boolean isSubnetMaskSettable() {
        return subnetMaskSettable;
    }

    /**
     * Sets the value of the subnetMaskSettable property.
     * 
     */
    public void setSubnetMaskSettable(boolean value) {
        this.subnetMaskSettable = value;
    }

    /**
     * Gets the value of the defaultGatewaySettable property.
     * 
     */
    public boolean isDefaultGatewaySettable() {
        return defaultGatewaySettable;
    }

    /**
     * Sets the value of the defaultGatewaySettable property.
     * 
     */
    public void setDefaultGatewaySettable(boolean value) {
        this.defaultGatewaySettable = value;
    }

    /**
     * Gets the value of the primaryDnsServerAddressSettable property.
     * 
     */
    public boolean isPrimaryDnsServerAddressSettable() {
        return primaryDnsServerAddressSettable;
    }

    /**
     * Sets the value of the primaryDnsServerAddressSettable property.
     * 
     */
    public void setPrimaryDnsServerAddressSettable(boolean value) {
        this.primaryDnsServerAddressSettable = value;
    }

    /**
     * Gets the value of the alternateDnsServerAddressSettable property.
     * 
     */
    public boolean isAlternateDnsServerAddressSettable() {
        return alternateDnsServerAddressSettable;
    }

    /**
     * Sets the value of the alternateDnsServerAddressSettable property.
     * 
     */
    public void setAlternateDnsServerAddressSettable(boolean value) {
        this.alternateDnsServerAddressSettable = value;
    }

    /**
     * Gets the value of the ipv6Supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6Supported() {
        return ipv6Supported;
    }

    /**
     * Sets the value of the ipv6Supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6Supported(Boolean value) {
        this.ipv6Supported = value;
    }

    /**
     * Gets the value of the arpRedirectSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArpRedirectSettable() {
        return arpRedirectSettable;
    }

    /**
     * Sets the value of the arpRedirectSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArpRedirectSettable(Boolean value) {
        this.arpRedirectSettable = value;
    }

    /**
     * Gets the value of the mtuSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMtuSettable() {
        return mtuSettable;
    }

    /**
     * Sets the value of the mtuSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMtuSettable(Boolean value) {
        this.mtuSettable = value;
    }

    /**
     * Gets the value of the hostNameAsTargetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostNameAsTargetAddress() {
        return hostNameAsTargetAddress;
    }

    /**
     * Sets the value of the hostNameAsTargetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostNameAsTargetAddress(Boolean value) {
        this.hostNameAsTargetAddress = value;
    }

    /**
     * Gets the value of the nameAliasSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNameAliasSettable() {
        return nameAliasSettable;
    }

    /**
     * Sets the value of the nameAliasSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNameAliasSettable(Boolean value) {
        this.nameAliasSettable = value;
    }

    /**
     * Gets the value of the ipv4EnableSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv4EnableSettable() {
        return ipv4EnableSettable;
    }

    /**
     * Sets the value of the ipv4EnableSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv4EnableSettable(Boolean value) {
        this.ipv4EnableSettable = value;
    }

    /**
     * Gets the value of the ipv6EnableSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6EnableSettable() {
        return ipv6EnableSettable;
    }

    /**
     * Sets the value of the ipv6EnableSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6EnableSettable(Boolean value) {
        this.ipv6EnableSettable = value;
    }

    /**
     * Gets the value of the ipv6PrefixLengthSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6PrefixLengthSettable() {
        return ipv6PrefixLengthSettable;
    }

    /**
     * Sets the value of the ipv6PrefixLengthSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6PrefixLengthSettable(Boolean value) {
        this.ipv6PrefixLengthSettable = value;
    }

    /**
     * Gets the value of the ipv6PrefixLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpv6PrefixLength() {
        return ipv6PrefixLength;
    }

    /**
     * Sets the value of the ipv6PrefixLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpv6PrefixLength(Integer value) {
        this.ipv6PrefixLength = value;
    }

    /**
     * Gets the value of the ipv6DhcpConfigurationSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6DhcpConfigurationSettable() {
        return ipv6DhcpConfigurationSettable;
    }

    /**
     * Sets the value of the ipv6DhcpConfigurationSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6DhcpConfigurationSettable(Boolean value) {
        this.ipv6DhcpConfigurationSettable = value;
    }

    /**
     * Gets the value of the ipv6LinkLocalAutoConfigurationSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6LinkLocalAutoConfigurationSettable() {
        return ipv6LinkLocalAutoConfigurationSettable;
    }

    /**
     * Sets the value of the ipv6LinkLocalAutoConfigurationSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6LinkLocalAutoConfigurationSettable(Boolean value) {
        this.ipv6LinkLocalAutoConfigurationSettable = value;
    }

    /**
     * Gets the value of the ipv6RouterAdvertisementConfigurationSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6RouterAdvertisementConfigurationSettable() {
        return ipv6RouterAdvertisementConfigurationSettable;
    }

    /**
     * Sets the value of the ipv6RouterAdvertisementConfigurationSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6RouterAdvertisementConfigurationSettable(Boolean value) {
        this.ipv6RouterAdvertisementConfigurationSettable = value;
    }

    /**
     * Gets the value of the ipv6DefaultGatewaySettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6DefaultGatewaySettable() {
        return ipv6DefaultGatewaySettable;
    }

    /**
     * Sets the value of the ipv6DefaultGatewaySettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6DefaultGatewaySettable(Boolean value) {
        this.ipv6DefaultGatewaySettable = value;
    }

    /**
     * Gets the value of the ipv6MaxStaticAddressesSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpv6MaxStaticAddressesSupported() {
        return ipv6MaxStaticAddressesSupported;
    }

    /**
     * Sets the value of the ipv6MaxStaticAddressesSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpv6MaxStaticAddressesSupported(Integer value) {
        this.ipv6MaxStaticAddressesSupported = value;
    }

}
