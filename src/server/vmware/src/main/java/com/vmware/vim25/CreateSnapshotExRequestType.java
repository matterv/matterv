
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateSnapshotExRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateSnapshotExRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="memory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="quiesceSpec" type="{urn:internalvim25}VirtualMachineGuestQuiesceSpec" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSnapshotExRequestType", propOrder = {
    "_this",
    "name",
    "description",
    "memory",
    "quiesceSpec"
})
public class CreateSnapshotExRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected boolean memory;
    protected VirtualMachineGuestQuiesceSpec quiesceSpec;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the memory property.
     * 
     */
    public boolean isMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     */
    public void setMemory(boolean value) {
        this.memory = value;
    }

    /**
     * Gets the value of the quiesceSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineGuestQuiesceSpec }
     *     
     */
    public VirtualMachineGuestQuiesceSpec getQuiesceSpec() {
        return quiesceSpec;
    }

    /**
     * Sets the value of the quiesceSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineGuestQuiesceSpec }
     *     
     */
    public void setQuiesceSpec(VirtualMachineGuestQuiesceSpec value) {
        this.quiesceSpec = value;
    }

}
