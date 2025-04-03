
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineVgpuProfileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineVgpuProfileInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineVgpuProfileInfo" type="{urn:internalvim25}VirtualMachineVgpuProfileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineVgpuProfileInfo", propOrder = {
    "virtualMachineVgpuProfileInfo"
})
public class ArrayOfVirtualMachineVgpuProfileInfo {

    @XmlElement(name = "VirtualMachineVgpuProfileInfo")
    protected List<VirtualMachineVgpuProfileInfo> virtualMachineVgpuProfileInfo;

    /**
     * Gets the value of the virtualMachineVgpuProfileInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineVgpuProfileInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineVgpuProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVgpuProfileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineVgpuProfileInfo property.
     */
    public List<VirtualMachineVgpuProfileInfo> getVirtualMachineVgpuProfileInfo() {
        if (virtualMachineVgpuProfileInfo == null) {
            virtualMachineVgpuProfileInfo = new ArrayList<>();
        }
        return this.virtualMachineVgpuProfileInfo;
    }

}
