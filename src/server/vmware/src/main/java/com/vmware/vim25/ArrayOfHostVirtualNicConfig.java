
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostVirtualNicConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostVirtualNicConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostVirtualNicConfig" type="{urn:internalvim25}HostVirtualNicConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVirtualNicConfig", propOrder = {
    "hostVirtualNicConfig"
})
public class ArrayOfHostVirtualNicConfig {

    @XmlElement(name = "HostVirtualNicConfig")
    protected List<HostVirtualNicConfig> hostVirtualNicConfig;

    /**
     * Gets the value of the hostVirtualNicConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostVirtualNicConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostVirtualNicConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualNicConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostVirtualNicConfig property.
     */
    public List<HostVirtualNicConfig> getHostVirtualNicConfig() {
        if (hostVirtualNicConfig == null) {
            hostVirtualNicConfig = new ArrayList<>();
        }
        return this.hostVirtualNicConfig;
    }

}
