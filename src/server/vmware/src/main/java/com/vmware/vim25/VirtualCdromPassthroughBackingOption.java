
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualCdromPassthroughBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualCdromPassthroughBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceDeviceBackingOption">
 *       <sequence>
 *         <element name="exclusive" type="{urn:internalvim25}BoolOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCdromPassthroughBackingOption", propOrder = {
    "exclusive"
})
public class VirtualCdromPassthroughBackingOption
    extends VirtualDeviceDeviceBackingOption
{

    @XmlElement(required = true)
    protected BoolOption exclusive;

    /**
     * Gets the value of the exclusive property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getExclusive() {
        return exclusive;
    }

    /**
     * Sets the value of the exclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setExclusive(BoolOption value) {
        this.exclusive = value;
    }

}
