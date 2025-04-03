
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnableCryptoRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EnableCryptoRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="keyPlain" type="{urn:internalvim25}CryptoKeyPlain"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnableCryptoRequestType", propOrder = {
    "_this",
    "keyPlain"
})
public class EnableCryptoRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected CryptoKeyPlain keyPlain;

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
     * Gets the value of the keyPlain property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyPlain }
     *     
     */
    public CryptoKeyPlain getKeyPlain() {
        return keyPlain;
    }

    /**
     * Sets the value of the keyPlain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyPlain }
     *     
     */
    public void setKeyPlain(CryptoKeyPlain value) {
        this.keyPlain = value;
    }

}
