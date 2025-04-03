
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScsiLun complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScsiLun">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDevice">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="descriptor" type="{urn:internalvim25}ScsiLunDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="canonicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lunType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="scsiLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="durableName" type="{urn:internalvim25}ScsiLunDurableName" minOccurs="0"/>
 *         <element name="alternateName" type="{urn:internalvim25}ScsiLunDurableName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="standardInquiry" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="queueDepth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="operationalState" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="capabilities" type="{urn:internalvim25}ScsiLunCapabilities" minOccurs="0"/>
 *         <element name="vStorageSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="protocolEndpoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="perenniallyReserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="clusteredVmdkSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="applicationProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dispersedNs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="deviceReservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScsiLun", propOrder = {
    "key",
    "uuid",
    "descriptor",
    "canonicalName",
    "displayName",
    "lunType",
    "vendor",
    "model",
    "revision",
    "scsiLevel",
    "serialNumber",
    "durableName",
    "alternateName",
    "standardInquiry",
    "queueDepth",
    "operationalState",
    "capabilities",
    "vStorageSupport",
    "protocolEndpoint",
    "perenniallyReserved",
    "clusteredVmdkSupported",
    "applicationProtocol",
    "dispersedNs",
    "deviceReservation"
})
@XmlSeeAlso({
    HostScsiDisk.class
})
public class ScsiLun
    extends HostDevice
{

    protected String key;
    @XmlElement(required = true)
    protected String uuid;
    protected List<ScsiLunDescriptor> descriptor;
    protected String canonicalName;
    protected String displayName;
    @XmlElement(required = true)
    protected String lunType;
    protected String vendor;
    protected String model;
    protected String revision;
    protected Integer scsiLevel;
    protected String serialNumber;
    protected ScsiLunDurableName durableName;
    protected List<ScsiLunDurableName> alternateName;
    @XmlElement(type = Byte.class)
    protected List<Byte> standardInquiry;
    protected Integer queueDepth;
    @XmlElement(required = true)
    protected List<String> operationalState;
    protected ScsiLunCapabilities capabilities;
    protected String vStorageSupport;
    protected Boolean protocolEndpoint;
    protected Boolean perenniallyReserved;
    protected Boolean clusteredVmdkSupported;
    protected String applicationProtocol;
    protected Boolean dispersedNs;
    protected String deviceReservation;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the descriptor property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptor property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScsiLunDescriptor }
     * </p>
     * 
     * 
     * @return
     *     The value of the descriptor property.
     */
    public List<ScsiLunDescriptor> getDescriptor() {
        if (descriptor == null) {
            descriptor = new ArrayList<>();
        }
        return this.descriptor;
    }

    /**
     * Gets the value of the canonicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalName() {
        return canonicalName;
    }

    /**
     * Sets the value of the canonicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalName(String value) {
        this.canonicalName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the lunType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLunType() {
        return lunType;
    }

    /**
     * Sets the value of the lunType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLunType(String value) {
        this.lunType = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the scsiLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScsiLevel() {
        return scsiLevel;
    }

    /**
     * Sets the value of the scsiLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScsiLevel(Integer value) {
        this.scsiLevel = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the durableName property.
     * 
     * @return
     *     possible object is
     *     {@link ScsiLunDurableName }
     *     
     */
    public ScsiLunDurableName getDurableName() {
        return durableName;
    }

    /**
     * Sets the value of the durableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScsiLunDurableName }
     *     
     */
    public void setDurableName(ScsiLunDurableName value) {
        this.durableName = value;
    }

    /**
     * Gets the value of the alternateName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAlternateName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScsiLunDurableName }
     * </p>
     * 
     * 
     * @return
     *     The value of the alternateName property.
     */
    public List<ScsiLunDurableName> getAlternateName() {
        if (alternateName == null) {
            alternateName = new ArrayList<>();
        }
        return this.alternateName;
    }

    /**
     * Gets the value of the standardInquiry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardInquiry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStandardInquiry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * </p>
     * 
     * 
     * @return
     *     The value of the standardInquiry property.
     */
    public List<Byte> getStandardInquiry() {
        if (standardInquiry == null) {
            standardInquiry = new ArrayList<>();
        }
        return this.standardInquiry;
    }

    /**
     * Gets the value of the queueDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueueDepth() {
        return queueDepth;
    }

    /**
     * Sets the value of the queueDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueueDepth(Integer value) {
        this.queueDepth = value;
    }

    /**
     * Gets the value of the operationalState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOperationalState().add(newItem);
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
     *     The value of the operationalState property.
     */
    public List<String> getOperationalState() {
        if (operationalState == null) {
            operationalState = new ArrayList<>();
        }
        return this.operationalState;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ScsiLunCapabilities }
     *     
     */
    public ScsiLunCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScsiLunCapabilities }
     *     
     */
    public void setCapabilities(ScsiLunCapabilities value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the vStorageSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVStorageSupport() {
        return vStorageSupport;
    }

    /**
     * Sets the value of the vStorageSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVStorageSupport(String value) {
        this.vStorageSupport = value;
    }

    /**
     * Gets the value of the protocolEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtocolEndpoint() {
        return protocolEndpoint;
    }

    /**
     * Sets the value of the protocolEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtocolEndpoint(Boolean value) {
        this.protocolEndpoint = value;
    }

    /**
     * Gets the value of the perenniallyReserved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerenniallyReserved() {
        return perenniallyReserved;
    }

    /**
     * Sets the value of the perenniallyReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerenniallyReserved(Boolean value) {
        this.perenniallyReserved = value;
    }

    /**
     * Gets the value of the clusteredVmdkSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClusteredVmdkSupported() {
        return clusteredVmdkSupported;
    }

    /**
     * Sets the value of the clusteredVmdkSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClusteredVmdkSupported(Boolean value) {
        this.clusteredVmdkSupported = value;
    }

    /**
     * Gets the value of the applicationProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationProtocol() {
        return applicationProtocol;
    }

    /**
     * Sets the value of the applicationProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationProtocol(String value) {
        this.applicationProtocol = value;
    }

    /**
     * Gets the value of the dispersedNs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispersedNs() {
        return dispersedNs;
    }

    /**
     * Sets the value of the dispersedNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispersedNs(Boolean value) {
        this.dispersedNs = value;
    }

    /**
     * Gets the value of the deviceReservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceReservation() {
        return deviceReservation;
    }

    /**
     * Sets the value of the deviceReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceReservation(String value) {
        this.deviceReservation = value;
    }

}
