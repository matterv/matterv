
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachinePciPassthroughInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachinePciPassthroughInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachinePciPassthroughInfo" type="{urn:internalvim25}VirtualMachinePciPassthroughInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachinePciPassthroughInfo", propOrder = {
    "virtualMachinePciPassthroughInfo"
})
public class ArrayOfVirtualMachinePciPassthroughInfo {

    @XmlElement(name = "VirtualMachinePciPassthroughInfo")
    protected List<VirtualMachinePciPassthroughInfo> virtualMachinePciPassthroughInfo;

    /**
     * Gets the value of the virtualMachinePciPassthroughInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachinePciPassthroughInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachinePciPassthroughInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachinePciPassthroughInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachinePciPassthroughInfo property.
     */
    public List<VirtualMachinePciPassthroughInfo> getVirtualMachinePciPassthroughInfo() {
        if (virtualMachinePciPassthroughInfo == null) {
            virtualMachinePciPassthroughInfo = new ArrayList<>();
        }
        return this.virtualMachinePciPassthroughInfo;
    }

}
