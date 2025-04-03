
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterOrchestrationInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterOrchestrationInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="defaultVmReadiness" type="{urn:internalvim25}ClusterVmReadiness" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterOrchestrationInfo", propOrder = {
    "defaultVmReadiness"
})
public class ClusterOrchestrationInfo
    extends DynamicData
{

    protected ClusterVmReadiness defaultVmReadiness;

    /**
     * Gets the value of the defaultVmReadiness property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterVmReadiness }
     *     
     */
    public ClusterVmReadiness getDefaultVmReadiness() {
        return defaultVmReadiness;
    }

    /**
     * Sets the value of the defaultVmReadiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterVmReadiness }
     *     
     */
    public void setDefaultVmReadiness(ClusterVmReadiness value) {
        this.defaultVmReadiness = value;
    }

}
