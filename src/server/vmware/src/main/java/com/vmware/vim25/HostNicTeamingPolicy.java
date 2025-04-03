
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNicTeamingPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNicTeamingPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="policy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reversePolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="notifySwitches" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rollingOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="failureCriteria" type="{urn:internalvim25}HostNicFailureCriteria" minOccurs="0"/>
 *         <element name="nicOrder" type="{urn:internalvim25}HostNicOrderPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNicTeamingPolicy", propOrder = {
    "policy",
    "reversePolicy",
    "notifySwitches",
    "rollingOrder",
    "failureCriteria",
    "nicOrder"
})
public class HostNicTeamingPolicy
    extends DynamicData
{

    protected String policy;
    protected Boolean reversePolicy;
    protected Boolean notifySwitches;
    protected Boolean rollingOrder;
    protected HostNicFailureCriteria failureCriteria;
    protected HostNicOrderPolicy nicOrder;

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
     * Gets the value of the reversePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversePolicy() {
        return reversePolicy;
    }

    /**
     * Sets the value of the reversePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversePolicy(Boolean value) {
        this.reversePolicy = value;
    }

    /**
     * Gets the value of the notifySwitches property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifySwitches() {
        return notifySwitches;
    }

    /**
     * Sets the value of the notifySwitches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifySwitches(Boolean value) {
        this.notifySwitches = value;
    }

    /**
     * Gets the value of the rollingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollingOrder() {
        return rollingOrder;
    }

    /**
     * Sets the value of the rollingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollingOrder(Boolean value) {
        this.rollingOrder = value;
    }

    /**
     * Gets the value of the failureCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link HostNicFailureCriteria }
     *     
     */
    public HostNicFailureCriteria getFailureCriteria() {
        return failureCriteria;
    }

    /**
     * Sets the value of the failureCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNicFailureCriteria }
     *     
     */
    public void setFailureCriteria(HostNicFailureCriteria value) {
        this.failureCriteria = value;
    }

    /**
     * Gets the value of the nicOrder property.
     * 
     * @return
     *     possible object is
     *     {@link HostNicOrderPolicy }
     *     
     */
    public HostNicOrderPolicy getNicOrder() {
        return nicOrder;
    }

    /**
     * Sets the value of the nicOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNicOrderPolicy }
     *     
     */
    public void setNicOrder(HostNicOrderPolicy value) {
        this.nicOrder = value;
    }

}
