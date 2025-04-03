
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVPortgroupRollbackRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVPortgroupRollbackRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="entityBackup" type="{urn:internalvim25}EntityBackupConfig" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortgroupRollbackRequestType", propOrder = {
    "_this",
    "entityBackup"
})
public class DVPortgroupRollbackRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected EntityBackupConfig entityBackup;

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
     * Gets the value of the entityBackup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityBackupConfig }
     *     
     */
    public EntityBackupConfig getEntityBackup() {
        return entityBackup;
    }

    /**
     * Sets the value of the entityBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityBackupConfig }
     *     
     */
    public void setEntityBackup(EntityBackupConfig value) {
        this.entityBackup = value;
    }

}
