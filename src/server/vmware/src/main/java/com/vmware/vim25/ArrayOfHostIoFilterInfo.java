
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostIoFilterInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostIoFilterInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostIoFilterInfo" type="{urn:internalvim25}HostIoFilterInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostIoFilterInfo", propOrder = {
    "hostIoFilterInfo"
})
public class ArrayOfHostIoFilterInfo {

    @XmlElement(name = "HostIoFilterInfo")
    protected List<HostIoFilterInfo> hostIoFilterInfo;

    /**
     * Gets the value of the hostIoFilterInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostIoFilterInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostIoFilterInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIoFilterInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostIoFilterInfo property.
     */
    public List<HostIoFilterInfo> getHostIoFilterInfo() {
        if (hostIoFilterInfo == null) {
            hostIoFilterInfo = new ArrayList<>();
        }
        return this.hostIoFilterInfo;
    }

}
