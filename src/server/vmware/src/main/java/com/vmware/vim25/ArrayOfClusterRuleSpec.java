
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClusterRuleSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClusterRuleSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClusterRuleSpec" type="{urn:internalvim25}ClusterRuleSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterRuleSpec", propOrder = {
    "clusterRuleSpec"
})
public class ArrayOfClusterRuleSpec {

    @XmlElement(name = "ClusterRuleSpec")
    protected List<ClusterRuleSpec> clusterRuleSpec;

    /**
     * Gets the value of the clusterRuleSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterRuleSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClusterRuleSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRuleSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the clusterRuleSpec property.
     */
    public List<ClusterRuleSpec> getClusterRuleSpec() {
        if (clusterRuleSpec == null) {
            clusterRuleSpec = new ArrayList<>();
        }
        return this.clusterRuleSpec;
    }

}
