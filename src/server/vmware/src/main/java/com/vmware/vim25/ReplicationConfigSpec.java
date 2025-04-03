
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReplicationConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="generation" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="vmReplicationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="rpo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="quiesceGuestEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="paused" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="oppUpdatesEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="netCompressionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="netEncryptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryptionDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="encryptionPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="remoteCertificateThumbprint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dataSetsReplicationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disk" type="{urn:internalvim25}ReplicationInfoDiskSettings" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationConfigSpec", propOrder = {
    "generation",
    "vmReplicationId",
    "destination",
    "port",
    "rpo",
    "quiesceGuestEnabled",
    "paused",
    "oppUpdatesEnabled",
    "netCompressionEnabled",
    "netEncryptionEnabled",
    "encryptionDestination",
    "encryptionPort",
    "remoteCertificateThumbprint",
    "dataSetsReplicationEnabled",
    "disk"
})
public class ReplicationConfigSpec
    extends DynamicData
{

    protected long generation;
    @XmlElement(required = true)
    protected String vmReplicationId;
    @XmlElement(required = true)
    protected String destination;
    protected int port;
    protected long rpo;
    protected boolean quiesceGuestEnabled;
    protected boolean paused;
    protected boolean oppUpdatesEnabled;
    protected Boolean netCompressionEnabled;
    protected Boolean netEncryptionEnabled;
    protected String encryptionDestination;
    protected Integer encryptionPort;
    protected String remoteCertificateThumbprint;
    protected Boolean dataSetsReplicationEnabled;
    protected List<ReplicationInfoDiskSettings> disk;

    /**
     * Gets the value of the generation property.
     * 
     */
    public long getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     */
    public void setGeneration(long value) {
        this.generation = value;
    }

    /**
     * Gets the value of the vmReplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmReplicationId() {
        return vmReplicationId;
    }

    /**
     * Sets the value of the vmReplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmReplicationId(String value) {
        this.vmReplicationId = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the rpo property.
     * 
     */
    public long getRpo() {
        return rpo;
    }

    /**
     * Sets the value of the rpo property.
     * 
     */
    public void setRpo(long value) {
        this.rpo = value;
    }

    /**
     * Gets the value of the quiesceGuestEnabled property.
     * 
     */
    public boolean isQuiesceGuestEnabled() {
        return quiesceGuestEnabled;
    }

    /**
     * Sets the value of the quiesceGuestEnabled property.
     * 
     */
    public void setQuiesceGuestEnabled(boolean value) {
        this.quiesceGuestEnabled = value;
    }

    /**
     * Gets the value of the paused property.
     * 
     */
    public boolean isPaused() {
        return paused;
    }

    /**
     * Sets the value of the paused property.
     * 
     */
    public void setPaused(boolean value) {
        this.paused = value;
    }

    /**
     * Gets the value of the oppUpdatesEnabled property.
     * 
     */
    public boolean isOppUpdatesEnabled() {
        return oppUpdatesEnabled;
    }

    /**
     * Sets the value of the oppUpdatesEnabled property.
     * 
     */
    public void setOppUpdatesEnabled(boolean value) {
        this.oppUpdatesEnabled = value;
    }

    /**
     * Gets the value of the netCompressionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetCompressionEnabled() {
        return netCompressionEnabled;
    }

    /**
     * Sets the value of the netCompressionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetCompressionEnabled(Boolean value) {
        this.netCompressionEnabled = value;
    }

    /**
     * Gets the value of the netEncryptionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetEncryptionEnabled() {
        return netEncryptionEnabled;
    }

    /**
     * Sets the value of the netEncryptionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetEncryptionEnabled(Boolean value) {
        this.netEncryptionEnabled = value;
    }

    /**
     * Gets the value of the encryptionDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionDestination() {
        return encryptionDestination;
    }

    /**
     * Sets the value of the encryptionDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionDestination(String value) {
        this.encryptionDestination = value;
    }

    /**
     * Gets the value of the encryptionPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEncryptionPort() {
        return encryptionPort;
    }

    /**
     * Sets the value of the encryptionPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEncryptionPort(Integer value) {
        this.encryptionPort = value;
    }

    /**
     * Gets the value of the remoteCertificateThumbprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteCertificateThumbprint() {
        return remoteCertificateThumbprint;
    }

    /**
     * Sets the value of the remoteCertificateThumbprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteCertificateThumbprint(String value) {
        this.remoteCertificateThumbprint = value;
    }

    /**
     * Gets the value of the dataSetsReplicationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataSetsReplicationEnabled() {
        return dataSetsReplicationEnabled;
    }

    /**
     * Sets the value of the dataSetsReplicationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataSetsReplicationEnabled(Boolean value) {
        this.dataSetsReplicationEnabled = value;
    }

    /**
     * Gets the value of the disk property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disk property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationInfoDiskSettings }
     * </p>
     * 
     * 
     * @return
     *     The value of the disk property.
     */
    public List<ReplicationInfoDiskSettings> getDisk() {
        if (disk == null) {
            disk = new ArrayList<>();
        }
        return this.disk;
    }

}
