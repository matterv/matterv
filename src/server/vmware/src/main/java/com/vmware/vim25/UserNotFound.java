
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserNotFound complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UserNotFound">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="principal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unresolved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNotFound", propOrder = {
    "principal",
    "unresolved"
})
public class UserNotFound
    extends VimFault
{

    @XmlElement(required = true)
    protected String principal;
    protected boolean unresolved;

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

    /**
     * Gets the value of the unresolved property.
     * 
     */
    public boolean isUnresolved() {
        return unresolved;
    }

    /**
     * Sets the value of the unresolved property.
     * 
     */
    public void setUnresolved(boolean value) {
        this.unresolved = value;
    }

}
