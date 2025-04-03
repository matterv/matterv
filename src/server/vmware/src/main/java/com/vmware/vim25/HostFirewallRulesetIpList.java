
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFirewallRulesetIpList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFirewallRulesetIpList">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipNetwork" type="{urn:internalvim25}HostFirewallRulesetIpNetwork" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="allIp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallRulesetIpList", propOrder = {
    "ipAddress",
    "ipNetwork",
    "allIp"
})
public class HostFirewallRulesetIpList
    extends DynamicData
{

    protected List<String> ipAddress;
    protected List<HostFirewallRulesetIpNetwork> ipNetwork;
    protected boolean allIp;

    /**
     * Gets the value of the ipAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIpAddress().add(newItem);
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
     *     The value of the ipAddress property.
     */
    public List<String> getIpAddress() {
        if (ipAddress == null) {
            ipAddress = new ArrayList<>();
        }
        return this.ipAddress;
    }

    /**
     * Gets the value of the ipNetwork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipNetwork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIpNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFirewallRulesetIpNetwork }
     * </p>
     * 
     * 
     * @return
     *     The value of the ipNetwork property.
     */
    public List<HostFirewallRulesetIpNetwork> getIpNetwork() {
        if (ipNetwork == null) {
            ipNetwork = new ArrayList<>();
        }
        return this.ipNetwork;
    }

    /**
     * Gets the value of the allIp property.
     * 
     */
    public boolean isAllIp() {
        return allIp;
    }

    /**
     * Sets the value of the allIp property.
     * 
     */
    public void setAllIp(boolean value) {
        this.allIp = value;
    }

}
