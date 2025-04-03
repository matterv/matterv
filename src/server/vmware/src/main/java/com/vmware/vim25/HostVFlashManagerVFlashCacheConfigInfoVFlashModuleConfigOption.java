
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vFlashModule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vFlashModuleVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="minSupportedModuleVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cacheConsistencyType" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="cacheMode" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="blockSizeInKBOption" type="{urn:internalvim25}LongOption"/>
 *         <element name="reservationInMBOption" type="{urn:internalvim25}LongOption"/>
 *         <element name="maxDiskSizeInKB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption", propOrder = {
    "vFlashModule",
    "vFlashModuleVersion",
    "minSupportedModuleVersion",
    "cacheConsistencyType",
    "cacheMode",
    "blockSizeInKBOption",
    "reservationInMBOption",
    "maxDiskSizeInKB"
})
public class HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected String vFlashModule;
    @XmlElement(required = true)
    protected String vFlashModuleVersion;
    @XmlElement(required = true)
    protected String minSupportedModuleVersion;
    @XmlElement(required = true)
    protected ChoiceOption cacheConsistencyType;
    @XmlElement(required = true)
    protected ChoiceOption cacheMode;
    @XmlElement(required = true)
    protected LongOption blockSizeInKBOption;
    @XmlElement(required = true)
    protected LongOption reservationInMBOption;
    protected long maxDiskSizeInKB;

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
     * Gets the value of the vFlashModuleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVFlashModuleVersion() {
        return vFlashModuleVersion;
    }

    /**
     * Sets the value of the vFlashModuleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVFlashModuleVersion(String value) {
        this.vFlashModuleVersion = value;
    }

    /**
     * Gets the value of the minSupportedModuleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinSupportedModuleVersion() {
        return minSupportedModuleVersion;
    }

    /**
     * Sets the value of the minSupportedModuleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinSupportedModuleVersion(String value) {
        this.minSupportedModuleVersion = value;
    }

    /**
     * Gets the value of the cacheConsistencyType property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getCacheConsistencyType() {
        return cacheConsistencyType;
    }

    /**
     * Sets the value of the cacheConsistencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setCacheConsistencyType(ChoiceOption value) {
        this.cacheConsistencyType = value;
    }

    /**
     * Gets the value of the cacheMode property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getCacheMode() {
        return cacheMode;
    }

    /**
     * Sets the value of the cacheMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setCacheMode(ChoiceOption value) {
        this.cacheMode = value;
    }

    /**
     * Gets the value of the blockSizeInKBOption property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getBlockSizeInKBOption() {
        return blockSizeInKBOption;
    }

    /**
     * Sets the value of the blockSizeInKBOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setBlockSizeInKBOption(LongOption value) {
        this.blockSizeInKBOption = value;
    }

    /**
     * Gets the value of the reservationInMBOption property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getReservationInMBOption() {
        return reservationInMBOption;
    }

    /**
     * Sets the value of the reservationInMBOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setReservationInMBOption(LongOption value) {
        this.reservationInMBOption = value;
    }

    /**
     * Gets the value of the maxDiskSizeInKB property.
     * 
     */
    public long getMaxDiskSizeInKB() {
        return maxDiskSizeInKB;
    }

    /**
     * Sets the value of the maxDiskSizeInKB property.
     * 
     */
    public void setMaxDiskSizeInKB(long value) {
        this.maxDiskSizeInKB = value;
    }

}
