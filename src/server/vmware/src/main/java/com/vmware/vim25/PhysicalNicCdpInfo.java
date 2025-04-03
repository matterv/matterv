
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalNicCdpInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PhysicalNicCdpInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="cdpVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ttl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="samples" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="devId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="portId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceCapability" type="{urn:internalvim25}PhysicalNicCdpDeviceCapability" minOccurs="0"/>
 *         <element name="softwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hardwarePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipPrefixLen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="vlan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="fullDuplex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="systemOID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mgmtAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicCdpInfo", propOrder = {
    "cdpVersion",
    "timeout",
    "ttl",
    "samples",
    "devId",
    "address",
    "portId",
    "deviceCapability",
    "softwareVersion",
    "hardwarePlatform",
    "ipPrefix",
    "ipPrefixLen",
    "vlan",
    "fullDuplex",
    "mtu",
    "systemName",
    "systemOID",
    "mgmtAddr",
    "location"
})
public class PhysicalNicCdpInfo
    extends DynamicData
{

    protected Integer cdpVersion;
    protected Integer timeout;
    protected Integer ttl;
    protected Integer samples;
    protected String devId;
    protected String address;
    protected String portId;
    protected PhysicalNicCdpDeviceCapability deviceCapability;
    protected String softwareVersion;
    protected String hardwarePlatform;
    protected String ipPrefix;
    protected Integer ipPrefixLen;
    protected Integer vlan;
    protected Boolean fullDuplex;
    protected Integer mtu;
    protected String systemName;
    protected String systemOID;
    protected String mgmtAddr;
    protected String location;

    /**
     * Gets the value of the cdpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdpVersion() {
        return cdpVersion;
    }

    /**
     * Sets the value of the cdpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdpVersion(Integer value) {
        this.cdpVersion = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTtl(Integer value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the samples property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSamples() {
        return samples;
    }

    /**
     * Sets the value of the samples property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSamples(Integer value) {
        this.samples = value;
    }

    /**
     * Gets the value of the devId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevId() {
        return devId;
    }

    /**
     * Sets the value of the devId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevId(String value) {
        this.devId = value;
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
     * Gets the value of the portId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortId() {
        return portId;
    }

    /**
     * Sets the value of the portId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortId(String value) {
        this.portId = value;
    }

    /**
     * Gets the value of the deviceCapability property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalNicCdpDeviceCapability }
     *     
     */
    public PhysicalNicCdpDeviceCapability getDeviceCapability() {
        return deviceCapability;
    }

    /**
     * Sets the value of the deviceCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalNicCdpDeviceCapability }
     *     
     */
    public void setDeviceCapability(PhysicalNicCdpDeviceCapability value) {
        this.deviceCapability = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the hardwarePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * Sets the value of the hardwarePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwarePlatform(String value) {
        this.hardwarePlatform = value;
    }

    /**
     * Gets the value of the ipPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpPrefix() {
        return ipPrefix;
    }

    /**
     * Sets the value of the ipPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpPrefix(String value) {
        this.ipPrefix = value;
    }

    /**
     * Gets the value of the ipPrefixLen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpPrefixLen() {
        return ipPrefixLen;
    }

    /**
     * Sets the value of the ipPrefixLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpPrefixLen(Integer value) {
        this.ipPrefixLen = value;
    }

    /**
     * Gets the value of the vlan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVlan() {
        return vlan;
    }

    /**
     * Sets the value of the vlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVlan(Integer value) {
        this.vlan = value;
    }

    /**
     * Gets the value of the fullDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullDuplex() {
        return fullDuplex;
    }

    /**
     * Sets the value of the fullDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullDuplex(Boolean value) {
        this.fullDuplex = value;
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
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets the value of the systemOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemOID() {
        return systemOID;
    }

    /**
     * Sets the value of the systemOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemOID(String value) {
        this.systemOID = value;
    }

    /**
     * Gets the value of the mgmtAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgmtAddr() {
        return mgmtAddr;
    }

    /**
     * Sets the value of the mgmtAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgmtAddr(String value) {
        this.mgmtAddr = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
