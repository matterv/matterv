
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDnsConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDnsConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dhcp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="virtualNicDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipv6VirtualNicDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="address" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="searchDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDnsConfig", propOrder = {
    "dhcp",
    "virtualNicDevice",
    "ipv6VirtualNicDevice",
    "hostName",
    "domainName",
    "address",
    "searchDomain"
})
@XmlSeeAlso({
    HostDnsConfigSpec.class
})
public class HostDnsConfig
    extends DynamicData
{

    protected boolean dhcp;
    protected String virtualNicDevice;
    protected String ipv6VirtualNicDevice;
    @XmlElement(required = true)
    protected String hostName;
    @XmlElement(required = true)
    protected String domainName;
    protected List<String> address;
    protected List<String> searchDomain;

    /**
     * Gets the value of the dhcp property.
     * 
     */
    public boolean isDhcp() {
        return dhcp;
    }

    /**
     * Sets the value of the dhcp property.
     * 
     */
    public void setDhcp(boolean value) {
        this.dhcp = value;
    }

    /**
     * Gets the value of the virtualNicDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualNicDevice() {
        return virtualNicDevice;
    }

    /**
     * Sets the value of the virtualNicDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualNicDevice(String value) {
        this.virtualNicDevice = value;
    }

    /**
     * Gets the value of the ipv6VirtualNicDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6VirtualNicDevice() {
        return ipv6VirtualNicDevice;
    }

    /**
     * Sets the value of the ipv6VirtualNicDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6VirtualNicDevice(String value) {
        this.ipv6VirtualNicDevice = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the address property.
     */
    public List<String> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

    /**
     * Gets the value of the searchDomain property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDomain property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchDomain property.
     */
    public List<String> getSearchDomain() {
        if (searchDomain == null) {
            searchDomain = new ArrayList<>();
        }
        return this.searchDomain;
    }

}
