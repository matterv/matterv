
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncompatibleSetting complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IncompatibleSetting">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidArgument">
 *       <sequence>
 *         <element name="conflictingProperty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompatibleSetting", propOrder = {
    "conflictingProperty"
})
public class IncompatibleSetting
    extends InvalidArgument
{

    @XmlElement(required = true)
    protected String conflictingProperty;

    /**
     * Gets the value of the conflictingProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictingProperty() {
        return conflictingProperty;
    }

    /**
     * Sets the value of the conflictingProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictingProperty(String value) {
        this.conflictingProperty = value;
    }

}
