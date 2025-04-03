
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineIdeDiskDeviceInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineIdeDiskDeviceInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineDiskDeviceInfo">
 *       <sequence>
 *         <element name="partitionTable" type="{urn:internalvim25}VirtualMachineIdeDiskDevicePartitionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineIdeDiskDeviceInfo", propOrder = {
    "partitionTable"
})
public class VirtualMachineIdeDiskDeviceInfo
    extends VirtualMachineDiskDeviceInfo
{

    protected List<VirtualMachineIdeDiskDevicePartitionInfo> partitionTable;

    /**
     * Gets the value of the partitionTable property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partitionTable property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPartitionTable().add(newItem);
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
     *     The value of the partitionTable property.
     */
    public List<VirtualMachineIdeDiskDevicePartitionInfo> getPartitionTable() {
        if (partitionTable == null) {
            partitionTable = new ArrayList<>();
        }
        return this.partitionTable;
    }

}
