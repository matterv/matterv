
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddStandaloneHostRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AddStandaloneHostRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="spec" type="{urn:internalvim25}HostConnectSpec"/>
 *         <element name="compResSpec" type="{urn:internalvim25}ComputeResourceConfigSpec" minOccurs="0"/>
 *         <element name="addConnected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="license" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddStandaloneHostRequestType", propOrder = {
    "_this",
    "spec",
    "compResSpec",
    "addConnected",
    "license"
})
public class AddStandaloneHostRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected HostConnectSpec spec;
    protected ComputeResourceConfigSpec compResSpec;
    protected boolean addConnected;
    protected String license;

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
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link HostConnectSpec }
     *     
     */
    public HostConnectSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostConnectSpec }
     *     
     */
    public void setSpec(HostConnectSpec value) {
        this.spec = value;
    }

    /**
     * Gets the value of the compResSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ComputeResourceConfigSpec }
     *     
     */
    public ComputeResourceConfigSpec getCompResSpec() {
        return compResSpec;
    }

    /**
     * Sets the value of the compResSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputeResourceConfigSpec }
     *     
     */
    public void setCompResSpec(ComputeResourceConfigSpec value) {
        this.compResSpec = value;
    }

    /**
     * Gets the value of the addConnected property.
     * 
     */
    public boolean isAddConnected() {
        return addConnected;
    }

    /**
     * Sets the value of the addConnected property.
     * 
     */
    public void setAddConnected(boolean value) {
        this.addConnected = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicense(String value) {
        this.license = value;
    }

}
