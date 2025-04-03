
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostApplyProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostApplyProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ApplyProfile">
 *       <sequence>
 *         <element name="memory" type="{urn:internalvim25}HostMemoryProfile" minOccurs="0"/>
 *         <element name="storage" type="{urn:internalvim25}StorageProfile" minOccurs="0"/>
 *         <element name="network" type="{urn:internalvim25}NetworkProfile" minOccurs="0"/>
 *         <element name="datetime" type="{urn:internalvim25}DateTimeProfile" minOccurs="0"/>
 *         <element name="firewall" type="{urn:internalvim25}FirewallProfile" minOccurs="0"/>
 *         <element name="security" type="{urn:internalvim25}SecurityProfile" minOccurs="0"/>
 *         <element name="service" type="{urn:internalvim25}ServiceProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="option" type="{urn:internalvim25}OptionProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="userAccount" type="{urn:internalvim25}UserProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="usergroupAccount" type="{urn:internalvim25}UserGroupProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="authentication" type="{urn:internalvim25}AuthenticationProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostApplyProfile", propOrder = {
    "memory",
    "storage",
    "network",
    "datetime",
    "firewall",
    "security",
    "service",
    "option",
    "userAccount",
    "usergroupAccount",
    "authentication"
})
public class HostApplyProfile
    extends ApplyProfile
{

    protected HostMemoryProfile memory;
    protected StorageProfile storage;
    protected NetworkProfile network;
    protected DateTimeProfile datetime;
    protected FirewallProfile firewall;
    protected SecurityProfile security;
    protected List<ServiceProfile> service;
    protected List<OptionProfile> option;
    protected List<UserProfile> userAccount;
    protected List<UserGroupProfile> usergroupAccount;
    protected AuthenticationProfile authentication;

    /**
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link HostMemoryProfile }
     *     
     */
    public HostMemoryProfile getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMemoryProfile }
     *     
     */
    public void setMemory(HostMemoryProfile value) {
        this.memory = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link StorageProfile }
     *     
     */
    public StorageProfile getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageProfile }
     *     
     */
    public void setStorage(StorageProfile value) {
        this.storage = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkProfile }
     *     
     */
    public NetworkProfile getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkProfile }
     *     
     */
    public void setNetwork(NetworkProfile value) {
        this.network = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeProfile }
     *     
     */
    public DateTimeProfile getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeProfile }
     *     
     */
    public void setDatetime(DateTimeProfile value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the firewall property.
     * 
     * @return
     *     possible object is
     *     {@link FirewallProfile }
     *     
     */
    public FirewallProfile getFirewall() {
        return firewall;
    }

    /**
     * Sets the value of the firewall property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirewallProfile }
     *     
     */
    public void setFirewall(FirewallProfile value) {
        this.firewall = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityProfile }
     *     
     */
    public SecurityProfile getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityProfile }
     *     
     */
    public void setSecurity(SecurityProfile value) {
        this.security = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the service property.
     */
    public List<ServiceProfile> getService() {
        if (service == null) {
            service = new ArrayList<>();
        }
        return this.service;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the option property.
     */
    public List<OptionProfile> getOption() {
        if (option == null) {
            option = new ArrayList<>();
        }
        return this.option;
    }

    /**
     * Gets the value of the userAccount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAccount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUserAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the userAccount property.
     */
    public List<UserProfile> getUserAccount() {
        if (userAccount == null) {
            userAccount = new ArrayList<>();
        }
        return this.userAccount;
    }

    /**
     * Gets the value of the usergroupAccount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usergroupAccount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsergroupAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserGroupProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the usergroupAccount property.
     */
    public List<UserGroupProfile> getUsergroupAccount() {
        if (usergroupAccount == null) {
            usergroupAccount = new ArrayList<>();
        }
        return this.usergroupAccount;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationProfile }
     *     
     */
    public AuthenticationProfile getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationProfile }
     *     
     */
    public void setAuthentication(AuthenticationProfile value) {
        this.authentication = value;
    }

}
