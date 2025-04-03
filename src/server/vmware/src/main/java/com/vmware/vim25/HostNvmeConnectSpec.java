
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeConnectSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNvmeConnectSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostNvmeSpec">
 *       <sequence>
 *         <element name="subnqn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="controllerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="adminQueueSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="keepAliveTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeConnectSpec", propOrder = {
    "subnqn",
    "controllerId",
    "adminQueueSize",
    "keepAliveTimeout"
})
public class HostNvmeConnectSpec
    extends HostNvmeSpec
{

    @XmlElement(required = true)
    protected String subnqn;
    protected Integer controllerId;
    protected Integer adminQueueSize;
    protected Integer keepAliveTimeout;

    /**
     * Gets the value of the subnqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnqn() {
        return subnqn;
    }

    /**
     * Sets the value of the subnqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnqn(String value) {
        this.subnqn = value;
    }

    /**
     * Gets the value of the controllerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getControllerId() {
        return controllerId;
    }

    /**
     * Sets the value of the controllerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setControllerId(Integer value) {
        this.controllerId = value;
    }

    /**
     * Gets the value of the adminQueueSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdminQueueSize() {
        return adminQueueSize;
    }

    /**
     * Sets the value of the adminQueueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdminQueueSize(Integer value) {
        this.adminQueueSize = value;
    }

    /**
     * Gets the value of the keepAliveTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeepAliveTimeout() {
        return keepAliveTimeout;
    }

    /**
     * Sets the value of the keepAliveTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeepAliveTimeout(Integer value) {
        this.keepAliveTimeout = value;
    }

}
