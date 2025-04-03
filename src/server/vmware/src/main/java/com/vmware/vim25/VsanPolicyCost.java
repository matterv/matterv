
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanPolicyCost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanPolicyCost">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="changeDataSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="currentDataSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="tempDataSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="copyDataSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="changeFlashReadCacheSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="currentFlashReadCacheSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="currentDiskSpaceToAddressSpaceRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="diskSpaceToAddressSpaceRatio" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanPolicyCost", propOrder = {
    "changeDataSize",
    "currentDataSize",
    "tempDataSize",
    "copyDataSize",
    "changeFlashReadCacheSize",
    "currentFlashReadCacheSize",
    "currentDiskSpaceToAddressSpaceRatio",
    "diskSpaceToAddressSpaceRatio"
})
public class VsanPolicyCost
    extends DynamicData
{

    protected Long changeDataSize;
    protected Long currentDataSize;
    protected Long tempDataSize;
    protected Long copyDataSize;
    protected Long changeFlashReadCacheSize;
    protected Long currentFlashReadCacheSize;
    protected Float currentDiskSpaceToAddressSpaceRatio;
    protected Float diskSpaceToAddressSpaceRatio;

    /**
     * Gets the value of the changeDataSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangeDataSize() {
        return changeDataSize;
    }

    /**
     * Sets the value of the changeDataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangeDataSize(Long value) {
        this.changeDataSize = value;
    }

    /**
     * Gets the value of the currentDataSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentDataSize() {
        return currentDataSize;
    }

    /**
     * Sets the value of the currentDataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentDataSize(Long value) {
        this.currentDataSize = value;
    }

    /**
     * Gets the value of the tempDataSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTempDataSize() {
        return tempDataSize;
    }

    /**
     * Sets the value of the tempDataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTempDataSize(Long value) {
        this.tempDataSize = value;
    }

    /**
     * Gets the value of the copyDataSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCopyDataSize() {
        return copyDataSize;
    }

    /**
     * Sets the value of the copyDataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCopyDataSize(Long value) {
        this.copyDataSize = value;
    }

    /**
     * Gets the value of the changeFlashReadCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangeFlashReadCacheSize() {
        return changeFlashReadCacheSize;
    }

    /**
     * Sets the value of the changeFlashReadCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangeFlashReadCacheSize(Long value) {
        this.changeFlashReadCacheSize = value;
    }

    /**
     * Gets the value of the currentFlashReadCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentFlashReadCacheSize() {
        return currentFlashReadCacheSize;
    }

    /**
     * Sets the value of the currentFlashReadCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentFlashReadCacheSize(Long value) {
        this.currentFlashReadCacheSize = value;
    }

    /**
     * Gets the value of the currentDiskSpaceToAddressSpaceRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCurrentDiskSpaceToAddressSpaceRatio() {
        return currentDiskSpaceToAddressSpaceRatio;
    }

    /**
     * Sets the value of the currentDiskSpaceToAddressSpaceRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCurrentDiskSpaceToAddressSpaceRatio(Float value) {
        this.currentDiskSpaceToAddressSpaceRatio = value;
    }

    /**
     * Gets the value of the diskSpaceToAddressSpaceRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiskSpaceToAddressSpaceRatio() {
        return diskSpaceToAddressSpaceRatio;
    }

    /**
     * Sets the value of the diskSpaceToAddressSpaceRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiskSpaceToAddressSpaceRatio(Float value) {
        this.diskSpaceToAddressSpaceRatio = value;
    }

}
