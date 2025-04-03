
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineFileLayoutExDiskLayout complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineFileLayoutExDiskLayout">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineFileLayoutExDiskLayout" type="{urn:internalvim25}VirtualMachineFileLayoutExDiskLayout" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutExDiskLayout", propOrder = {
    "virtualMachineFileLayoutExDiskLayout"
})
public class ArrayOfVirtualMachineFileLayoutExDiskLayout {

    @XmlElement(name = "VirtualMachineFileLayoutExDiskLayout")
    protected List<VirtualMachineFileLayoutExDiskLayout> virtualMachineFileLayoutExDiskLayout;

    /**
     * Gets the value of the virtualMachineFileLayoutExDiskLayout property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineFileLayoutExDiskLayout property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineFileLayoutExDiskLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFileLayoutExDiskLayout }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineFileLayoutExDiskLayout property.
     */
    public List<VirtualMachineFileLayoutExDiskLayout> getVirtualMachineFileLayoutExDiskLayout() {
        if (virtualMachineFileLayoutExDiskLayout == null) {
            virtualMachineFileLayoutExDiskLayout = new ArrayList<>();
        }
        return this.virtualMachineFileLayoutExDiskLayout;
    }

}
