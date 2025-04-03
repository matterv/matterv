
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConnectInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostConnectInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="serverIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="inDasCluster" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="host" type="{urn:internalvim25}HostListSummary"/>
 *         <element name="vm" type="{urn:internalvim25}VirtualMachineSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vimAccountNameRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="clusterSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="network" type="{urn:internalvim25}HostConnectInfoNetworkInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="datastore" type="{urn:internalvim25}HostDatastoreConnectInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="license" type="{urn:internalvim25}HostLicenseConnectInfo" minOccurs="0"/>
 *         <element name="capability" type="{urn:internalvim25}HostCapability" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConnectInfo", propOrder = {
    "serverIp",
    "inDasCluster",
    "host",
    "vm",
    "vimAccountNameRequired",
    "clusterSupported",
    "network",
    "datastore",
    "license",
    "capability"
})
public class HostConnectInfo
    extends DynamicData
{

    protected String serverIp;
    protected Boolean inDasCluster;
    @XmlElement(required = true)
    protected HostListSummary host;
    protected List<VirtualMachineSummary> vm;
    protected Boolean vimAccountNameRequired;
    protected Boolean clusterSupported;
    protected List<HostConnectInfoNetworkInfo> network;
    protected List<HostDatastoreConnectInfo> datastore;
    protected HostLicenseConnectInfo license;
    protected HostCapability capability;

    /**
     * Gets the value of the serverIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * Sets the value of the serverIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerIp(String value) {
        this.serverIp = value;
    }

    /**
     * Gets the value of the inDasCluster property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInDasCluster() {
        return inDasCluster;
    }

    /**
     * Sets the value of the inDasCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInDasCluster(Boolean value) {
        this.inDasCluster = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link HostListSummary }
     *     
     */
    public HostListSummary getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostListSummary }
     *     
     */
    public void setHost(HostListSummary value) {
        this.host = value;
    }

    /**
     * Gets the value of the vm property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vm property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineSummary }
     * </p>
     * 
     * 
     * @return
     *     The value of the vm property.
     */
    public List<VirtualMachineSummary> getVm() {
        if (vm == null) {
            vm = new ArrayList<>();
        }
        return this.vm;
    }

    /**
     * Gets the value of the vimAccountNameRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVimAccountNameRequired() {
        return vimAccountNameRequired;
    }

    /**
     * Sets the value of the vimAccountNameRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVimAccountNameRequired(Boolean value) {
        this.vimAccountNameRequired = value;
    }

    /**
     * Gets the value of the clusterSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClusterSupported() {
        return clusterSupported;
    }

    /**
     * Sets the value of the clusterSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClusterSupported(Boolean value) {
        this.clusterSupported = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the network property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostConnectInfoNetworkInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the network property.
     */
    public List<HostConnectInfoNetworkInfo> getNetwork() {
        if (network == null) {
            network = new ArrayList<>();
        }
        return this.network;
    }

    /**
     * Gets the value of the datastore property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastore property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostDatastoreConnectInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastore property.
     */
    public List<HostDatastoreConnectInfo> getDatastore() {
        if (datastore == null) {
            datastore = new ArrayList<>();
        }
        return this.datastore;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link HostLicenseConnectInfo }
     *     
     */
    public HostLicenseConnectInfo getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostLicenseConnectInfo }
     *     
     */
    public void setLicense(HostLicenseConnectInfo value) {
        this.license = value;
    }

    /**
     * Gets the value of the capability property.
     * 
     * @return
     *     possible object is
     *     {@link HostCapability }
     *     
     */
    public HostCapability getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostCapability }
     *     
     */
    public void setCapability(HostCapability value) {
        this.capability = value;
    }

}
