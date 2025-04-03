
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetStackInstance complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetStackInstance">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dnsConfig" type="{urn:internalvim25}HostDnsConfig" minOccurs="0"/>
 *         <element name="ipRouteConfig" type="{urn:internalvim25}HostIpRouteConfig" minOccurs="0"/>
 *         <element name="requestedMaxNumberOfConnections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="congestionControlAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipV6Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="routeTableConfig" type="{urn:internalvim25}HostIpRouteTableConfig" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetStackInstance", propOrder = {
    "key",
    "name",
    "dnsConfig",
    "ipRouteConfig",
    "requestedMaxNumberOfConnections",
    "congestionControlAlgorithm",
    "ipV6Enabled",
    "routeTableConfig"
})
public class HostNetStackInstance
    extends DynamicData
{

    protected String key;
    protected String name;
    protected HostDnsConfig dnsConfig;
    protected HostIpRouteConfig ipRouteConfig;
    protected Integer requestedMaxNumberOfConnections;
    protected String congestionControlAlgorithm;
    protected Boolean ipV6Enabled;
    protected HostIpRouteTableConfig routeTableConfig;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the dnsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostDnsConfig }
     *     
     */
    public HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Sets the value of the dnsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDnsConfig }
     *     
     */
    public void setDnsConfig(HostDnsConfig value) {
        this.dnsConfig = value;
    }

    /**
     * Gets the value of the ipRouteConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }

    /**
     * Sets the value of the ipRouteConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteConfig }
     *     
     */
    public void setIpRouteConfig(HostIpRouteConfig value) {
        this.ipRouteConfig = value;
    }

    /**
     * Gets the value of the requestedMaxNumberOfConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestedMaxNumberOfConnections() {
        return requestedMaxNumberOfConnections;
    }

    /**
     * Sets the value of the requestedMaxNumberOfConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestedMaxNumberOfConnections(Integer value) {
        this.requestedMaxNumberOfConnections = value;
    }

    /**
     * Gets the value of the congestionControlAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongestionControlAlgorithm() {
        return congestionControlAlgorithm;
    }

    /**
     * Sets the value of the congestionControlAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongestionControlAlgorithm(String value) {
        this.congestionControlAlgorithm = value;
    }

    /**
     * Gets the value of the ipV6Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpV6Enabled() {
        return ipV6Enabled;
    }

    /**
     * Sets the value of the ipV6Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpV6Enabled(Boolean value) {
        this.ipV6Enabled = value;
    }

    /**
     * Gets the value of the routeTableConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpRouteTableConfig }
     *     
     */
    public HostIpRouteTableConfig getRouteTableConfig() {
        return routeTableConfig;
    }

    /**
     * Sets the value of the routeTableConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpRouteTableConfig }
     *     
     */
    public void setRouteTableConfig(HostIpRouteTableConfig value) {
        this.routeTableConfig = value;
    }

}
