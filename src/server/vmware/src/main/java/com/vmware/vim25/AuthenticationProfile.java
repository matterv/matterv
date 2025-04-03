
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AuthenticationProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ApplyProfile">
 *       <sequence>
 *         <element name="activeDirectory" type="{urn:internalvim25}ActiveDirectoryProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationProfile", propOrder = {
    "activeDirectory"
})
public class AuthenticationProfile
    extends ApplyProfile
{

    protected ActiveDirectoryProfile activeDirectory;

    /**
     * Gets the value of the activeDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveDirectoryProfile }
     *     
     */
    public ActiveDirectoryProfile getActiveDirectory() {
        return activeDirectory;
    }

    /**
     * Sets the value of the activeDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveDirectoryProfile }
     *     
     */
    public void setActiveDirectory(ActiveDirectoryProfile value) {
        this.activeDirectory = value;
    }

}
