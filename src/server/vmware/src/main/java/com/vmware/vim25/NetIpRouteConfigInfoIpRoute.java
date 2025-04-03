
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetIpRouteConfigInfoIpRoute complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetIpRouteConfigInfoIpRoute">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="network" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prefixLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="gateway" type="{urn:internalvim25}NetIpRouteConfigInfoGateway"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpRouteConfigInfoIpRoute", propOrder = {
    "network",
    "prefixLength",
    "gateway"
})
public class NetIpRouteConfigInfoIpRoute
    extends DynamicData
{

    @XmlElement(required = true)
    protected String network;
    protected int prefixLength;
    @XmlElement(required = true)
    protected NetIpRouteConfigInfoGateway gateway;

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
     * Gets the value of the prefixLength property.
     * 
     */
    public int getPrefixLength() {
        return prefixLength;
    }

    /**
     * Sets the value of the prefixLength property.
     * 
     */
    public void setPrefixLength(int value) {
        this.prefixLength = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link NetIpRouteConfigInfoGateway }
     *     
     */
    public NetIpRouteConfigInfoGateway getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetIpRouteConfigInfoGateway }
     *     
     */
    public void setGateway(NetIpRouteConfigInfoGateway value) {
        this.gateway = value;
    }

}
