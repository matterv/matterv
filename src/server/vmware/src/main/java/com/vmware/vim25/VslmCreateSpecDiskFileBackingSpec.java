
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VslmCreateSpecDiskFileBackingSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VslmCreateSpecDiskFileBackingSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VslmCreateSpecBackingSpec">
 *       <sequence>
 *         <element name="provisioningType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCreateSpecDiskFileBackingSpec", propOrder = {
    "provisioningType"
})
public class VslmCreateSpecDiskFileBackingSpec
    extends VslmCreateSpecBackingSpec
{

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
