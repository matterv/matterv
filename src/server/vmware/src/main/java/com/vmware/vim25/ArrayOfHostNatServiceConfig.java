
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostNatServiceConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostNatServiceConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostNatServiceConfig" type="{urn:internalvim25}HostNatServiceConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNatServiceConfig", propOrder = {
    "hostNatServiceConfig"
})
public class ArrayOfHostNatServiceConfig {

    @XmlElement(name = "HostNatServiceConfig")
    protected List<HostNatServiceConfig> hostNatServiceConfig;

    /**
     * Gets the value of the hostNatServiceConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostNatServiceConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostNatServiceConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNatServiceConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostNatServiceConfig property.
     */
    public List<HostNatServiceConfig> getHostNatServiceConfig() {
        if (hostNatServiceConfig == null) {
            hostNatServiceConfig = new ArrayList<>();
        }
        return this.hostNatServiceConfig;
    }

}
