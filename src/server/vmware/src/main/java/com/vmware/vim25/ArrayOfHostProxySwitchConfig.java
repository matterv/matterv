
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostProxySwitchConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostProxySwitchConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostProxySwitchConfig" type="{urn:internalvim25}HostProxySwitchConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProxySwitchConfig", propOrder = {
    "hostProxySwitchConfig"
})
public class ArrayOfHostProxySwitchConfig {

    @XmlElement(name = "HostProxySwitchConfig")
    protected List<HostProxySwitchConfig> hostProxySwitchConfig;

    /**
     * Gets the value of the hostProxySwitchConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostProxySwitchConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostProxySwitchConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProxySwitchConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostProxySwitchConfig property.
     */
    public List<HostProxySwitchConfig> getHostProxySwitchConfig() {
        if (hostProxySwitchConfig == null) {
            hostProxySwitchConfig = new ArrayList<>();
        }
        return this.hostProxySwitchConfig;
    }

}
