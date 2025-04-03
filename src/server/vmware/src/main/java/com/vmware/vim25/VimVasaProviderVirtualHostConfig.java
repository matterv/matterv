
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VimVasaProviderVirtualHostConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VimVasaProviderVirtualHostConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vhostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="serviceHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="servicePort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VimVasaProviderVirtualHostConfig", propOrder = {
    "vhostName",
    "serviceHost",
    "servicePort"
})
public class VimVasaProviderVirtualHostConfig
    extends DynamicData
{

    protected String vhostName;
    @XmlElement(required = true)
    protected String serviceHost;
    protected Integer servicePort;

    /**
     * Gets the value of the vhostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhostName() {
        return vhostName;
    }

    /**
     * Sets the value of the vhostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhostName(String value) {
        this.vhostName = value;
    }

    /**
     * Gets the value of the serviceHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceHost() {
        return serviceHost;
    }

    /**
     * Sets the value of the serviceHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceHost(String value) {
        this.serviceHost = value;
    }

    /**
     * Gets the value of the servicePort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicePort() {
        return servicePort;
    }

    /**
     * Sets the value of the servicePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicePort(Integer value) {
        this.servicePort = value;
    }

}
