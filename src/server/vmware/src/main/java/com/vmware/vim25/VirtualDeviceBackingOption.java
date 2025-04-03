
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceBackingOption", propOrder = {
    "type"
})
@XmlSeeAlso({
    VirtualEthernetCardOpaqueNetworkBackingOption.class,
    VirtualEthernetCardDVPortBackingOption.class,
    VirtualPCIPassthroughPluginBackingOption.class,
    VirtualPCIPassthroughDvxBackingOption.class,
    VirtualPrecisionClockSystemClockBackingOption.class,
    VirtualDeviceFileBackingOption.class,
    VirtualDevicePipeBackingOption.class,
    VirtualDeviceURIBackingOption.class,
    VirtualSerialPortThinPrintBackingOption.class,
    VirtualSriovEthernetCardSriovBackingOption.class,
    VirtualDeviceDeviceBackingOption.class,
    VirtualDeviceRemoteDeviceBackingOption.class
})
public class VirtualDeviceBackingOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
