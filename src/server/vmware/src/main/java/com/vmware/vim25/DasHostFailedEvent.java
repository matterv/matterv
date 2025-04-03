
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DasHostFailedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DasHostFailedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterEvent">
 *       <sequence>
 *         <element name="failedHost" type="{urn:internalvim25}HostEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DasHostFailedEvent", propOrder = {
    "failedHost"
})
public class DasHostFailedEvent
    extends ClusterEvent
{

    @XmlElement(required = true)
    protected HostEventArgument failedHost;

    /**
     * Gets the value of the failedHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getFailedHost() {
        return failedHost;
    }

    /**
     * Sets the value of the failedHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setFailedHost(HostEventArgument value) {
        this.failedHost = value;
    }

}
