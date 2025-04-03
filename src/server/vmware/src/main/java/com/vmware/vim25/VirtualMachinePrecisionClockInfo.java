
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachinePrecisionClockInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachinePrecisionClockInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="systemClockProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePrecisionClockInfo", propOrder = {
    "systemClockProtocol"
})
public class VirtualMachinePrecisionClockInfo
    extends VirtualMachineTargetInfo
{

    protected String systemClockProtocol;

    /**
     * Gets the value of the systemClockProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemClockProtocol() {
        return systemClockProtocol;
    }

    /**
     * Sets the value of the systemClockProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemClockProtocol(String value) {
        this.systemClockProtocol = value;
    }

}
