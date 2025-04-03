
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaDiscoveryProperties complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHbaDiscoveryProperties">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="iSnsDiscoveryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="iSnsDiscoveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="iSnsHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="slpDiscoveryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="slpDiscoveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="slpHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="staticTargetDiscoveryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendTargetsDiscoveryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaDiscoveryProperties", propOrder = {
    "iSnsDiscoveryEnabled",
    "iSnsDiscoveryMethod",
    "iSnsHost",
    "slpDiscoveryEnabled",
    "slpDiscoveryMethod",
    "slpHost",
    "staticTargetDiscoveryEnabled",
    "sendTargetsDiscoveryEnabled"
})
public class HostInternetScsiHbaDiscoveryProperties
    extends DynamicData
{

    protected boolean iSnsDiscoveryEnabled;
    protected String iSnsDiscoveryMethod;
    protected String iSnsHost;
    protected boolean slpDiscoveryEnabled;
    protected String slpDiscoveryMethod;
    protected String slpHost;
    protected boolean staticTargetDiscoveryEnabled;
    protected boolean sendTargetsDiscoveryEnabled;

    /**
     * Gets the value of the iSnsDiscoveryEnabled property.
     * 
     */
    public boolean isISnsDiscoveryEnabled() {
        return iSnsDiscoveryEnabled;
    }

    /**
     * Sets the value of the iSnsDiscoveryEnabled property.
     * 
     */
    public void setISnsDiscoveryEnabled(boolean value) {
        this.iSnsDiscoveryEnabled = value;
    }

    /**
     * Gets the value of the iSnsDiscoveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISnsDiscoveryMethod() {
        return iSnsDiscoveryMethod;
    }

    /**
     * Sets the value of the iSnsDiscoveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISnsDiscoveryMethod(String value) {
        this.iSnsDiscoveryMethod = value;
    }

    /**
     * Gets the value of the iSnsHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISnsHost() {
        return iSnsHost;
    }

    /**
     * Sets the value of the iSnsHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISnsHost(String value) {
        this.iSnsHost = value;
    }

    /**
     * Gets the value of the slpDiscoveryEnabled property.
     * 
     */
    public boolean isSlpDiscoveryEnabled() {
        return slpDiscoveryEnabled;
    }

    /**
     * Sets the value of the slpDiscoveryEnabled property.
     * 
     */
    public void setSlpDiscoveryEnabled(boolean value) {
        this.slpDiscoveryEnabled = value;
    }

    /**
     * Gets the value of the slpDiscoveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlpDiscoveryMethod() {
        return slpDiscoveryMethod;
    }

    /**
     * Sets the value of the slpDiscoveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlpDiscoveryMethod(String value) {
        this.slpDiscoveryMethod = value;
    }

    /**
     * Gets the value of the slpHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlpHost() {
        return slpHost;
    }

    /**
     * Sets the value of the slpHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlpHost(String value) {
        this.slpHost = value;
    }

    /**
     * Gets the value of the staticTargetDiscoveryEnabled property.
     * 
     */
    public boolean isStaticTargetDiscoveryEnabled() {
        return staticTargetDiscoveryEnabled;
    }

    /**
     * Sets the value of the staticTargetDiscoveryEnabled property.
     * 
     */
    public void setStaticTargetDiscoveryEnabled(boolean value) {
        this.staticTargetDiscoveryEnabled = value;
    }

    /**
     * Gets the value of the sendTargetsDiscoveryEnabled property.
     * 
     */
    public boolean isSendTargetsDiscoveryEnabled() {
        return sendTargetsDiscoveryEnabled;
    }

    /**
     * Sets the value of the sendTargetsDiscoveryEnabled property.
     * 
     */
    public void setSendTargetsDiscoveryEnabled(boolean value) {
        this.sendTargetsDiscoveryEnabled = value;
    }

}
