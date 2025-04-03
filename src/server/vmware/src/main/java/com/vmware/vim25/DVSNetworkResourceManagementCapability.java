
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSNetworkResourceManagementCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSNetworkResourceManagementCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="networkResourceManagementSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="networkResourcePoolHighShareValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="qosSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="userDefinedNetworkResourcePoolsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="networkResourceControlVersion3Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="userDefinedInfraTrafficPoolSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSNetworkResourceManagementCapability", propOrder = {
    "networkResourceManagementSupported",
    "networkResourcePoolHighShareValue",
    "qosSupported",
    "userDefinedNetworkResourcePoolsSupported",
    "networkResourceControlVersion3Supported",
    "userDefinedInfraTrafficPoolSupported"
})
public class DVSNetworkResourceManagementCapability
    extends DynamicData
{

    protected boolean networkResourceManagementSupported;
    protected int networkResourcePoolHighShareValue;
    protected boolean qosSupported;
    protected boolean userDefinedNetworkResourcePoolsSupported;
    protected Boolean networkResourceControlVersion3Supported;
    protected Boolean userDefinedInfraTrafficPoolSupported;

    /**
     * Gets the value of the networkResourceManagementSupported property.
     * 
     */
    public boolean isNetworkResourceManagementSupported() {
        return networkResourceManagementSupported;
    }

    /**
     * Sets the value of the networkResourceManagementSupported property.
     * 
     */
    public void setNetworkResourceManagementSupported(boolean value) {
        this.networkResourceManagementSupported = value;
    }

    /**
     * Gets the value of the networkResourcePoolHighShareValue property.
     * 
     */
    public int getNetworkResourcePoolHighShareValue() {
        return networkResourcePoolHighShareValue;
    }

    /**
     * Sets the value of the networkResourcePoolHighShareValue property.
     * 
     */
    public void setNetworkResourcePoolHighShareValue(int value) {
        this.networkResourcePoolHighShareValue = value;
    }

    /**
     * Gets the value of the qosSupported property.
     * 
     */
    public boolean isQosSupported() {
        return qosSupported;
    }

    /**
     * Sets the value of the qosSupported property.
     * 
     */
    public void setQosSupported(boolean value) {
        this.qosSupported = value;
    }

    /**
     * Gets the value of the userDefinedNetworkResourcePoolsSupported property.
     * 
     */
    public boolean isUserDefinedNetworkResourcePoolsSupported() {
        return userDefinedNetworkResourcePoolsSupported;
    }

    /**
     * Sets the value of the userDefinedNetworkResourcePoolsSupported property.
     * 
     */
    public void setUserDefinedNetworkResourcePoolsSupported(boolean value) {
        this.userDefinedNetworkResourcePoolsSupported = value;
    }

    /**
     * Gets the value of the networkResourceControlVersion3Supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkResourceControlVersion3Supported() {
        return networkResourceControlVersion3Supported;
    }

    /**
     * Sets the value of the networkResourceControlVersion3Supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkResourceControlVersion3Supported(Boolean value) {
        this.networkResourceControlVersion3Supported = value;
    }

    /**
     * Gets the value of the userDefinedInfraTrafficPoolSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDefinedInfraTrafficPoolSupported() {
        return userDefinedInfraTrafficPoolSupported;
    }

    /**
     * Sets the value of the userDefinedInfraTrafficPoolSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDefinedInfraTrafficPoolSupported(Boolean value) {
        this.userDefinedInfraTrafficPoolSupported = value;
    }

}
