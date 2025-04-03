
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostProtocolEndpoint complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostProtocolEndpoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostProtocolEndpoint" type="{urn:internalvim25}HostProtocolEndpoint" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProtocolEndpoint", propOrder = {
    "hostProtocolEndpoint"
})
public class ArrayOfHostProtocolEndpoint {

    @XmlElement(name = "HostProtocolEndpoint")
    protected List<HostProtocolEndpoint> hostProtocolEndpoint;

    /**
     * Gets the value of the hostProtocolEndpoint property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostProtocolEndpoint property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostProtocolEndpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProtocolEndpoint }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostProtocolEndpoint property.
     */
    public List<HostProtocolEndpoint> getHostProtocolEndpoint() {
        if (hostProtocolEndpoint == null) {
            hostProtocolEndpoint = new ArrayList<>();
        }
        return this.hostProtocolEndpoint;
    }

}
