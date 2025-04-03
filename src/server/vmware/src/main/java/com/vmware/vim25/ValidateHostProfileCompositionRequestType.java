
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateHostProfileCompositionRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ValidateHostProfileCompositionRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="source" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="targets" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="toBeMerged" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="toReplaceWith" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="toBeDeleted" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="enableStatusToBeCopied" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="errorOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateHostProfileCompositionRequestType", propOrder = {
    "_this",
    "source",
    "targets",
    "toBeMerged",
    "toReplaceWith",
    "toBeDeleted",
    "enableStatusToBeCopied",
    "errorOnly"
})
public class ValidateHostProfileCompositionRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected ManagedObjectReference source;
    protected List<ManagedObjectReference> targets;
    protected HostApplyProfile toBeMerged;
    protected HostApplyProfile toReplaceWith;
    protected HostApplyProfile toBeDeleted;
    protected HostApplyProfile enableStatusToBeCopied;
    protected Boolean errorOnly;

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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSource(ManagedObjectReference value) {
        this.source = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targets property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTargets().add(newItem);
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
     *     The value of the targets property.
     */
    public List<ManagedObjectReference> getTargets() {
        if (targets == null) {
            targets = new ArrayList<>();
        }
        return this.targets;
    }

    /**
     * Gets the value of the toBeMerged property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getToBeMerged() {
        return toBeMerged;
    }

    /**
     * Sets the value of the toBeMerged property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setToBeMerged(HostApplyProfile value) {
        this.toBeMerged = value;
    }

    /**
     * Gets the value of the toReplaceWith property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getToReplaceWith() {
        return toReplaceWith;
    }

    /**
     * Sets the value of the toReplaceWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setToReplaceWith(HostApplyProfile value) {
        this.toReplaceWith = value;
    }

    /**
     * Gets the value of the toBeDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getToBeDeleted() {
        return toBeDeleted;
    }

    /**
     * Sets the value of the toBeDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setToBeDeleted(HostApplyProfile value) {
        this.toBeDeleted = value;
    }

    /**
     * Gets the value of the enableStatusToBeCopied property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getEnableStatusToBeCopied() {
        return enableStatusToBeCopied;
    }

    /**
     * Sets the value of the enableStatusToBeCopied property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setEnableStatusToBeCopied(HostApplyProfile value) {
        this.enableStatusToBeCopied = value;
    }

    /**
     * Gets the value of the errorOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorOnly() {
        return errorOnly;
    }

    /**
     * Sets the value of the errorOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorOnly(Boolean value) {
        this.errorOnly = value;
    }

}
