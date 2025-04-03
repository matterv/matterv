
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldValueChangedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomFieldValueChangedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomFieldEvent">
 *       <sequence>
 *         <element name="entity" type="{urn:internalvim25}ManagedEntityEventArgument"/>
 *         <element name="fieldKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prevState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldValueChangedEvent", propOrder = {
    "entity",
    "fieldKey",
    "name",
    "value",
    "prevState"
})
public class CustomFieldValueChangedEvent
    extends CustomFieldEvent
{

    @XmlElement(required = true)
    protected ManagedEntityEventArgument entity;
    protected int fieldKey;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String value;
    protected String prevState;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityEventArgument }
     *     
     */
    public ManagedEntityEventArgument getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityEventArgument }
     *     
     */
    public void setEntity(ManagedEntityEventArgument value) {
        this.entity = value;
    }

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

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the prevState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevState() {
        return prevState;
    }

    /**
     * Sets the value of the prevState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevState(String value) {
        this.prevState = value;
    }

}
