
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualDeviceOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualDeviceOption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualDeviceOption" type="{urn:internalvim25}VirtualDeviceOption" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDeviceOption", propOrder = {
    "virtualDeviceOption"
})
public class ArrayOfVirtualDeviceOption {

    @XmlElement(name = "VirtualDeviceOption")
    protected List<VirtualDeviceOption> virtualDeviceOption;

    /**
     * Gets the value of the virtualDeviceOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualDeviceOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualDeviceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualDeviceOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualDeviceOption property.
     */
    public List<VirtualDeviceOption> getVirtualDeviceOption() {
        if (virtualDeviceOption == null) {
            virtualDeviceOption = new ArrayList<>();
        }
        return this.virtualDeviceOption;
    }

}
