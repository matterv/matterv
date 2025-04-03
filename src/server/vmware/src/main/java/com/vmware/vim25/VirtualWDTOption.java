
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualWDTOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualWDTOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
 *       <sequence>
 *         <element name="runOnBoot" type="{urn:internalvim25}BoolOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualWDTOption", propOrder = {
    "runOnBoot"
})
public class VirtualWDTOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected BoolOption runOnBoot;

    /**
     * Gets the value of the runOnBoot property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getRunOnBoot() {
        return runOnBoot;
    }

    /**
     * Sets the value of the runOnBoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setRunOnBoot(BoolOption value) {
        this.runOnBoot = value;
    }

}
