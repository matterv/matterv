
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProtocolEndpoint complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostProtocolEndpoint">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="peType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostKey" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="storageArray" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nfsServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nfsDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nfsServerScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nfsServerMajor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nfsServerAuthType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nfsServerUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="usedByStretchedContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProtocolEndpoint", propOrder = {
    "peType",
    "type",
    "uuid",
    "hostKey",
    "storageArray",
    "nfsServer",
    "nfsDir",
    "nfsServerScope",
    "nfsServerMajor",
    "nfsServerAuthType",
    "nfsServerUser",
    "deviceId",
    "usedByStretchedContainer"
})
public class HostProtocolEndpoint
    extends DynamicData
{

    @XmlElement(required = true)
    protected String peType;
    protected String type;
    @XmlElement(required = true)
    protected String uuid;
    protected List<ManagedObjectReference> hostKey;
    protected String storageArray;
    protected String nfsServer;
    protected String nfsDir;
    protected String nfsServerScope;
    protected String nfsServerMajor;
    protected String nfsServerAuthType;
    protected String nfsServerUser;
    protected String deviceId;
    protected Boolean usedByStretchedContainer;

    /**
     * Gets the value of the peType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeType() {
        return peType;
    }

    /**
     * Sets the value of the peType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeType(String value) {
        this.peType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the hostKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostKey().add(newItem);
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
     *     The value of the hostKey property.
     */
    public List<ManagedObjectReference> getHostKey() {
        if (hostKey == null) {
            hostKey = new ArrayList<>();
        }
        return this.hostKey;
    }

    /**
     * Gets the value of the storageArray property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageArray() {
        return storageArray;
    }

    /**
     * Sets the value of the storageArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageArray(String value) {
        this.storageArray = value;
    }

    /**
     * Gets the value of the nfsServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfsServer() {
        return nfsServer;
    }

    /**
     * Sets the value of the nfsServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfsServer(String value) {
        this.nfsServer = value;
    }

    /**
     * Gets the value of the nfsDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfsDir() {
        return nfsDir;
    }

    /**
     * Sets the value of the nfsDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfsDir(String value) {
        this.nfsDir = value;
    }

    /**
     * Gets the value of the nfsServerScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfsServerScope() {
        return nfsServerScope;
    }

    /**
     * Sets the value of the nfsServerScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfsServerScope(String value) {
        this.nfsServerScope = value;
    }

    /**
     * Gets the value of the nfsServerMajor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfsServerMajor() {
        return nfsServerMajor;
    }

    /**
     * Sets the value of the nfsServerMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfsServerMajor(String value) {
        this.nfsServerMajor = value;
    }

    /**
     * Gets the value of the nfsServerAuthType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfsServerAuthType() {
        return nfsServerAuthType;
    }

    /**
     * Sets the value of the nfsServerAuthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfsServerAuthType(String value) {
        this.nfsServerAuthType = value;
    }

    /**
     * Gets the value of the nfsServerUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfsServerUser() {
        return nfsServerUser;
    }

    /**
     * Sets the value of the nfsServerUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfsServerUser(String value) {
        this.nfsServerUser = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the usedByStretchedContainer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsedByStretchedContainer() {
        return usedByStretchedContainer;
    }

    /**
     * Sets the value of the usedByStretchedContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedByStretchedContainer(Boolean value) {
        this.usedByStretchedContainer = value;
    }

}
