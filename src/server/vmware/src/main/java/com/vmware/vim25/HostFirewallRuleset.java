
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFirewallRuleset complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFirewallRuleset">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="rule" type="{urn:internalvim25}HostFirewallRule" maxOccurs="unbounded"/>
 *         <element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="allowedHosts" type="{urn:internalvim25}HostFirewallRulesetIpList" minOccurs="0"/>
 *         <element name="userControllable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipListUserConfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallRuleset", propOrder = {
    "key",
    "label",
    "required",
    "rule",
    "service",
    "enabled",
    "allowedHosts",
    "userControllable",
    "ipListUserConfigurable"
})
public class HostFirewallRuleset
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String label;
    protected boolean required;
    @XmlElement(required = true)
    protected List<HostFirewallRule> rule;
    protected String service;
    protected boolean enabled;
    protected HostFirewallRulesetIpList allowedHosts;
    protected Boolean userControllable;
    protected Boolean ipListUserConfigurable;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFirewallRule }
     * </p>
     * 
     * 
     * @return
     *     The value of the rule property.
     */
    public List<HostFirewallRule> getRule() {
        if (rule == null) {
            rule = new ArrayList<>();
        }
        return this.rule;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the allowedHosts property.
     * 
     * @return
     *     possible object is
     *     {@link HostFirewallRulesetIpList }
     *     
     */
    public HostFirewallRulesetIpList getAllowedHosts() {
        return allowedHosts;
    }

    /**
     * Sets the value of the allowedHosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFirewallRulesetIpList }
     *     
     */
    public void setAllowedHosts(HostFirewallRulesetIpList value) {
        this.allowedHosts = value;
    }

    /**
     * Gets the value of the userControllable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserControllable() {
        return userControllable;
    }

    /**
     * Sets the value of the userControllable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserControllable(Boolean value) {
        this.userControllable = value;
    }

    /**
     * Gets the value of the ipListUserConfigurable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpListUserConfigurable() {
        return ipListUserConfigurable;
    }

    /**
     * Sets the value of the ipListUserConfigurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpListUserConfigurable(Boolean value) {
        this.ipListUserConfigurable = value;
    }

}
