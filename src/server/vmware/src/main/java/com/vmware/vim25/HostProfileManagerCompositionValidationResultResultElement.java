
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileManagerCompositionValidationResultResultElement complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostProfileManagerCompositionValidationResultResultElement">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="target" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="errors" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sourceDiffForToBeMerged" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="targetDiffForToBeMerged" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="toBeAdded" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="toBeDeleted" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="toBeDisabled" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="toBeEnabled" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="toBeReenableCC" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileManagerCompositionValidationResultResultElement", propOrder = {
    "target",
    "status",
    "errors",
    "sourceDiffForToBeMerged",
    "targetDiffForToBeMerged",
    "toBeAdded",
    "toBeDeleted",
    "toBeDisabled",
    "toBeEnabled",
    "toBeReenableCC"
})
public class HostProfileManagerCompositionValidationResultResultElement
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference target;
    @XmlElement(required = true)
    protected String status;
    protected List<LocalizableMessage> errors;
    protected HostApplyProfile sourceDiffForToBeMerged;
    protected HostApplyProfile targetDiffForToBeMerged;
    protected HostApplyProfile toBeAdded;
    protected HostApplyProfile toBeDeleted;
    protected HostApplyProfile toBeDisabled;
    protected HostApplyProfile toBeEnabled;
    protected HostApplyProfile toBeReenableCC;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setTarget(ManagedObjectReference value) {
        this.target = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizableMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the errors property.
     */
    public List<LocalizableMessage> getErrors() {
        if (errors == null) {
            errors = new ArrayList<>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the sourceDiffForToBeMerged property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getSourceDiffForToBeMerged() {
        return sourceDiffForToBeMerged;
    }

    /**
     * Sets the value of the sourceDiffForToBeMerged property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setSourceDiffForToBeMerged(HostApplyProfile value) {
        this.sourceDiffForToBeMerged = value;
    }

    /**
     * Gets the value of the targetDiffForToBeMerged property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getTargetDiffForToBeMerged() {
        return targetDiffForToBeMerged;
    }

    /**
     * Sets the value of the targetDiffForToBeMerged property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setTargetDiffForToBeMerged(HostApplyProfile value) {
        this.targetDiffForToBeMerged = value;
    }

    /**
     * Gets the value of the toBeAdded property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getToBeAdded() {
        return toBeAdded;
    }

    /**
     * Sets the value of the toBeAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setToBeAdded(HostApplyProfile value) {
        this.toBeAdded = value;
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
     * Gets the value of the toBeDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getToBeDisabled() {
        return toBeDisabled;
    }

    /**
     * Sets the value of the toBeDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setToBeDisabled(HostApplyProfile value) {
        this.toBeDisabled = value;
    }

    /**
     * Gets the value of the toBeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getToBeEnabled() {
        return toBeEnabled;
    }

    /**
     * Sets the value of the toBeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setToBeEnabled(HostApplyProfile value) {
        this.toBeEnabled = value;
    }

    /**
     * Gets the value of the toBeReenableCC property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getToBeReenableCC() {
        return toBeReenableCC;
    }

    /**
     * Sets the value of the toBeReenableCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setToBeReenableCC(HostApplyProfile value) {
        this.toBeReenableCC = value;
    }

}
