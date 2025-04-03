
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPropertyFilterUpdate complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPropertyFilterUpdate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PropertyFilterUpdate" type="{urn:internalvim25}PropertyFilterUpdate" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropertyFilterUpdate", propOrder = {
    "propertyFilterUpdate"
})
public class ArrayOfPropertyFilterUpdate {

    @XmlElement(name = "PropertyFilterUpdate")
    protected List<PropertyFilterUpdate> propertyFilterUpdate;

    /**
     * Gets the value of the propertyFilterUpdate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyFilterUpdate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPropertyFilterUpdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyFilterUpdate }
     * </p>
     * 
     * 
     * @return
     *     The value of the propertyFilterUpdate property.
     */
    public List<PropertyFilterUpdate> getPropertyFilterUpdate() {
        if (propertyFilterUpdate == null) {
            propertyFilterUpdate = new ArrayList<>();
        }
        return this.propertyFilterUpdate;
    }

}
