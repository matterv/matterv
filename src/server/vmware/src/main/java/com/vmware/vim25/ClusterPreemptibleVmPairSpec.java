
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterPreemptibleVmPairSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterPreemptibleVmPairSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ArrayUpdateSpec">
 *       <sequence>
 *         <element name="info" type="{urn:internalvim25}ClusterPreemptibleVmPairInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterPreemptibleVmPairSpec", propOrder = {
    "info"
})
public class ClusterPreemptibleVmPairSpec
    extends ArrayUpdateSpec
{

    protected ClusterPreemptibleVmPairInfo info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterPreemptibleVmPairInfo }
     *     
     */
    public ClusterPreemptibleVmPairInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterPreemptibleVmPairInfo }
     *     
     */
    public void setInfo(ClusterPreemptibleVmPairInfo value) {
        this.info = value;
    }

}
