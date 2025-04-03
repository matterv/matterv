
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDatacenterMismatchArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDatacenterMismatchArgument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatacenterMismatchArgument" type="{urn:internalvim25}DatacenterMismatchArgument" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatacenterMismatchArgument", propOrder = {
    "datacenterMismatchArgument"
})
public class ArrayOfDatacenterMismatchArgument {

    @XmlElement(name = "DatacenterMismatchArgument")
    protected List<DatacenterMismatchArgument> datacenterMismatchArgument;

    /**
     * Gets the value of the datacenterMismatchArgument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datacenterMismatchArgument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatacenterMismatchArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatacenterMismatchArgument }
     * </p>
     * 
     * 
     * @return
     *     The value of the datacenterMismatchArgument property.
     */
    public List<DatacenterMismatchArgument> getDatacenterMismatchArgument() {
        if (datacenterMismatchArgument == null) {
            datacenterMismatchArgument = new ArrayList<>();
        }
        return this.datacenterMismatchArgument;
    }

}
