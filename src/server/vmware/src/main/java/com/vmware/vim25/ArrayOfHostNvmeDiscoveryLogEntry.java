
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostNvmeDiscoveryLogEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostNvmeDiscoveryLogEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostNvmeDiscoveryLogEntry" type="{urn:internalvim25}HostNvmeDiscoveryLogEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNvmeDiscoveryLogEntry", propOrder = {
    "hostNvmeDiscoveryLogEntry"
})
public class ArrayOfHostNvmeDiscoveryLogEntry {

    @XmlElement(name = "HostNvmeDiscoveryLogEntry")
    protected List<HostNvmeDiscoveryLogEntry> hostNvmeDiscoveryLogEntry;

    /**
     * Gets the value of the hostNvmeDiscoveryLogEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostNvmeDiscoveryLogEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostNvmeDiscoveryLogEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNvmeDiscoveryLogEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostNvmeDiscoveryLogEntry property.
     */
    public List<HostNvmeDiscoveryLogEntry> getHostNvmeDiscoveryLogEntry() {
        if (hostNvmeDiscoveryLogEntry == null) {
            hostNvmeDiscoveryLogEntry = new ArrayList<>();
        }
        return this.hostNvmeDiscoveryLogEntry;
    }

}
