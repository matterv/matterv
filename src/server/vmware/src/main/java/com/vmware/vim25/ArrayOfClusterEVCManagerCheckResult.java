
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClusterEVCManagerCheckResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClusterEVCManagerCheckResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClusterEVCManagerCheckResult" type="{urn:internalvim25}ClusterEVCManagerCheckResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterEVCManagerCheckResult", propOrder = {
    "clusterEVCManagerCheckResult"
})
public class ArrayOfClusterEVCManagerCheckResult {

    @XmlElement(name = "ClusterEVCManagerCheckResult")
    protected List<ClusterEVCManagerCheckResult> clusterEVCManagerCheckResult;

    /**
     * Gets the value of the clusterEVCManagerCheckResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterEVCManagerCheckResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClusterEVCManagerCheckResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterEVCManagerCheckResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the clusterEVCManagerCheckResult property.
     */
    public List<ClusterEVCManagerCheckResult> getClusterEVCManagerCheckResult() {
        if (clusterEVCManagerCheckResult == null) {
            clusterEVCManagerCheckResult = new ArrayList<>();
        }
        return this.clusterEVCManagerCheckResult;
    }

}
