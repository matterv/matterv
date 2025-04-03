
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmfsDatastoreInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmfsDatastoreInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DatastoreInfo">
 *       <sequence>
 *         <element name="maxPhysicalRDMFileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="maxVirtualRDMFileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="vmfs" type="{urn:internalvim25}HostVmfsVolume" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreInfo", propOrder = {
    "maxPhysicalRDMFileSize",
    "maxVirtualRDMFileSize",
    "vmfs"
})
public class VmfsDatastoreInfo
    extends DatastoreInfo
{

    protected Long maxPhysicalRDMFileSize;
    protected Long maxVirtualRDMFileSize;
    protected HostVmfsVolume vmfs;

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
     * Gets the value of the vmfs property.
     * 
     * @return
     *     possible object is
     *     {@link HostVmfsVolume }
     *     
     */
    public HostVmfsVolume getVmfs() {
        return vmfs;
    }

    /**
     * Sets the value of the vmfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVmfsVolume }
     *     
     */
    public void setVmfs(HostVmfsVolume value) {
        this.vmfs = value;
    }

}
