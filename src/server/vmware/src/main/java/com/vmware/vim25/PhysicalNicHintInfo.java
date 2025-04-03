
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalNicHintInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PhysicalNicHintInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="subnet" type="{urn:internalvim25}PhysicalNicIpHint" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="network" type="{urn:internalvim25}PhysicalNicNameHint" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="connectedSwitchPort" type="{urn:internalvim25}PhysicalNicCdpInfo" minOccurs="0"/>
 *         <element name="lldpInfo" type="{urn:internalvim25}LinkLayerDiscoveryProtocolInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicHintInfo", propOrder = {
    "device",
    "subnet",
    "network",
    "connectedSwitchPort",
    "lldpInfo"
})
public class PhysicalNicHintInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String device;
    protected List<PhysicalNicIpHint> subnet;
    protected List<PhysicalNicNameHint> network;
    protected PhysicalNicCdpInfo connectedSwitchPort;
    protected LinkLayerDiscoveryProtocolInfo lldpInfo;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the subnet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subnet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSubnet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalNicIpHint }
     * </p>
     * 
     * 
     * @return
     *     The value of the subnet property.
     */
    public List<PhysicalNicIpHint> getSubnet() {
        if (subnet == null) {
            subnet = new ArrayList<>();
        }
        return this.subnet;
    }

    /**
     * Gets the value of the network property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the network property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalNicNameHint }
     * </p>
     * 
     * 
     * @return
     *     The value of the network property.
     */
    public List<PhysicalNicNameHint> getNetwork() {
        if (network == null) {
            network = new ArrayList<>();
        }
        return this.network;
    }

    /**
     * Gets the value of the connectedSwitchPort property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalNicCdpInfo }
     *     
     */
    public PhysicalNicCdpInfo getConnectedSwitchPort() {
        return connectedSwitchPort;
    }

    /**
     * Sets the value of the connectedSwitchPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalNicCdpInfo }
     *     
     */
    public void setConnectedSwitchPort(PhysicalNicCdpInfo value) {
        this.connectedSwitchPort = value;
    }

    /**
     * Gets the value of the lldpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LinkLayerDiscoveryProtocolInfo }
     *     
     */
    public LinkLayerDiscoveryProtocolInfo getLldpInfo() {
        return lldpInfo;
    }

    /**
     * Sets the value of the lldpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkLayerDiscoveryProtocolInfo }
     *     
     */
    public void setLldpInfo(LinkLayerDiscoveryProtocolInfo value) {
        this.lldpInfo = value;
    }

}
