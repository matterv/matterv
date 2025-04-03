
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostSystemResourceInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostSystemResourceInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostSystemResourceInfo" type="{urn:internalvim25}HostSystemResourceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSystemResourceInfo", propOrder = {
    "hostSystemResourceInfo"
})
public class ArrayOfHostSystemResourceInfo {

    @XmlElement(name = "HostSystemResourceInfo")
    protected List<HostSystemResourceInfo> hostSystemResourceInfo;

    /**
     * Gets the value of the hostSystemResourceInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostSystemResourceInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostSystemResourceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostSystemResourceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostSystemResourceInfo property.
     */
    public List<HostSystemResourceInfo> getHostSystemResourceInfo() {
        if (hostSystemResourceInfo == null) {
            hostSystemResourceInfo = new ArrayList<>();
        }
        return this.hostSystemResourceInfo;
    }

}
