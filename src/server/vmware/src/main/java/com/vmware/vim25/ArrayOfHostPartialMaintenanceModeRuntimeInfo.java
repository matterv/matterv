
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostPartialMaintenanceModeRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostPartialMaintenanceModeRuntimeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostPartialMaintenanceModeRuntimeInfo" type="{urn:internalvim25}HostPartialMaintenanceModeRuntimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPartialMaintenanceModeRuntimeInfo", propOrder = {
    "hostPartialMaintenanceModeRuntimeInfo"
})
public class ArrayOfHostPartialMaintenanceModeRuntimeInfo {

    @XmlElement(name = "HostPartialMaintenanceModeRuntimeInfo")
    protected List<HostPartialMaintenanceModeRuntimeInfo> hostPartialMaintenanceModeRuntimeInfo;

    /**
     * Gets the value of the hostPartialMaintenanceModeRuntimeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostPartialMaintenanceModeRuntimeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostPartialMaintenanceModeRuntimeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPartialMaintenanceModeRuntimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostPartialMaintenanceModeRuntimeInfo property.
     */
    public List<HostPartialMaintenanceModeRuntimeInfo> getHostPartialMaintenanceModeRuntimeInfo() {
        if (hostPartialMaintenanceModeRuntimeInfo == null) {
            hostPartialMaintenanceModeRuntimeInfo = new ArrayList<>();
        }
        return this.hostPartialMaintenanceModeRuntimeInfo;
    }

}
