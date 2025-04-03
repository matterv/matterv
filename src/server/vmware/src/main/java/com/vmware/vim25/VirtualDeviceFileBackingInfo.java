
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceFileBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceFileBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingInfo">
 *       <sequence>
 *         <element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datastore" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="backingObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceFileBackingInfo", propOrder = {
    "fileName",
    "datastore",
    "backingObjectId"
})
@XmlSeeAlso({
    VirtualCdromIsoBackingInfo.class,
    VirtualDiskSparseVer1BackingInfo.class,
    VirtualDiskSparseVer2BackingInfo.class,
    VirtualDiskFlatVer1BackingInfo.class,
    VirtualDiskFlatVer2BackingInfo.class,
    VirtualDiskSeSparseBackingInfo.class,
    VirtualDiskRawDiskMappingVer1BackingInfo.class,
    VirtualDiskLocalPMemBackingInfo.class,
    VirtualFloppyImageBackingInfo.class,
    VirtualNVDIMMBackingInfo.class,
    VirtualParallelPortFileBackingInfo.class,
    VirtualSerialPortFileBackingInfo.class
})
public class VirtualDeviceFileBackingInfo
    extends VirtualDeviceBackingInfo
{

    @XmlElement(required = true)
    protected String fileName;
    protected ManagedObjectReference datastore;
    protected String backingObjectId;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatastore(ManagedObjectReference value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the backingObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingObjectId() {
        return backingObjectId;
    }

    /**
     * Sets the value of the backingObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingObjectId(String value) {
        this.backingObjectId = value;
    }

}
