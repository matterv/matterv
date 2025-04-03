
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmRestartedOnAlternateHostEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmRestartedOnAlternateHostEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmPoweredOnEvent">
 *       <sequence>
 *         <element name="sourceHost" type="{urn:internalvim25}HostEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmRestartedOnAlternateHostEvent", propOrder = {
    "sourceHost"
})
public class VmRestartedOnAlternateHostEvent
    extends VmPoweredOnEvent
{

    @XmlElement(required = true)
    protected HostEventArgument sourceHost;

    /**
     * Gets the value of the sourceHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getSourceHost() {
        return sourceHost;
    }

    /**
     * Sets the value of the sourceHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setSourceHost(HostEventArgument value) {
        this.sourceHost = value;
    }

}
