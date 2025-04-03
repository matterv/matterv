
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComplianceCheckedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComplianceCheckedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterEvent">
 *       <sequence>
 *         <element name="profile" type="{urn:internalvim25}ProfileEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComplianceCheckedEvent", propOrder = {
    "profile"
})
public class ClusterComplianceCheckedEvent
    extends ClusterEvent
{

    @XmlElement(required = true)
    protected ProfileEventArgument profile;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileEventArgument }
     *     
     */
    public ProfileEventArgument getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileEventArgument }
     *     
     */
    public void setProfile(ProfileEventArgument value) {
        this.profile = value;
    }

}
