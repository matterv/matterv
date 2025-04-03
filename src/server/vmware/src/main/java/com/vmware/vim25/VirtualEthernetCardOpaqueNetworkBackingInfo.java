
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualEthernetCardOpaqueNetworkBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualEthernetCardOpaqueNetworkBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingInfo">
 *       <sequence>
 *         <element name="opaqueNetworkId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="opaqueNetworkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCardOpaqueNetworkBackingInfo", propOrder = {
    "opaqueNetworkId",
    "opaqueNetworkType"
})
public class VirtualEthernetCardOpaqueNetworkBackingInfo
    extends VirtualDeviceBackingInfo
{

    @XmlElement(required = true)
    protected String opaqueNetworkId;
    @XmlElement(required = true)
    protected String opaqueNetworkType;

    /**
     * Gets the value of the opaqueNetworkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpaqueNetworkId() {
        return opaqueNetworkId;
    }

    /**
     * Sets the value of the opaqueNetworkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpaqueNetworkId(String value) {
        this.opaqueNetworkId = value;
    }

    /**
     * Gets the value of the opaqueNetworkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpaqueNetworkType() {
        return opaqueNetworkType;
    }

    /**
     * Sets the value of the opaqueNetworkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpaqueNetworkType(String value) {
        this.opaqueNetworkType = value;
    }

}
