
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchHostMemberRuntimeState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchHostMemberRuntimeState">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="currentMaxProxySwitchPorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberRuntimeState", propOrder = {
    "currentMaxProxySwitchPorts"
})
public class DistributedVirtualSwitchHostMemberRuntimeState
    extends DynamicData
{

    protected int currentMaxProxySwitchPorts;

    /**
     * Gets the value of the currentMaxProxySwitchPorts property.
     * 
     */
    public int getCurrentMaxProxySwitchPorts() {
        return currentMaxProxySwitchPorts;
    }

    /**
     * Sets the value of the currentMaxProxySwitchPorts property.
     * 
     */
    public void setCurrentMaxProxySwitchPorts(int value) {
        this.currentMaxProxySwitchPorts = value;
    }

}
