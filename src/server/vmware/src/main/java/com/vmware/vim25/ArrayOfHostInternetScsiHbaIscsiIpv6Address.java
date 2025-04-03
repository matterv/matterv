
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostInternetScsiHbaIscsiIpv6Address complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostInternetScsiHbaIscsiIpv6Address">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostInternetScsiHbaIscsiIpv6Address" type="{urn:internalvim25}HostInternetScsiHbaIscsiIpv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostInternetScsiHbaIscsiIpv6Address", propOrder = {
    "hostInternetScsiHbaIscsiIpv6Address"
})
public class ArrayOfHostInternetScsiHbaIscsiIpv6Address {

    @XmlElement(name = "HostInternetScsiHbaIscsiIpv6Address")
    protected List<HostInternetScsiHbaIscsiIpv6Address> hostInternetScsiHbaIscsiIpv6Address;

    /**
     * Gets the value of the hostInternetScsiHbaIscsiIpv6Address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostInternetScsiHbaIscsiIpv6Address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostInternetScsiHbaIscsiIpv6Address().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostInternetScsiHbaIscsiIpv6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostInternetScsiHbaIscsiIpv6Address property.
     */
    public List<HostInternetScsiHbaIscsiIpv6Address> getHostInternetScsiHbaIscsiIpv6Address() {
        if (hostInternetScsiHbaIscsiIpv6Address == null) {
            hostInternetScsiHbaIscsiIpv6Address = new ArrayList<>();
        }
        return this.hostInternetScsiHbaIscsiIpv6Address;
    }

}
