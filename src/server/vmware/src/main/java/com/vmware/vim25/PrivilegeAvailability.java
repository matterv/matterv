
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivilegeAvailability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PrivilegeAvailability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="privId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="isGranted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivilegeAvailability", propOrder = {
    "privId",
    "isGranted"
})
public class PrivilegeAvailability
    extends DynamicData
{

    @XmlElement(required = true)
    protected String privId;
    protected boolean isGranted;

    /**
     * Gets the value of the privId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivId() {
        return privId;
    }

    /**
     * Sets the value of the privId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivId(String value) {
        this.privId = value;
    }

    /**
     * Gets the value of the isGranted property.
     * 
     */
    public boolean isIsGranted() {
        return isGranted;
    }

    /**
     * Sets the value of the isGranted property.
     * 
     */
    public void setIsGranted(boolean value) {
        this.isGranted = value;
    }

}
