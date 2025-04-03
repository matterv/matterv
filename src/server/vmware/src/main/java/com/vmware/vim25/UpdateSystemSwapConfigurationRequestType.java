
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSystemSwapConfigurationRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateSystemSwapConfigurationRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="sysSwapConfig" type="{urn:internalvim25}HostSystemSwapConfiguration"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSystemSwapConfigurationRequestType", propOrder = {
    "_this",
    "sysSwapConfig"
})
public class UpdateSystemSwapConfigurationRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected HostSystemSwapConfiguration sysSwapConfig;

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
     * Gets the value of the sysSwapConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemSwapConfiguration }
     *     
     */
    public HostSystemSwapConfiguration getSysSwapConfig() {
        return sysSwapConfig;
    }

    /**
     * Sets the value of the sysSwapConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemSwapConfiguration }
     *     
     */
    public void setSysSwapConfig(HostSystemSwapConfiguration value) {
        this.sysSwapConfig = value;
    }

}
