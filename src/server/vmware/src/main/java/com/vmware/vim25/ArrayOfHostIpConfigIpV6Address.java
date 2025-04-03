
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostIpConfigIpV6Address complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostIpConfigIpV6Address">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostIpConfigIpV6Address" type="{urn:internalvim25}HostIpConfigIpV6Address" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostIpConfigIpV6Address", propOrder = {
    "hostIpConfigIpV6Address"
})
public class ArrayOfHostIpConfigIpV6Address {

    @XmlElement(name = "HostIpConfigIpV6Address")
    protected List<HostIpConfigIpV6Address> hostIpConfigIpV6Address;

    /**
     * Gets the value of the hostIpConfigIpV6Address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostIpConfigIpV6Address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostIpConfigIpV6Address().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostIpConfigIpV6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostIpConfigIpV6Address property.
     */
    public List<HostIpConfigIpV6Address> getHostIpConfigIpV6Address() {
        if (hostIpConfigIpV6Address == null) {
            hostIpConfigIpV6Address = new ArrayList<>();
        }
        return this.hostIpConfigIpV6Address;
    }

}
