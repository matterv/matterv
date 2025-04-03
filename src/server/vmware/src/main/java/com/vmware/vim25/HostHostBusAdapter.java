
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostHostBusAdapter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostHostBusAdapter">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="bus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="driver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="storageProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHostBusAdapter", propOrder = {
    "key",
    "device",
    "bus",
    "status",
    "model",
    "driver",
    "pci",
    "storageProtocol"
})
@XmlSeeAlso({
    HostParallelScsiHba.class,
    HostSerialAttachedHba.class,
    HostBlockHba.class,
    HostInternetScsiHba.class,
    HostFibreChannelHba.class,
    HostPcieHba.class,
    HostRdmaHba.class,
    HostTcpHba.class
})
public class HostHostBusAdapter
    extends DynamicData
{

    protected String key;
    @XmlElement(required = true)
    protected String device;
    protected int bus;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String model;
    protected String driver;
    protected String pci;
    protected String storageProtocol;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

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
     * Gets the value of the bus property.
     * 
     */
    public int getBus() {
        return bus;
    }

    /**
     * Sets the value of the bus property.
     * 
     */
    public void setBus(int value) {
        this.bus = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * Gets the value of the pci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPci() {
        return pci;
    }

    /**
     * Sets the value of the pci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPci(String value) {
        this.pci = value;
    }

    /**
     * Gets the value of the storageProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageProtocol() {
        return storageProtocol;
    }

    /**
     * Sets the value of the storageProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageProtocol(String value) {
        this.storageProtocol = value;
    }

}
