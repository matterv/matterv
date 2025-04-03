
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateVirtualMachineFilesRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateVirtualMachineFilesRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="mountPathDatastoreMapping" type="{urn:internalvim25}DatastoreMountPathDatastorePair" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVirtualMachineFilesRequestType", propOrder = {
    "_this",
    "mountPathDatastoreMapping"
})
public class UpdateVirtualMachineFilesRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected List<DatastoreMountPathDatastorePair> mountPathDatastoreMapping;

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
     * Gets the value of the mountPathDatastoreMapping property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mountPathDatastoreMapping property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMountPathDatastoreMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatastoreMountPathDatastorePair }
     * </p>
     * 
     * 
     * @return
     *     The value of the mountPathDatastoreMapping property.
     */
    public List<DatastoreMountPathDatastorePair> getMountPathDatastoreMapping() {
        if (mountPathDatastoreMapping == null) {
            mountPathDatastoreMapping = new ArrayList<>();
        }
        return this.mountPathDatastoreMapping;
    }

}
