
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotSupportedHostInDvs complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NotSupportedHostInDvs">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NotSupportedHost">
 *       <sequence>
 *         <element name="switchProductSpec" type="{urn:internalvim25}DistributedVirtualSwitchProductSpec"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupportedHostInDvs", propOrder = {
    "switchProductSpec"
})
public class NotSupportedHostInDvs
    extends NotSupportedHost
{

    @XmlElement(required = true)
    protected DistributedVirtualSwitchProductSpec switchProductSpec;

    /**
     * Gets the value of the switchProductSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public DistributedVirtualSwitchProductSpec getSwitchProductSpec() {
        return switchProductSpec;
    }

    /**
     * Sets the value of the switchProductSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public void setSwitchProductSpec(DistributedVirtualSwitchProductSpec value) {
        this.switchProductSpec = value;
    }

}
