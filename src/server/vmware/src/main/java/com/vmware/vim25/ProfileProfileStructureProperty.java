
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileProfileStructureProperty complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfileProfileStructureProperty">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="array" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="element" type="{urn:internalvim25}ProfileProfileStructure"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileProfileStructureProperty", propOrder = {
    "propertyName",
    "array",
    "element"
})
public class ProfileProfileStructureProperty
    extends DynamicData
{

    @XmlElement(required = true)
    protected String propertyName;
    protected boolean array;
    @XmlElement(required = true)
    protected ProfileProfileStructure element;

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the array property.
     * 
     */
    public boolean isArray() {
        return array;
    }

    /**
     * Sets the value of the array property.
     * 
     */
    public void setArray(boolean value) {
        this.array = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileProfileStructure }
     *     
     */
    public ProfileProfileStructure getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileProfileStructure }
     *     
     */
    public void setElement(ProfileProfileStructure value) {
        this.element = value;
    }

}
