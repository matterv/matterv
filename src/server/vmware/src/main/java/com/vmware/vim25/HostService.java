
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostService">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="uninstallable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="running" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ruleset" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="policy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sourcePackage" type="{urn:internalvim25}HostServiceSourcePackage" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostService", propOrder = {
    "key",
    "label",
    "required",
    "uninstallable",
    "running",
    "ruleset",
    "policy",
    "sourcePackage"
})
public class HostService
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String label;
    protected boolean required;
    protected boolean uninstallable;
    protected boolean running;
    protected List<String> ruleset;
    @XmlElement(required = true)
    protected String policy;
    protected HostServiceSourcePackage sourcePackage;

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
     * Gets the value of the uninstallable property.
     * 
     */
    public boolean isUninstallable() {
        return uninstallable;
    }

    /**
     * Sets the value of the uninstallable property.
     * 
     */
    public void setUninstallable(boolean value) {
        this.uninstallable = value;
    }

    /**
     * Gets the value of the running property.
     * 
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Sets the value of the running property.
     * 
     */
    public void setRunning(boolean value) {
        this.running = value;
    }

    /**
     * Gets the value of the ruleset property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleset property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRuleset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the ruleset property.
     */
    public List<String> getRuleset() {
        if (ruleset == null) {
            ruleset = new ArrayList<>();
        }
        return this.ruleset;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicy(String value) {
        this.policy = value;
    }

    /**
     * Gets the value of the sourcePackage property.
     * 
     * @return
     *     possible object is
     *     {@link HostServiceSourcePackage }
     *     
     */
    public HostServiceSourcePackage getSourcePackage() {
        return sourcePackage;
    }

    /**
     * Sets the value of the sourcePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostServiceSourcePackage }
     *     
     */
    public void setSourcePackage(HostServiceSourcePackage value) {
        this.sourcePackage = value;
    }

}
