
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostLocalPortCreatedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostLocalPortCreatedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="hostLocalPort" type="{urn:internalvim25}DVSHostLocalPortInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLocalPortCreatedEvent", propOrder = {
    "hostLocalPort"
})
public class HostLocalPortCreatedEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected DVSHostLocalPortInfo hostLocalPort;

    /**
     * Gets the value of the hostLocalPort property.
     * 
     * @return
     *     possible object is
     *     {@link DVSHostLocalPortInfo }
     *     
     */
    public DVSHostLocalPortInfo getHostLocalPort() {
        return hostLocalPort;
    }

    /**
     * Sets the value of the hostLocalPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSHostLocalPortInfo }
     *     
     */
    public void setHostLocalPort(DVSHostLocalPortInfo value) {
        this.hostLocalPort = value;
    }

}
