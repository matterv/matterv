
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostMemoryTierInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostMemoryTierInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostMemoryTierInfo" type="{urn:internalvim25}HostMemoryTierInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostMemoryTierInfo", propOrder = {
    "hostMemoryTierInfo"
})
public class ArrayOfHostMemoryTierInfo {

    @XmlElement(name = "HostMemoryTierInfo")
    protected List<HostMemoryTierInfo> hostMemoryTierInfo;

    /**
     * Gets the value of the hostMemoryTierInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostMemoryTierInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostMemoryTierInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostMemoryTierInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostMemoryTierInfo property.
     */
    public List<HostMemoryTierInfo> getHostMemoryTierInfo() {
        if (hostMemoryTierInfo == null) {
            hostMemoryTierInfo = new ArrayList<>();
        }
        return this.hostMemoryTierInfo;
    }

}
