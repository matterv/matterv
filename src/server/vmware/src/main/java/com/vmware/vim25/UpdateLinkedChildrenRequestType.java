
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateLinkedChildrenRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateLinkedChildrenRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="addChangeSet" type="{urn:internalvim25}VirtualAppLinkInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="removeSet" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLinkedChildrenRequestType", propOrder = {
    "_this",
    "addChangeSet",
    "removeSet"
})
public class UpdateLinkedChildrenRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected List<VirtualAppLinkInfo> addChangeSet;
    protected List<ManagedObjectReference> removeSet;

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
     * Gets the value of the addChangeSet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addChangeSet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddChangeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualAppLinkInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the addChangeSet property.
     */
    public List<VirtualAppLinkInfo> getAddChangeSet() {
        if (addChangeSet == null) {
            addChangeSet = new ArrayList<>();
        }
        return this.addChangeSet;
    }

    /**
     * Gets the value of the removeSet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removeSet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemoveSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the removeSet property.
     */
    public List<ManagedObjectReference> getRemoveSet() {
        if (removeSet == null) {
            removeSet = new ArrayList<>();
        }
        return this.removeSet;
    }

}
