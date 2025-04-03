
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVmfsSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVmfsSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="extent" type="{urn:internalvim25}HostScsiDiskPartition"/>
 *         <element name="blockSizeMb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="majorVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="volumeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="blockSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="unmapGranularity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="unmapPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="unmapBandwidthSpec" type="{urn:internalvim25}VmfsUnmapBandwidthSpec" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVmfsSpec", propOrder = {
    "extent",
    "blockSizeMb",
    "majorVersion",
    "volumeName",
    "blockSize",
    "unmapGranularity",
    "unmapPriority",
    "unmapBandwidthSpec"
})
public class HostVmfsSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostScsiDiskPartition extent;
    protected Integer blockSizeMb;
    protected int majorVersion;
    @XmlElement(required = true)
    protected String volumeName;
    protected Integer blockSize;
    protected Integer unmapGranularity;
    protected String unmapPriority;
    protected VmfsUnmapBandwidthSpec unmapBandwidthSpec;

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link HostScsiDiskPartition }
     *     
     */
    public HostScsiDiskPartition getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostScsiDiskPartition }
     *     
     */
    public void setExtent(HostScsiDiskPartition value) {
        this.extent = value;
    }

    /**
     * Gets the value of the blockSizeMb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlockSizeMb() {
        return blockSizeMb;
    }

    /**
     * Sets the value of the blockSizeMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlockSizeMb(Integer value) {
        this.blockSizeMb = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     */
    public int getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     */
    public void setMajorVersion(int value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the volumeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * Sets the value of the volumeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeName(String value) {
        this.volumeName = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlockSize(Integer value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the unmapGranularity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnmapGranularity() {
        return unmapGranularity;
    }

    /**
     * Sets the value of the unmapGranularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnmapGranularity(Integer value) {
        this.unmapGranularity = value;
    }

    /**
     * Gets the value of the unmapPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnmapPriority() {
        return unmapPriority;
    }

    /**
     * Sets the value of the unmapPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnmapPriority(String value) {
        this.unmapPriority = value;
    }

    /**
     * Gets the value of the unmapBandwidthSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VmfsUnmapBandwidthSpec }
     *     
     */
    public VmfsUnmapBandwidthSpec getUnmapBandwidthSpec() {
        return unmapBandwidthSpec;
    }

    /**
     * Sets the value of the unmapBandwidthSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmfsUnmapBandwidthSpec }
     *     
     */
    public void setUnmapBandwidthSpec(VmfsUnmapBandwidthSpec value) {
        this.unmapBandwidthSpec = value;
    }

}
