
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterVmOrchestrationSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterVmOrchestrationSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ArrayUpdateSpec">
 *       <sequence>
 *         <element name="info" type="{urn:internalvim25}ClusterVmOrchestrationInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmOrchestrationSpec", propOrder = {
    "info"
})
public class ClusterVmOrchestrationSpec
    extends ArrayUpdateSpec
{

    protected ClusterVmOrchestrationInfo info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterVmOrchestrationInfo }
     *     
     */
    public ClusterVmOrchestrationInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterVmOrchestrationInfo }
     *     
     */
    public void setInfo(ClusterVmOrchestrationInfo value) {
        this.info = value;
    }

}
