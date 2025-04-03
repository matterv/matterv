
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetCapabilities">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="canSetPhysicalNicLinkSpeed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="supportsNicTeaming" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="nicTeamingPolicy" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="supportsVlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usesServiceConsoleNic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="supportsNetworkHints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="maxPortGroupsPerVswitch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="vswitchConfigSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="vnicConfigSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ipRouteConfigSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="dnsConfigSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="dhcpOnVnicSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ipV6Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="backupNfcNiocSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetCapabilities", propOrder = {
    "canSetPhysicalNicLinkSpeed",
    "supportsNicTeaming",
    "nicTeamingPolicy",
    "supportsVlan",
    "usesServiceConsoleNic",
    "supportsNetworkHints",
    "maxPortGroupsPerVswitch",
    "vswitchConfigSupported",
    "vnicConfigSupported",
    "ipRouteConfigSupported",
    "dnsConfigSupported",
    "dhcpOnVnicSupported",
    "ipV6Supported",
    "backupNfcNiocSupported"
})
public class HostNetCapabilities
    extends DynamicData
{

    protected boolean canSetPhysicalNicLinkSpeed;
    protected boolean supportsNicTeaming;
    protected List<String> nicTeamingPolicy;
    protected boolean supportsVlan;
    protected boolean usesServiceConsoleNic;
    protected boolean supportsNetworkHints;
    protected Integer maxPortGroupsPerVswitch;
    protected boolean vswitchConfigSupported;
    protected boolean vnicConfigSupported;
    protected boolean ipRouteConfigSupported;
    protected boolean dnsConfigSupported;
    protected boolean dhcpOnVnicSupported;
    protected Boolean ipV6Supported;
    protected Boolean backupNfcNiocSupported;

    /**
     * Gets the value of the canSetPhysicalNicLinkSpeed property.
     * 
     */
    public boolean isCanSetPhysicalNicLinkSpeed() {
        return canSetPhysicalNicLinkSpeed;
    }

    /**
     * Sets the value of the canSetPhysicalNicLinkSpeed property.
     * 
     */
    public void setCanSetPhysicalNicLinkSpeed(boolean value) {
        this.canSetPhysicalNicLinkSpeed = value;
    }

    /**
     * Gets the value of the supportsNicTeaming property.
     * 
     */
    public boolean isSupportsNicTeaming() {
        return supportsNicTeaming;
    }

    /**
     * Sets the value of the supportsNicTeaming property.
     * 
     */
    public void setSupportsNicTeaming(boolean value) {
        this.supportsNicTeaming = value;
    }

    /**
     * Gets the value of the nicTeamingPolicy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nicTeamingPolicy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNicTeamingPolicy().add(newItem);
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
     *     The value of the nicTeamingPolicy property.
     */
    public List<String> getNicTeamingPolicy() {
        if (nicTeamingPolicy == null) {
            nicTeamingPolicy = new ArrayList<>();
        }
        return this.nicTeamingPolicy;
    }

    /**
     * Gets the value of the supportsVlan property.
     * 
     */
    public boolean isSupportsVlan() {
        return supportsVlan;
    }

    /**
     * Sets the value of the supportsVlan property.
     * 
     */
    public void setSupportsVlan(boolean value) {
        this.supportsVlan = value;
    }

    /**
     * Gets the value of the usesServiceConsoleNic property.
     * 
     */
    public boolean isUsesServiceConsoleNic() {
        return usesServiceConsoleNic;
    }

    /**
     * Sets the value of the usesServiceConsoleNic property.
     * 
     */
    public void setUsesServiceConsoleNic(boolean value) {
        this.usesServiceConsoleNic = value;
    }

    /**
     * Gets the value of the supportsNetworkHints property.
     * 
     */
    public boolean isSupportsNetworkHints() {
        return supportsNetworkHints;
    }

    /**
     * Sets the value of the supportsNetworkHints property.
     * 
     */
    public void setSupportsNetworkHints(boolean value) {
        this.supportsNetworkHints = value;
    }

    /**
     * Gets the value of the maxPortGroupsPerVswitch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPortGroupsPerVswitch() {
        return maxPortGroupsPerVswitch;
    }

    /**
     * Sets the value of the maxPortGroupsPerVswitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPortGroupsPerVswitch(Integer value) {
        this.maxPortGroupsPerVswitch = value;
    }

    /**
     * Gets the value of the vswitchConfigSupported property.
     * 
     */
    public boolean isVswitchConfigSupported() {
        return vswitchConfigSupported;
    }

    /**
     * Sets the value of the vswitchConfigSupported property.
     * 
     */
    public void setVswitchConfigSupported(boolean value) {
        this.vswitchConfigSupported = value;
    }

    /**
     * Gets the value of the vnicConfigSupported property.
     * 
     */
    public boolean isVnicConfigSupported() {
        return vnicConfigSupported;
    }

    /**
     * Sets the value of the vnicConfigSupported property.
     * 
     */
    public void setVnicConfigSupported(boolean value) {
        this.vnicConfigSupported = value;
    }

    /**
     * Gets the value of the ipRouteConfigSupported property.
     * 
     */
    public boolean isIpRouteConfigSupported() {
        return ipRouteConfigSupported;
    }

    /**
     * Sets the value of the ipRouteConfigSupported property.
     * 
     */
    public void setIpRouteConfigSupported(boolean value) {
        this.ipRouteConfigSupported = value;
    }

    /**
     * Gets the value of the dnsConfigSupported property.
     * 
     */
    public boolean isDnsConfigSupported() {
        return dnsConfigSupported;
    }

    /**
     * Sets the value of the dnsConfigSupported property.
     * 
     */
    public void setDnsConfigSupported(boolean value) {
        this.dnsConfigSupported = value;
    }

    /**
     * Gets the value of the dhcpOnVnicSupported property.
     * 
     */
    public boolean isDhcpOnVnicSupported() {
        return dhcpOnVnicSupported;
    }

    /**
     * Sets the value of the dhcpOnVnicSupported property.
     * 
     */
    public void setDhcpOnVnicSupported(boolean value) {
        this.dhcpOnVnicSupported = value;
    }

    /**
     * Gets the value of the ipV6Supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpV6Supported() {
        return ipV6Supported;
    }

    /**
     * Sets the value of the ipV6Supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpV6Supported(Boolean value) {
        this.ipV6Supported = value;
    }

    /**
     * Gets the value of the backupNfcNiocSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackupNfcNiocSupported() {
        return backupNfcNiocSupported;
    }

    /**
     * Sets the value of the backupNfcNiocSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackupNfcNiocSupported(Boolean value) {
        this.backupNfcNiocSupported = value;
    }

}
