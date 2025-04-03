
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfManagedEntityStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfManagedEntityStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ManagedEntityStatus" type="{urn:internalvim25}ManagedEntityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManagedEntityStatus", propOrder = {
    "managedEntityStatus"
})
public class ArrayOfManagedEntityStatus {

    @XmlElement(name = "ManagedEntityStatus")
    @XmlSchemaType(name = "string")
    protected List<ManagedEntityStatus> managedEntityStatus;

    /**
     * Gets the value of the managedEntityStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managedEntityStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getManagedEntityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedEntityStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the managedEntityStatus property.
     */
    public List<ManagedEntityStatus> getManagedEntityStatus() {
        if (managedEntityStatus == null) {
            managedEntityStatus = new ArrayList<>();
        }
        return this.managedEntityStatus;
    }

}
