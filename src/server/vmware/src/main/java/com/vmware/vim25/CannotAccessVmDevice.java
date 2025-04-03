
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CannotAccessVmDevice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CannotAccessVmDevice">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CannotAccessVmComponent">
 *       <sequence>
 *         <element name="device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="backing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="connected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotAccessVmDevice", propOrder = {
    "device",
    "backing",
    "connected"
})
@XmlSeeAlso({
    CannotAccessVmDisk.class,
    CannotAccessNetwork.class
})
public class CannotAccessVmDevice
    extends CannotAccessVmComponent
{

    @XmlElement(required = true)
    protected String device;
    @XmlElement(required = true)
    protected String backing;
    protected boolean connected;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBacking(String value) {
        this.backing = value;
    }

    /**
     * Gets the value of the connected property.
     * 
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     * 
     */
    public void setConnected(boolean value) {
        this.connected = value;
    }

}
