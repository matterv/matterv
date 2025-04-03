
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateIpmiRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateIpmiRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="ipmiInfo" type="{urn:internalvim25}HostIpmiInfo"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIpmiRequestType", propOrder = {
    "_this",
    "ipmiInfo"
})
public class UpdateIpmiRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected HostIpmiInfo ipmiInfo;

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
     * Gets the value of the ipmiInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpmiInfo }
     *     
     */
    public HostIpmiInfo getIpmiInfo() {
        return ipmiInfo;
    }

    /**
     * Sets the value of the ipmiInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpmiInfo }
     *     
     */
    public void setIpmiInfo(HostIpmiInfo value) {
        this.ipmiInfo = value;
    }

}
