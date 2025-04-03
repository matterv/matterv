
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveFileInGuestRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MoveFileInGuestRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="auth" type="{urn:internalvim25}GuestAuthentication"/>
 *         <element name="srcFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dstFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveFileInGuestRequestType", propOrder = {
    "_this",
    "vm",
    "auth",
    "srcFilePath",
    "dstFilePath",
    "overwrite"
})
public class MoveFileInGuestRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected ManagedObjectReference vm;
    @XmlElement(required = true)
    protected GuestAuthentication auth;
    @XmlElement(required = true)
    protected String srcFilePath;
    @XmlElement(required = true)
    protected String dstFilePath;
    protected boolean overwrite;

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
     * Gets the value of the srcFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcFilePath() {
        return srcFilePath;
    }

    /**
     * Sets the value of the srcFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcFilePath(String value) {
        this.srcFilePath = value;
    }

    /**
     * Gets the value of the dstFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstFilePath() {
        return dstFilePath;
    }

    /**
     * Sets the value of the dstFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstFilePath(String value) {
        this.dstFilePath = value;
    }

    /**
     * Gets the value of the overwrite property.
     * 
     */
    public boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Sets the value of the overwrite property.
     * 
     */
    public void setOverwrite(boolean value) {
        this.overwrite = value;
    }

}
