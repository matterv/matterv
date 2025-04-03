
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareVspanSession complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareVspanSession">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sourcePortTransmitted" type="{urn:internalvim25}VMwareVspanPort" minOccurs="0"/>
 *         <element name="sourcePortReceived" type="{urn:internalvim25}VMwareVspanPort" minOccurs="0"/>
 *         <element name="destinationPort" type="{urn:internalvim25}VMwareVspanPort" minOccurs="0"/>
 *         <element name="encapsulationVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="stripOriginalVlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mirroredPacketLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="normalTrafficAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="encapType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="erspanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="erspanCOS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="erspanGraNanosec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="netstack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareVspanSession", propOrder = {
    "key",
    "name",
    "description",
    "enabled",
    "sourcePortTransmitted",
    "sourcePortReceived",
    "destinationPort",
    "encapsulationVlanId",
    "stripOriginalVlan",
    "mirroredPacketLength",
    "normalTrafficAllowed",
    "sessionType",
    "samplingRate",
    "encapType",
    "erspanId",
    "erspanCOS",
    "erspanGraNanosec",
    "netstack"
})
public class VMwareVspanSession
    extends DynamicData
{

    protected String key;
    protected String name;
    protected String description;
    protected boolean enabled;
    protected VMwareVspanPort sourcePortTransmitted;
    protected VMwareVspanPort sourcePortReceived;
    protected VMwareVspanPort destinationPort;
    protected Integer encapsulationVlanId;
    protected boolean stripOriginalVlan;
    protected Integer mirroredPacketLength;
    protected boolean normalTrafficAllowed;
    protected String sessionType;
    protected Integer samplingRate;
    protected String encapType;
    protected Integer erspanId;
    protected Integer erspanCOS;
    protected Boolean erspanGraNanosec;
    protected String netstack;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the sourcePortTransmitted property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareVspanPort }
     *     
     */
    public VMwareVspanPort getSourcePortTransmitted() {
        return sourcePortTransmitted;
    }

    /**
     * Sets the value of the sourcePortTransmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareVspanPort }
     *     
     */
    public void setSourcePortTransmitted(VMwareVspanPort value) {
        this.sourcePortTransmitted = value;
    }

    /**
     * Gets the value of the sourcePortReceived property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareVspanPort }
     *     
     */
    public VMwareVspanPort getSourcePortReceived() {
        return sourcePortReceived;
    }

    /**
     * Sets the value of the sourcePortReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareVspanPort }
     *     
     */
    public void setSourcePortReceived(VMwareVspanPort value) {
        this.sourcePortReceived = value;
    }

    /**
     * Gets the value of the destinationPort property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareVspanPort }
     *     
     */
    public VMwareVspanPort getDestinationPort() {
        return destinationPort;
    }

    /**
     * Sets the value of the destinationPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareVspanPort }
     *     
     */
    public void setDestinationPort(VMwareVspanPort value) {
        this.destinationPort = value;
    }

    /**
     * Gets the value of the encapsulationVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEncapsulationVlanId() {
        return encapsulationVlanId;
    }

    /**
     * Sets the value of the encapsulationVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEncapsulationVlanId(Integer value) {
        this.encapsulationVlanId = value;
    }

    /**
     * Gets the value of the stripOriginalVlan property.
     * 
     */
    public boolean isStripOriginalVlan() {
        return stripOriginalVlan;
    }

    /**
     * Sets the value of the stripOriginalVlan property.
     * 
     */
    public void setStripOriginalVlan(boolean value) {
        this.stripOriginalVlan = value;
    }

    /**
     * Gets the value of the mirroredPacketLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMirroredPacketLength() {
        return mirroredPacketLength;
    }

    /**
     * Sets the value of the mirroredPacketLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMirroredPacketLength(Integer value) {
        this.mirroredPacketLength = value;
    }

    /**
     * Gets the value of the normalTrafficAllowed property.
     * 
     */
    public boolean isNormalTrafficAllowed() {
        return normalTrafficAllowed;
    }

    /**
     * Sets the value of the normalTrafficAllowed property.
     * 
     */
    public void setNormalTrafficAllowed(boolean value) {
        this.normalTrafficAllowed = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionType(String value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the samplingRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSamplingRate() {
        return samplingRate;
    }

    /**
     * Sets the value of the samplingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSamplingRate(Integer value) {
        this.samplingRate = value;
    }

    /**
     * Gets the value of the encapType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncapType() {
        return encapType;
    }

    /**
     * Sets the value of the encapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncapType(String value) {
        this.encapType = value;
    }

    /**
     * Gets the value of the erspanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErspanId() {
        return erspanId;
    }

    /**
     * Sets the value of the erspanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErspanId(Integer value) {
        this.erspanId = value;
    }

    /**
     * Gets the value of the erspanCOS property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErspanCOS() {
        return erspanCOS;
    }

    /**
     * Sets the value of the erspanCOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErspanCOS(Integer value) {
        this.erspanCOS = value;
    }

    /**
     * Gets the value of the erspanGraNanosec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErspanGraNanosec() {
        return erspanGraNanosec;
    }

    /**
     * Sets the value of the erspanGraNanosec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErspanGraNanosec(Boolean value) {
        this.erspanGraNanosec = value;
    }

    /**
     * Gets the value of the netstack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetstack() {
        return netstack;
    }

    /**
     * Sets the value of the netstack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetstack(String value) {
        this.netstack = value;
    }

}
