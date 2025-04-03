
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVsanHostMembershipInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVsanHostMembershipInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VsanHostMembershipInfo" type="{urn:internalvim25}VsanHostMembershipInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanHostMembershipInfo", propOrder = {
    "vsanHostMembershipInfo"
})
public class ArrayOfVsanHostMembershipInfo {

    @XmlElement(name = "VsanHostMembershipInfo")
    protected List<VsanHostMembershipInfo> vsanHostMembershipInfo;

    /**
     * Gets the value of the vsanHostMembershipInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsanHostMembershipInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVsanHostMembershipInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanHostMembershipInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vsanHostMembershipInfo property.
     */
    public List<VsanHostMembershipInfo> getVsanHostMembershipInfo() {
        if (vsanHostMembershipInfo == null) {
            vsanHostMembershipInfo = new ArrayList<>();
        }
        return this.vsanHostMembershipInfo;
    }

}
