
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachinePciPassthroughInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachinePciPassthroughInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="pciDevice" type="{urn:internalvim25}HostPciDevice"/>
 *         <element name="systemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePciPassthroughInfo", propOrder = {
    "pciDevice",
    "systemId"
})
@XmlSeeAlso({
    VirtualMachineSriovInfo.class
})
public class VirtualMachinePciPassthroughInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected HostPciDevice pciDevice;
    @XmlElement(required = true)
    protected String systemId;

    /**
     * Gets the value of the pciDevice property.
     * 
     * @return
     *     possible object is
     *     {@link HostPciDevice }
     *     
     */
    public HostPciDevice getPciDevice() {
        return pciDevice;
    }

    /**
     * Sets the value of the pciDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPciDevice }
     *     
     */
    public void setPciDevice(HostPciDevice value) {
        this.pciDevice = value;
    }

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

}
