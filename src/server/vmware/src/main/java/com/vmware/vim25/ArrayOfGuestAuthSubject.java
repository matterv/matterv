
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGuestAuthSubject complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGuestAuthSubject">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GuestAuthSubject" type="{urn:internalvim25}GuestAuthSubject" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestAuthSubject", propOrder = {
    "guestAuthSubject"
})
public class ArrayOfGuestAuthSubject {

    @XmlElement(name = "GuestAuthSubject")
    protected List<GuestAuthSubject> guestAuthSubject;

    /**
     * Gets the value of the guestAuthSubject property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestAuthSubject property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGuestAuthSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestAuthSubject }
     * </p>
     * 
     * 
     * @return
     *     The value of the guestAuthSubject property.
     */
    public List<GuestAuthSubject> getGuestAuthSubject() {
        if (guestAuthSubject == null) {
            guestAuthSubject = new ArrayList<>();
        }
        return this.guestAuthSubject;
    }

}
