
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClusterComputeResourceHostConfigurationInput complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClusterComputeResourceHostConfigurationInput">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClusterComputeResourceHostConfigurationInput" type="{urn:internalvim25}ClusterComputeResourceHostConfigurationInput" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterComputeResourceHostConfigurationInput", propOrder = {
    "clusterComputeResourceHostConfigurationInput"
})
public class ArrayOfClusterComputeResourceHostConfigurationInput {

    @XmlElement(name = "ClusterComputeResourceHostConfigurationInput")
    protected List<ClusterComputeResourceHostConfigurationInput> clusterComputeResourceHostConfigurationInput;

    /**
     * Gets the value of the clusterComputeResourceHostConfigurationInput property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterComputeResourceHostConfigurationInput property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClusterComputeResourceHostConfigurationInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceHostConfigurationInput }
     * </p>
     * 
     * 
     * @return
     *     The value of the clusterComputeResourceHostConfigurationInput property.
     */
    public List<ClusterComputeResourceHostConfigurationInput> getClusterComputeResourceHostConfigurationInput() {
        if (clusterComputeResourceHostConfigurationInput == null) {
            clusterComputeResourceHostConfigurationInput = new ArrayList<>();
        }
        return this.clusterComputeResourceHostConfigurationInput;
    }

}
