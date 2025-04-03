
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineBootOptionsBootableDevice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineBootOptionsBootableDevice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineBootOptionsBootableDevice" type="{urn:internalvim25}VirtualMachineBootOptionsBootableDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineBootOptionsBootableDevice", propOrder = {
    "virtualMachineBootOptionsBootableDevice"
})
public class ArrayOfVirtualMachineBootOptionsBootableDevice {

    @XmlElement(name = "VirtualMachineBootOptionsBootableDevice")
    protected List<VirtualMachineBootOptionsBootableDevice> virtualMachineBootOptionsBootableDevice;

    /**
     * Gets the value of the virtualMachineBootOptionsBootableDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineBootOptionsBootableDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineBootOptionsBootableDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineBootOptionsBootableDevice }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineBootOptionsBootableDevice property.
     */
    public List<VirtualMachineBootOptionsBootableDevice> getVirtualMachineBootOptionsBootableDevice() {
        if (virtualMachineBootOptionsBootableDevice == null) {
            virtualMachineBootOptionsBootableDevice = new ArrayList<>();
        }
        return this.virtualMachineBootOptionsBootableDevice;
    }

}
