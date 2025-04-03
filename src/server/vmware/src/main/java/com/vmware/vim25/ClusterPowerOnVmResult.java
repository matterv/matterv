
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterPowerOnVmResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterPowerOnVmResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="attempted" type="{urn:internalvim25}ClusterAttemptedVmInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="notAttempted" type="{urn:internalvim25}ClusterNotAttemptedVmInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="recommendations" type="{urn:internalvim25}ClusterRecommendation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterPowerOnVmResult", propOrder = {
    "attempted",
    "notAttempted",
    "recommendations"
})
public class ClusterPowerOnVmResult
    extends DynamicData
{

    protected List<ClusterAttemptedVmInfo> attempted;
    protected List<ClusterNotAttemptedVmInfo> notAttempted;
    protected List<ClusterRecommendation> recommendations;

    /**
     * Gets the value of the attempted property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attempted property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttempted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterAttemptedVmInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the attempted property.
     */
    public List<ClusterAttemptedVmInfo> getAttempted() {
        if (attempted == null) {
            attempted = new ArrayList<>();
        }
        return this.attempted;
    }

    /**
     * Gets the value of the notAttempted property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAttempted property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNotAttempted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterNotAttemptedVmInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the notAttempted property.
     */
    public List<ClusterNotAttemptedVmInfo> getNotAttempted() {
        if (notAttempted == null) {
            notAttempted = new ArrayList<>();
        }
        return this.notAttempted;
    }

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

}
