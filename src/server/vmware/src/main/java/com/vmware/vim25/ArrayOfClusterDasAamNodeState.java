
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClusterDasAamNodeState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClusterDasAamNodeState">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClusterDasAamNodeState" type="{urn:internalvim25}ClusterDasAamNodeState" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterDasAamNodeState", propOrder = {
    "clusterDasAamNodeState"
})
public class ArrayOfClusterDasAamNodeState {

    @XmlElement(name = "ClusterDasAamNodeState")
    protected List<ClusterDasAamNodeState> clusterDasAamNodeState;

    /**
     * Gets the value of the clusterDasAamNodeState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterDasAamNodeState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClusterDasAamNodeState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDasAamNodeState }
     * </p>
     * 
     * 
     * @return
     *     The value of the clusterDasAamNodeState property.
     */
    public List<ClusterDasAamNodeState> getClusterDasAamNodeState() {
        if (clusterDasAamNodeState == null) {
            clusterDasAamNodeState = new ArrayList<>();
        }
        return this.clusterDasAamNodeState;
    }

}
