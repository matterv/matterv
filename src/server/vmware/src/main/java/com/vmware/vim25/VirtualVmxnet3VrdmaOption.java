
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVmxnet3VrdmaOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualVmxnet3VrdmaOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualVmxnet3Option">
 *       <sequence>
 *         <element name="deviceProtocol" type="{urn:internalvim25}ChoiceOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet3VrdmaOption", propOrder = {
    "deviceProtocol"
})
public class VirtualVmxnet3VrdmaOption
    extends VirtualVmxnet3Option
{

    protected ChoiceOption deviceProtocol;

    /**
     * Gets the value of the deviceProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getDeviceProtocol() {
        return deviceProtocol;
    }

    /**
     * Sets the value of the deviceProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setDeviceProtocol(ChoiceOption value) {
        this.deviceProtocol = value;
    }

}
