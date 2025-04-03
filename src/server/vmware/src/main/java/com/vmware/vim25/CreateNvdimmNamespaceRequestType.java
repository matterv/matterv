
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateNvdimmNamespaceRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateNvdimmNamespaceRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="createSpec" type="{urn:internalvim25}NvdimmNamespaceCreateSpec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateNvdimmNamespaceRequestType", propOrder = {
    "_this",
    "createSpec"
})
public class CreateNvdimmNamespaceRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected NvdimmNamespaceCreateSpec createSpec;

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
     * Gets the value of the createSpec property.
     * 
     * @return
     *     possible object is
     *     {@link NvdimmNamespaceCreateSpec }
     *     
     */
    public NvdimmNamespaceCreateSpec getCreateSpec() {
        return createSpec;
    }

    /**
     * Sets the value of the createSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link NvdimmNamespaceCreateSpec }
     *     
     */
    public void setCreateSpec(NvdimmNamespaceCreateSpec value) {
        this.createSpec = value;
    }

}
