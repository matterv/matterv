
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVsanPolicyChangeBatch complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVsanPolicyChangeBatch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VsanPolicyChangeBatch" type="{urn:internalvim25}VsanPolicyChangeBatch" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanPolicyChangeBatch", propOrder = {
    "vsanPolicyChangeBatch"
})
public class ArrayOfVsanPolicyChangeBatch {

    @XmlElement(name = "VsanPolicyChangeBatch")
    protected List<VsanPolicyChangeBatch> vsanPolicyChangeBatch;

    /**
     * Gets the value of the vsanPolicyChangeBatch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsanPolicyChangeBatch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVsanPolicyChangeBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanPolicyChangeBatch }
     * </p>
     * 
     * 
     * @return
     *     The value of the vsanPolicyChangeBatch property.
     */
    public List<VsanPolicyChangeBatch> getVsanPolicyChangeBatch() {
        if (vsanPolicyChangeBatch == null) {
            vsanPolicyChangeBatch = new ArrayList<>();
        }
        return this.vsanPolicyChangeBatch;
    }

}
