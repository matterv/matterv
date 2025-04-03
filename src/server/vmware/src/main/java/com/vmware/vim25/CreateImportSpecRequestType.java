
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateImportSpecRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateImportSpecRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="ovfDescriptor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="resourcePool" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="datastore" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="cisp" type="{urn:internalvim25}OvfCreateImportSpecParams"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateImportSpecRequestType", propOrder = {
    "_this",
    "ovfDescriptor",
    "resourcePool",
    "datastore",
    "cisp"
})
public class CreateImportSpecRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String ovfDescriptor;
    @XmlElement(required = true)
    protected ManagedObjectReference resourcePool;
    @XmlElement(required = true)
    protected ManagedObjectReference datastore;
    @XmlElement(required = true)
    protected OvfCreateImportSpecParams cisp;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the ovfDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvfDescriptor() {
        return ovfDescriptor;
    }

    /**
     * Sets the value of the ovfDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvfDescriptor(String value) {
        this.ovfDescriptor = value;
    }

    /**
     * Gets the value of the resourcePool property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getResourcePool() {
        return resourcePool;
    }

    /**
     * Sets the value of the resourcePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setResourcePool(ManagedObjectReference value) {
        this.resourcePool = value;
    }

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatastore(ManagedObjectReference value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the cisp property.
     * 
     * @return
     *     possible object is
     *     {@link OvfCreateImportSpecParams }
     *     
     */
    public OvfCreateImportSpecParams getCisp() {
        return cisp;
    }

    /**
     * Sets the value of the cisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvfCreateImportSpecParams }
     *     
     */
    public void setCisp(OvfCreateImportSpecParams value) {
        this.cisp = value;
    }

}
