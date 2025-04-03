
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFileSystemMountInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFileSystemMountInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="mountInfo" type="{urn:internalvim25}HostMountInfo"/>
 *         <element name="volume" type="{urn:internalvim25}HostFileSystemVolume"/>
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
@XmlType(name = "HostFileSystemMountInfo", propOrder = {
    "mountInfo",
    "volume",
    "vStorageSupport"
})
public class HostFileSystemMountInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostMountInfo mountInfo;
    @XmlElement(required = true)
    protected HostFileSystemVolume volume;
    protected String vStorageSupport;

    /**
     * Gets the value of the mountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostMountInfo }
     *     
     */
    public HostMountInfo getMountInfo() {
        return mountInfo;
    }

    /**
     * Sets the value of the mountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMountInfo }
     *     
     */
    public void setMountInfo(HostMountInfo value) {
        this.mountInfo = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link HostFileSystemVolume }
     *     
     */
    public HostFileSystemVolume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFileSystemVolume }
     *     
     */
    public void setVolume(HostFileSystemVolume value) {
        this.volume = value;
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
