
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualMachineConfigInfoDatastoreUrlPair complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualMachineConfigInfoDatastoreUrlPair">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualMachineConfigInfoDatastoreUrlPair" type="{urn:internalvim25}VirtualMachineConfigInfoDatastoreUrlPair" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineConfigInfoDatastoreUrlPair", propOrder = {
    "virtualMachineConfigInfoDatastoreUrlPair"
})
public class ArrayOfVirtualMachineConfigInfoDatastoreUrlPair {

    @XmlElement(name = "VirtualMachineConfigInfoDatastoreUrlPair")
    protected List<VirtualMachineConfigInfoDatastoreUrlPair> virtualMachineConfigInfoDatastoreUrlPair;

    /**
     * Gets the value of the virtualMachineConfigInfoDatastoreUrlPair property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineConfigInfoDatastoreUrlPair property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineConfigInfoDatastoreUrlPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineConfigInfoDatastoreUrlPair }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineConfigInfoDatastoreUrlPair property.
     */
    public List<VirtualMachineConfigInfoDatastoreUrlPair> getVirtualMachineConfigInfoDatastoreUrlPair() {
        if (virtualMachineConfigInfoDatastoreUrlPair == null) {
            virtualMachineConfigInfoDatastoreUrlPair = new ArrayList<>();
        }
        return this.virtualMachineConfigInfoDatastoreUrlPair;
    }

}
