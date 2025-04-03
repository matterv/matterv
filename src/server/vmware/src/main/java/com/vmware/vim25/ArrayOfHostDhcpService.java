
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostDhcpService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostDhcpService">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostDhcpService" type="{urn:internalvim25}HostDhcpService" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDhcpService", propOrder = {
    "hostDhcpService"
})
public class ArrayOfHostDhcpService {

    @XmlElement(name = "HostDhcpService")
    protected List<HostDhcpService> hostDhcpService;

    /**
     * Gets the value of the hostDhcpService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostDhcpService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostDhcpService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostDhcpService }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostDhcpService property.
     */
    public List<HostDhcpService> getHostDhcpService() {
        if (hostDhcpService == null) {
            hostDhcpService = new ArrayList<>();
        }
        return this.hostDhcpService;
    }

}
