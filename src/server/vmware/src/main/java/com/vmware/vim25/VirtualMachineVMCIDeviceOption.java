
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVMCIDeviceOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVMCIDeviceOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
 *       <sequence>
 *         <element name="allowUnrestrictedCommunication" type="{urn:internalvim25}BoolOption"/>
 *         <element name="filterSpecOption" type="{urn:internalvim25}VirtualMachineVMCIDeviceOptionFilterSpecOption" minOccurs="0"/>
 *         <element name="filterSupported" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMCIDeviceOption", propOrder = {
    "allowUnrestrictedCommunication",
    "filterSpecOption",
    "filterSupported"
})
public class VirtualMachineVMCIDeviceOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected BoolOption allowUnrestrictedCommunication;
    protected VirtualMachineVMCIDeviceOptionFilterSpecOption filterSpecOption;
    protected BoolOption filterSupported;

    /**
     * Gets the value of the allowUnrestrictedCommunication property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getAllowUnrestrictedCommunication() {
        return allowUnrestrictedCommunication;
    }

    /**
     * Sets the value of the allowUnrestrictedCommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setAllowUnrestrictedCommunication(BoolOption value) {
        this.allowUnrestrictedCommunication = value;
    }

    /**
     * Gets the value of the filterSpecOption property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineVMCIDeviceOptionFilterSpecOption }
     *     
     */
    public VirtualMachineVMCIDeviceOptionFilterSpecOption getFilterSpecOption() {
        return filterSpecOption;
    }

    /**
     * Sets the value of the filterSpecOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineVMCIDeviceOptionFilterSpecOption }
     *     
     */
    public void setFilterSpecOption(VirtualMachineVMCIDeviceOptionFilterSpecOption value) {
        this.filterSpecOption = value;
    }

    /**
     * Gets the value of the filterSupported property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getFilterSupported() {
        return filterSupported;
    }

    /**
     * Sets the value of the filterSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setFilterSupported(BoolOption value) {
        this.filterSupported = value;
    }

}
