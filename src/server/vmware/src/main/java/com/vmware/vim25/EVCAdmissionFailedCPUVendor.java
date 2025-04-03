
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVCAdmissionFailedCPUVendor complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EVCAdmissionFailedCPUVendor">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}EVCAdmissionFailed">
 *       <sequence>
 *         <element name="clusterCPUVendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostCPUVendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCAdmissionFailedCPUVendor", propOrder = {
    "clusterCPUVendor",
    "hostCPUVendor"
})
public class EVCAdmissionFailedCPUVendor
    extends EVCAdmissionFailed
{

    @XmlElement(required = true)
    protected String clusterCPUVendor;
    @XmlElement(required = true)
    protected String hostCPUVendor;

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
     * Gets the value of the hostCPUVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostCPUVendor() {
        return hostCPUVendor;
    }

    /**
     * Sets the value of the hostCPUVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostCPUVendor(String value) {
        this.hostCPUVendor = value;
    }

}
