
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileCompleteConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostProfileCompleteConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostProfileConfigSpec">
 *       <sequence>
 *         <element name="applyProfile" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="customComplyProfile" type="{urn:internalvim25}ComplianceProfile" minOccurs="0"/>
 *         <element name="disabledExpressionListChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="disabledExpressionList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="validatorHost" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="validating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hostConfig" type="{urn:internalvim25}HostProfileConfigInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileCompleteConfigSpec", propOrder = {
    "applyProfile",
    "customComplyProfile",
    "disabledExpressionListChanged",
    "disabledExpressionList",
    "validatorHost",
    "validating",
    "hostConfig"
})
public class HostProfileCompleteConfigSpec
    extends HostProfileConfigSpec
{

    protected HostApplyProfile applyProfile;
    protected ComplianceProfile customComplyProfile;
    protected boolean disabledExpressionListChanged;
    protected List<String> disabledExpressionList;
    protected ManagedObjectReference validatorHost;
    protected Boolean validating;
    protected HostProfileConfigInfo hostConfig;

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
     * Gets the value of the disabledExpressionListChanged property.
     * 
     */
    public boolean isDisabledExpressionListChanged() {
        return disabledExpressionListChanged;
    }

    /**
     * Sets the value of the disabledExpressionListChanged property.
     * 
     */
    public void setDisabledExpressionListChanged(boolean value) {
        this.disabledExpressionListChanged = value;
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
     * Gets the value of the validatorHost property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getValidatorHost() {
        return validatorHost;
    }

    /**
     * Sets the value of the validatorHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setValidatorHost(ManagedObjectReference value) {
        this.validatorHost = value;
    }

    /**
     * Gets the value of the validating property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidating() {
        return validating;
    }

    /**
     * Sets the value of the validating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidating(Boolean value) {
        this.validating = value;
    }

    /**
     * Gets the value of the hostConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostProfileConfigInfo }
     *     
     */
    public HostProfileConfigInfo getHostConfig() {
        return hostConfig;
    }

    /**
     * Sets the value of the hostConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostProfileConfigInfo }
     *     
     */
    public void setHostConfig(HostProfileConfigInfo value) {
        this.hostConfig = value;
    }

}
