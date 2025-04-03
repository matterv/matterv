
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InheritablePolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InheritablePolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InheritablePolicy", propOrder = {
    "inherited"
})
@XmlSeeAlso({
    BoolPolicy.class,
    IntPolicy.class,
    LongPolicy.class,
    StringPolicy.class,
    DVSTrafficShapingPolicy.class,
    DVSVendorSpecificConfig.class,
    DvsFilterConfig.class,
    DvsFilterPolicy.class,
    VMwareUplinkPortOrderPolicy.class,
    DVSFailureCriteria.class,
    VmwareUplinkPortTeamingPolicy.class,
    VmwareDistributedVirtualSwitchVlanSpec.class,
    DVSSecurityPolicy.class,
    DVSMacLearningPolicy.class,
    DVSMacManagementPolicy.class,
    VMwareUplinkLacpPolicy.class
})
public class InheritablePolicy
    extends DynamicData
{

    protected boolean inherited;

    /**
     * Gets the value of the inherited property.
     * 
     */
    public boolean isInherited() {
        return inherited;
    }

    /**
     * Sets the value of the inherited property.
     * 
     */
    public void setInherited(boolean value) {
        this.inherited = value;
    }

}
