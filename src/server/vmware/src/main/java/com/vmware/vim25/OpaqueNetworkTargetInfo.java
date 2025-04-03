
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpaqueNetworkTargetInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OpaqueNetworkTargetInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="network" type="{urn:internalvim25}OpaqueNetworkSummary"/>
 *         <element name="networkReservationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpaqueNetworkTargetInfo", propOrder = {
    "network",
    "networkReservationSupported"
})
public class OpaqueNetworkTargetInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected OpaqueNetworkSummary network;
    protected Boolean networkReservationSupported;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link OpaqueNetworkSummary }
     *     
     */
    public OpaqueNetworkSummary getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpaqueNetworkSummary }
     *     
     */
    public void setNetwork(OpaqueNetworkSummary value) {
        this.network = value;
    }

    /**
     * Gets the value of the networkReservationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkReservationSupported() {
        return networkReservationSupported;
    }

    /**
     * Sets the value of the networkReservationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkReservationSupported(Boolean value) {
        this.networkReservationSupported = value;
    }

}
