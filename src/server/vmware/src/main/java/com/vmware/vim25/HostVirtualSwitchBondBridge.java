
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVirtualSwitchBondBridge complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVirtualSwitchBondBridge">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostVirtualSwitchBridge">
 *       <sequence>
 *         <element name="nicDevice" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="beacon" type="{urn:internalvim25}HostVirtualSwitchBeaconConfig" minOccurs="0"/>
 *         <element name="linkDiscoveryProtocolConfig" type="{urn:internalvim25}LinkDiscoveryProtocolConfig" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchBondBridge", propOrder = {
    "nicDevice",
    "beacon",
    "linkDiscoveryProtocolConfig"
})
public class HostVirtualSwitchBondBridge
    extends HostVirtualSwitchBridge
{

    @XmlElement(required = true)
    protected List<String> nicDevice;
    protected HostVirtualSwitchBeaconConfig beacon;
    protected LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;

    /**
     * Gets the value of the nicDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nicDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNicDevice().add(newItem);
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
     *     The value of the nicDevice property.
     */
    public List<String> getNicDevice() {
        if (nicDevice == null) {
            nicDevice = new ArrayList<>();
        }
        return this.nicDevice;
    }

    /**
     * Gets the value of the beacon property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualSwitchBeaconConfig }
     *     
     */
    public HostVirtualSwitchBeaconConfig getBeacon() {
        return beacon;
    }

    /**
     * Sets the value of the beacon property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualSwitchBeaconConfig }
     *     
     */
    public void setBeacon(HostVirtualSwitchBeaconConfig value) {
        this.beacon = value;
    }

    /**
     * Gets the value of the linkDiscoveryProtocolConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LinkDiscoveryProtocolConfig }
     *     
     */
    public LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
        return linkDiscoveryProtocolConfig;
    }

    /**
     * Sets the value of the linkDiscoveryProtocolConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkDiscoveryProtocolConfig }
     *     
     */
    public void setLinkDiscoveryProtocolConfig(LinkDiscoveryProtocolConfig value) {
        this.linkDiscoveryProtocolConfig = value;
    }

}
