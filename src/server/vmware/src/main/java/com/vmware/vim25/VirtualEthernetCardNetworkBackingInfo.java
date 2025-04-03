
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualEthernetCardNetworkBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualEthernetCardNetworkBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceDeviceBackingInfo">
 *       <sequence>
 *         <element name="network" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="inPassthroughMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCardNetworkBackingInfo", propOrder = {
    "network",
    "inPassthroughMode"
})
public class VirtualEthernetCardNetworkBackingInfo
    extends VirtualDeviceDeviceBackingInfo
{

    protected ManagedObjectReference network;
    protected Boolean inPassthroughMode;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setNetwork(ManagedObjectReference value) {
        this.network = value;
    }

    /**
     * Gets the value of the inPassthroughMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPassthroughMode() {
        return inPassthroughMode;
    }

    /**
     * Sets the value of the inPassthroughMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPassthroughMode(Boolean value) {
        this.inPassthroughMode = value;
    }

}
