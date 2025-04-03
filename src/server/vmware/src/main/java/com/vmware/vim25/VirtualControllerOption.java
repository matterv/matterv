
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
 *       <sequence>
 *         <element name="devices" type="{urn:internalvim25}IntOption"/>
 *         <element name="supportedDevice" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualControllerOption", propOrder = {
    "devices",
    "supportedDevice"
})
@XmlSeeAlso({
    VirtualIDEControllerOption.class,
    VirtualNVDIMMControllerOption.class,
    VirtualNVMEControllerOption.class,
    VirtualPCIControllerOption.class,
    VirtualPS2ControllerOption.class,
    VirtualSATAControllerOption.class,
    VirtualSCSIControllerOption.class,
    VirtualSIOControllerOption.class,
    VirtualUSBControllerOption.class,
    VirtualUSBXHCIControllerOption.class
})
public class VirtualControllerOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected IntOption devices;
    protected List<String> supportedDevice;

    /**
     * Gets the value of the devices property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getDevices() {
        return devices;
    }

    /**
     * Sets the value of the devices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setDevices(IntOption value) {
        this.devices = value;
    }

    /**
     * Gets the value of the supportedDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedDevice property.
     */
    public List<String> getSupportedDevice() {
        if (supportedDevice == null) {
            supportedDevice = new ArrayList<>();
        }
        return this.supportedDevice;
    }

}
