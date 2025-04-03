
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineVMotionStunTimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineVMotionStunTimeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineVMotionStunTimeInfo" type="{urn:internalvim25}VirtualMachineVMotionStunTimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineVMotionStunTimeInfo", propOrder = {
    "virtualMachineVMotionStunTimeInfo"
})
public class ArrayOfVirtualMachineVMotionStunTimeInfo {

    @XmlElement(name = "VirtualMachineVMotionStunTimeInfo")
    protected List<VirtualMachineVMotionStunTimeInfo> virtualMachineVMotionStunTimeInfo;

    /**
     * Gets the value of the virtualMachineVMotionStunTimeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineVMotionStunTimeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineVMotionStunTimeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVMotionStunTimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineVMotionStunTimeInfo property.
     */
    public List<VirtualMachineVMotionStunTimeInfo> getVirtualMachineVMotionStunTimeInfo() {
        if (virtualMachineVMotionStunTimeInfo == null) {
            virtualMachineVMotionStunTimeInfo = new ArrayList<>();
        }
        return this.virtualMachineVMotionStunTimeInfo;
    }

}
