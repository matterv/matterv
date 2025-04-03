
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVCModeUnsupportedByHosts complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EVCModeUnsupportedByHosts">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}EVCConfigFault">
 *       <sequence>
 *         <element name="evcMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCModeUnsupportedByHosts", propOrder = {
    "evcMode",
    "host",
    "hostName"
})
public class EVCModeUnsupportedByHosts
    extends EVCConfigFault
{

    protected String evcMode;
    protected List<ManagedObjectReference> host;
    protected List<String> hostName;

    /**
     * Gets the value of the evcMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvcMode() {
        return evcMode;
    }

    /**
     * Sets the value of the evcMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvcMode(String value) {
        this.evcMode = value;
    }

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
