
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectNvmeControllerRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConnectNvmeControllerRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="connectSpec" type="{urn:internalvim25}HostNvmeConnectSpec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectNvmeControllerRequestType", propOrder = {
    "_this",
    "connectSpec"
})
public class ConnectNvmeControllerRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected HostNvmeConnectSpec connectSpec;

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
     * Gets the value of the connectSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostNvmeConnectSpec }
     *     
     */
    public HostNvmeConnectSpec getConnectSpec() {
        return connectSpec;
    }

    /**
     * Sets the value of the connectSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNvmeConnectSpec }
     *     
     */
    public void setConnectSpec(HostNvmeConnectSpec value) {
        this.connectSpec = value;
    }

}
