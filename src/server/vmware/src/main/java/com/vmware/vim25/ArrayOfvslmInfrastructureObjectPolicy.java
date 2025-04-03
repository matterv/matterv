
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfvslmInfrastructureObjectPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfvslmInfrastructureObjectPolicy">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="vslmInfrastructureObjectPolicy" type="{urn:internalvim25}vslmInfrastructureObjectPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfvslmInfrastructureObjectPolicy", propOrder = {
    "vslmInfrastructureObjectPolicy"
})
public class ArrayOfvslmInfrastructureObjectPolicy {

    protected List<VslmInfrastructureObjectPolicy> vslmInfrastructureObjectPolicy;

    /**
     * Gets the value of the vslmInfrastructureObjectPolicy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vslmInfrastructureObjectPolicy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVslmInfrastructureObjectPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VslmInfrastructureObjectPolicy }
     * </p>
     * 
     * 
     * @return
     *     The value of the vslmInfrastructureObjectPolicy property.
     */
    public List<VslmInfrastructureObjectPolicy> getVslmInfrastructureObjectPolicy() {
        if (vslmInfrastructureObjectPolicy == null) {
            vslmInfrastructureObjectPolicy = new ArrayList<>();
        }
        return this.vslmInfrastructureObjectPolicy;
    }

}
