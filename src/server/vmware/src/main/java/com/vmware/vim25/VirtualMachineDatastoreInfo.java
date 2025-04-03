
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineDatastoreInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineDatastoreInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="datastore" type="{urn:internalvim25}DatastoreSummary"/>
 *         <element name="capability" type="{urn:internalvim25}DatastoreCapability"/>
 *         <element name="maxFileSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="maxVirtualDiskCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="maxPhysicalRDMFileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="maxVirtualRDMFileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vStorageSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDatastoreInfo", propOrder = {
    "datastore",
    "capability",
    "maxFileSize",
    "maxVirtualDiskCapacity",
    "maxPhysicalRDMFileSize",
    "maxVirtualRDMFileSize",
    "mode",
    "vStorageSupport"
})
public class VirtualMachineDatastoreInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected DatastoreSummary datastore;
    @XmlElement(required = true)
    protected DatastoreCapability capability;
    protected long maxFileSize;
    protected Long maxVirtualDiskCapacity;
    protected Long maxPhysicalRDMFileSize;
    protected Long maxVirtualRDMFileSize;
    @XmlElement(required = true)
    protected String mode;
    protected String vStorageSupport;

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreSummary }
     *     
     */
    public DatastoreSummary getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreSummary }
     *     
     */
    public void setDatastore(DatastoreSummary value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the capability property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreCapability }
     *     
     */
    public DatastoreCapability getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreCapability }
     *     
     */
    public void setCapability(DatastoreCapability value) {
        this.capability = value;
    }

    /**
     * Gets the value of the maxFileSize property.
     * 
     */
    public long getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * Sets the value of the maxFileSize property.
     * 
     */
    public void setMaxFileSize(long value) {
        this.maxFileSize = value;
    }

    /**
     * Gets the value of the maxVirtualDiskCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxVirtualDiskCapacity() {
        return maxVirtualDiskCapacity;
    }

    /**
     * Sets the value of the maxVirtualDiskCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxVirtualDiskCapacity(Long value) {
        this.maxVirtualDiskCapacity = value;
    }

    /**
     * Gets the value of the maxPhysicalRDMFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxPhysicalRDMFileSize() {
        return maxPhysicalRDMFileSize;
    }

    /**
     * Sets the value of the maxPhysicalRDMFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPhysicalRDMFileSize(Long value) {
        this.maxPhysicalRDMFileSize = value;
    }

    /**
     * Gets the value of the maxVirtualRDMFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxVirtualRDMFileSize() {
        return maxVirtualRDMFileSize;
    }

    /**
     * Sets the value of the maxVirtualRDMFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxVirtualRDMFileSize(Long value) {
        this.maxVirtualRDMFileSize = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
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

}
