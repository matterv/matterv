
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeController complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNvmeController">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="controllerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="subnqn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="associatedAdapter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="transportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fusedOperationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="numberOfQueues" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="queueSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="attachedNamespace" type="{urn:internalvim25}HostNvmeNamespace" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="firmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeController", propOrder = {
    "key",
    "controllerNumber",
    "subnqn",
    "name",
    "associatedAdapter",
    "transportType",
    "fusedOperationSupported",
    "numberOfQueues",
    "queueSize",
    "attachedNamespace",
    "vendorId",
    "model",
    "serialNumber",
    "firmwareVersion"
})
public class HostNvmeController
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    protected int controllerNumber;
    @XmlElement(required = true)
    protected String subnqn;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String associatedAdapter;
    @XmlElement(required = true)
    protected String transportType;
    protected boolean fusedOperationSupported;
    protected int numberOfQueues;
    protected int queueSize;
    protected List<HostNvmeNamespace> attachedNamespace;
    protected String vendorId;
    protected String model;
    protected String serialNumber;
    protected String firmwareVersion;

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
     * Gets the value of the controllerNumber property.
     * 
     */
    public int getControllerNumber() {
        return controllerNumber;
    }

    /**
     * Sets the value of the controllerNumber property.
     * 
     */
    public void setControllerNumber(int value) {
        this.controllerNumber = value;
    }

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
     * Gets the value of the associatedAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedAdapter() {
        return associatedAdapter;
    }

    /**
     * Sets the value of the associatedAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedAdapter(String value) {
        this.associatedAdapter = value;
    }

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportType(String value) {
        this.transportType = value;
    }

    /**
     * Gets the value of the fusedOperationSupported property.
     * 
     */
    public boolean isFusedOperationSupported() {
        return fusedOperationSupported;
    }

    /**
     * Sets the value of the fusedOperationSupported property.
     * 
     */
    public void setFusedOperationSupported(boolean value) {
        this.fusedOperationSupported = value;
    }

    /**
     * Gets the value of the numberOfQueues property.
     * 
     */
    public int getNumberOfQueues() {
        return numberOfQueues;
    }

    /**
     * Sets the value of the numberOfQueues property.
     * 
     */
    public void setNumberOfQueues(int value) {
        this.numberOfQueues = value;
    }

    /**
     * Gets the value of the queueSize property.
     * 
     */
    public int getQueueSize() {
        return queueSize;
    }

    /**
     * Sets the value of the queueSize property.
     * 
     */
    public void setQueueSize(int value) {
        this.queueSize = value;
    }

    /**
     * Gets the value of the attachedNamespace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedNamespace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachedNamespace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNvmeNamespace }
     * </p>
     * 
     * 
     * @return
     *     The value of the attachedNamespace property.
     */
    public List<HostNvmeNamespace> getAttachedNamespace() {
        if (attachedNamespace == null) {
            attachedNamespace = new ArrayList<>();
        }
        return this.attachedNamespace;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
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
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

}
