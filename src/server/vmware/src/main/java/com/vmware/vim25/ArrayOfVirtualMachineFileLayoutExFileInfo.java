
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineFileLayoutExFileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineFileLayoutExFileInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineFileLayoutExFileInfo" type="{urn:internalvim25}VirtualMachineFileLayoutExFileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutExFileInfo", propOrder = {
    "virtualMachineFileLayoutExFileInfo"
})
public class ArrayOfVirtualMachineFileLayoutExFileInfo {

    @XmlElement(name = "VirtualMachineFileLayoutExFileInfo")
    protected List<VirtualMachineFileLayoutExFileInfo> virtualMachineFileLayoutExFileInfo;

    /**
     * Gets the value of the virtualMachineFileLayoutExFileInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineFileLayoutExFileInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineFileLayoutExFileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFileLayoutExFileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineFileLayoutExFileInfo property.
     */
    public List<VirtualMachineFileLayoutExFileInfo> getVirtualMachineFileLayoutExFileInfo() {
        if (virtualMachineFileLayoutExFileInfo == null) {
            virtualMachineFileLayoutExFileInfo = new ArrayList<>();
        }
        return this.virtualMachineFileLayoutExFileInfo;
    }

}
