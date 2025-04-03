
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergePermissionsRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MergePermissionsRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="srcRoleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dstRoleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergePermissionsRequestType", propOrder = {
    "_this",
    "srcRoleId",
    "dstRoleId"
})
public class MergePermissionsRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected int srcRoleId;
    protected int dstRoleId;

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
     * Gets the value of the srcRoleId property.
     * 
     */
    public int getSrcRoleId() {
        return srcRoleId;
    }

    /**
     * Sets the value of the srcRoleId property.
     * 
     */
    public void setSrcRoleId(int value) {
        this.srcRoleId = value;
    }

    /**
     * Gets the value of the dstRoleId property.
     * 
     */
    public int getDstRoleId() {
        return dstRoleId;
    }

    /**
     * Sets the value of the dstRoleId property.
     * 
     */
    public void setDstRoleId(int value) {
        this.dstRoleId = value;
    }

}
