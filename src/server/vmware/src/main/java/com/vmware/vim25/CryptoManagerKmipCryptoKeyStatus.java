
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoManagerKmipCryptoKeyStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CryptoManagerKmipCryptoKeyStatus">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="keyId" type="{urn:internalvim25}CryptoKeyId"/>
 *         <element name="keyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="encryptedVMs" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="affectedHosts" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="referencedByTags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipCryptoKeyStatus", propOrder = {
    "keyId",
    "keyAvailable",
    "reason",
    "encryptedVMs",
    "affectedHosts",
    "referencedByTags"
})
public class CryptoManagerKmipCryptoKeyStatus
    extends DynamicData
{

    @XmlElement(required = true)
    protected CryptoKeyId keyId;
    protected Boolean keyAvailable;
    protected String reason;
    protected List<ManagedObjectReference> encryptedVMs;
    protected List<ManagedObjectReference> affectedHosts;
    protected List<String> referencedByTags;

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
     * Gets the value of the keyAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyAvailable() {
        return keyAvailable;
    }

    /**
     * Sets the value of the keyAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyAvailable(Boolean value) {
        this.keyAvailable = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the encryptedVMs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptedVMs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEncryptedVMs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the encryptedVMs property.
     */
    public List<ManagedObjectReference> getEncryptedVMs() {
        if (encryptedVMs == null) {
            encryptedVMs = new ArrayList<>();
        }
        return this.encryptedVMs;
    }

    /**
     * Gets the value of the affectedHosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedHosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAffectedHosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the affectedHosts property.
     */
    public List<ManagedObjectReference> getAffectedHosts() {
        if (affectedHosts == null) {
            affectedHosts = new ArrayList<>();
        }
        return this.affectedHosts;
    }

    /**
     * Gets the value of the referencedByTags property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedByTags property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReferencedByTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the referencedByTags property.
     */
    public List<String> getReferencedByTags() {
        if (referencedByTags == null) {
            referencedByTags = new ArrayList<>();
        }
        return this.referencedByTags;
    }

}
