
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDrsConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDrsConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="enableVmBehaviorOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="defaultVmBehavior" type="{urn:internalvim25}DrsBehavior" minOccurs="0"/>
 *         <element name="vmotionRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="scaleDescendantsShares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ClusterDrsConfigInfo", propOrder = {
    "enabled",
    "enableVmBehaviorOverrides",
    "defaultVmBehavior",
    "vmotionRate",
    "scaleDescendantsShares",
    "option"
})
public class ClusterDrsConfigInfo
    extends DynamicData
{

    protected Boolean enabled;
    protected Boolean enableVmBehaviorOverrides;
    @XmlSchemaType(name = "string")
    protected DrsBehavior defaultVmBehavior;
    protected Integer vmotionRate;
    protected String scaleDescendantsShares;
    protected List<OptionValue> option;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the enableVmBehaviorOverrides property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableVmBehaviorOverrides() {
        return enableVmBehaviorOverrides;
    }

    /**
     * Sets the value of the enableVmBehaviorOverrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableVmBehaviorOverrides(Boolean value) {
        this.enableVmBehaviorOverrides = value;
    }

    /**
     * Gets the value of the defaultVmBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link DrsBehavior }
     *     
     */
    public DrsBehavior getDefaultVmBehavior() {
        return defaultVmBehavior;
    }

    /**
     * Sets the value of the defaultVmBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrsBehavior }
     *     
     */
    public void setDefaultVmBehavior(DrsBehavior value) {
        this.defaultVmBehavior = value;
    }

    /**
     * Gets the value of the vmotionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVmotionRate() {
        return vmotionRate;
    }

    /**
     * Sets the value of the vmotionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVmotionRate(Integer value) {
        this.vmotionRate = value;
    }

    /**
     * Gets the value of the scaleDescendantsShares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleDescendantsShares() {
        return scaleDescendantsShares;
    }

    /**
     * Sets the value of the scaleDescendantsShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleDescendantsShares(String value) {
        this.scaleDescendantsShares = value;
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
