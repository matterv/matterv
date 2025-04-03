
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmShutdownOnIsolationEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmShutdownOnIsolationEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmPoweredOffEvent">
 *       <sequence>
 *         <element name="isolatedHost" type="{urn:internalvim25}HostEventArgument"/>
 *         <element name="shutdownResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmShutdownOnIsolationEvent", propOrder = {
    "isolatedHost",
    "shutdownResult"
})
public class VmShutdownOnIsolationEvent
    extends VmPoweredOffEvent
{

    @XmlElement(required = true)
    protected HostEventArgument isolatedHost;
    protected String shutdownResult;

    /**
     * Gets the value of the isolatedHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getIsolatedHost() {
        return isolatedHost;
    }

    /**
     * Sets the value of the isolatedHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setIsolatedHost(HostEventArgument value) {
        this.isolatedHost = value;
    }

    /**
     * Gets the value of the shutdownResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShutdownResult() {
        return shutdownResult;
    }

    /**
     * Sets the value of the shutdownResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShutdownResult(String value) {
        this.shutdownResult = value;
    }

}
