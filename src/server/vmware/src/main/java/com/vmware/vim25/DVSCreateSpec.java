
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSCreateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSCreateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="configSpec" type="{urn:internalvim25}DVSConfigSpec"/>
 *         <element name="productInfo" type="{urn:internalvim25}DistributedVirtualSwitchProductSpec" minOccurs="0"/>
 *         <element name="capability" type="{urn:internalvim25}DVSCapability" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSCreateSpec", propOrder = {
    "configSpec",
    "productInfo",
    "capability"
})
public class DVSCreateSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected DVSConfigSpec configSpec;
    protected DistributedVirtualSwitchProductSpec productInfo;
    protected DVSCapability capability;

    /**
     * Gets the value of the configSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DVSConfigSpec }
     *     
     */
    public DVSConfigSpec getConfigSpec() {
        return configSpec;
    }

    /**
     * Sets the value of the configSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSConfigSpec }
     *     
     */
    public void setConfigSpec(DVSConfigSpec value) {
        this.configSpec = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public DistributedVirtualSwitchProductSpec getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public void setProductInfo(DistributedVirtualSwitchProductSpec value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the capability property.
     * 
     * @return
     *     possible object is
     *     {@link DVSCapability }
     *     
     */
    public DVSCapability getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSCapability }
     *     
     */
    public void setCapability(DVSCapability value) {
        this.capability = value;
    }

}
