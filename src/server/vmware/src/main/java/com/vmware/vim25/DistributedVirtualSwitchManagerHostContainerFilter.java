
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchManagerHostContainerFilter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchManagerHostContainerFilter">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DistributedVirtualSwitchManagerHostDvsFilterSpec">
 *       <sequence>
 *         <element name="hostContainer" type="{urn:internalvim25}DistributedVirtualSwitchManagerHostContainer"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerHostContainerFilter", propOrder = {
    "hostContainer"
})
public class DistributedVirtualSwitchManagerHostContainerFilter
    extends DistributedVirtualSwitchManagerHostDvsFilterSpec
{

    @XmlElement(required = true)
    protected DistributedVirtualSwitchManagerHostContainer hostContainer;

    /**
     * Gets the value of the hostContainer property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchManagerHostContainer }
     *     
     */
    public DistributedVirtualSwitchManagerHostContainer getHostContainer() {
        return hostContainer;
    }

    /**
     * Sets the value of the hostContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchManagerHostContainer }
     *     
     */
    public void setHostContainer(DistributedVirtualSwitchManagerHostContainer value) {
        this.hostContainer = value;
    }

}
