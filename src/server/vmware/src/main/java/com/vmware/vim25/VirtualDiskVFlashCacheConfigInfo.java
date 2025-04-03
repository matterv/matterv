
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskVFlashCacheConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskVFlashCacheConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vFlashModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="reservationInMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="cacheConsistencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cacheMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="blockSizeInKB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskVFlashCacheConfigInfo", propOrder = {
    "vFlashModule",
    "reservationInMB",
    "cacheConsistencyType",
    "cacheMode",
    "blockSizeInKB"
})
public class VirtualDiskVFlashCacheConfigInfo
    extends DynamicData
{

    protected String vFlashModule;
    protected Long reservationInMB;
    protected String cacheConsistencyType;
    protected String cacheMode;
    protected Long blockSizeInKB;

    /**
     * Gets the value of the vFlashModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVFlashModule() {
        return vFlashModule;
    }

    /**
     * Sets the value of the vFlashModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVFlashModule(String value) {
        this.vFlashModule = value;
    }

    /**
     * Gets the value of the reservationInMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservationInMB() {
        return reservationInMB;
    }

    /**
     * Sets the value of the reservationInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservationInMB(Long value) {
        this.reservationInMB = value;
    }

    /**
     * Gets the value of the cacheConsistencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheConsistencyType() {
        return cacheConsistencyType;
    }

    /**
     * Sets the value of the cacheConsistencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheConsistencyType(String value) {
        this.cacheConsistencyType = value;
    }

    /**
     * Gets the value of the cacheMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheMode() {
        return cacheMode;
    }

    /**
     * Sets the value of the cacheMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheMode(String value) {
        this.cacheMode = value;
    }

    /**
     * Gets the value of the blockSizeInKB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBlockSizeInKB() {
        return blockSizeInKB;
    }

    /**
     * Sets the value of the blockSizeInKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBlockSizeInKB(Long value) {
        this.blockSizeInKB = value;
    }

}
