
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClusterComputeResourceVcsSlots complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClusterComputeResourceVcsSlots">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClusterComputeResourceVcsSlots" type="{urn:internalvim25}ClusterComputeResourceVcsSlots" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceVcsSlots", propOrder = {
    "clusterComputeResourceVcsSlots"
})
public class ArrayOfClusterComputeResourceVcsSlots {

    @XmlElement(name = "ClusterComputeResourceVcsSlots")
    protected List<ClusterComputeResourceVcsSlots> clusterComputeResourceVcsSlots;

    /**
     * Gets the value of the clusterComputeResourceVcsSlots property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterComputeResourceVcsSlots property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClusterComputeResourceVcsSlots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceVcsSlots }
     * </p>
     * 
     * 
     * @return
     *     The value of the clusterComputeResourceVcsSlots property.
     */
    public List<ClusterComputeResourceVcsSlots> getClusterComputeResourceVcsSlots() {
        if (clusterComputeResourceVcsSlots == null) {
            clusterComputeResourceVcsSlots = new ArrayList<>();
        }
        return this.clusterComputeResourceVcsSlots;
    }

}
