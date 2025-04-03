
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassiveNodeDeploymentSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PassiveNodeDeploymentSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NodeDeploymentSpec">
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
@XmlType(name = "PassiveNodeDeploymentSpec", propOrder = {
    "failoverIpSettings"
})
public class PassiveNodeDeploymentSpec
    extends NodeDeploymentSpec
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
