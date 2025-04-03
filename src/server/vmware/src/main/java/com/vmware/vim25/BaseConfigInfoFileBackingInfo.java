
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseConfigInfoFileBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseConfigInfoFileBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}BaseConfigInfoBackingInfo">
 *       <sequence>
 *         <element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="backingObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="parent" type="{urn:internalvim25}BaseConfigInfoFileBackingInfo" minOccurs="0"/>
 *         <element name="deltaSizeInMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="keyId" type="{urn:internalvim25}CryptoKeyId" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfigInfoFileBackingInfo", propOrder = {
    "filePath",
    "backingObjectId",
    "parent",
    "deltaSizeInMB",
    "keyId"
})
@XmlSeeAlso({
    BaseConfigInfoDiskFileBackingInfo.class,
    BaseConfigInfoRawDiskMappingBackingInfo.class
})
public class BaseConfigInfoFileBackingInfo
    extends BaseConfigInfoBackingInfo
{

    @XmlElement(required = true)
    protected String filePath;
    protected String backingObjectId;
    protected BaseConfigInfoFileBackingInfo parent;
    protected Long deltaSizeInMB;
    protected CryptoKeyId keyId;

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the backingObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingObjectId() {
        return backingObjectId;
    }

    /**
     * Sets the value of the backingObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingObjectId(String value) {
        this.backingObjectId = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link BaseConfigInfoFileBackingInfo }
     *     
     */
    public BaseConfigInfoFileBackingInfo getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseConfigInfoFileBackingInfo }
     *     
     */
    public void setParent(BaseConfigInfoFileBackingInfo value) {
        this.parent = value;
    }

    /**
     * Gets the value of the deltaSizeInMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeltaSizeInMB() {
        return deltaSizeInMB;
    }

    /**
     * Sets the value of the deltaSizeInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeltaSizeInMB(Long value) {
        this.deltaSizeInMB = value;
    }

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

}
