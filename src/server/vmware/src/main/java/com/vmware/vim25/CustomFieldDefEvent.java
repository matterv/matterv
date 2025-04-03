
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldDefEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomFieldDefEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomFieldEvent">
 *       <sequence>
 *         <element name="fieldKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldDefEvent", propOrder = {
    "fieldKey",
    "name"
})
@XmlSeeAlso({
    CustomFieldDefAddedEvent.class,
    CustomFieldDefRemovedEvent.class,
    CustomFieldDefRenamedEvent.class
})
public class CustomFieldDefEvent
    extends CustomFieldEvent
{

    protected int fieldKey;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the fieldKey property.
     * 
     */
    public int getFieldKey() {
        return fieldKey;
    }

    /**
     * Sets the value of the fieldKey property.
     * 
     */
    public void setFieldKey(int value) {
        this.fieldKey = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
