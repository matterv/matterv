
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVASAStorageArray complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVASAStorageArray">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VASAStorageArray" type="{urn:internalvim25}VASAStorageArray" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVASAStorageArray", propOrder = {
    "vasaStorageArray"
})
public class ArrayOfVASAStorageArray {

    @XmlElement(name = "VASAStorageArray")
    protected List<VASAStorageArray> vasaStorageArray;

    /**
     * Gets the value of the vasaStorageArray property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vasaStorageArray property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVASAStorageArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VASAStorageArray }
     * </p>
     * 
     * 
     * @return
     *     The value of the vasaStorageArray property.
     */
    public List<VASAStorageArray> getVASAStorageArray() {
        if (vasaStorageArray == null) {
            vasaStorageArray = new ArrayList<>();
        }
        return this.vasaStorageArray;
    }

}
