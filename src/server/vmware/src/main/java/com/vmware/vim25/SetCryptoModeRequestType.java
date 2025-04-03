
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetCryptoModeRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SetCryptoModeRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="cryptoMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="policy" type="{urn:internalvim25}ClusterComputeResourceCryptoModePolicy" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetCryptoModeRequestType", propOrder = {
    "_this",
    "cryptoMode",
    "policy"
})
public class SetCryptoModeRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String cryptoMode;
    protected ClusterComputeResourceCryptoModePolicy policy;

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
     * Gets the value of the cryptoMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptoMode() {
        return cryptoMode;
    }

    /**
     * Sets the value of the cryptoMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptoMode(String value) {
        this.cryptoMode = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterComputeResourceCryptoModePolicy }
     *     
     */
    public ClusterComputeResourceCryptoModePolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterComputeResourceCryptoModePolicy }
     *     
     */
    public void setPolicy(ClusterComputeResourceCryptoModePolicy value) {
        this.policy = value;
    }

}
