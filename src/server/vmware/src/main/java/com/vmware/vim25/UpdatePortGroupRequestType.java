
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePortGroupRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdatePortGroupRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="pgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="portgrp" type="{urn:internalvim25}HostPortGroupSpec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePortGroupRequestType", propOrder = {
    "_this",
    "pgName",
    "portgrp"
})
public class UpdatePortGroupRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String pgName;
    @XmlElement(required = true)
    protected HostPortGroupSpec portgrp;

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
     * Gets the value of the pgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgName() {
        return pgName;
    }

    /**
     * Sets the value of the pgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgName(String value) {
        this.pgName = value;
    }

    /**
     * Gets the value of the portgrp property.
     * 
     * @return
     *     possible object is
     *     {@link HostPortGroupSpec }
     *     
     */
    public HostPortGroupSpec getPortgrp() {
        return portgrp;
    }

    /**
     * Sets the value of the portgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPortGroupSpec }
     *     
     */
    public void setPortgrp(HostPortGroupSpec value) {
        this.portgrp = value;
    }

}
