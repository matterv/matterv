
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSpecGetUpdatedHostsRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSpecGetUpdatedHostsRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="startChangeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="endChangeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSpecGetUpdatedHostsRequestType", propOrder = {
    "_this",
    "startChangeID",
    "endChangeID"
})
public class HostSpecGetUpdatedHostsRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected String startChangeID;
    protected String endChangeID;

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
     * Gets the value of the startChangeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartChangeID() {
        return startChangeID;
    }

    /**
     * Sets the value of the startChangeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartChangeID(String value) {
        this.startChangeID = value;
    }

    /**
     * Gets the value of the endChangeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndChangeID() {
        return endChangeID;
    }

    /**
     * Sets the value of the endChangeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndChangeID(String value) {
        this.endChangeID = value;
    }

}
