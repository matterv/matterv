
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVMCIDeviceFilterInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVMCIDeviceFilterInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="filters" type="{urn:internalvim25}VirtualMachineVMCIDeviceFilterSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMCIDeviceFilterInfo", propOrder = {
    "filters"
})
public class VirtualMachineVMCIDeviceFilterInfo
    extends DynamicData
{

    protected List<VirtualMachineVMCIDeviceFilterSpec> filters;

    /**
     * Gets the value of the filters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVMCIDeviceFilterSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the filters property.
     */
    public List<VirtualMachineVMCIDeviceFilterSpec> getFilters() {
        if (filters == null) {
            filters = new ArrayList<>();
        }
        return this.filters;
    }

}
