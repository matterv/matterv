
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostPatchManagerStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostPatchManagerStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostPatchManagerStatus" type="{urn:internalvim25}HostPatchManagerStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPatchManagerStatus", propOrder = {
    "hostPatchManagerStatus"
})
public class ArrayOfHostPatchManagerStatus {

    @XmlElement(name = "HostPatchManagerStatus")
    protected List<HostPatchManagerStatus> hostPatchManagerStatus;

    /**
     * Gets the value of the hostPatchManagerStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostPatchManagerStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostPatchManagerStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPatchManagerStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostPatchManagerStatus property.
     */
    public List<HostPatchManagerStatus> getHostPatchManagerStatus() {
        if (hostPatchManagerStatus == null) {
            hostPatchManagerStatus = new ArrayList<>();
        }
        return this.hostPatchManagerStatus;
    }

}
