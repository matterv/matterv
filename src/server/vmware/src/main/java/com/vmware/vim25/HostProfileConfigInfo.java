
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostProfileConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ProfileConfigInfo">
 *       <sequence>
 *         <element name="applyProfile" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="defaultComplyProfile" type="{urn:internalvim25}ComplianceProfile" minOccurs="0"/>
 *         <element name="defaultComplyLocator" type="{urn:internalvim25}ComplianceLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="customComplyProfile" type="{urn:internalvim25}ComplianceProfile" minOccurs="0"/>
 *         <element name="disabledExpressionList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="description" type="{urn:internalvim25}ProfileDescription" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileConfigInfo", propOrder = {
    "applyProfile",
    "defaultComplyProfile",
    "defaultComplyLocator",
    "customComplyProfile",
    "disabledExpressionList",
    "description"
})
public class HostProfileConfigInfo
    extends ProfileConfigInfo
{

    protected HostApplyProfile applyProfile;
    protected ComplianceProfile defaultComplyProfile;
    protected List<ComplianceLocator> defaultComplyLocator;
    protected ComplianceProfile customComplyProfile;
    protected List<String> disabledExpressionList;
    protected ProfileDescription description;

    /**
     * Gets the value of the applyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getApplyProfile() {
        return applyProfile;
    }

    /**
     * Sets the value of the applyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setApplyProfile(HostApplyProfile value) {
        this.applyProfile = value;
    }

    /**
     * Gets the value of the defaultComplyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceProfile }
     *     
     */
    public ComplianceProfile getDefaultComplyProfile() {
        return defaultComplyProfile;
    }

    /**
     * Sets the value of the defaultComplyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceProfile }
     *     
     */
    public void setDefaultComplyProfile(ComplianceProfile value) {
        this.defaultComplyProfile = value;
    }

    /**
     * Gets the value of the defaultComplyLocator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultComplyLocator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDefaultComplyLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplianceLocator }
     * </p>
     * 
     * 
     * @return
     *     The value of the defaultComplyLocator property.
     */
    public List<ComplianceLocator> getDefaultComplyLocator() {
        if (defaultComplyLocator == null) {
            defaultComplyLocator = new ArrayList<>();
        }
        return this.defaultComplyLocator;
    }

    /**
     * Gets the value of the customComplyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceProfile }
     *     
     */
    public ComplianceProfile getCustomComplyProfile() {
        return customComplyProfile;
    }

    /**
     * Sets the value of the customComplyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceProfile }
     *     
     */
    public void setCustomComplyProfile(ComplianceProfile value) {
        this.customComplyProfile = value;
    }

    /**
     * Gets the value of the disabledExpressionList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabledExpressionList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisabledExpressionList().add(newItem);
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
     *     The value of the disabledExpressionList property.
     */
    public List<String> getDisabledExpressionList() {
        if (disabledExpressionList == null) {
            disabledExpressionList = new ArrayList<>();
        }
        return this.disabledExpressionList;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDescription }
     *     
     */
    public ProfileDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDescription }
     *     
     */
    public void setDescription(ProfileDescription value) {
        this.description = value;
    }

}
