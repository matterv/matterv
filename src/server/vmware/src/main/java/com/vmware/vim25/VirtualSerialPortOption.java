
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSerialPortOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSerialPortOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
 *       <sequence>
 *         <element name="yieldOnPoll" type="{urn:internalvim25}BoolOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSerialPortOption", propOrder = {
    "yieldOnPoll"
})
public class VirtualSerialPortOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected BoolOption yieldOnPoll;

    /**
     * Gets the value of the yieldOnPoll property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getYieldOnPoll() {
        return yieldOnPoll;
    }

    /**
     * Sets the value of the yieldOnPoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setYieldOnPoll(BoolOption value) {
        this.yieldOnPoll = value;
    }

}
