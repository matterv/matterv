
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpdateVirtualMachineFilesResultFailedVmFileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfUpdateVirtualMachineFilesResultFailedVmFileInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UpdateVirtualMachineFilesResultFailedVmFileInfo" type="{urn:internalvim25}UpdateVirtualMachineFilesResultFailedVmFileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpdateVirtualMachineFilesResultFailedVmFileInfo", propOrder = {
    "updateVirtualMachineFilesResultFailedVmFileInfo"
})
public class ArrayOfUpdateVirtualMachineFilesResultFailedVmFileInfo {

    @XmlElement(name = "UpdateVirtualMachineFilesResultFailedVmFileInfo")
    protected List<UpdateVirtualMachineFilesResultFailedVmFileInfo> updateVirtualMachineFilesResultFailedVmFileInfo;

    /**
     * Gets the value of the updateVirtualMachineFilesResultFailedVmFileInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateVirtualMachineFilesResultFailedVmFileInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUpdateVirtualMachineFilesResultFailedVmFileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateVirtualMachineFilesResultFailedVmFileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the updateVirtualMachineFilesResultFailedVmFileInfo property.
     */
    public List<UpdateVirtualMachineFilesResultFailedVmFileInfo> getUpdateVirtualMachineFilesResultFailedVmFileInfo() {
        if (updateVirtualMachineFilesResultFailedVmFileInfo == null) {
            updateVirtualMachineFilesResultFailedVmFileInfo = new ArrayList<>();
        }
        return this.updateVirtualMachineFilesResultFailedVmFileInfo;
    }

}
