
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoManagerHostKeyStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CryptoManagerHostKeyStatus">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="keyId" type="{urn:internalvim25}CryptoKeyId"/>
 *         <element name="present" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="managementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accessGranted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerHostKeyStatus", propOrder = {
    "keyId",
    "present",
    "managementType",
    "accessGranted"
})
public class CryptoManagerHostKeyStatus
    extends DynamicData
{

    @XmlElement(required = true)
    protected CryptoKeyId keyId;
    protected boolean present;
    protected String managementType;
    protected Boolean accessGranted;

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
     * Gets the value of the present property.
     * 
     */
    public boolean isPresent() {
        return present;
    }

    /**
     * Sets the value of the present property.
     * 
     */
    public void setPresent(boolean value) {
        this.present = value;
    }

    /**
     * Gets the value of the managementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementType() {
        return managementType;
    }

    /**
     * Sets the value of the managementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementType(String value) {
        this.managementType = value;
    }

    /**
     * Gets the value of the accessGranted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessGranted() {
        return accessGranted;
    }

    /**
     * Sets the value of the accessGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessGranted(Boolean value) {
        this.accessGranted = value;
    }

}
