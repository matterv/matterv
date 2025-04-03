
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanDatastoreInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanDatastoreInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DatastoreInfo">
 *       <sequence>
 *         <element name="membershipUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accessGenNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanDatastoreInfo", propOrder = {
    "membershipUuid",
    "accessGenNo"
})
public class VsanDatastoreInfo
    extends DatastoreInfo
{

    protected String membershipUuid;
    protected Integer accessGenNo;

    /**
     * Gets the value of the membershipUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipUuid() {
        return membershipUuid;
    }

    /**
     * Sets the value of the membershipUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipUuid(String value) {
        this.membershipUuid = value;
    }

    /**
     * Gets the value of the accessGenNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessGenNo() {
        return accessGenNo;
    }

    /**
     * Sets the value of the accessGenNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessGenNo(Integer value) {
        this.accessGenNo = value;
    }

}
