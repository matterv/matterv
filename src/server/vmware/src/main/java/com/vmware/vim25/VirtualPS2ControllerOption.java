
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPS2ControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPS2ControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualControllerOption">
 *       <sequence>
 *         <element name="numKeyboards" type="{urn:internalvim25}IntOption"/>
 *         <element name="numPointingDevices" type="{urn:internalvim25}IntOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPS2ControllerOption", propOrder = {
    "numKeyboards",
    "numPointingDevices"
})
public class VirtualPS2ControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected IntOption numKeyboards;
    @XmlElement(required = true)
    protected IntOption numPointingDevices;

    /**
     * Gets the value of the numKeyboards property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumKeyboards() {
        return numKeyboards;
    }

    /**
     * Sets the value of the numKeyboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumKeyboards(IntOption value) {
        this.numKeyboards = value;
    }

    /**
     * Gets the value of the numPointingDevices property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumPointingDevices() {
        return numPointingDevices;
    }

    /**
     * Sets the value of the numPointingDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumPointingDevices(IntOption value) {
        this.numPointingDevices = value;
    }

}
