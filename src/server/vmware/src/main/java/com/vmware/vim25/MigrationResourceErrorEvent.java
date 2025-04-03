
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrationResourceErrorEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MigrationResourceErrorEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationEvent">
 *       <sequence>
 *         <element name="dstPool" type="{urn:internalvim25}ResourcePoolEventArgument"/>
 *         <element name="dstHost" type="{urn:internalvim25}HostEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationResourceErrorEvent", propOrder = {
    "dstPool",
    "dstHost"
})
public class MigrationResourceErrorEvent
    extends MigrationEvent
{

    @XmlElement(required = true)
    protected ResourcePoolEventArgument dstPool;
    @XmlElement(required = true)
    protected HostEventArgument dstHost;

    /**
     * Gets the value of the dstPool property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcePoolEventArgument }
     *     
     */
    public ResourcePoolEventArgument getDstPool() {
        return dstPool;
    }

    /**
     * Sets the value of the dstPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcePoolEventArgument }
     *     
     */
    public void setDstPool(ResourcePoolEventArgument value) {
        this.dstPool = value;
    }

    /**
     * Gets the value of the dstHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getDstHost() {
        return dstHost;
    }

    /**
     * Sets the value of the dstHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setDstHost(HostEventArgument value) {
        this.dstHost = value;
    }

}
