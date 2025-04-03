
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostPlugStoreTopologyPath complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostPlugStoreTopologyPath">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostPlugStoreTopologyPath" type="{urn:internalvim25}HostPlugStoreTopologyPath" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPlugStoreTopologyPath", propOrder = {
    "hostPlugStoreTopologyPath"
})
public class ArrayOfHostPlugStoreTopologyPath {

    @XmlElement(name = "HostPlugStoreTopologyPath")
    protected List<HostPlugStoreTopologyPath> hostPlugStoreTopologyPath;

    /**
     * Gets the value of the hostPlugStoreTopologyPath property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostPlugStoreTopologyPath property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostPlugStoreTopologyPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPlugStoreTopologyPath }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostPlugStoreTopologyPath property.
     */
    public List<HostPlugStoreTopologyPath> getHostPlugStoreTopologyPath() {
        if (hostPlugStoreTopologyPath == null) {
            hostPlugStoreTopologyPath = new ArrayList<>();
        }
        return this.hostPlugStoreTopologyPath;
    }

}
