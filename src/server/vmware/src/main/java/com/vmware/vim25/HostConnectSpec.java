
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConnectSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostConnectSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="sslThumbprint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vmFolder" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="force" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="vimAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vimAccountPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="managementIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lockdownMode" type="{urn:internalvim25}HostLockdownMode" minOccurs="0"/>
 *         <element name="hostGateway" type="{urn:internalvim25}HostGatewaySpec" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConnectSpec", propOrder = {
    "hostName",
    "port",
    "sslThumbprint",
    "userName",
    "password",
    "vmFolder",
    "force",
    "vimAccountName",
    "vimAccountPassword",
    "managementIp",
    "lockdownMode",
    "hostGateway"
})
public class HostConnectSpec
    extends DynamicData
{

    protected String hostName;
    protected Integer port;
    protected String sslThumbprint;
    protected String userName;
    protected String password;
    protected ManagedObjectReference vmFolder;
    protected boolean force;
    protected String vimAccountName;
    protected String vimAccountPassword;
    protected String managementIp;
    @XmlSchemaType(name = "string")
    protected HostLockdownMode lockdownMode;
    protected HostGatewaySpec hostGateway;

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the sslThumbprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslThumbprint() {
        return sslThumbprint;
    }

    /**
     * Sets the value of the sslThumbprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslThumbprint(String value) {
        this.sslThumbprint = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the vmFolder property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVmFolder() {
        return vmFolder;
    }

    /**
     * Sets the value of the vmFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVmFolder(ManagedObjectReference value) {
        this.vmFolder = value;
    }

    /**
     * Gets the value of the force property.
     * 
     */
    public boolean isForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     */
    public void setForce(boolean value) {
        this.force = value;
    }

    /**
     * Gets the value of the vimAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVimAccountName() {
        return vimAccountName;
    }

    /**
     * Sets the value of the vimAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVimAccountName(String value) {
        this.vimAccountName = value;
    }

    /**
     * Gets the value of the vimAccountPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVimAccountPassword() {
        return vimAccountPassword;
    }

    /**
     * Sets the value of the vimAccountPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVimAccountPassword(String value) {
        this.vimAccountPassword = value;
    }

    /**
     * Gets the value of the managementIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementIp() {
        return managementIp;
    }

    /**
     * Sets the value of the managementIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementIp(String value) {
        this.managementIp = value;
    }

    /**
     * Gets the value of the lockdownMode property.
     * 
     * @return
     *     possible object is
     *     {@link HostLockdownMode }
     *     
     */
    public HostLockdownMode getLockdownMode() {
        return lockdownMode;
    }

    /**
     * Sets the value of the lockdownMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostLockdownMode }
     *     
     */
    public void setLockdownMode(HostLockdownMode value) {
        this.lockdownMode = value;
    }

    /**
     * Gets the value of the hostGateway property.
     * 
     * @return
     *     possible object is
     *     {@link HostGatewaySpec }
     *     
     */
    public HostGatewaySpec getHostGateway() {
        return hostGateway;
    }

    /**
     * Sets the value of the hostGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostGatewaySpec }
     *     
     */
    public void setHostGateway(HostGatewaySpec value) {
        this.hostGateway = value;
    }

}
