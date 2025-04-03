
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostProfileManagerCompositionValidationResultResultElement complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostProfileManagerCompositionValidationResultResultElement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostProfileManagerCompositionValidationResultResultElement" type="{urn:internalvim25}HostProfileManagerCompositionValidationResultResultElement" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProfileManagerCompositionValidationResultResultElement", propOrder = {
    "hostProfileManagerCompositionValidationResultResultElement"
})
public class ArrayOfHostProfileManagerCompositionValidationResultResultElement {

    @XmlElement(name = "HostProfileManagerCompositionValidationResultResultElement")
    protected List<HostProfileManagerCompositionValidationResultResultElement> hostProfileManagerCompositionValidationResultResultElement;

    /**
     * Gets the value of the hostProfileManagerCompositionValidationResultResultElement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostProfileManagerCompositionValidationResultResultElement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostProfileManagerCompositionValidationResultResultElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProfileManagerCompositionValidationResultResultElement }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostProfileManagerCompositionValidationResultResultElement property.
     */
    public List<HostProfileManagerCompositionValidationResultResultElement> getHostProfileManagerCompositionValidationResultResultElement() {
        if (hostProfileManagerCompositionValidationResultResultElement == null) {
            hostProfileManagerCompositionValidationResultResultElement = new ArrayList<>();
        }
        return this.hostProfileManagerCompositionValidationResultResultElement;
    }

}
