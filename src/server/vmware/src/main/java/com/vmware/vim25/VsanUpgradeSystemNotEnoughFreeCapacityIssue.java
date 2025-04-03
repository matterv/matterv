
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanUpgradeSystemNotEnoughFreeCapacityIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanUpgradeSystemNotEnoughFreeCapacityIssue">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VsanUpgradeSystemPreflightCheckIssue">
 *       <sequence>
 *         <element name="reducedRedundancyUpgradePossible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemNotEnoughFreeCapacityIssue", propOrder = {
    "reducedRedundancyUpgradePossible"
})
public class VsanUpgradeSystemNotEnoughFreeCapacityIssue
    extends VsanUpgradeSystemPreflightCheckIssue
{

    protected boolean reducedRedundancyUpgradePossible;

    /**
     * Gets the value of the reducedRedundancyUpgradePossible property.
     * 
     */
    public boolean isReducedRedundancyUpgradePossible() {
        return reducedRedundancyUpgradePossible;
    }

    /**
     * Sets the value of the reducedRedundancyUpgradePossible property.
     * 
     */
    public void setReducedRedundancyUpgradePossible(boolean value) {
        this.reducedRedundancyUpgradePossible = value;
    }

}
