
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostIpConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostIpConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="upstreamIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="downstreamIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostIpConfig", propOrder = {
    "upstreamIpAddress",
    "downstreamIpAddress"
})
public class VsanHostIpConfig
    extends DynamicData
{

    @XmlElement(required = true)
    protected String upstreamIpAddress;
    @XmlElement(required = true)
    protected String downstreamIpAddress;

    /**
     * Gets the value of the upstreamIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpstreamIpAddress() {
        return upstreamIpAddress;
    }

    /**
     * Sets the value of the upstreamIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpstreamIpAddress(String value) {
        this.upstreamIpAddress = value;
    }

    /**
     * Gets the value of the downstreamIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownstreamIpAddress() {
        return downstreamIpAddress;
    }

    /**
     * Sets the value of the downstreamIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownstreamIpAddress(String value) {
        this.downstreamIpAddress = value;
    }

}
