
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVmfsDatastoreOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVmfsDatastoreOption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VmfsDatastoreOption" type="{urn:internalvim25}VmfsDatastoreOption" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVmfsDatastoreOption", propOrder = {
    "vmfsDatastoreOption"
})
public class ArrayOfVmfsDatastoreOption {

    @XmlElement(name = "VmfsDatastoreOption")
    protected List<VmfsDatastoreOption> vmfsDatastoreOption;

    /**
     * Gets the value of the vmfsDatastoreOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmfsDatastoreOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmfsDatastoreOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmfsDatastoreOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmfsDatastoreOption property.
     */
    public List<VmfsDatastoreOption> getVmfsDatastoreOption() {
        if (vmfsDatastoreOption == null) {
            vmfsDatastoreOption = new ArrayList<>();
        }
        return this.vmfsDatastoreOption;
    }

}
