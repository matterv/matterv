
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVCModeIllegalByVendor complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EVCModeIllegalByVendor">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}EVCConfigFault">
 *       <sequence>
 *         <element name="clusterCPUVendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="modeCPUVendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCModeIllegalByVendor", propOrder = {
    "clusterCPUVendor",
    "modeCPUVendor"
})
public class EVCModeIllegalByVendor
    extends EVCConfigFault
{

    @XmlElement(required = true)
    protected String clusterCPUVendor;
    @XmlElement(required = true)
    protected String modeCPUVendor;

    /**
     * Gets the value of the clusterCPUVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterCPUVendor() {
        return clusterCPUVendor;
    }

    /**
     * Sets the value of the clusterCPUVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterCPUVendor(String value) {
        this.clusterCPUVendor = value;
    }

    /**
     * Gets the value of the modeCPUVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeCPUVendor() {
        return modeCPUVendor;
    }

    /**
     * Sets the value of the modeCPUVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeCPUVendor(String value) {
        this.modeCPUVendor = value;
    }

}
