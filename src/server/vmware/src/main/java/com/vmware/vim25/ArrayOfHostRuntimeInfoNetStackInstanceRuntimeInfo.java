
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostRuntimeInfoNetStackInstanceRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostRuntimeInfoNetStackInstanceRuntimeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostRuntimeInfoNetStackInstanceRuntimeInfo" type="{urn:internalvim25}HostRuntimeInfoNetStackInstanceRuntimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostRuntimeInfoNetStackInstanceRuntimeInfo", propOrder = {
    "hostRuntimeInfoNetStackInstanceRuntimeInfo"
})
public class ArrayOfHostRuntimeInfoNetStackInstanceRuntimeInfo {

    @XmlElement(name = "HostRuntimeInfoNetStackInstanceRuntimeInfo")
    protected List<HostRuntimeInfoNetStackInstanceRuntimeInfo> hostRuntimeInfoNetStackInstanceRuntimeInfo;

    /**
     * Gets the value of the hostRuntimeInfoNetStackInstanceRuntimeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostRuntimeInfoNetStackInstanceRuntimeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostRuntimeInfoNetStackInstanceRuntimeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostRuntimeInfoNetStackInstanceRuntimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostRuntimeInfoNetStackInstanceRuntimeInfo property.
     */
    public List<HostRuntimeInfoNetStackInstanceRuntimeInfo> getHostRuntimeInfoNetStackInstanceRuntimeInfo() {
        if (hostRuntimeInfoNetStackInstanceRuntimeInfo == null) {
            hostRuntimeInfoNetStackInstanceRuntimeInfo = new ArrayList<>();
        }
        return this.hostRuntimeInfoNetStackInstanceRuntimeInfo;
    }

}
