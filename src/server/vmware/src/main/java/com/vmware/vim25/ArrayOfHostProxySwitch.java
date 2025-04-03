
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostProxySwitch complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostProxySwitch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostProxySwitch" type="{urn:internalvim25}HostProxySwitch" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProxySwitch", propOrder = {
    "hostProxySwitch"
})
public class ArrayOfHostProxySwitch {

    @XmlElement(name = "HostProxySwitch")
    protected List<HostProxySwitch> hostProxySwitch;

    /**
     * Gets the value of the hostProxySwitch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostProxySwitch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostProxySwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProxySwitch }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostProxySwitch property.
     */
    public List<HostProxySwitch> getHostProxySwitch() {
        if (hostProxySwitch == null) {
            hostProxySwitch = new ArrayList<>();
        }
        return this.hostProxySwitch;
    }

}
