
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceURIBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceURIBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingOption">
 *       <sequence>
 *         <element name="directions" type="{urn:internalvim25}ChoiceOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceURIBackingOption", propOrder = {
    "directions"
})
@XmlSeeAlso({
    VirtualSerialPortURIBackingOption.class
})
public class VirtualDeviceURIBackingOption
    extends VirtualDeviceBackingOption
{

    @XmlElement(required = true)
    protected ChoiceOption directions;

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setDirections(ChoiceOption value) {
        this.directions = value;
    }

}
