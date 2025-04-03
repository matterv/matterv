
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmwareUplinkPortTeamingPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmwareUplinkPortTeamingPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InheritablePolicy">
 *       <sequence>
 *         <element name="policy" type="{urn:internalvim25}StringPolicy" minOccurs="0"/>
 *         <element name="reversePolicy" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="notifySwitches" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="rollingOrder" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="failureCriteria" type="{urn:internalvim25}DVSFailureCriteria" minOccurs="0"/>
 *         <element name="uplinkPortOrder" type="{urn:internalvim25}VMwareUplinkPortOrderPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmwareUplinkPortTeamingPolicy", propOrder = {
    "policy",
    "reversePolicy",
    "notifySwitches",
    "rollingOrder",
    "failureCriteria",
    "uplinkPortOrder"
})
public class VmwareUplinkPortTeamingPolicy
    extends InheritablePolicy
{

    protected StringPolicy policy;
    protected BoolPolicy reversePolicy;
    protected BoolPolicy notifySwitches;
    protected BoolPolicy rollingOrder;
    protected DVSFailureCriteria failureCriteria;
    protected VMwareUplinkPortOrderPolicy uplinkPortOrder;

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link StringPolicy }
     *     
     */
    public StringPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPolicy }
     *     
     */
    public void setPolicy(StringPolicy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the reversePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getReversePolicy() {
        return reversePolicy;
    }

    /**
     * Sets the value of the reversePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setReversePolicy(BoolPolicy value) {
        this.reversePolicy = value;
    }

    /**
     * Gets the value of the notifySwitches property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getNotifySwitches() {
        return notifySwitches;
    }

    /**
     * Sets the value of the notifySwitches property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setNotifySwitches(BoolPolicy value) {
        this.notifySwitches = value;
    }

    /**
     * Gets the value of the rollingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getRollingOrder() {
        return rollingOrder;
    }

    /**
     * Sets the value of the rollingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setRollingOrder(BoolPolicy value) {
        this.rollingOrder = value;
    }

    /**
     * Gets the value of the failureCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DVSFailureCriteria }
     *     
     */
    public DVSFailureCriteria getFailureCriteria() {
        return failureCriteria;
    }

    /**
     * Sets the value of the failureCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSFailureCriteria }
     *     
     */
    public void setFailureCriteria(DVSFailureCriteria value) {
        this.failureCriteria = value;
    }

    /**
     * Gets the value of the uplinkPortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareUplinkPortOrderPolicy }
     *     
     */
    public VMwareUplinkPortOrderPolicy getUplinkPortOrder() {
        return uplinkPortOrder;
    }

    /**
     * Sets the value of the uplinkPortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareUplinkPortOrderPolicy }
     *     
     */
    public void setUplinkPortOrder(VMwareUplinkPortOrderPolicy value) {
        this.uplinkPortOrder = value;
    }

}
