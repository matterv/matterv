
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiskCryptoSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DiskCryptoSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="parent" type="{urn:internalvim25}DiskCryptoSpec" minOccurs="0"/>
 *         <element name="crypto" type="{urn:internalvim25}CryptoSpec"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskCryptoSpec", propOrder = {
    "parent",
    "crypto"
})
public class DiskCryptoSpec
    extends DynamicData
{

    protected DiskCryptoSpec parent;
    @XmlElement(required = true)
    protected CryptoSpec crypto;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link DiskCryptoSpec }
     *     
     */
    public DiskCryptoSpec getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskCryptoSpec }
     *     
     */
    public void setParent(DiskCryptoSpec value) {
        this.parent = value;
    }

    /**
     * Gets the value of the crypto property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoSpec }
     *     
     */
    public CryptoSpec getCrypto() {
        return crypto;
    }

    /**
     * Sets the value of the crypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoSpec }
     *     
     */
    public void setCrypto(CryptoSpec value) {
        this.crypto = value;
    }

}
