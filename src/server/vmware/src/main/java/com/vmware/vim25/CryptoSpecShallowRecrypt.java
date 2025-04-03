
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoSpecShallowRecrypt complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CryptoSpecShallowRecrypt">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CryptoSpec">
 *       <sequence>
 *         <element name="newKeyId" type="{urn:internalvim25}CryptoKeyId"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoSpecShallowRecrypt", propOrder = {
    "newKeyId"
})
public class CryptoSpecShallowRecrypt
    extends CryptoSpec
{

    @XmlElement(required = true)
    protected CryptoKeyId newKeyId;

    /**
     * Gets the value of the newKeyId property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyId }
     *     
     */
    public CryptoKeyId getNewKeyId() {
        return newKeyId;
    }

    /**
     * Sets the value of the newKeyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyId }
     *     
     */
    public void setNewKeyId(CryptoKeyId value) {
        this.newKeyId = value;
    }

}
