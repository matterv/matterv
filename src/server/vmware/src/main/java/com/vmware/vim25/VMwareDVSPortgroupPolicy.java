
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSPortgroupPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSPortgroupPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVPortgroupPolicy">
 *       <sequence>
 *         <element name="vlanOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="uplinkTeamingOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="securityPolicyOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ipfixOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="macManagementOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSPortgroupPolicy", propOrder = {
    "vlanOverrideAllowed",
    "uplinkTeamingOverrideAllowed",
    "securityPolicyOverrideAllowed",
    "ipfixOverrideAllowed",
    "macManagementOverrideAllowed"
})
public class VMwareDVSPortgroupPolicy
    extends DVPortgroupPolicy
{

    protected boolean vlanOverrideAllowed;
    protected boolean uplinkTeamingOverrideAllowed;
    protected boolean securityPolicyOverrideAllowed;
    protected Boolean ipfixOverrideAllowed;
    protected Boolean macManagementOverrideAllowed;

    /**
     * Gets the value of the vlanOverrideAllowed property.
     * 
     */
    public boolean isVlanOverrideAllowed() {
        return vlanOverrideAllowed;
    }

    /**
     * Sets the value of the vlanOverrideAllowed property.
     * 
     */
    public void setVlanOverrideAllowed(boolean value) {
        this.vlanOverrideAllowed = value;
    }

    /**
     * Gets the value of the uplinkTeamingOverrideAllowed property.
     * 
     */
    public boolean isUplinkTeamingOverrideAllowed() {
        return uplinkTeamingOverrideAllowed;
    }

    /**
     * Sets the value of the uplinkTeamingOverrideAllowed property.
     * 
     */
    public void setUplinkTeamingOverrideAllowed(boolean value) {
        this.uplinkTeamingOverrideAllowed = value;
    }

    /**
     * Gets the value of the securityPolicyOverrideAllowed property.
     * 
     */
    public boolean isSecurityPolicyOverrideAllowed() {
        return securityPolicyOverrideAllowed;
    }

    /**
     * Sets the value of the securityPolicyOverrideAllowed property.
     * 
     */
    public void setSecurityPolicyOverrideAllowed(boolean value) {
        this.securityPolicyOverrideAllowed = value;
    }

    /**
     * Gets the value of the ipfixOverrideAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpfixOverrideAllowed() {
        return ipfixOverrideAllowed;
    }

    /**
     * Sets the value of the ipfixOverrideAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpfixOverrideAllowed(Boolean value) {
        this.ipfixOverrideAllowed = value;
    }

    /**
     * Gets the value of the macManagementOverrideAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMacManagementOverrideAllowed() {
        return macManagementOverrideAllowed;
    }

    /**
     * Sets the value of the macManagementOverrideAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMacManagementOverrideAllowed(Boolean value) {
        this.macManagementOverrideAllowed = value;
    }

}
