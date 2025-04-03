
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfConsumerUndeclaredSection complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfConsumerUndeclaredSection">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfConsumerCallbackFault">
 *       <sequence>
 *         <element name="qualifiedSectionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerUndeclaredSection", propOrder = {
    "qualifiedSectionType"
})
public class OvfConsumerUndeclaredSection
    extends OvfConsumerCallbackFault
{

    @XmlElement(required = true)
    protected String qualifiedSectionType;

    /**
     * Gets the value of the qualifiedSectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedSectionType() {
        return qualifiedSectionType;
    }

    /**
     * Sets the value of the qualifiedSectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedSectionType(String value) {
        this.qualifiedSectionType = value;
    }

}
