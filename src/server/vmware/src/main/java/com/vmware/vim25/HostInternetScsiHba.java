
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHba complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHba">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostHostBusAdapter">
 *       <sequence>
 *         <element name="isSoftwareBased" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canBeDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="networkBindingSupport" type="{urn:internalvim25}HostInternetScsiHbaNetworkBindingSupportType" minOccurs="0"/>
 *         <element name="discoveryCapabilities" type="{urn:internalvim25}HostInternetScsiHbaDiscoveryCapabilities"/>
 *         <element name="discoveryProperties" type="{urn:internalvim25}HostInternetScsiHbaDiscoveryProperties"/>
 *         <element name="authenticationCapabilities" type="{urn:internalvim25}HostInternetScsiHbaAuthenticationCapabilities"/>
 *         <element name="authenticationProperties" type="{urn:internalvim25}HostInternetScsiHbaAuthenticationProperties"/>
 *         <element name="digestCapabilities" type="{urn:internalvim25}HostInternetScsiHbaDigestCapabilities" minOccurs="0"/>
 *         <element name="digestProperties" type="{urn:internalvim25}HostInternetScsiHbaDigestProperties" minOccurs="0"/>
 *         <element name="ipCapabilities" type="{urn:internalvim25}HostInternetScsiHbaIPCapabilities"/>
 *         <element name="ipProperties" type="{urn:internalvim25}HostInternetScsiHbaIPProperties"/>
 *         <element name="supportedAdvancedOptions" type="{urn:internalvim25}OptionDef" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="advancedOptions" type="{urn:internalvim25}HostInternetScsiHbaParamValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="iScsiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="iScsiAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="configuredSendTarget" type="{urn:internalvim25}HostInternetScsiHbaSendTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="configuredStaticTarget" type="{urn:internalvim25}HostInternetScsiHbaStaticTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxSpeedMb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="currentSpeedMb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHba", propOrder = {
    "isSoftwareBased",
    "canBeDisabled",
    "networkBindingSupport",
    "discoveryCapabilities",
    "discoveryProperties",
    "authenticationCapabilities",
    "authenticationProperties",
    "digestCapabilities",
    "digestProperties",
    "ipCapabilities",
    "ipProperties",
    "supportedAdvancedOptions",
    "advancedOptions",
    "iScsiName",
    "iScsiAlias",
    "configuredSendTarget",
    "configuredStaticTarget",
    "maxSpeedMb",
    "currentSpeedMb"
})
public class HostInternetScsiHba
    extends HostHostBusAdapter
{

    protected boolean isSoftwareBased;
    protected Boolean canBeDisabled;
    @XmlSchemaType(name = "string")
    protected HostInternetScsiHbaNetworkBindingSupportType networkBindingSupport;
    @XmlElement(required = true)
    protected HostInternetScsiHbaDiscoveryCapabilities discoveryCapabilities;
    @XmlElement(required = true)
    protected HostInternetScsiHbaDiscoveryProperties discoveryProperties;
    @XmlElement(required = true)
    protected HostInternetScsiHbaAuthenticationCapabilities authenticationCapabilities;
    @XmlElement(required = true)
    protected HostInternetScsiHbaAuthenticationProperties authenticationProperties;
    protected HostInternetScsiHbaDigestCapabilities digestCapabilities;
    protected HostInternetScsiHbaDigestProperties digestProperties;
    @XmlElement(required = true)
    protected HostInternetScsiHbaIPCapabilities ipCapabilities;
    @XmlElement(required = true)
    protected HostInternetScsiHbaIPProperties ipProperties;
    protected List<OptionDef> supportedAdvancedOptions;
    protected List<HostInternetScsiHbaParamValue> advancedOptions;
    @XmlElement(required = true)
    protected String iScsiName;
    protected String iScsiAlias;
    protected List<HostInternetScsiHbaSendTarget> configuredSendTarget;
    protected List<HostInternetScsiHbaStaticTarget> configuredStaticTarget;
    protected Integer maxSpeedMb;
    protected Integer currentSpeedMb;

    /**
     * Gets the value of the isSoftwareBased property.
     * 
     */
    public boolean isIsSoftwareBased() {
        return isSoftwareBased;
    }

    /**
     * Sets the value of the isSoftwareBased property.
     * 
     */
    public void setIsSoftwareBased(boolean value) {
        this.isSoftwareBased = value;
    }

    /**
     * Gets the value of the canBeDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeDisabled() {
        return canBeDisabled;
    }

    /**
     * Sets the value of the canBeDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeDisabled(Boolean value) {
        this.canBeDisabled = value;
    }

    /**
     * Gets the value of the networkBindingSupport property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaNetworkBindingSupportType }
     *     
     */
    public HostInternetScsiHbaNetworkBindingSupportType getNetworkBindingSupport() {
        return networkBindingSupport;
    }

    /**
     * Sets the value of the networkBindingSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaNetworkBindingSupportType }
     *     
     */
    public void setNetworkBindingSupport(HostInternetScsiHbaNetworkBindingSupportType value) {
        this.networkBindingSupport = value;
    }

    /**
     * Gets the value of the discoveryCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaDiscoveryCapabilities }
     *     
     */
    public HostInternetScsiHbaDiscoveryCapabilities getDiscoveryCapabilities() {
        return discoveryCapabilities;
    }

    /**
     * Sets the value of the discoveryCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaDiscoveryCapabilities }
     *     
     */
    public void setDiscoveryCapabilities(HostInternetScsiHbaDiscoveryCapabilities value) {
        this.discoveryCapabilities = value;
    }

    /**
     * Gets the value of the discoveryProperties property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaDiscoveryProperties }
     *     
     */
    public HostInternetScsiHbaDiscoveryProperties getDiscoveryProperties() {
        return discoveryProperties;
    }

    /**
     * Sets the value of the discoveryProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaDiscoveryProperties }
     *     
     */
    public void setDiscoveryProperties(HostInternetScsiHbaDiscoveryProperties value) {
        this.discoveryProperties = value;
    }

    /**
     * Gets the value of the authenticationCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaAuthenticationCapabilities }
     *     
     */
    public HostInternetScsiHbaAuthenticationCapabilities getAuthenticationCapabilities() {
        return authenticationCapabilities;
    }

    /**
     * Sets the value of the authenticationCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaAuthenticationCapabilities }
     *     
     */
    public void setAuthenticationCapabilities(HostInternetScsiHbaAuthenticationCapabilities value) {
        this.authenticationCapabilities = value;
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
     * Gets the value of the digestCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaDigestCapabilities }
     *     
     */
    public HostInternetScsiHbaDigestCapabilities getDigestCapabilities() {
        return digestCapabilities;
    }

    /**
     * Sets the value of the digestCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaDigestCapabilities }
     *     
     */
    public void setDigestCapabilities(HostInternetScsiHbaDigestCapabilities value) {
        this.digestCapabilities = value;
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
     * Gets the value of the ipCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaIPCapabilities }
     *     
     */
    public HostInternetScsiHbaIPCapabilities getIpCapabilities() {
        return ipCapabilities;
    }

    /**
     * Sets the value of the ipCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaIPCapabilities }
     *     
     */
    public void setIpCapabilities(HostInternetScsiHbaIPCapabilities value) {
        this.ipCapabilities = value;
    }

    /**
     * Gets the value of the ipProperties property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaIPProperties }
     *     
     */
    public HostInternetScsiHbaIPProperties getIpProperties() {
        return ipProperties;
    }

    /**
     * Sets the value of the ipProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaIPProperties }
     *     
     */
    public void setIpProperties(HostInternetScsiHbaIPProperties value) {
        this.ipProperties = value;
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
     * Gets the value of the iScsiAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIScsiAlias() {
        return iScsiAlias;
    }

    /**
     * Sets the value of the iScsiAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIScsiAlias(String value) {
        this.iScsiAlias = value;
    }

    /**
     * Gets the value of the configuredSendTarget property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredSendTarget property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfiguredSendTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostInternetScsiHbaSendTarget }
     * </p>
     * 
     * 
     * @return
     *     The value of the configuredSendTarget property.
     */
    public List<HostInternetScsiHbaSendTarget> getConfiguredSendTarget() {
        if (configuredSendTarget == null) {
            configuredSendTarget = new ArrayList<>();
        }
        return this.configuredSendTarget;
    }

    /**
     * Gets the value of the configuredStaticTarget property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredStaticTarget property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfiguredStaticTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostInternetScsiHbaStaticTarget }
     * </p>
     * 
     * 
     * @return
     *     The value of the configuredStaticTarget property.
     */
    public List<HostInternetScsiHbaStaticTarget> getConfiguredStaticTarget() {
        if (configuredStaticTarget == null) {
            configuredStaticTarget = new ArrayList<>();
        }
        return this.configuredStaticTarget;
    }

    /**
     * Gets the value of the maxSpeedMb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSpeedMb() {
        return maxSpeedMb;
    }

    /**
     * Sets the value of the maxSpeedMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSpeedMb(Integer value) {
        this.maxSpeedMb = value;
    }

    /**
     * Gets the value of the currentSpeedMb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentSpeedMb() {
        return currentSpeedMb;
    }

    /**
     * Sets the value of the currentSpeedMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentSpeedMb(Integer value) {
        this.currentSpeedMb = value;
    }

}
