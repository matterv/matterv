
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IpPool complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IpPool">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipv4Config" type="{urn:internalvim25}IpPoolIpPoolConfigInfo" minOccurs="0"/>
 *         <element name="ipv6Config" type="{urn:internalvim25}IpPoolIpPoolConfigInfo" minOccurs="0"/>
 *         <element name="dnsDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dnsSearchPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hostPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="httpProxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="networkAssociation" type="{urn:internalvim25}IpPoolAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="availableIpv4Addresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="availableIpv6Addresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="allocatedIpv4Addresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="allocatedIpv6Addresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpPool", propOrder = {
    "id",
    "name",
    "ipv4Config",
    "ipv6Config",
    "dnsDomain",
    "dnsSearchPath",
    "hostPrefix",
    "httpProxy",
    "networkAssociation",
    "availableIpv4Addresses",
    "availableIpv6Addresses",
    "allocatedIpv4Addresses",
    "allocatedIpv6Addresses"
})
public class IpPool
    extends DynamicData
{

    protected Integer id;
    protected String name;
    protected IpPoolIpPoolConfigInfo ipv4Config;
    protected IpPoolIpPoolConfigInfo ipv6Config;
    protected String dnsDomain;
    protected String dnsSearchPath;
    protected String hostPrefix;
    protected String httpProxy;
    protected List<IpPoolAssociation> networkAssociation;
    protected Integer availableIpv4Addresses;
    protected Integer availableIpv6Addresses;
    protected Integer allocatedIpv4Addresses;
    protected Integer allocatedIpv6Addresses;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ipv4Config property.
     * 
     * @return
     *     possible object is
     *     {@link IpPoolIpPoolConfigInfo }
     *     
     */
    public IpPoolIpPoolConfigInfo getIpv4Config() {
        return ipv4Config;
    }

    /**
     * Sets the value of the ipv4Config property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpPoolIpPoolConfigInfo }
     *     
     */
    public void setIpv4Config(IpPoolIpPoolConfigInfo value) {
        this.ipv4Config = value;
    }

    /**
     * Gets the value of the ipv6Config property.
     * 
     * @return
     *     possible object is
     *     {@link IpPoolIpPoolConfigInfo }
     *     
     */
    public IpPoolIpPoolConfigInfo getIpv6Config() {
        return ipv6Config;
    }

    /**
     * Sets the value of the ipv6Config property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpPoolIpPoolConfigInfo }
     *     
     */
    public void setIpv6Config(IpPoolIpPoolConfigInfo value) {
        this.ipv6Config = value;
    }

    /**
     * Gets the value of the dnsDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnsDomain() {
        return dnsDomain;
    }

    /**
     * Sets the value of the dnsDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnsDomain(String value) {
        this.dnsDomain = value;
    }

    /**
     * Gets the value of the dnsSearchPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnsSearchPath() {
        return dnsSearchPath;
    }

    /**
     * Sets the value of the dnsSearchPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnsSearchPath(String value) {
        this.dnsSearchPath = value;
    }

    /**
     * Gets the value of the hostPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostPrefix() {
        return hostPrefix;
    }

    /**
     * Sets the value of the hostPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostPrefix(String value) {
        this.hostPrefix = value;
    }

    /**
     * Gets the value of the httpProxy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpProxy() {
        return httpProxy;
    }

    /**
     * Sets the value of the httpProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpProxy(String value) {
        this.httpProxy = value;
    }

    /**
     * Gets the value of the networkAssociation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkAssociation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetworkAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IpPoolAssociation }
     * </p>
     * 
     * 
     * @return
     *     The value of the networkAssociation property.
     */
    public List<IpPoolAssociation> getNetworkAssociation() {
        if (networkAssociation == null) {
            networkAssociation = new ArrayList<>();
        }
        return this.networkAssociation;
    }

    /**
     * Gets the value of the availableIpv4Addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableIpv4Addresses() {
        return availableIpv4Addresses;
    }

    /**
     * Sets the value of the availableIpv4Addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableIpv4Addresses(Integer value) {
        this.availableIpv4Addresses = value;
    }

    /**
     * Gets the value of the availableIpv6Addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableIpv6Addresses() {
        return availableIpv6Addresses;
    }

    /**
     * Sets the value of the availableIpv6Addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableIpv6Addresses(Integer value) {
        this.availableIpv6Addresses = value;
    }

    /**
     * Gets the value of the allocatedIpv4Addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllocatedIpv4Addresses() {
        return allocatedIpv4Addresses;
    }

    /**
     * Sets the value of the allocatedIpv4Addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllocatedIpv4Addresses(Integer value) {
        this.allocatedIpv4Addresses = value;
    }

    /**
     * Gets the value of the allocatedIpv6Addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllocatedIpv6Addresses() {
        return allocatedIpv6Addresses;
    }

    /**
     * Sets the value of the allocatedIpv6Addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllocatedIpv6Addresses(Integer value) {
        this.allocatedIpv6Addresses = value;
    }

}
