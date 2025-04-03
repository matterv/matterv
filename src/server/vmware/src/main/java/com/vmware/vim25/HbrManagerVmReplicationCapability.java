
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HbrManagerVmReplicationCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HbrManagerVmReplicationCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="supportedQuiesceMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="compressionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="maxSupportedSourceDiskCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="minRpo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="fault" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HbrManagerVmReplicationCapability", propOrder = {
    "vm",
    "supportedQuiesceMode",
    "compressionSupported",
    "maxSupportedSourceDiskCapacity",
    "minRpo",
    "fault"
})
public class HbrManagerVmReplicationCapability
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference vm;
    @XmlElement(required = true)
    protected String supportedQuiesceMode;
    protected boolean compressionSupported;
    protected long maxSupportedSourceDiskCapacity;
    protected Long minRpo;
    protected LocalizedMethodFault fault;

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVm(ManagedObjectReference value) {
        this.vm = value;
    }

    /**
     * Gets the value of the supportedQuiesceMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedQuiesceMode() {
        return supportedQuiesceMode;
    }

    /**
     * Sets the value of the supportedQuiesceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedQuiesceMode(String value) {
        this.supportedQuiesceMode = value;
    }

    /**
     * Gets the value of the compressionSupported property.
     * 
     */
    public boolean isCompressionSupported() {
        return compressionSupported;
    }

    /**
     * Sets the value of the compressionSupported property.
     * 
     */
    public void setCompressionSupported(boolean value) {
        this.compressionSupported = value;
    }

    /**
     * Gets the value of the maxSupportedSourceDiskCapacity property.
     * 
     */
    public long getMaxSupportedSourceDiskCapacity() {
        return maxSupportedSourceDiskCapacity;
    }

    /**
     * Sets the value of the maxSupportedSourceDiskCapacity property.
     * 
     */
    public void setMaxSupportedSourceDiskCapacity(long value) {
        this.maxSupportedSourceDiskCapacity = value;
    }

    /**
     * Gets the value of the minRpo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinRpo() {
        return minRpo;
    }

    /**
     * Sets the value of the minRpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinRpo(Long value) {
        this.minRpo = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setFault(LocalizedMethodFault value) {
        this.fault = value;
    }

}
