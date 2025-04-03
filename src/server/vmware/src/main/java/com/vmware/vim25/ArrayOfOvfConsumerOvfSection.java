
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOvfConsumerOvfSection complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfOvfConsumerOvfSection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OvfConsumerOvfSection" type="{urn:internalvim25}OvfConsumerOvfSection" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfConsumerOvfSection", propOrder = {
    "ovfConsumerOvfSection"
})
public class ArrayOfOvfConsumerOvfSection {

    @XmlElement(name = "OvfConsumerOvfSection")
    protected List<OvfConsumerOvfSection> ovfConsumerOvfSection;

    /**
     * Gets the value of the ovfConsumerOvfSection property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ovfConsumerOvfSection property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOvfConsumerOvfSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvfConsumerOvfSection }
     * </p>
     * 
     * 
     * @return
     *     The value of the ovfConsumerOvfSection property.
     */
    public List<OvfConsumerOvfSection> getOvfConsumerOvfSection() {
        if (ovfConsumerOvfSection == null) {
            ovfConsumerOvfSection = new ArrayList<>();
        }
        return this.ovfConsumerOvfSection;
    }

}
