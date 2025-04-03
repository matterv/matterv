
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasVmConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasVmConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ArrayUpdateSpec">
 *       <sequence>
 *         <element name="info" type="{urn:internalvim25}ClusterDasVmConfigInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasVmConfigSpec", propOrder = {
    "info"
})
public class ClusterDasVmConfigSpec
    extends ArrayUpdateSpec
{

    protected ClusterDasVmConfigInfo info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasVmConfigInfo }
     *     
     */
    public ClusterDasVmConfigInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasVmConfigInfo }
     *     
     */
    public void setInfo(ClusterDasVmConfigInfo value) {
        this.info = value;
    }

}
