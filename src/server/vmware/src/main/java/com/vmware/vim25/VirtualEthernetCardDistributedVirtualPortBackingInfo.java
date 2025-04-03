
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualEthernetCardDistributedVirtualPortBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualEthernetCardDistributedVirtualPortBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingInfo">
 *       <sequence>
 *         <element name="port" type="{urn:internalvim25}DistributedVirtualSwitchPortConnection"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCardDistributedVirtualPortBackingInfo", propOrder = {
    "port"
})
public class VirtualEthernetCardDistributedVirtualPortBackingInfo
    extends VirtualDeviceBackingInfo
{

    @XmlElement(required = true)
    protected DistributedVirtualSwitchPortConnection port;

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchPortConnection }
     *     
     */
    public DistributedVirtualSwitchPortConnection getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchPortConnection }
     *     
     */
    public void setPort(DistributedVirtualSwitchPortConnection value) {
        this.port = value;
    }

}
