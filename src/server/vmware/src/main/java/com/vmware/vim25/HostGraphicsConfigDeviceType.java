
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostGraphicsConfigDeviceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostGraphicsConfigDeviceType">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="graphicsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vgpuMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGraphicsConfigDeviceType", propOrder = {
    "deviceId",
    "graphicsType",
    "vgpuMode"
})
public class HostGraphicsConfigDeviceType
    extends DynamicData
{

    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected String graphicsType;
    protected String vgpuMode;

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the graphicsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsType() {
        return graphicsType;
    }

    /**
     * Sets the value of the graphicsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsType(String value) {
        this.graphicsType = value;
    }

    /**
     * Gets the value of the vgpuMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgpuMode() {
        return vgpuMode;
    }

    /**
     * Sets the value of the vgpuMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgpuMode(String value) {
        this.vgpuMode = value;
    }

}
