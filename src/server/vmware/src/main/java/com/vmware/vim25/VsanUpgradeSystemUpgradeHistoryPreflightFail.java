
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanUpgradeSystemUpgradeHistoryPreflightFail complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanUpgradeSystemUpgradeHistoryPreflightFail">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VsanUpgradeSystemUpgradeHistoryItem">
 *       <sequence>
 *         <element name="preflightResult" type="{urn:internalvim25}VsanUpgradeSystemPreflightCheckResult"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemUpgradeHistoryPreflightFail", propOrder = {
    "preflightResult"
})
public class VsanUpgradeSystemUpgradeHistoryPreflightFail
    extends VsanUpgradeSystemUpgradeHistoryItem
{

    @XmlElement(required = true)
    protected VsanUpgradeSystemPreflightCheckResult preflightResult;

    /**
     * Gets the value of the preflightResult property.
     * 
     * @return
     *     possible object is
     *     {@link VsanUpgradeSystemPreflightCheckResult }
     *     
     */
    public VsanUpgradeSystemPreflightCheckResult getPreflightResult() {
        return preflightResult;
    }

    /**
     * Sets the value of the preflightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanUpgradeSystemPreflightCheckResult }
     *     
     */
    public void setPreflightResult(VsanUpgradeSystemPreflightCheckResult value) {
        this.preflightResult = value;
    }

}
