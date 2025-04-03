
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostSriovDevicePoolInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostSriovDevicePoolInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostSriovDevicePoolInfo" type="{urn:internalvim25}HostSriovDevicePoolInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSriovDevicePoolInfo", propOrder = {
    "hostSriovDevicePoolInfo"
})
public class ArrayOfHostSriovDevicePoolInfo {

    @XmlElement(name = "HostSriovDevicePoolInfo")
    protected List<HostSriovDevicePoolInfo> hostSriovDevicePoolInfo;

    /**
     * Gets the value of the hostSriovDevicePoolInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostSriovDevicePoolInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostSriovDevicePoolInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostSriovDevicePoolInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostSriovDevicePoolInfo property.
     */
    public List<HostSriovDevicePoolInfo> getHostSriovDevicePoolInfo() {
        if (hostSriovDevicePoolInfo == null) {
            hostSriovDevicePoolInfo = new ArrayList<>();
        }
        return this.hostSriovDevicePoolInfo;
    }

}
