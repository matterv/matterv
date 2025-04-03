
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchManagerHostDvsFilterSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchManagerHostDvsFilterSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerHostDvsFilterSpec", propOrder = {
    "inclusive"
})
@XmlSeeAlso({
    DistributedVirtualSwitchManagerHostArrayFilter.class,
    DistributedVirtualSwitchManagerHostContainerFilter.class,
    DistributedVirtualSwitchManagerHostDvsMembershipFilter.class
})
public class DistributedVirtualSwitchManagerHostDvsFilterSpec
    extends DynamicData
{

    protected boolean inclusive;

    /**
     * Gets the value of the inclusive property.
     * 
     */
    public boolean isInclusive() {
        return inclusive;
    }

    /**
     * Sets the value of the inclusive property.
     * 
     */
    public void setInclusive(boolean value) {
        this.inclusive = value;
    }

}
