
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageDrsPodConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageDrsPodConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ioLoadBalanceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="defaultVmBehavior" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="loadBalanceInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="defaultIntraVmAffinity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="spaceLoadBalanceConfig" type="{urn:internalvim25}StorageDrsSpaceLoadBalanceConfig" minOccurs="0"/>
 *         <element name="ioLoadBalanceConfig" type="{urn:internalvim25}StorageDrsIoLoadBalanceConfig" minOccurs="0"/>
 *         <element name="automationOverrides" type="{urn:internalvim25}StorageDrsAutomationConfig" minOccurs="0"/>
 *         <element name="rule" type="{urn:internalvim25}ClusterRuleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="option" type="{urn:internalvim25}OptionValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsPodConfigInfo", propOrder = {
    "enabled",
    "ioLoadBalanceEnabled",
    "defaultVmBehavior",
    "loadBalanceInterval",
    "defaultIntraVmAffinity",
    "spaceLoadBalanceConfig",
    "ioLoadBalanceConfig",
    "automationOverrides",
    "rule",
    "option"
})
public class StorageDrsPodConfigInfo
    extends DynamicData
{

    protected boolean enabled;
    protected boolean ioLoadBalanceEnabled;
    @XmlElement(required = true)
    protected String defaultVmBehavior;
    protected Integer loadBalanceInterval;
    protected Boolean defaultIntraVmAffinity;
    protected StorageDrsSpaceLoadBalanceConfig spaceLoadBalanceConfig;
    protected StorageDrsIoLoadBalanceConfig ioLoadBalanceConfig;
    protected StorageDrsAutomationConfig automationOverrides;
    protected List<ClusterRuleInfo> rule;
    protected List<OptionValue> option;

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
     * Gets the value of the ioLoadBalanceEnabled property.
     * 
     */
    public boolean isIoLoadBalanceEnabled() {
        return ioLoadBalanceEnabled;
    }

    /**
     * Sets the value of the ioLoadBalanceEnabled property.
     * 
     */
    public void setIoLoadBalanceEnabled(boolean value) {
        this.ioLoadBalanceEnabled = value;
    }

    /**
     * Gets the value of the defaultVmBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultVmBehavior() {
        return defaultVmBehavior;
    }

    /**
     * Sets the value of the defaultVmBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultVmBehavior(String value) {
        this.defaultVmBehavior = value;
    }

    /**
     * Gets the value of the loadBalanceInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoadBalanceInterval() {
        return loadBalanceInterval;
    }

    /**
     * Sets the value of the loadBalanceInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoadBalanceInterval(Integer value) {
        this.loadBalanceInterval = value;
    }

    /**
     * Gets the value of the defaultIntraVmAffinity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIntraVmAffinity() {
        return defaultIntraVmAffinity;
    }

    /**
     * Sets the value of the defaultIntraVmAffinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIntraVmAffinity(Boolean value) {
        this.defaultIntraVmAffinity = value;
    }

    /**
     * Gets the value of the spaceLoadBalanceConfig property.
     * 
     * @return
     *     possible object is
     *     {@link StorageDrsSpaceLoadBalanceConfig }
     *     
     */
    public StorageDrsSpaceLoadBalanceConfig getSpaceLoadBalanceConfig() {
        return spaceLoadBalanceConfig;
    }

    /**
     * Sets the value of the spaceLoadBalanceConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageDrsSpaceLoadBalanceConfig }
     *     
     */
    public void setSpaceLoadBalanceConfig(StorageDrsSpaceLoadBalanceConfig value) {
        this.spaceLoadBalanceConfig = value;
    }

    /**
     * Gets the value of the ioLoadBalanceConfig property.
     * 
     * @return
     *     possible object is
     *     {@link StorageDrsIoLoadBalanceConfig }
     *     
     */
    public StorageDrsIoLoadBalanceConfig getIoLoadBalanceConfig() {
        return ioLoadBalanceConfig;
    }

    /**
     * Sets the value of the ioLoadBalanceConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageDrsIoLoadBalanceConfig }
     *     
     */
    public void setIoLoadBalanceConfig(StorageDrsIoLoadBalanceConfig value) {
        this.ioLoadBalanceConfig = value;
    }

    /**
     * Gets the value of the automationOverrides property.
     * 
     * @return
     *     possible object is
     *     {@link StorageDrsAutomationConfig }
     *     
     */
    public StorageDrsAutomationConfig getAutomationOverrides() {
        return automationOverrides;
    }

    /**
     * Sets the value of the automationOverrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageDrsAutomationConfig }
     *     
     */
    public void setAutomationOverrides(StorageDrsAutomationConfig value) {
        this.automationOverrides = value;
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
     * {@link ClusterRuleInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the rule property.
     */
    public List<ClusterRuleInfo> getRule() {
        if (rule == null) {
            rule = new ArrayList<>();
        }
        return this.rule;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the option property.
     */
    public List<OptionValue> getOption() {
        if (option == null) {
            option = new ArrayList<>();
        }
        return this.option;
    }

}
