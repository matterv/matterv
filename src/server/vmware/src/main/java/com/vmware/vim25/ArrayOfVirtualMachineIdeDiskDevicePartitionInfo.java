
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineIdeDiskDevicePartitionInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineIdeDiskDevicePartitionInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineIdeDiskDevicePartitionInfo" type="{urn:internalvim25}VirtualMachineIdeDiskDevicePartitionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineIdeDiskDevicePartitionInfo", propOrder = {
    "virtualMachineIdeDiskDevicePartitionInfo"
})
public class ArrayOfVirtualMachineIdeDiskDevicePartitionInfo {

    @XmlElement(name = "VirtualMachineIdeDiskDevicePartitionInfo")
    protected List<VirtualMachineIdeDiskDevicePartitionInfo> virtualMachineIdeDiskDevicePartitionInfo;

    /**
     * Gets the value of the virtualMachineIdeDiskDevicePartitionInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineIdeDiskDevicePartitionInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineIdeDiskDevicePartitionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineIdeDiskDevicePartitionInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineIdeDiskDevicePartitionInfo property.
     */
    public List<VirtualMachineIdeDiskDevicePartitionInfo> getVirtualMachineIdeDiskDevicePartitionInfo() {
        if (virtualMachineIdeDiskDevicePartitionInfo == null) {
            virtualMachineIdeDiskDevicePartitionInfo = new ArrayList<>();
        }
        return this.virtualMachineIdeDiskDevicePartitionInfo;
    }

}
