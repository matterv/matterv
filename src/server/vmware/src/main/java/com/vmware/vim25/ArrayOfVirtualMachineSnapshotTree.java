
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineSnapshotTree complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineSnapshotTree">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineSnapshotTree" type="{urn:internalvim25}VirtualMachineSnapshotTree" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineSnapshotTree", propOrder = {
    "virtualMachineSnapshotTree"
})
public class ArrayOfVirtualMachineSnapshotTree {

    @XmlElement(name = "VirtualMachineSnapshotTree")
    protected List<VirtualMachineSnapshotTree> virtualMachineSnapshotTree;

    /**
     * Gets the value of the virtualMachineSnapshotTree property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineSnapshotTree property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineSnapshotTree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineSnapshotTree }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineSnapshotTree property.
     */
    public List<VirtualMachineSnapshotTree> getVirtualMachineSnapshotTree() {
        if (virtualMachineSnapshotTree == null) {
            virtualMachineSnapshotTree = new ArrayList<>();
        }
        return this.virtualMachineSnapshotTree;
    }

}
