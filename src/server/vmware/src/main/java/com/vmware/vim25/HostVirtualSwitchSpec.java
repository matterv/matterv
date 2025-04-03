
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVirtualSwitchSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVirtualSwitchSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="numPorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="bridge" type="{urn:internalvim25}HostVirtualSwitchBridge" minOccurs="0"/>
 *         <element name="policy" type="{urn:internalvim25}HostNetworkPolicy" minOccurs="0"/>
 *         <element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchSpec", propOrder = {
    "numPorts",
    "bridge",
    "policy",
    "mtu"
})
public class HostVirtualSwitchSpec
    extends DynamicData
{

    protected int numPorts;
    protected HostVirtualSwitchBridge bridge;
    protected HostNetworkPolicy policy;
    protected Integer mtu;

    /**
     * Gets the value of the numPorts property.
     * 
     */
    public int getNumPorts() {
        return numPorts;
    }

    /**
     * Sets the value of the numPorts property.
     * 
     */
    public void setNumPorts(int value) {
        this.numPorts = value;
    }

    /**
     * Gets the value of the bridge property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualSwitchBridge }
     *     
     */
    public HostVirtualSwitchBridge getBridge() {
        return bridge;
    }

    /**
     * Sets the value of the bridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualSwitchBridge }
     *     
     */
    public void setBridge(HostVirtualSwitchBridge value) {
        this.bridge = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetworkPolicy }
     *     
     */
    public HostNetworkPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetworkPolicy }
     *     
     */
    public void setPolicy(HostNetworkPolicy value) {
        this.policy = value;
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

}
