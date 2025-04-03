
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineCpuIdInfoSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineCpuIdInfoSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineCpuIdInfoSpec" type="{urn:internalvim25}VirtualMachineCpuIdInfoSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineCpuIdInfoSpec", propOrder = {
    "virtualMachineCpuIdInfoSpec"
})
public class ArrayOfVirtualMachineCpuIdInfoSpec {

    @XmlElement(name = "VirtualMachineCpuIdInfoSpec")
    protected List<VirtualMachineCpuIdInfoSpec> virtualMachineCpuIdInfoSpec;

    /**
     * Gets the value of the virtualMachineCpuIdInfoSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineCpuIdInfoSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineCpuIdInfoSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineCpuIdInfoSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineCpuIdInfoSpec property.
     */
    public List<VirtualMachineCpuIdInfoSpec> getVirtualMachineCpuIdInfoSpec() {
        if (virtualMachineCpuIdInfoSpec == null) {
            virtualMachineCpuIdInfoSpec = new ArrayList<>();
        }
        return this.virtualMachineCpuIdInfoSpec;
    }

}
