
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileSerializedCreateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfileSerializedCreateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ProfileCreateSpec">
 *       <sequence>
 *         <element name="profileConfigString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileSerializedCreateSpec", propOrder = {
    "profileConfigString"
})
@XmlSeeAlso({
    HostProfileSerializedHostProfileSpec.class
})
public class ProfileSerializedCreateSpec
    extends ProfileCreateSpec
{

    @XmlElement(required = true)
    protected String profileConfigString;

    /**
     * Gets the value of the profileConfigString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileConfigString() {
        return profileConfigString;
    }

    /**
     * Sets the value of the profileConfigString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileConfigString(String value) {
        this.profileConfigString = value;
    }

}
