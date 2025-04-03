
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestNicInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestNicInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="network" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="macAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="connected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deviceConfigId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dnsConfig" type="{urn:internalvim25}NetDnsConfigInfo" minOccurs="0"/>
 *         <element name="ipConfig" type="{urn:internalvim25}NetIpConfigInfo" minOccurs="0"/>
 *         <element name="netBIOSConfig" type="{urn:internalvim25}NetBIOSConfigInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestNicInfo", propOrder = {
    "network",
    "ipAddress",
    "macAddress",
    "connected",
    "deviceConfigId",
    "dnsConfig",
    "ipConfig",
    "netBIOSConfig"
})
public class GuestNicInfo
    extends DynamicData
{

    protected String network;
    protected List<String> ipAddress;
    protected String macAddress;
    protected boolean connected;
    protected int deviceConfigId;
    protected NetDnsConfigInfo dnsConfig;
    protected NetIpConfigInfo ipConfig;
    protected NetBIOSConfigInfo netBIOSConfig;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

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
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the ipAddress property.
     */
    public List<String> getIpAddress() {
        if (ipAddress == null) {
            ipAddress = new ArrayList<>();
        }
        return this.ipAddress;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the connected property.
     * 
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     * 
     */
    public void setConnected(boolean value) {
        this.connected = value;
    }

    /**
     * Gets the value of the deviceConfigId property.
     * 
     */
    public int getDeviceConfigId() {
        return deviceConfigId;
    }

    /**
     * Sets the value of the deviceConfigId property.
     * 
     */
    public void setDeviceConfigId(int value) {
        this.deviceConfigId = value;
    }

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
     * Gets the value of the ipConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NetIpConfigInfo }
     *     
     */
    public NetIpConfigInfo getIpConfig() {
        return ipConfig;
    }

    /**
     * Sets the value of the ipConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetIpConfigInfo }
     *     
     */
    public void setIpConfig(NetIpConfigInfo value) {
        this.ipConfig = value;
    }

    /**
     * Gets the value of the netBIOSConfig property.
     * 
     * @return
     *     possible object is
     *     {@link NetBIOSConfigInfo }
     *     
     */
    public NetBIOSConfigInfo getNetBIOSConfig() {
        return netBIOSConfig;
    }

    /**
     * Sets the value of the netBIOSConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetBIOSConfigInfo }
     *     
     */
    public void setNetBIOSConfig(NetBIOSConfigInfo value) {
        this.netBIOSConfig = value;
    }

}
