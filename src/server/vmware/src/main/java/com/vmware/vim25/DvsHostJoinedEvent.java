
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsHostJoinedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsHostJoinedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="hostJoined" type="{urn:internalvim25}HostEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostJoinedEvent", propOrder = {
    "hostJoined"
})
public class DvsHostJoinedEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected HostEventArgument hostJoined;

    /**
     * Gets the value of the hostJoined property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getHostJoined() {
        return hostJoined;
    }

    /**
     * Sets the value of the hostJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setHostJoined(HostEventArgument value) {
        this.hostJoined = value;
    }

}
