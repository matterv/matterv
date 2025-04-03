
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasAdmissionControlPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasAdmissionControlPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="resourceReductionToToleratePercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pMemAdmissionControlEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAdmissionControlPolicy", propOrder = {
    "resourceReductionToToleratePercent",
    "pMemAdmissionControlEnabled"
})
@XmlSeeAlso({
    ClusterFailoverHostAdmissionControlPolicy.class,
    ClusterFailoverLevelAdmissionControlPolicy.class,
    ClusterFailoverResourcesAdmissionControlPolicy.class
})
public class ClusterDasAdmissionControlPolicy
    extends DynamicData
{

    protected Integer resourceReductionToToleratePercent;
    protected Boolean pMemAdmissionControlEnabled;

    /**
     * Gets the value of the resourceReductionToToleratePercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResourceReductionToToleratePercent() {
        return resourceReductionToToleratePercent;
    }

    /**
     * Sets the value of the resourceReductionToToleratePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResourceReductionToToleratePercent(Integer value) {
        this.resourceReductionToToleratePercent = value;
    }

    /**
     * Gets the value of the pMemAdmissionControlEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPMemAdmissionControlEnabled() {
        return pMemAdmissionControlEnabled;
    }

    /**
     * Sets the value of the pMemAdmissionControlEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPMemAdmissionControlEnabled(Boolean value) {
        this.pMemAdmissionControlEnabled = value;
    }

}
