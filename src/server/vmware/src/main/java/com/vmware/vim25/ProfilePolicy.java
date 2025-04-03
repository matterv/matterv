
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfilePolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfilePolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="policyOption" type="{urn:internalvim25}PolicyOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfilePolicy", propOrder = {
    "id",
    "policyOption"
})
public class ProfilePolicy
    extends DynamicData
{

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected PolicyOption policyOption;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the policyOption property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyOption }
     *     
     */
    public PolicyOption getPolicyOption() {
        return policyOption;
    }

    /**
     * Sets the value of the policyOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyOption }
     *     
     */
    public void setPolicyOption(PolicyOption value) {
        this.policyOption = value;
    }

}
