
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVnicPortArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVnicPortArgument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VnicPortArgument" type="{urn:internalvim25}VnicPortArgument" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVnicPortArgument", propOrder = {
    "vnicPortArgument"
})
public class ArrayOfVnicPortArgument {

    @XmlElement(name = "VnicPortArgument")
    protected List<VnicPortArgument> vnicPortArgument;

    /**
     * Gets the value of the vnicPortArgument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vnicPortArgument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVnicPortArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VnicPortArgument }
     * </p>
     * 
     * 
     * @return
     *     The value of the vnicPortArgument property.
     */
    public List<VnicPortArgument> getVnicPortArgument() {
        if (vnicPortArgument == null) {
            vnicPortArgument = new ArrayList<>();
        }
        return this.vnicPortArgument;
    }

}
