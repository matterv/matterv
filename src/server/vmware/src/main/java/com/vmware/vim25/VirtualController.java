
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualController complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualController">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDevice">
 *       <sequence>
 *         <element name="busNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="device" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualController", propOrder = {
    "busNumber",
    "device"
})
@XmlSeeAlso({
    VirtualIDEController.class,
    VirtualNVDIMMController.class,
    VirtualNVMEController.class,
    VirtualPCIController.class,
    VirtualPS2Controller.class,
    VirtualSATAController.class,
    VirtualSCSIController.class,
    VirtualSIOController.class,
    VirtualUSBController.class,
    VirtualUSBXHCIController.class
})
public class VirtualController
    extends VirtualDevice
{

    protected int busNumber;
    @XmlElement(type = Integer.class)
    protected List<Integer> device;

    /**
     * Gets the value of the busNumber property.
     * 
     */
    public int getBusNumber() {
        return busNumber;
    }

    /**
     * Sets the value of the busNumber property.
     * 
     */
    public void setBusNumber(int value) {
        this.busNumber = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the device property.
     */
    public List<Integer> getDevice() {
        if (device == null) {
            device = new ArrayList<>();
        }
        return this.device;
    }

}
