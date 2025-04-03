
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeDiscoveryLogEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNvmeDiscoveryLogEntry">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="subnqn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="subsystemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="subsystemPortId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="controllerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="adminQueueMaxSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="transportParameters" type="{urn:internalvim25}HostNvmeTransportParameters"/>
 *         <element name="transportRequirements" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="connected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeDiscoveryLogEntry", propOrder = {
    "subnqn",
    "subsystemType",
    "subsystemPortId",
    "controllerId",
    "adminQueueMaxSize",
    "transportParameters",
    "transportRequirements",
    "connected"
})
public class HostNvmeDiscoveryLogEntry
    extends DynamicData
{

    @XmlElement(required = true)
    protected String subnqn;
    @XmlElement(required = true)
    protected String subsystemType;
    protected int subsystemPortId;
    protected int controllerId;
    protected int adminQueueMaxSize;
    @XmlElement(required = true)
    protected HostNvmeTransportParameters transportParameters;
    @XmlElement(required = true)
    protected String transportRequirements;
    protected boolean connected;

    /**
     * Gets the value of the subnqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnqn() {
        return subnqn;
    }

    /**
     * Sets the value of the subnqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnqn(String value) {
        this.subnqn = value;
    }

    /**
     * Gets the value of the subsystemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsystemType() {
        return subsystemType;
    }

    /**
     * Sets the value of the subsystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsystemType(String value) {
        this.subsystemType = value;
    }

    /**
     * Gets the value of the subsystemPortId property.
     * 
     */
    public int getSubsystemPortId() {
        return subsystemPortId;
    }

    /**
     * Sets the value of the subsystemPortId property.
     * 
     */
    public void setSubsystemPortId(int value) {
        this.subsystemPortId = value;
    }

    /**
     * Gets the value of the controllerId property.
     * 
     */
    public int getControllerId() {
        return controllerId;
    }

    /**
     * Sets the value of the controllerId property.
     * 
     */
    public void setControllerId(int value) {
        this.controllerId = value;
    }

    /**
     * Gets the value of the adminQueueMaxSize property.
     * 
     */
    public int getAdminQueueMaxSize() {
        return adminQueueMaxSize;
    }

    /**
     * Sets the value of the adminQueueMaxSize property.
     * 
     */
    public void setAdminQueueMaxSize(int value) {
        this.adminQueueMaxSize = value;
    }

    /**
     * Gets the value of the transportParameters property.
     * 
     * @return
     *     possible object is
     *     {@link HostNvmeTransportParameters }
     *     
     */
    public HostNvmeTransportParameters getTransportParameters() {
        return transportParameters;
    }

    /**
     * Sets the value of the transportParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNvmeTransportParameters }
     *     
     */
    public void setTransportParameters(HostNvmeTransportParameters value) {
        this.transportParameters = value;
    }

    /**
     * Gets the value of the transportRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportRequirements() {
        return transportRequirements;
    }

    /**
     * Sets the value of the transportRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportRequirements(String value) {
        this.transportRequirements = value;
    }

    /**
     * Gets the value of the connected property.
     * 
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     * 
     */
    public void setConnected(boolean value) {
        this.connected = value;
    }

}
