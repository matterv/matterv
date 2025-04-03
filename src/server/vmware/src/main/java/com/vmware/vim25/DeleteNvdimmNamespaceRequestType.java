
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteNvdimmNamespaceRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeleteNvdimmNamespaceRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="deleteSpec" type="{urn:internalvim25}NvdimmNamespaceDeleteSpec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteNvdimmNamespaceRequestType", propOrder = {
    "_this",
    "deleteSpec"
})
public class DeleteNvdimmNamespaceRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected NvdimmNamespaceDeleteSpec deleteSpec;

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
     * Gets the value of the deleteSpec property.
     * 
     * @return
     *     possible object is
     *     {@link NvdimmNamespaceDeleteSpec }
     *     
     */
    public NvdimmNamespaceDeleteSpec getDeleteSpec() {
        return deleteSpec;
    }

    /**
     * Sets the value of the deleteSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link NvdimmNamespaceDeleteSpec }
     *     
     */
    public void setDeleteSpec(NvdimmNamespaceDeleteSpec value) {
        this.deleteSpec = value;
    }

}
