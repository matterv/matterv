
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualPCIPassthroughAllowedDevice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualPCIPassthroughAllowedDevice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualPCIPassthroughAllowedDevice" type="{urn:internalvim25}VirtualPCIPassthroughAllowedDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualPCIPassthroughAllowedDevice", propOrder = {
    "virtualPCIPassthroughAllowedDevice"
})
public class ArrayOfVirtualPCIPassthroughAllowedDevice {

    @XmlElement(name = "VirtualPCIPassthroughAllowedDevice")
    protected List<VirtualPCIPassthroughAllowedDevice> virtualPCIPassthroughAllowedDevice;

    /**
     * Gets the value of the virtualPCIPassthroughAllowedDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualPCIPassthroughAllowedDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualPCIPassthroughAllowedDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualPCIPassthroughAllowedDevice }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualPCIPassthroughAllowedDevice property.
     */
    public List<VirtualPCIPassthroughAllowedDevice> getVirtualPCIPassthroughAllowedDevice() {
        if (virtualPCIPassthroughAllowedDevice == null) {
            virtualPCIPassthroughAllowedDevice = new ArrayList<>();
        }
        return this.virtualPCIPassthroughAllowedDevice;
    }

}
