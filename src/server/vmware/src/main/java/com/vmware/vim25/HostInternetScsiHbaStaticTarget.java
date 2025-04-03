
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaStaticTarget complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHbaStaticTarget">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="iScsiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="discoveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="authenticationProperties" type="{urn:internalvim25}HostInternetScsiHbaAuthenticationProperties" minOccurs="0"/>
 *         <element name="digestProperties" type="{urn:internalvim25}HostInternetScsiHbaDigestProperties" minOccurs="0"/>
 *         <element name="supportedAdvancedOptions" type="{urn:internalvim25}OptionDef" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="advancedOptions" type="{urn:internalvim25}HostInternetScsiHbaParamValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaStaticTarget", propOrder = {
    "address",
    "port",
    "iScsiName",
    "discoveryMethod",
    "authenticationProperties",
    "digestProperties",
    "supportedAdvancedOptions",
    "advancedOptions",
    "parent"
})
public class HostInternetScsiHbaStaticTarget
    extends DynamicData
{

    @XmlElement(required = true)
    protected String address;
    protected Integer port;
    @XmlElement(required = true)
    protected String iScsiName;
    protected String discoveryMethod;
    protected HostInternetScsiHbaAuthenticationProperties authenticationProperties;
    protected HostInternetScsiHbaDigestProperties digestProperties;
    protected List<OptionDef> supportedAdvancedOptions;
    protected List<HostInternetScsiHbaParamValue> advancedOptions;
    protected String parent;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the iScsiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIScsiName() {
        return iScsiName;
    }

    /**
     * Sets the value of the iScsiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIScsiName(String value) {
        this.iScsiName = value;
    }

    /**
     * Gets the value of the discoveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscoveryMethod() {
        return discoveryMethod;
    }

    /**
     * Sets the value of the discoveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscoveryMethod(String value) {
        this.discoveryMethod = value;
    }

    /**
     * Gets the value of the authenticationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaAuthenticationProperties }
     *     
     */
    public HostInternetScsiHbaAuthenticationProperties getAuthenticationProperties() {
        return authenticationProperties;
    }

    /**
     * Sets the value of the authenticationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaAuthenticationProperties }
     *     
     */
    public void setAuthenticationProperties(HostInternetScsiHbaAuthenticationProperties value) {
        this.authenticationProperties = value;
    }

    /**
     * Gets the value of the digestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaDigestProperties }
     *     
     */
    public HostInternetScsiHbaDigestProperties getDigestProperties() {
        return digestProperties;
    }

    /**
     * Sets the value of the digestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaDigestProperties }
     *     
     */
    public void setDigestProperties(HostInternetScsiHbaDigestProperties value) {
        this.digestProperties = value;
    }

    /**
     * Gets the value of the supportedAdvancedOptions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedAdvancedOptions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedAdvancedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionDef }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedAdvancedOptions property.
     */
    public List<OptionDef> getSupportedAdvancedOptions() {
        if (supportedAdvancedOptions == null) {
            supportedAdvancedOptions = new ArrayList<>();
        }
        return this.supportedAdvancedOptions;
    }

    /**
     * Gets the value of the advancedOptions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancedOptions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdvancedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostInternetScsiHbaParamValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the advancedOptions property.
     */
    public List<HostInternetScsiHbaParamValue> getAdvancedOptions() {
        if (advancedOptions == null) {
            advancedOptions = new ArrayList<>();
        }
        return this.advancedOptions;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
    }

}
