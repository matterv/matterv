
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResourceConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfResourceConfigSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ResourceConfigSpec" type="{urn:internalvim25}ResourceConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResourceConfigSpec", propOrder = {
    "resourceConfigSpec"
})
public class ArrayOfResourceConfigSpec {

    @XmlElement(name = "ResourceConfigSpec")
    protected List<ResourceConfigSpec> resourceConfigSpec;

    /**
     * Gets the value of the resourceConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResourceConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the resourceConfigSpec property.
     */
    public List<ResourceConfigSpec> getResourceConfigSpec() {
        if (resourceConfigSpec == null) {
            resourceConfigSpec = new ArrayList<>();
        }
        return this.resourceConfigSpec;
    }

}
