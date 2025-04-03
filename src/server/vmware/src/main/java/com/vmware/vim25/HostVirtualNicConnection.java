
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVirtualNicConnection complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVirtualNicConnection">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="portgroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dvPort" type="{urn:internalvim25}DistributedVirtualSwitchPortConnection" minOccurs="0"/>
 *         <element name="opNetwork" type="{urn:internalvim25}HostVirtualNicOpaqueNetworkSpec" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicConnection", propOrder = {
    "portgroup",
    "dvPort",
    "opNetwork"
})
public class HostVirtualNicConnection
    extends DynamicData
{

    protected String portgroup;
    protected DistributedVirtualSwitchPortConnection dvPort;
    protected HostVirtualNicOpaqueNetworkSpec opNetwork;

    /**
     * Gets the value of the portgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortgroup() {
        return portgroup;
    }

    /**
     * Sets the value of the portgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortgroup(String value) {
        this.portgroup = value;
    }

    /**
     * Gets the value of the dvPort property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchPortConnection }
     *     
     */
    public DistributedVirtualSwitchPortConnection getDvPort() {
        return dvPort;
    }

    /**
     * Sets the value of the dvPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchPortConnection }
     *     
     */
    public void setDvPort(DistributedVirtualSwitchPortConnection value) {
        this.dvPort = value;
    }

    /**
     * Gets the value of the opNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualNicOpaqueNetworkSpec }
     *     
     */
    public HostVirtualNicOpaqueNetworkSpec getOpNetwork() {
        return opNetwork;
    }

    /**
     * Sets the value of the opNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualNicOpaqueNetworkSpec }
     *     
     */
    public void setOpNetwork(HostVirtualNicOpaqueNetworkSpec value) {
        this.opNetwork = value;
    }

}
