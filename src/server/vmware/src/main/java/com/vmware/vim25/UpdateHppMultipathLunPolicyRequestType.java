
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateHppMultipathLunPolicyRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateHppMultipathLunPolicyRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="lunId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="policy" type="{urn:internalvim25}HostMultipathInfoHppLogicalUnitPolicy"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHppMultipathLunPolicyRequestType", propOrder = {
    "_this",
    "lunId",
    "policy"
})
public class UpdateHppMultipathLunPolicyRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String lunId;
    @XmlElement(required = true)
    protected HostMultipathInfoHppLogicalUnitPolicy policy;

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
     * Gets the value of the lunId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLunId() {
        return lunId;
    }

    /**
     * Sets the value of the lunId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLunId(String value) {
        this.lunId = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link HostMultipathInfoHppLogicalUnitPolicy }
     *     
     */
    public HostMultipathInfoHppLogicalUnitPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMultipathInfoHppLogicalUnitPolicy }
     *     
     */
    public void setPolicy(HostMultipathInfoHppLogicalUnitPolicy value) {
        this.policy = value;
    }

}
