
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostScsiDisk complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostScsiDisk">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ScsiLun">
 *       <sequence>
 *         <element name="capacity" type="{urn:internalvim25}HostDiskDimensionsLba"/>
 *         <element name="devicePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ssd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="localDisk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="physicalLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="emulatedDIXDIFEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vsanDiskInfo" type="{urn:internalvim25}VsanHostVsanDiskInfo" minOccurs="0"/>
 *         <element name="scsiDiskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="usedByMemoryTiering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiDisk", propOrder = {
    "capacity",
    "devicePath",
    "ssd",
    "localDisk",
    "physicalLocation",
    "emulatedDIXDIFEnabled",
    "vsanDiskInfo",
    "scsiDiskType",
    "usedByMemoryTiering"
})
public class HostScsiDisk
    extends ScsiLun
{

    @XmlElement(required = true)
    protected HostDiskDimensionsLba capacity;
    @XmlElement(required = true)
    protected String devicePath;
    protected Boolean ssd;
    protected Boolean localDisk;
    protected List<String> physicalLocation;
    protected Boolean emulatedDIXDIFEnabled;
    protected VsanHostVsanDiskInfo vsanDiskInfo;
    protected String scsiDiskType;
    protected Boolean usedByMemoryTiering;

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link HostDiskDimensionsLba }
     *     
     */
    public HostDiskDimensionsLba getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDiskDimensionsLba }
     *     
     */
    public void setCapacity(HostDiskDimensionsLba value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the devicePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePath() {
        return devicePath;
    }

    /**
     * Sets the value of the devicePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePath(String value) {
        this.devicePath = value;
    }

    /**
     * Gets the value of the ssd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSsd() {
        return ssd;
    }

    /**
     * Sets the value of the ssd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSsd(Boolean value) {
        this.ssd = value;
    }

    /**
     * Gets the value of the localDisk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalDisk() {
        return localDisk;
    }

    /**
     * Sets the value of the localDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalDisk(Boolean value) {
        this.localDisk = value;
    }

    /**
     * Gets the value of the physicalLocation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalLocation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPhysicalLocation().add(newItem);
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
     *     The value of the physicalLocation property.
     */
    public List<String> getPhysicalLocation() {
        if (physicalLocation == null) {
            physicalLocation = new ArrayList<>();
        }
        return this.physicalLocation;
    }

    /**
     * Gets the value of the emulatedDIXDIFEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmulatedDIXDIFEnabled() {
        return emulatedDIXDIFEnabled;
    }

    /**
     * Sets the value of the emulatedDIXDIFEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmulatedDIXDIFEnabled(Boolean value) {
        this.emulatedDIXDIFEnabled = value;
    }

    /**
     * Gets the value of the vsanDiskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostVsanDiskInfo }
     *     
     */
    public VsanHostVsanDiskInfo getVsanDiskInfo() {
        return vsanDiskInfo;
    }

    /**
     * Sets the value of the vsanDiskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostVsanDiskInfo }
     *     
     */
    public void setVsanDiskInfo(VsanHostVsanDiskInfo value) {
        this.vsanDiskInfo = value;
    }

    /**
     * Gets the value of the scsiDiskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScsiDiskType() {
        return scsiDiskType;
    }

    /**
     * Sets the value of the scsiDiskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScsiDiskType(String value) {
        this.scsiDiskType = value;
    }

    /**
     * Gets the value of the usedByMemoryTiering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsedByMemoryTiering() {
        return usedByMemoryTiering;
    }

    /**
     * Sets the value of the usedByMemoryTiering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedByMemoryTiering(Boolean value) {
        this.usedByMemoryTiering = value;
    }

}
