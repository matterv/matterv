
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNetIpConfigSpecIpAddressSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfNetIpConfigSpecIpAddressSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NetIpConfigSpecIpAddressSpec" type="{urn:internalvim25}NetIpConfigSpecIpAddressSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetIpConfigSpecIpAddressSpec", propOrder = {
    "netIpConfigSpecIpAddressSpec"
})
public class ArrayOfNetIpConfigSpecIpAddressSpec {

    @XmlElement(name = "NetIpConfigSpecIpAddressSpec")
    protected List<NetIpConfigSpecIpAddressSpec> netIpConfigSpecIpAddressSpec;

    /**
     * Gets the value of the netIpConfigSpecIpAddressSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netIpConfigSpecIpAddressSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetIpConfigSpecIpAddressSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetIpConfigSpecIpAddressSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the netIpConfigSpecIpAddressSpec property.
     */
    public List<NetIpConfigSpecIpAddressSpec> getNetIpConfigSpecIpAddressSpec() {
        if (netIpConfigSpecIpAddressSpec == null) {
            netIpConfigSpecIpAddressSpec = new ArrayList<>();
        }
        return this.netIpConfigSpecIpAddressSpec;
    }

}
