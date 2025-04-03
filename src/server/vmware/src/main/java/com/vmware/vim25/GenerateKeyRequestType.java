
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenerateKeyRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GenerateKeyRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="keyProvider" type="{urn:internalvim25}KeyProviderId" minOccurs="0"/>
 *         <element name="spec" type="{urn:internalvim25}CryptoManagerKmipCustomAttributeSpec" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateKeyRequestType", propOrder = {
    "_this",
    "keyProvider",
    "spec"
})
public class GenerateKeyRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected KeyProviderId keyProvider;
    protected CryptoManagerKmipCustomAttributeSpec spec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the keyProvider property.
     * 
     * @return
     *     possible object is
     *     {@link KeyProviderId }
     *     
     */
    public KeyProviderId getKeyProvider() {
        return keyProvider;
    }

    /**
     * Sets the value of the keyProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyProviderId }
     *     
     */
    public void setKeyProvider(KeyProviderId value) {
        this.keyProvider = value;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoManagerKmipCustomAttributeSpec }
     *     
     */
    public CryptoManagerKmipCustomAttributeSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoManagerKmipCustomAttributeSpec }
     *     
     */
    public void setSpec(CryptoManagerKmipCustomAttributeSpec value) {
        this.spec = value;
    }

}
