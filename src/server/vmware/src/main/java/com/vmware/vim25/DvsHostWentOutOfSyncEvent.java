
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsHostWentOutOfSyncEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsHostWentOutOfSyncEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="hostOutOfSync" type="{urn:internalvim25}DvsOutOfSyncHostArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostWentOutOfSyncEvent", propOrder = {
    "hostOutOfSync"
})
public class DvsHostWentOutOfSyncEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected DvsOutOfSyncHostArgument hostOutOfSync;

    /**
     * Gets the value of the hostOutOfSync property.
     * 
     * @return
     *     possible object is
     *     {@link DvsOutOfSyncHostArgument }
     *     
     */
    public DvsOutOfSyncHostArgument getHostOutOfSync() {
        return hostOutOfSync;
    }

    /**
     * Sets the value of the hostOutOfSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsOutOfSyncHostArgument }
     *     
     */
    public void setHostOutOfSync(DvsOutOfSyncHostArgument value) {
        this.hostOutOfSync = value;
    }

}
