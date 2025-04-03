
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AlarmSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="systemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="expression" type="{urn:internalvim25}AlarmExpression"/>
 *         <element name="action" type="{urn:internalvim25}AlarmAction" minOccurs="0"/>
 *         <element name="actionFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="setting" type="{urn:internalvim25}AlarmSetting" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmSpec", propOrder = {
    "name",
    "systemName",
    "description",
    "enabled",
    "expression",
    "action",
    "actionFrequency",
    "setting"
})
@XmlSeeAlso({
    AlarmInfo.class
})
public class AlarmSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String name;
    protected String systemName;
    @XmlElement(required = true)
    protected String description;
    protected boolean enabled;
    @XmlElement(required = true)
    protected AlarmExpression expression;
    protected AlarmAction action;
    protected Integer actionFrequency;
    protected AlarmSetting setting;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmExpression }
     *     
     */
    public AlarmExpression getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmExpression }
     *     
     */
    public void setExpression(AlarmExpression value) {
        this.expression = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmAction }
     *     
     */
    public AlarmAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmAction }
     *     
     */
    public void setAction(AlarmAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActionFrequency() {
        return actionFrequency;
    }

    /**
     * Sets the value of the actionFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActionFrequency(Integer value) {
        this.actionFrequency = value;
    }

    /**
     * Gets the value of the setting property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmSetting }
     *     
     */
    public AlarmSetting getSetting() {
        return setting;
    }

    /**
     * Sets the value of the setting property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmSetting }
     *     
     */
    public void setSetting(AlarmSetting value) {
        this.setting = value;
    }

}
