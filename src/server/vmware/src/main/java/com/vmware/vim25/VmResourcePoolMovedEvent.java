
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmResourcePoolMovedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmResourcePoolMovedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="oldParent" type="{urn:internalvim25}ResourcePoolEventArgument"/>
 *         <element name="newParent" type="{urn:internalvim25}ResourcePoolEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmResourcePoolMovedEvent", propOrder = {
    "oldParent",
    "newParent"
})
public class VmResourcePoolMovedEvent
    extends VmEvent
{

    @XmlElement(required = true)
    protected ResourcePoolEventArgument oldParent;
    @XmlElement(required = true)
    protected ResourcePoolEventArgument newParent;

    /**
     * Gets the value of the oldParent property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcePoolEventArgument }
     *     
     */
    public ResourcePoolEventArgument getOldParent() {
        return oldParent;
    }

    /**
     * Sets the value of the oldParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcePoolEventArgument }
     *     
     */
    public void setOldParent(ResourcePoolEventArgument value) {
        this.oldParent = value;
    }

    /**
     * Gets the value of the newParent property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcePoolEventArgument }
     *     
     */
    public ResourcePoolEventArgument getNewParent() {
        return newParent;
    }

    /**
     * Sets the value of the newParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcePoolEventArgument }
     *     
     */
    public void setNewParent(ResourcePoolEventArgument value) {
        this.newParent = value;
    }

}
