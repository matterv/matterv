
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVAppPropertySpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVAppPropertySpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VAppPropertySpec" type="{urn:internalvim25}VAppPropertySpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppPropertySpec", propOrder = {
    "vAppPropertySpec"
})
public class ArrayOfVAppPropertySpec {

    @XmlElement(name = "VAppPropertySpec")
    protected List<VAppPropertySpec> vAppPropertySpec;

    /**
     * Gets the value of the vAppPropertySpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vAppPropertySpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVAppPropertySpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VAppPropertySpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the vAppPropertySpec property.
     */
    public List<VAppPropertySpec> getVAppPropertySpec() {
        if (vAppPropertySpec == null) {
            vAppPropertySpec = new ArrayList<>();
        }
        return this.vAppPropertySpec;
    }

}
