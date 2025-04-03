
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoKeyPlain complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CryptoKeyPlain">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="keyId" type="{urn:internalvim25}CryptoKeyId"/>
 *         <element name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="keyData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoKeyPlain", propOrder = {
    "keyId",
    "algorithm",
    "keyData"
})
public class CryptoKeyPlain
    extends DynamicData
{

    @XmlElement(required = true)
    protected CryptoKeyId keyId;
    @XmlElement(required = true)
    protected String algorithm;
    @XmlElement(required = true)
    protected String keyData;

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyId }
     *     
     */
    public CryptoKeyId getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyId }
     *     
     */
    public void setKeyId(CryptoKeyId value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the keyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyData() {
        return keyData;
    }

    /**
     * Sets the value of the keyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyData(String value) {
        this.keyData = value;
    }

}
