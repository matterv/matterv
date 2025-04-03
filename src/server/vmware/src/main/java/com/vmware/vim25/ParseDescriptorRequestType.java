
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParseDescriptorRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ParseDescriptorRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="ovfDescriptor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pdp" type="{urn:internalvim25}OvfParseDescriptorParams"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParseDescriptorRequestType", propOrder = {
    "_this",
    "ovfDescriptor",
    "pdp"
})
public class ParseDescriptorRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String ovfDescriptor;
    @XmlElement(required = true)
    protected OvfParseDescriptorParams pdp;

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
     * Gets the value of the ovfDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvfDescriptor() {
        return ovfDescriptor;
    }

    /**
     * Sets the value of the ovfDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvfDescriptor(String value) {
        this.ovfDescriptor = value;
    }

    /**
     * Gets the value of the pdp property.
     * 
     * @return
     *     possible object is
     *     {@link OvfParseDescriptorParams }
     *     
     */
    public OvfParseDescriptorParams getPdp() {
        return pdp;
    }

    /**
     * Sets the value of the pdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvfParseDescriptorParams }
     *     
     */
    public void setPdp(OvfParseDescriptorParams value) {
        this.pdp = value;
    }

}
