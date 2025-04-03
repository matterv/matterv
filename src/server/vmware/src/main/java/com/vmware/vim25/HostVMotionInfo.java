
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVMotionInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVMotionInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="netConfig" type="{urn:internalvim25}HostVMotionNetConfig" minOccurs="0"/>
 *         <element name="ipConfig" type="{urn:internalvim25}HostIpConfig" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionInfo", propOrder = {
    "netConfig",
    "ipConfig"
})
public class HostVMotionInfo
    extends DynamicData
{

    protected HostVMotionNetConfig netConfig;
    protected HostIpConfig ipConfig;

    /**
     * Gets the value of the netConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostVMotionNetConfig }
     *     
     */
    public HostVMotionNetConfig getNetConfig() {
        return netConfig;
    }

    /**
     * Sets the value of the netConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVMotionNetConfig }
     *     
     */
    public void setNetConfig(HostVMotionNetConfig value) {
        this.netConfig = value;
    }

    /**
     * Gets the value of the ipConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpConfig }
     *     
     */
    public HostIpConfig getIpConfig() {
        return ipConfig;
    }

    /**
     * Sets the value of the ipConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpConfig }
     *     
     */
    public void setIpConfig(HostIpConfig value) {
        this.ipConfig = value;
    }

}
