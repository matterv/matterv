
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualPort complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualPort">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="config" type="{urn:internalvim25}DVPortConfigInfo"/>
 *         <element name="dvsUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="portgroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="proxyHost" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="connectee" type="{urn:internalvim25}DistributedVirtualSwitchPortConnectee" minOccurs="0"/>
 *         <element name="conflict" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="conflictPortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="state" type="{urn:internalvim25}DVPortState" minOccurs="0"/>
 *         <element name="connectionCookie" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="lastStatusChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="hostLocalPort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="segmentPortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPort", propOrder = {
    "key",
    "config",
    "dvsUuid",
    "portgroupKey",
    "proxyHost",
    "connectee",
    "conflict",
    "conflictPortKey",
    "state",
    "connectionCookie",
    "lastStatusChange",
    "hostLocalPort",
    "externalId",
    "segmentPortId"
})
public class DistributedVirtualPort
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected DVPortConfigInfo config;
    @XmlElement(required = true)
    protected String dvsUuid;
    protected String portgroupKey;
    protected ManagedObjectReference proxyHost;
    protected DistributedVirtualSwitchPortConnectee connectee;
    protected boolean conflict;
    protected String conflictPortKey;
    protected DVPortState state;
    protected Integer connectionCookie;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastStatusChange;
    protected Boolean hostLocalPort;
    protected String externalId;
    protected String segmentPortId;

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
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortConfigInfo }
     *     
     */
    public DVPortConfigInfo getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortConfigInfo }
     *     
     */
    public void setConfig(DVPortConfigInfo value) {
        this.config = value;
    }

    /**
     * Gets the value of the dvsUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvsUuid() {
        return dvsUuid;
    }

    /**
     * Sets the value of the dvsUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvsUuid(String value) {
        this.dvsUuid = value;
    }

    /**
     * Gets the value of the portgroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortgroupKey() {
        return portgroupKey;
    }

    /**
     * Sets the value of the portgroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortgroupKey(String value) {
        this.portgroupKey = value;
    }

    /**
     * Gets the value of the proxyHost property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getProxyHost() {
        return proxyHost;
    }

    /**
     * Sets the value of the proxyHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setProxyHost(ManagedObjectReference value) {
        this.proxyHost = value;
    }

    /**
     * Gets the value of the connectee property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchPortConnectee }
     *     
     */
    public DistributedVirtualSwitchPortConnectee getConnectee() {
        return connectee;
    }

    /**
     * Sets the value of the connectee property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchPortConnectee }
     *     
     */
    public void setConnectee(DistributedVirtualSwitchPortConnectee value) {
        this.connectee = value;
    }

    /**
     * Gets the value of the conflict property.
     * 
     */
    public boolean isConflict() {
        return conflict;
    }

    /**
     * Sets the value of the conflict property.
     * 
     */
    public void setConflict(boolean value) {
        this.conflict = value;
    }

    /**
     * Gets the value of the conflictPortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictPortKey() {
        return conflictPortKey;
    }

    /**
     * Sets the value of the conflictPortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictPortKey(String value) {
        this.conflictPortKey = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortState }
     *     
     */
    public DVPortState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortState }
     *     
     */
    public void setState(DVPortState value) {
        this.state = value;
    }

    /**
     * Gets the value of the connectionCookie property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectionCookie() {
        return connectionCookie;
    }

    /**
     * Sets the value of the connectionCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectionCookie(Integer value) {
        this.connectionCookie = value;
    }

    /**
     * Gets the value of the lastStatusChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastStatusChange() {
        return lastStatusChange;
    }

    /**
     * Sets the value of the lastStatusChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastStatusChange(XMLGregorianCalendar value) {
        this.lastStatusChange = value;
    }

    /**
     * Gets the value of the hostLocalPort property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostLocalPort() {
        return hostLocalPort;
    }

    /**
     * Sets the value of the hostLocalPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostLocalPort(Boolean value) {
        this.hostLocalPort = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the segmentPortId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentPortId() {
        return segmentPortId;
    }

    /**
     * Sets the value of the segmentPortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentPortId(String value) {
        this.segmentPortId = value;
    }

}
