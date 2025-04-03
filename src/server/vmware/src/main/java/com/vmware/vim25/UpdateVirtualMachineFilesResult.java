
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateVirtualMachineFilesResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateVirtualMachineFilesResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="failedVmFile" type="{urn:internalvim25}UpdateVirtualMachineFilesResultFailedVmFileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVirtualMachineFilesResult", propOrder = {
    "failedVmFile"
})
public class UpdateVirtualMachineFilesResult
    extends DynamicData
{

    protected List<UpdateVirtualMachineFilesResultFailedVmFileInfo> failedVmFile;

    /**
     * Gets the value of the failedVmFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failedVmFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFailedVmFile().add(newItem);
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
     *     The value of the failedVmFile property.
     */
    public List<UpdateVirtualMachineFilesResultFailedVmFileInfo> getFailedVmFile() {
        if (failedVmFile == null) {
            failedVmFile = new ArrayList<>();
        }
        return this.failedVmFile;
    }

}
