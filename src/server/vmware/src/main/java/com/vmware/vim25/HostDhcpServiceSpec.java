
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDhcpServiceSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDhcpServiceSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="virtualSwitch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="defaultLeaseDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="leaseBeginIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="leaseEndIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="maxLeaseDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="unlimitedLease" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ipSubnetAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ipSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDhcpServiceSpec", propOrder = {
    "virtualSwitch",
    "defaultLeaseDuration",
    "leaseBeginIp",
    "leaseEndIp",
    "maxLeaseDuration",
    "unlimitedLease",
    "ipSubnetAddr",
    "ipSubnetMask"
})
public class HostDhcpServiceSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String virtualSwitch;
    protected int defaultLeaseDuration;
    @XmlElement(required = true)
    protected String leaseBeginIp;
    @XmlElement(required = true)
    protected String leaseEndIp;
    protected int maxLeaseDuration;
    protected boolean unlimitedLease;
    @XmlElement(required = true)
    protected String ipSubnetAddr;
    @XmlElement(required = true)
    protected String ipSubnetMask;

    /**
     * Gets the value of the virtualSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualSwitch() {
        return virtualSwitch;
    }

    /**
     * Sets the value of the virtualSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualSwitch(String value) {
        this.virtualSwitch = value;
    }

    /**
     * Gets the value of the defaultLeaseDuration property.
     * 
     */
    public int getDefaultLeaseDuration() {
        return defaultLeaseDuration;
    }

    /**
     * Sets the value of the defaultLeaseDuration property.
     * 
     */
    public void setDefaultLeaseDuration(int value) {
        this.defaultLeaseDuration = value;
    }

    /**
     * Gets the value of the leaseBeginIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseBeginIp() {
        return leaseBeginIp;
    }

    /**
     * Sets the value of the leaseBeginIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseBeginIp(String value) {
        this.leaseBeginIp = value;
    }

    /**
     * Gets the value of the leaseEndIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseEndIp() {
        return leaseEndIp;
    }

    /**
     * Sets the value of the leaseEndIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseEndIp(String value) {
        this.leaseEndIp = value;
    }

    /**
     * Gets the value of the maxLeaseDuration property.
     * 
     */
    public int getMaxLeaseDuration() {
        return maxLeaseDuration;
    }

    /**
     * Sets the value of the maxLeaseDuration property.
     * 
     */
    public void setMaxLeaseDuration(int value) {
        this.maxLeaseDuration = value;
    }

    /**
     * Gets the value of the unlimitedLease property.
     * 
     */
    public boolean isUnlimitedLease() {
        return unlimitedLease;
    }

    /**
     * Sets the value of the unlimitedLease property.
     * 
     */
    public void setUnlimitedLease(boolean value) {
        this.unlimitedLease = value;
    }

    /**
     * Gets the value of the ipSubnetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpSubnetAddr() {
        return ipSubnetAddr;
    }

    /**
     * Sets the value of the ipSubnetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpSubnetAddr(String value) {
        this.ipSubnetAddr = value;
    }

    /**
     * Gets the value of the ipSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpSubnetMask() {
        return ipSubnetMask;
    }

    /**
     * Sets the value of the ipSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpSubnetMask(String value) {
        this.ipSubnetMask = value;
    }

}
