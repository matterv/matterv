
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prepareVchaRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="prepareVchaRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="networkSpec" type="{urn:internalvim25}VchaClusterNetworkSpec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prepareVchaRequestType", propOrder = {
    "_this",
    "networkSpec"
})
public class PrepareVchaRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected VchaClusterNetworkSpec networkSpec;

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
     * Gets the value of the networkSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VchaClusterNetworkSpec }
     *     
     */
    public VchaClusterNetworkSpec getNetworkSpec() {
        return networkSpec;
    }

    /**
     * Sets the value of the networkSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VchaClusterNetworkSpec }
     *     
     */
    public void setNetworkSpec(VchaClusterNetworkSpec value) {
        this.networkSpec = value;
    }

}
