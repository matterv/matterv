
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionPrivilegeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtensionPrivilegeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="privID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="privGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionPrivilegeInfo", propOrder = {
    "privID",
    "privGroupName"
})
public class ExtensionPrivilegeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String privID;
    @XmlElement(required = true)
    protected String privGroupName;

    /**
     * Gets the value of the privID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivID() {
        return privID;
    }

    /**
     * Sets the value of the privID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivID(String value) {
        this.privID = value;
    }

    /**
     * Gets the value of the privGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivGroupName() {
        return privGroupName;
    }

    /**
     * Sets the value of the privGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivGroupName(String value) {
        this.privGroupName = value;
    }

}
