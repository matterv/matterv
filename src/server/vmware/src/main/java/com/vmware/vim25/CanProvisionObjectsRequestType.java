
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanProvisionObjectsRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CanProvisionObjectsRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="npbs" type="{urn:internalvim25}VsanNewPolicyBatch" maxOccurs="unbounded"/>
 *         <element name="ignoreSatisfiability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanProvisionObjectsRequestType", propOrder = {
    "_this",
    "npbs",
    "ignoreSatisfiability"
})
public class CanProvisionObjectsRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected List<VsanNewPolicyBatch> npbs;
    protected Boolean ignoreSatisfiability;

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
     * Gets the value of the npbs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npbs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNpbs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanNewPolicyBatch }
     * </p>
     * 
     * 
     * @return
     *     The value of the npbs property.
     */
    public List<VsanNewPolicyBatch> getNpbs() {
        if (npbs == null) {
            npbs = new ArrayList<>();
        }
        return this.npbs;
    }

    /**
     * Gets the value of the ignoreSatisfiability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreSatisfiability() {
        return ignoreSatisfiability;
    }

    /**
     * Sets the value of the ignoreSatisfiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreSatisfiability(Boolean value) {
        this.ignoreSatisfiability = value;
    }

}
