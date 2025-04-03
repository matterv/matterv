
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionFaultTypeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtensionFaultTypeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="faultID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionFaultTypeInfo", propOrder = {
    "faultID"
})
public class ExtensionFaultTypeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String faultID;

    /**
     * Gets the value of the faultID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultID() {
        return faultID;
    }

    /**
     * Sets the value of the faultID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultID(String value) {
        this.faultID = value;
    }

}
