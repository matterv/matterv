
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterEnterMaintenanceResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterEnterMaintenanceResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="recommendations" type="{urn:internalvim25}ClusterRecommendation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="fault" type="{urn:internalvim25}ClusterDrsFaults" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterEnterMaintenanceResult", propOrder = {
    "recommendations",
    "fault"
})
public class ClusterEnterMaintenanceResult
    extends DynamicData
{

    protected List<ClusterRecommendation> recommendations;
    protected ClusterDrsFaults fault;

    /**
     * Gets the value of the recommendations property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendations property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecommendations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRecommendation }
     * </p>
     * 
     * 
     * @return
     *     The value of the recommendations property.
     */
    public List<ClusterRecommendation> getRecommendations() {
        if (recommendations == null) {
            recommendations = new ArrayList<>();
        }
        return this.recommendations;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDrsFaults }
     *     
     */
    public ClusterDrsFaults getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDrsFaults }
     *     
     */
    public void setFault(ClusterDrsFaults value) {
        this.fault = value;
    }

}
