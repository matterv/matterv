
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeDiscoverSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNvmeDiscoverSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostNvmeSpec">
 *       <sequence>
 *         <element name="autoConnect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rootDiscoveryController" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeDiscoverSpec", propOrder = {
    "autoConnect",
    "rootDiscoveryController"
})
public class HostNvmeDiscoverSpec
    extends HostNvmeSpec
{

    protected Boolean autoConnect;
    protected Boolean rootDiscoveryController;

    /**
     * Gets the value of the autoConnect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoConnect() {
        return autoConnect;
    }

    /**
     * Sets the value of the autoConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoConnect(Boolean value) {
        this.autoConnect = value;
    }

    /**
     * Gets the value of the rootDiscoveryController property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRootDiscoveryController() {
        return rootDiscoveryController;
    }

    /**
     * Sets the value of the rootDiscoveryController property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRootDiscoveryController(Boolean value) {
        this.rootDiscoveryController = value;
    }

}
