
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterCryptoConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterCryptoConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="cryptoMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="policy" type="{urn:internalvim25}ClusterComputeResourceCryptoModePolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterCryptoConfigInfo", propOrder = {
    "cryptoMode",
    "policy"
})
public class ClusterCryptoConfigInfo
    extends DynamicData
{

    protected String cryptoMode;
    protected ClusterComputeResourceCryptoModePolicy policy;

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
