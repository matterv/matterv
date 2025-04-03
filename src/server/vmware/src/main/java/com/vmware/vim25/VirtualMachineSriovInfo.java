
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSriovInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineSriovInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachinePciPassthroughInfo">
 *       <sequence>
 *         <element name="virtualFunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="pnic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="devicePool" type="{urn:internalvim25}VirtualMachineSriovDevicePoolInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSriovInfo", propOrder = {
    "virtualFunction",
    "pnic",
    "devicePool"
})
public class VirtualMachineSriovInfo
    extends VirtualMachinePciPassthroughInfo
{

    protected boolean virtualFunction;
    protected String pnic;
    protected VirtualMachineSriovDevicePoolInfo devicePool;

    /**
     * Gets the value of the virtualFunction property.
     * 
     */
    public boolean isVirtualFunction() {
        return virtualFunction;
    }

    /**
     * Sets the value of the virtualFunction property.
     * 
     */
    public void setVirtualFunction(boolean value) {
        this.virtualFunction = value;
    }

    /**
     * Gets the value of the pnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnic() {
        return pnic;
    }

    /**
     * Sets the value of the pnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnic(String value) {
        this.pnic = value;
    }

    /**
     * Gets the value of the devicePool property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineSriovDevicePoolInfo }
     *     
     */
    public VirtualMachineSriovDevicePoolInfo getDevicePool() {
        return devicePool;
    }

    /**
     * Sets the value of the devicePool property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineSriovDevicePoolInfo }
     *     
     */
    public void setDevicePool(VirtualMachineSriovDevicePoolInfo value) {
        this.devicePool = value;
    }

}
