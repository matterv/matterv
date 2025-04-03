
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDpmHostConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDpmHostConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ArrayUpdateSpec">
 *       <sequence>
 *         <element name="info" type="{urn:internalvim25}ClusterDpmHostConfigInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDpmHostConfigSpec", propOrder = {
    "info"
})
public class ClusterDpmHostConfigSpec
    extends ArrayUpdateSpec
{

    protected ClusterDpmHostConfigInfo info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDpmHostConfigInfo }
     *     
     */
    public ClusterDpmHostConfigInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDpmHostConfigInfo }
     *     
     */
    public void setInfo(ClusterDpmHostConfigInfo value) {
        this.info = value;
    }

}
