
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsHostBackInSyncEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsHostBackInSyncEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="hostBackInSync" type="{urn:internalvim25}HostEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostBackInSyncEvent", propOrder = {
    "hostBackInSync"
})
public class DvsHostBackInSyncEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected HostEventArgument hostBackInSync;

    /**
     * Gets the value of the hostBackInSync property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getHostBackInSync() {
        return hostBackInSync;
    }

    /**
     * Sets the value of the hostBackInSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setHostBackInSync(HostEventArgument value) {
        this.hostBackInSync = value;
    }

}
