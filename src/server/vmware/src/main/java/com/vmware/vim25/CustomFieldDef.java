
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldDef complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomFieldDef">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="managedObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fieldDefPrivileges" type="{urn:internalvim25}PrivilegePolicyDef" minOccurs="0"/>
 *         <element name="fieldInstancePrivileges" type="{urn:internalvim25}PrivilegePolicyDef" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldDef", propOrder = {
    "key",
    "name",
    "type",
    "managedObjectType",
    "fieldDefPrivileges",
    "fieldInstancePrivileges"
})
public class CustomFieldDef
    extends DynamicData
{

    protected int key;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    protected String managedObjectType;
    protected PrivilegePolicyDef fieldDefPrivileges;
    protected PrivilegePolicyDef fieldInstancePrivileges;

    /**
     * Gets the value of the key property.
     * 
     */
    public int getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(int value) {
        this.key = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the managedObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedObjectType() {
        return managedObjectType;
    }

    /**
     * Sets the value of the managedObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedObjectType(String value) {
        this.managedObjectType = value;
    }

    /**
     * Gets the value of the fieldDefPrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegePolicyDef }
     *     
     */
    public PrivilegePolicyDef getFieldDefPrivileges() {
        return fieldDefPrivileges;
    }

    /**
     * Sets the value of the fieldDefPrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegePolicyDef }
     *     
     */
    public void setFieldDefPrivileges(PrivilegePolicyDef value) {
        this.fieldDefPrivileges = value;
    }

    /**
     * Gets the value of the fieldInstancePrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegePolicyDef }
     *     
     */
    public PrivilegePolicyDef getFieldInstancePrivileges() {
        return fieldInstancePrivileges;
    }

    /**
     * Sets the value of the fieldInstancePrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegePolicyDef }
     *     
     */
    public void setFieldInstancePrivileges(PrivilegePolicyDef value) {
        this.fieldInstancePrivileges = value;
    }

}
