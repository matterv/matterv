
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVAppCloneSpecResourceMap complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVAppCloneSpecResourceMap">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VAppCloneSpecResourceMap" type="{urn:internalvim25}VAppCloneSpecResourceMap" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppCloneSpecResourceMap", propOrder = {
    "vAppCloneSpecResourceMap"
})
public class ArrayOfVAppCloneSpecResourceMap {

    @XmlElement(name = "VAppCloneSpecResourceMap")
    protected List<VAppCloneSpecResourceMap> vAppCloneSpecResourceMap;

    /**
     * Gets the value of the vAppCloneSpecResourceMap property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vAppCloneSpecResourceMap property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVAppCloneSpecResourceMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VAppCloneSpecResourceMap }
     * </p>
     * 
     * 
     * @return
     *     The value of the vAppCloneSpecResourceMap property.
     */
    public List<VAppCloneSpecResourceMap> getVAppCloneSpecResourceMap() {
        if (vAppCloneSpecResourceMap == null) {
            vAppCloneSpecResourceMap = new ArrayList<>();
        }
        return this.vAppCloneSpecResourceMap;
    }

}
