
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseConfigInfoDiskFileBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseConfigInfoDiskFileBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}BaseConfigInfoFileBackingInfo">
 *       <sequence>
 *         <element name="provisioningType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfigInfoDiskFileBackingInfo", propOrder = {
    "provisioningType"
})
public class BaseConfigInfoDiskFileBackingInfo
    extends BaseConfigInfoFileBackingInfo
{

    @XmlElement(required = true)
    protected String provisioningType;

    /**
     * Gets the value of the provisioningType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningType() {
        return provisioningType;
    }

    /**
     * Sets the value of the provisioningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningType(String value) {
        this.provisioningType = value;
    }

}
