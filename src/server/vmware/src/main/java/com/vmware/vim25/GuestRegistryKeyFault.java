
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestRegistryKeyFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestRegistryKeyFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GuestRegistryFault">
 *       <sequence>
 *         <element name="keyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegistryKeyFault", propOrder = {
    "keyName"
})
@XmlSeeAlso({
    GuestRegistryKeyAlreadyExists.class,
    GuestRegistryKeyHasSubkeys.class,
    GuestRegistryKeyInvalid.class,
    GuestRegistryKeyParentVolatile.class
})
public class GuestRegistryKeyFault
    extends GuestRegistryFault
{

    @XmlElement(required = true)
    protected String keyName;

    /**
     * Gets the value of the keyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Sets the value of the keyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }

}
