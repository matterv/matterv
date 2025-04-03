
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVCUnsupportedByHostSoftware complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EVCUnsupportedByHostSoftware">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}EVCConfigFault">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded"/>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCUnsupportedByHostSoftware", propOrder = {
    "host",
    "hostName"
})
public class EVCUnsupportedByHostSoftware
    extends EVCConfigFault
{

    @XmlElement(required = true)
    protected List<ManagedObjectReference> host;
    @XmlElement(required = true)
    protected List<String> hostName;

    /**
     * Gets the value of the host property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the host property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the host property.
     */
    public List<ManagedObjectReference> getHost() {
        if (host == null) {
            host = new ArrayList<>();
        }
        return this.host;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostName property.
     */
    public List<String> getHostName() {
        if (hostName == null) {
            hostName = new ArrayList<>();
        }
        return this.hostName;
    }

}
