
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaDeviceConnectionInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRdmaDeviceConnectionInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mtu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="speedInMbps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDeviceConnectionInfo", propOrder = {
    "state",
    "mtu",
    "speedInMbps"
})
public class HostRdmaDeviceConnectionInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String state;
    protected int mtu;
    protected int speedInMbps;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     */
    public int getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     */
    public void setMtu(int value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the speedInMbps property.
     * 
     */
    public int getSpeedInMbps() {
        return speedInMbps;
    }

    /**
     * Sets the value of the speedInMbps property.
     * 
     */
    public void setSpeedInMbps(int value) {
        this.speedInMbps = value;
    }

}
