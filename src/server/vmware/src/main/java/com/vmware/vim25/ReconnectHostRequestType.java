
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconnectHostRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReconnectHostRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="cnxSpec" type="{urn:internalvim25}HostConnectSpec" minOccurs="0"/>
 *         <element name="reconnectSpec" type="{urn:internalvim25}HostSystemReconnectSpec" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconnectHostRequestType", propOrder = {
    "_this",
    "cnxSpec",
    "reconnectSpec"
})
public class ReconnectHostRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected HostConnectSpec cnxSpec;
    protected HostSystemReconnectSpec reconnectSpec;

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
     * Gets the value of the cnxSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostConnectSpec }
     *     
     */
    public HostConnectSpec getCnxSpec() {
        return cnxSpec;
    }

    /**
     * Sets the value of the cnxSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostConnectSpec }
     *     
     */
    public void setCnxSpec(HostConnectSpec value) {
        this.cnxSpec = value;
    }

    /**
     * Gets the value of the reconnectSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemReconnectSpec }
     *     
     */
    public HostSystemReconnectSpec getReconnectSpec() {
        return reconnectSpec;
    }

    /**
     * Sets the value of the reconnectSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemReconnectSpec }
     *     
     */
    public void setReconnectSpec(HostSystemReconnectSpec value) {
        this.reconnectSpec = value;
    }

}
