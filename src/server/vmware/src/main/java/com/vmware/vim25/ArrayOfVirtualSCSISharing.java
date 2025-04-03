
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualSCSISharing complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualSCSISharing">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualSCSISharing" type="{urn:internalvim25}VirtualSCSISharing" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualSCSISharing", propOrder = {
    "virtualSCSISharing"
})
public class ArrayOfVirtualSCSISharing {

    @XmlElement(name = "VirtualSCSISharing")
    @XmlSchemaType(name = "string")
    protected List<VirtualSCSISharing> virtualSCSISharing;

    /**
     * Gets the value of the virtualSCSISharing property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualSCSISharing property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualSCSISharing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualSCSISharing }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualSCSISharing property.
     */
    public List<VirtualSCSISharing> getVirtualSCSISharing() {
        if (virtualSCSISharing == null) {
            virtualSCSISharing = new ArrayList<>();
        }
        return this.virtualSCSISharing;
    }

}
