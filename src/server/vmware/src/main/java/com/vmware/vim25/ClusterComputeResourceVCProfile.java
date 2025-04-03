
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceVCProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceVCProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="clusterSpec" type="{urn:internalvim25}ClusterConfigSpecEx" minOccurs="0"/>
 *         <element name="evcModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="evcGraphicsModeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceVCProfile", propOrder = {
    "clusterSpec",
    "evcModeKey",
    "evcGraphicsModeKey"
})
public class ClusterComputeResourceVCProfile
    extends DynamicData
{

    protected ClusterConfigSpecEx clusterSpec;
    protected String evcModeKey;
    protected String evcGraphicsModeKey;

    /**
     * Gets the value of the clusterSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterConfigSpecEx }
     *     
     */
    public ClusterConfigSpecEx getClusterSpec() {
        return clusterSpec;
    }

    /**
     * Sets the value of the clusterSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterConfigSpecEx }
     *     
     */
    public void setClusterSpec(ClusterConfigSpecEx value) {
        this.clusterSpec = value;
    }

    /**
     * Gets the value of the evcModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvcModeKey() {
        return evcModeKey;
    }

    /**
     * Sets the value of the evcModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvcModeKey(String value) {
        this.evcModeKey = value;
    }

    /**
     * Gets the value of the evcGraphicsModeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvcGraphicsModeKey() {
        return evcGraphicsModeKey;
    }

    /**
     * Sets the value of the evcGraphicsModeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvcGraphicsModeKey(String value) {
        this.evcGraphicsModeKey = value;
    }

}
