
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPrecisionClockSystemClockBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPrecisionClockSystemClockBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingOption">
 *       <sequence>
 *         <element name="protocol" type="{urn:internalvim25}ChoiceOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPrecisionClockSystemClockBackingOption", propOrder = {
    "protocol"
})
public class VirtualPrecisionClockSystemClockBackingOption
    extends VirtualDeviceBackingOption
{

    @XmlElement(required = true)
    protected ChoiceOption protocol;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setProtocol(ChoiceOption value) {
        this.protocol = value;
    }

}
