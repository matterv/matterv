
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostIpRouteConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostIpRouteConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostIpRouteConfig">
 *       <sequence>
 *         <element name="gatewayDeviceConnection" type="{urn:internalvim25}HostVirtualNicConnection" minOccurs="0"/>
 *         <element name="ipV6GatewayDeviceConnection" type="{urn:internalvim25}HostVirtualNicConnection" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpRouteConfigSpec", propOrder = {
    "gatewayDeviceConnection",
    "ipV6GatewayDeviceConnection"
})
public class HostIpRouteConfigSpec
    extends HostIpRouteConfig
{

    protected HostVirtualNicConnection gatewayDeviceConnection;
    protected HostVirtualNicConnection ipV6GatewayDeviceConnection;

    /**
     * Gets the value of the gatewayDeviceConnection property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualNicConnection }
     *     
     */
    public HostVirtualNicConnection getGatewayDeviceConnection() {
        return gatewayDeviceConnection;
    }

    /**
     * Sets the value of the gatewayDeviceConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualNicConnection }
     *     
     */
    public void setGatewayDeviceConnection(HostVirtualNicConnection value) {
        this.gatewayDeviceConnection = value;
    }

    /**
     * Gets the value of the ipV6GatewayDeviceConnection property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualNicConnection }
     *     
     */
    public HostVirtualNicConnection getIpV6GatewayDeviceConnection() {
        return ipV6GatewayDeviceConnection;
    }

    /**
     * Sets the value of the ipV6GatewayDeviceConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualNicConnection }
     *     
     */
    public void setIpV6GatewayDeviceConnection(HostVirtualNicConnection value) {
        this.ipV6GatewayDeviceConnection = value;
    }

}
