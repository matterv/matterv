
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfileParameterMetadata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProfileParameterMetadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProfileParameterMetadata" type="{urn:internalvim25}ProfileParameterMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileParameterMetadata", propOrder = {
    "profileParameterMetadata"
})
public class ArrayOfProfileParameterMetadata {

    @XmlElement(name = "ProfileParameterMetadata")
    protected List<ProfileParameterMetadata> profileParameterMetadata;

    /**
     * Gets the value of the profileParameterMetadata property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileParameterMetadata property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProfileParameterMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileParameterMetadata }
     * </p>
     * 
     * 
     * @return
     *     The value of the profileParameterMetadata property.
     */
    public List<ProfileParameterMetadata> getProfileParameterMetadata() {
        if (profileParameterMetadata == null) {
            profileParameterMetadata = new ArrayList<>();
        }
        return this.profileParameterMetadata;
    }

}
