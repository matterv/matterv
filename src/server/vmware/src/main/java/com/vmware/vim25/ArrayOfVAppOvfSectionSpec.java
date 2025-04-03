
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVAppOvfSectionSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVAppOvfSectionSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VAppOvfSectionSpec" type="{urn:internalvim25}VAppOvfSectionSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppOvfSectionSpec", propOrder = {
    "vAppOvfSectionSpec"
})
public class ArrayOfVAppOvfSectionSpec {

    @XmlElement(name = "VAppOvfSectionSpec")
    protected List<VAppOvfSectionSpec> vAppOvfSectionSpec;

    /**
     * Gets the value of the vAppOvfSectionSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vAppOvfSectionSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVAppOvfSectionSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VAppOvfSectionSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the vAppOvfSectionSpec property.
     */
    public List<VAppOvfSectionSpec> getVAppOvfSectionSpec() {
        if (vAppOvfSectionSpec == null) {
            vAppOvfSectionSpec = new ArrayList<>();
        }
        return this.vAppOvfSectionSpec;
    }

}
