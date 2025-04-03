
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClusterVmOrchestrationSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClusterVmOrchestrationSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClusterVmOrchestrationSpec" type="{urn:internalvim25}ClusterVmOrchestrationSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterVmOrchestrationSpec", propOrder = {
    "clusterVmOrchestrationSpec"
})
public class ArrayOfClusterVmOrchestrationSpec {

    @XmlElement(name = "ClusterVmOrchestrationSpec")
    protected List<ClusterVmOrchestrationSpec> clusterVmOrchestrationSpec;

    /**
     * Gets the value of the clusterVmOrchestrationSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterVmOrchestrationSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClusterVmOrchestrationSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterVmOrchestrationSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the clusterVmOrchestrationSpec property.
     */
    public List<ClusterVmOrchestrationSpec> getClusterVmOrchestrationSpec() {
        if (clusterVmOrchestrationSpec == null) {
            clusterVmOrchestrationSpec = new ArrayList<>();
        }
        return this.clusterVmOrchestrationSpec;
    }

}
