
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostUnresolvedVmfsResolutionResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostUnresolvedVmfsResolutionResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostUnresolvedVmfsResolutionResult" type="{urn:internalvim25}HostUnresolvedVmfsResolutionResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostUnresolvedVmfsResolutionResult", propOrder = {
    "hostUnresolvedVmfsResolutionResult"
})
public class ArrayOfHostUnresolvedVmfsResolutionResult {

    @XmlElement(name = "HostUnresolvedVmfsResolutionResult")
    protected List<HostUnresolvedVmfsResolutionResult> hostUnresolvedVmfsResolutionResult;

    /**
     * Gets the value of the hostUnresolvedVmfsResolutionResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostUnresolvedVmfsResolutionResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostUnresolvedVmfsResolutionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostUnresolvedVmfsResolutionResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostUnresolvedVmfsResolutionResult property.
     */
    public List<HostUnresolvedVmfsResolutionResult> getHostUnresolvedVmfsResolutionResult() {
        if (hostUnresolvedVmfsResolutionResult == null) {
            hostUnresolvedVmfsResolutionResult = new ArrayList<>();
        }
        return this.hostUnresolvedVmfsResolutionResult;
    }

}
