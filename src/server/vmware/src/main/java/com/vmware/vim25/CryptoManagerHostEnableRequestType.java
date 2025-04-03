
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoManagerHostEnableRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CryptoManagerHostEnableRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="initialKey" type="{urn:internalvim25}CryptoKeyPlain"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerHostEnableRequestType", propOrder = {
    "_this",
    "initialKey"
})
public class CryptoManagerHostEnableRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected CryptoKeyPlain initialKey;

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
     * Gets the value of the initialKey property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoKeyPlain }
     *     
     */
    public CryptoKeyPlain getInitialKey() {
        return initialKey;
    }

    /**
     * Sets the value of the initialKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoKeyPlain }
     *     
     */
    public void setInitialKey(CryptoKeyPlain value) {
        this.initialKey = value;
    }

}
