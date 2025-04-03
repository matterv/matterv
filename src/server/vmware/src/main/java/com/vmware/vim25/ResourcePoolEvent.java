
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourcePoolEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResourcePoolEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
 *       <sequence>
 *         <element name="resourcePool" type="{urn:internalvim25}ResourcePoolEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolEvent", propOrder = {
    "resourcePool"
})
@XmlSeeAlso({
    ResourcePoolCreatedEvent.class,
    ResourcePoolDestroyedEvent.class,
    ResourcePoolMovedEvent.class,
    ResourcePoolReconfiguredEvent.class,
    ResourceViolatedEvent.class
})
public class ResourcePoolEvent
    extends Event
{

    @XmlElement(required = true)
    protected ResourcePoolEventArgument resourcePool;

    /**
     * Gets the value of the resourcePool property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcePoolEventArgument }
     *     
     */
    public ResourcePoolEventArgument getResourcePool() {
        return resourcePool;
    }

    /**
     * Sets the value of the resourcePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcePoolEventArgument }
     *     
     */
    public void setResourcePool(ResourcePoolEventArgument value) {
        this.resourcePool = value;
    }

}
