
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassiveNodeNetworkSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PassiveNodeNetworkSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NodeNetworkSpec">
 *       <sequence>
 *         <element name="failoverIpSettings" type="{urn:internalvim25}CustomizationIPSettings" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassiveNodeNetworkSpec", propOrder = {
    "failoverIpSettings"
})
public class PassiveNodeNetworkSpec
    extends NodeNetworkSpec
{

    protected CustomizationIPSettings failoverIpSettings;

    /**
     * Gets the value of the failoverIpSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIPSettings }
     *     
     */
    public CustomizationIPSettings getFailoverIpSettings() {
        return failoverIpSettings;
    }

    /**
     * Sets the value of the failoverIpSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIPSettings }
     *     
     */
    public void setFailoverIpSettings(CustomizationIPSettings value) {
        this.failoverIpSettings = value;
    }

}
