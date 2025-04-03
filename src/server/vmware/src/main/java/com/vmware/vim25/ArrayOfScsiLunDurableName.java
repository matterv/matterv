
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfScsiLunDurableName complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfScsiLunDurableName">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ScsiLunDurableName" type="{urn:internalvim25}ScsiLunDurableName" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfScsiLunDurableName", propOrder = {
    "scsiLunDurableName"
})
public class ArrayOfScsiLunDurableName {

    @XmlElement(name = "ScsiLunDurableName")
    protected List<ScsiLunDurableName> scsiLunDurableName;

    /**
     * Gets the value of the scsiLunDurableName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scsiLunDurableName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getScsiLunDurableName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScsiLunDurableName }
     * </p>
     * 
     * 
     * @return
     *     The value of the scsiLunDurableName property.
     */
    public List<ScsiLunDurableName> getScsiLunDurableName() {
        if (scsiLunDurableName == null) {
            scsiLunDurableName = new ArrayList<>();
        }
        return this.scsiLunDurableName;
    }

}
