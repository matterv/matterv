
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDpmConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDpmConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="defaultDpmBehavior" type="{urn:internalvim25}DpmBehavior" minOccurs="0"/>
 *         <element name="hostPowerActionRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ClusterDpmConfigInfo", propOrder = {
    "enabled",
    "defaultDpmBehavior",
    "hostPowerActionRate",
    "option"
})
public class ClusterDpmConfigInfo
    extends DynamicData
{

    protected Boolean enabled;
    @XmlSchemaType(name = "string")
    protected DpmBehavior defaultDpmBehavior;
    protected Integer hostPowerActionRate;
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
     * Gets the value of the defaultDpmBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link DpmBehavior }
     *     
     */
    public DpmBehavior getDefaultDpmBehavior() {
        return defaultDpmBehavior;
    }

    /**
     * Sets the value of the defaultDpmBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link DpmBehavior }
     *     
     */
    public void setDefaultDpmBehavior(DpmBehavior value) {
        this.defaultDpmBehavior = value;
    }

    /**
     * Gets the value of the hostPowerActionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostPowerActionRate() {
        return hostPowerActionRate;
    }

    /**
     * Sets the value of the hostPowerActionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostPowerActionRate(Integer value) {
        this.hostPowerActionRate = value;
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
