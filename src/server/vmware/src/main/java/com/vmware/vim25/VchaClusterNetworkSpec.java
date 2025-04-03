
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VchaClusterNetworkSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VchaClusterNetworkSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="witnessNetworkSpec" type="{urn:internalvim25}NodeNetworkSpec"/>
 *         <element name="passiveNetworkSpec" type="{urn:internalvim25}PassiveNodeNetworkSpec"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterNetworkSpec", propOrder = {
    "witnessNetworkSpec",
    "passiveNetworkSpec"
})
public class VchaClusterNetworkSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected NodeNetworkSpec witnessNetworkSpec;
    @XmlElement(required = true)
    protected PassiveNodeNetworkSpec passiveNetworkSpec;

    /**
     * Gets the value of the witnessNetworkSpec property.
     * 
     * @return
     *     possible object is
     *     {@link NodeNetworkSpec }
     *     
     */
    public NodeNetworkSpec getWitnessNetworkSpec() {
        return witnessNetworkSpec;
    }

    /**
     * Sets the value of the witnessNetworkSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeNetworkSpec }
     *     
     */
    public void setWitnessNetworkSpec(NodeNetworkSpec value) {
        this.witnessNetworkSpec = value;
    }

    /**
     * Gets the value of the passiveNetworkSpec property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveNodeNetworkSpec }
     *     
     */
    public PassiveNodeNetworkSpec getPassiveNetworkSpec() {
        return passiveNetworkSpec;
    }

    /**
     * Sets the value of the passiveNetworkSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveNodeNetworkSpec }
     *     
     */
    public void setPassiveNetworkSpec(PassiveNodeNetworkSpec value) {
        this.passiveNetworkSpec = value;
    }

}
