
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostHostBusAdapter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostHostBusAdapter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostHostBusAdapter" type="{urn:internalvim25}HostHostBusAdapter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostHostBusAdapter", propOrder = {
    "hostHostBusAdapter"
})
public class ArrayOfHostHostBusAdapter {

    @XmlElement(name = "HostHostBusAdapter")
    protected List<HostHostBusAdapter> hostHostBusAdapter;

    /**
     * Gets the value of the hostHostBusAdapter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostHostBusAdapter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostHostBusAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostHostBusAdapter }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostHostBusAdapter property.
     */
    public List<HostHostBusAdapter> getHostHostBusAdapter() {
        if (hostHostBusAdapter == null) {
            hostHostBusAdapter = new ArrayList<>();
        }
        return this.hostHostBusAdapter;
    }

}
