
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRuntimeInfoNetStackInstanceRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRuntimeInfoNetStackInstanceRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="netStackInstanceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vmknicKeys" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxNumberOfConnections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="currentIpV6Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRuntimeInfoNetStackInstanceRuntimeInfo", propOrder = {
    "netStackInstanceKey",
    "state",
    "vmknicKeys",
    "maxNumberOfConnections",
    "currentIpV6Enabled"
})
public class HostRuntimeInfoNetStackInstanceRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String netStackInstanceKey;
    protected String state;
    protected List<String> vmknicKeys;
    protected Integer maxNumberOfConnections;
    protected Boolean currentIpV6Enabled;

    /**
     * Gets the value of the netStackInstanceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetStackInstanceKey() {
        return netStackInstanceKey;
    }

    /**
     * Sets the value of the netStackInstanceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetStackInstanceKey(String value) {
        this.netStackInstanceKey = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the vmknicKeys property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmknicKeys property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmknicKeys().add(newItem);
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
     *     The value of the vmknicKeys property.
     */
    public List<String> getVmknicKeys() {
        if (vmknicKeys == null) {
            vmknicKeys = new ArrayList<>();
        }
        return this.vmknicKeys;
    }

    /**
     * Gets the value of the maxNumberOfConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfConnections() {
        return maxNumberOfConnections;
    }

    /**
     * Sets the value of the maxNumberOfConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfConnections(Integer value) {
        this.maxNumberOfConnections = value;
    }

    /**
     * Gets the value of the currentIpV6Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentIpV6Enabled() {
        return currentIpV6Enabled;
    }

    /**
     * Sets the value of the currentIpV6Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentIpV6Enabled(Boolean value) {
        this.currentIpV6Enabled = value;
    }

}
