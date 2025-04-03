
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementAffinityRule complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PlacementAffinityRule">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ruleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ruleScope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vms" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="keys" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementAffinityRule", propOrder = {
    "ruleType",
    "ruleScope",
    "vms",
    "keys"
})
public class PlacementAffinityRule
    extends DynamicData
{

    @XmlElement(required = true)
    protected String ruleType;
    @XmlElement(required = true)
    protected String ruleScope;
    protected List<ManagedObjectReference> vms;
    protected List<String> keys;

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleType(String value) {
        this.ruleType = value;
    }

    /**
     * Gets the value of the ruleScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleScope() {
        return ruleScope;
    }

    /**
     * Sets the value of the ruleScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleScope(String value) {
        this.ruleScope = value;
    }

    /**
     * Gets the value of the vms property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vms property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the vms property.
     */
    public List<ManagedObjectReference> getVms() {
        if (vms == null) {
            vms = new ArrayList<>();
        }
        return this.vms;
    }

    /**
     * Gets the value of the keys property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keys property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKeys().add(newItem);
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
     *     The value of the keys property.
     */
    public List<String> getKeys() {
        if (keys == null) {
            keys = new ArrayList<>();
        }
        return this.keys;
    }

}
