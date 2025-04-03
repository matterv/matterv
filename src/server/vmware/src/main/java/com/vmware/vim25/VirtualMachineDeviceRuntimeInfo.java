
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineDeviceRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineDeviceRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="runtimeState" type="{urn:internalvim25}VirtualMachineDeviceRuntimeInfoDeviceRuntimeState"/>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDeviceRuntimeInfo", propOrder = {
    "runtimeState",
    "key"
})
public class VirtualMachineDeviceRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected VirtualMachineDeviceRuntimeInfoDeviceRuntimeState runtimeState;
    protected int key;

    /**
     * Gets the value of the runtimeState property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineDeviceRuntimeInfoDeviceRuntimeState }
     *     
     */
    public VirtualMachineDeviceRuntimeInfoDeviceRuntimeState getRuntimeState() {
        return runtimeState;
    }

    /**
     * Sets the value of the runtimeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineDeviceRuntimeInfoDeviceRuntimeState }
     *     
     */
    public void setRuntimeState(VirtualMachineDeviceRuntimeInfoDeviceRuntimeState value) {
        this.runtimeState = value;
    }

    /**
     * Gets the value of the key property.
     * 
     */
    public int getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(int value) {
        this.key = value;
    }

}
