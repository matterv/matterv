
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoverFcoeHbasRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DiscoverFcoeHbasRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="fcoeSpec" type="{urn:internalvim25}FcoeConfigFcoeSpecification"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoverFcoeHbasRequestType", propOrder = {
    "_this",
    "fcoeSpec"
})
public class DiscoverFcoeHbasRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected FcoeConfigFcoeSpecification fcoeSpec;

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
     * Gets the value of the fcoeSpec property.
     * 
     * @return
     *     possible object is
     *     {@link FcoeConfigFcoeSpecification }
     *     
     */
    public FcoeConfigFcoeSpecification getFcoeSpec() {
        return fcoeSpec;
    }

    /**
     * Sets the value of the fcoeSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FcoeConfigFcoeSpecification }
     *     
     */
    public void setFcoeSpec(FcoeConfigFcoeSpecification value) {
        this.fcoeSpec = value;
    }

}
