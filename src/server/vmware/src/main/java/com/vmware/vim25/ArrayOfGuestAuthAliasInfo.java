
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGuestAuthAliasInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGuestAuthAliasInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GuestAuthAliasInfo" type="{urn:internalvim25}GuestAuthAliasInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestAuthAliasInfo", propOrder = {
    "guestAuthAliasInfo"
})
public class ArrayOfGuestAuthAliasInfo {

    @XmlElement(name = "GuestAuthAliasInfo")
    protected List<GuestAuthAliasInfo> guestAuthAliasInfo;

    /**
     * Gets the value of the guestAuthAliasInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestAuthAliasInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGuestAuthAliasInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestAuthAliasInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the guestAuthAliasInfo property.
     */
    public List<GuestAuthAliasInfo> getGuestAuthAliasInfo() {
        if (guestAuthAliasInfo == null) {
            guestAuthAliasInfo = new ArrayList<>();
        }
        return this.guestAuthAliasInfo;
    }

}
