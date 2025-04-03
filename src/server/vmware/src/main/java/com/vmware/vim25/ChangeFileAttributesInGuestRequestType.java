
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeFileAttributesInGuestRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ChangeFileAttributesInGuestRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="auth" type="{urn:internalvim25}GuestAuthentication"/>
 *         <element name="guestFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fileAttributes" type="{urn:internalvim25}GuestFileAttributes"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeFileAttributesInGuestRequestType", propOrder = {
    "_this",
    "vm",
    "auth",
    "guestFilePath",
    "fileAttributes"
})
public class ChangeFileAttributesInGuestRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected ManagedObjectReference vm;
    @XmlElement(required = true)
    protected GuestAuthentication auth;
    @XmlElement(required = true)
    protected String guestFilePath;
    @XmlElement(required = true)
    protected GuestFileAttributes fileAttributes;

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
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVm(ManagedObjectReference value) {
        this.vm = value;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link GuestAuthentication }
     *     
     */
    public GuestAuthentication getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestAuthentication }
     *     
     */
    public void setAuth(GuestAuthentication value) {
        this.auth = value;
    }

    /**
     * Gets the value of the guestFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestFilePath() {
        return guestFilePath;
    }

    /**
     * Sets the value of the guestFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestFilePath(String value) {
        this.guestFilePath = value;
    }

    /**
     * Gets the value of the fileAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link GuestFileAttributes }
     *     
     */
    public GuestFileAttributes getFileAttributes() {
        return fileAttributes;
    }

    /**
     * Sets the value of the fileAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestFileAttributes }
     *     
     */
    public void setFileAttributes(GuestFileAttributes value) {
        this.fileAttributes = value;
    }

}
