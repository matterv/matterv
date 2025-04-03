
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineDatastoreVolumeOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineDatastoreVolumeOption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineDatastoreVolumeOption" type="{urn:internalvim25}VirtualMachineDatastoreVolumeOption" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineDatastoreVolumeOption", propOrder = {
    "virtualMachineDatastoreVolumeOption"
})
public class ArrayOfVirtualMachineDatastoreVolumeOption {

    @XmlElement(name = "VirtualMachineDatastoreVolumeOption")
    protected List<VirtualMachineDatastoreVolumeOption> virtualMachineDatastoreVolumeOption;

    /**
     * Gets the value of the virtualMachineDatastoreVolumeOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineDatastoreVolumeOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineDatastoreVolumeOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineDatastoreVolumeOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineDatastoreVolumeOption property.
     */
    public List<VirtualMachineDatastoreVolumeOption> getVirtualMachineDatastoreVolumeOption() {
        if (virtualMachineDatastoreVolumeOption == null) {
            virtualMachineDatastoreVolumeOption = new ArrayList<>();
        }
        return this.virtualMachineDatastoreVolumeOption;
    }

}
