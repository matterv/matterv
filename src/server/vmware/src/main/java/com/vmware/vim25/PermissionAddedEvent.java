
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionAddedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PermissionAddedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}PermissionEvent">
 *       <sequence>
 *         <element name="role" type="{urn:internalvim25}RoleEventArgument"/>
 *         <element name="propagate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionAddedEvent", propOrder = {
    "role",
    "propagate"
})
public class PermissionAddedEvent
    extends PermissionEvent
{

    @XmlElement(required = true)
    protected RoleEventArgument role;
    protected boolean propagate;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link RoleEventArgument }
     *     
     */
    public RoleEventArgument getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleEventArgument }
     *     
     */
    public void setRole(RoleEventArgument value) {
        this.role = value;
    }

    /**
     * Gets the value of the propagate property.
     * 
     */
    public boolean isPropagate() {
        return propagate;
    }

    /**
     * Sets the value of the propagate property.
     * 
     */
    public void setPropagate(boolean value) {
        this.propagate = value;
    }

}
