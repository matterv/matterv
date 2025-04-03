
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaIPv6Properties complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHbaIPv6Properties">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="iscsiIpv6Address" type="{urn:internalvim25}HostInternetScsiHbaIscsiIpv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipv6DhcpConfigurationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6LinkLocalAutoConfigurationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6RouterAdvertisementConfigurationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipv6DefaultGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaIPv6Properties", propOrder = {
    "iscsiIpv6Address",
    "ipv6DhcpConfigurationEnabled",
    "ipv6LinkLocalAutoConfigurationEnabled",
    "ipv6RouterAdvertisementConfigurationEnabled",
    "ipv6DefaultGateway"
})
public class HostInternetScsiHbaIPv6Properties
    extends DynamicData
{

    protected List<HostInternetScsiHbaIscsiIpv6Address> iscsiIpv6Address;
    protected Boolean ipv6DhcpConfigurationEnabled;
    protected Boolean ipv6LinkLocalAutoConfigurationEnabled;
    protected Boolean ipv6RouterAdvertisementConfigurationEnabled;
    protected String ipv6DefaultGateway;

    /**
     * Gets the value of the iscsiIpv6Address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iscsiIpv6Address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIscsiIpv6Address().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostInternetScsiHbaIscsiIpv6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the iscsiIpv6Address property.
     */
    public List<HostInternetScsiHbaIscsiIpv6Address> getIscsiIpv6Address() {
        if (iscsiIpv6Address == null) {
            iscsiIpv6Address = new ArrayList<>();
        }
        return this.iscsiIpv6Address;
    }

    /**
     * Gets the value of the ipv6DhcpConfigurationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6DhcpConfigurationEnabled() {
        return ipv6DhcpConfigurationEnabled;
    }

    /**
     * Sets the value of the ipv6DhcpConfigurationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6DhcpConfigurationEnabled(Boolean value) {
        this.ipv6DhcpConfigurationEnabled = value;
    }

    /**
     * Gets the value of the ipv6LinkLocalAutoConfigurationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6LinkLocalAutoConfigurationEnabled() {
        return ipv6LinkLocalAutoConfigurationEnabled;
    }

    /**
     * Sets the value of the ipv6LinkLocalAutoConfigurationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6LinkLocalAutoConfigurationEnabled(Boolean value) {
        this.ipv6LinkLocalAutoConfigurationEnabled = value;
    }

    /**
     * Gets the value of the ipv6RouterAdvertisementConfigurationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpv6RouterAdvertisementConfigurationEnabled() {
        return ipv6RouterAdvertisementConfigurationEnabled;
    }

    /**
     * Sets the value of the ipv6RouterAdvertisementConfigurationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpv6RouterAdvertisementConfigurationEnabled(Boolean value) {
        this.ipv6RouterAdvertisementConfigurationEnabled = value;
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

}
