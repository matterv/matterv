
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerSystemInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PowerSystemInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="currentPolicy" type="{urn:internalvim25}HostPowerPolicy"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSystemInfo", propOrder = {
    "currentPolicy"
})
public class PowerSystemInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostPowerPolicy currentPolicy;

    /**
     * Gets the value of the currentPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link HostPowerPolicy }
     *     
     */
    public HostPowerPolicy getCurrentPolicy() {
        return currentPolicy;
    }

    /**
     * Sets the value of the currentPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPowerPolicy }
     *     
     */
    public void setCurrentPolicy(HostPowerPolicy value) {
        this.currentPolicy = value;
    }

}
