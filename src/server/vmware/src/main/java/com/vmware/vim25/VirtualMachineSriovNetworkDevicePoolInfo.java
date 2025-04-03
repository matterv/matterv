
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSriovNetworkDevicePoolInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineSriovNetworkDevicePoolInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineSriovDevicePoolInfo">
 *       <sequence>
 *         <element name="switchKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="switchUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSriovNetworkDevicePoolInfo", propOrder = {
    "switchKey",
    "switchUuid"
})
public class VirtualMachineSriovNetworkDevicePoolInfo
    extends VirtualMachineSriovDevicePoolInfo
{

    protected String switchKey;
    protected String switchUuid;

    /**
     * Gets the value of the switchKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchKey() {
        return switchKey;
    }

    /**
     * Sets the value of the switchKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchKey(String value) {
        this.switchKey = value;
    }

    /**
     * Gets the value of the switchUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchUuid() {
        return switchUuid;
    }

    /**
     * Sets the value of the switchUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchUuid(String value) {
        this.switchUuid = value;
    }

}
