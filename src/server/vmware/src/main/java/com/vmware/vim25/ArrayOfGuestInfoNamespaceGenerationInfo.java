
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGuestInfoNamespaceGenerationInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGuestInfoNamespaceGenerationInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GuestInfoNamespaceGenerationInfo" type="{urn:internalvim25}GuestInfoNamespaceGenerationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestInfoNamespaceGenerationInfo", propOrder = {
    "guestInfoNamespaceGenerationInfo"
})
public class ArrayOfGuestInfoNamespaceGenerationInfo {

    @XmlElement(name = "GuestInfoNamespaceGenerationInfo")
    protected List<GuestInfoNamespaceGenerationInfo> guestInfoNamespaceGenerationInfo;

    /**
     * Gets the value of the guestInfoNamespaceGenerationInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestInfoNamespaceGenerationInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGuestInfoNamespaceGenerationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestInfoNamespaceGenerationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the guestInfoNamespaceGenerationInfo property.
     */
    public List<GuestInfoNamespaceGenerationInfo> getGuestInfoNamespaceGenerationInfo() {
        if (guestInfoNamespaceGenerationInfo == null) {
            guestInfoNamespaceGenerationInfo = new ArrayList<>();
        }
        return this.guestInfoNamespaceGenerationInfo;
    }

}
