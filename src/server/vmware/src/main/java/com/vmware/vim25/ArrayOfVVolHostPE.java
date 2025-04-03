
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVVolHostPE complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVVolHostPE">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VVolHostPE" type="{urn:internalvim25}VVolHostPE" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVVolHostPE", propOrder = {
    "vVolHostPE"
})
public class ArrayOfVVolHostPE {

    @XmlElement(name = "VVolHostPE")
    protected List<VVolHostPE> vVolHostPE;

    /**
     * Gets the value of the vVolHostPE property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vVolHostPE property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVVolHostPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VVolHostPE }
     * </p>
     * 
     * 
     * @return
     *     The value of the vVolHostPE property.
     */
    public List<VVolHostPE> getVVolHostPE() {
        if (vVolHostPE == null) {
            vVolHostPE = new ArrayList<>();
        }
        return this.vVolHostPE;
    }

}
