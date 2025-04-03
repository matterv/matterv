
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClusterTagCategoryUpdateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClusterTagCategoryUpdateSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClusterTagCategoryUpdateSpec" type="{urn:internalvim25}ClusterTagCategoryUpdateSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterTagCategoryUpdateSpec", propOrder = {
    "clusterTagCategoryUpdateSpec"
})
public class ArrayOfClusterTagCategoryUpdateSpec {

    @XmlElement(name = "ClusterTagCategoryUpdateSpec")
    protected List<ClusterTagCategoryUpdateSpec> clusterTagCategoryUpdateSpec;

    /**
     * Gets the value of the clusterTagCategoryUpdateSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterTagCategoryUpdateSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClusterTagCategoryUpdateSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterTagCategoryUpdateSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the clusterTagCategoryUpdateSpec property.
     */
    public List<ClusterTagCategoryUpdateSpec> getClusterTagCategoryUpdateSpec() {
        if (clusterTagCategoryUpdateSpec == null) {
            clusterTagCategoryUpdateSpec = new ArrayList<>();
        }
        return this.clusterTagCategoryUpdateSpec;
    }

}
