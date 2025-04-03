
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostStorageElementInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostStorageElementInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostStorageElementInfo" type="{urn:internalvim25}HostStorageElementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostStorageElementInfo", propOrder = {
    "hostStorageElementInfo"
})
public class ArrayOfHostStorageElementInfo {

    @XmlElement(name = "HostStorageElementInfo")
    protected List<HostStorageElementInfo> hostStorageElementInfo;

    /**
     * Gets the value of the hostStorageElementInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostStorageElementInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostStorageElementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostStorageElementInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostStorageElementInfo property.
     */
    public List<HostStorageElementInfo> getHostStorageElementInfo() {
        if (hostStorageElementInfo == null) {
            hostStorageElementInfo = new ArrayList<>();
        }
        return this.hostStorageElementInfo;
    }

}
