
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskOptionVFlashCacheConfigOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskOptionVFlashCacheConfigOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="cacheConsistencyType" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="cacheMode" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="reservationInMB" type="{urn:internalvim25}LongOption"/>
 *         <element name="blockSizeInKB" type="{urn:internalvim25}LongOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskOptionVFlashCacheConfigOption", propOrder = {
    "cacheConsistencyType",
    "cacheMode",
    "reservationInMB",
    "blockSizeInKB"
})
public class VirtualDiskOptionVFlashCacheConfigOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected ChoiceOption cacheConsistencyType;
    @XmlElement(required = true)
    protected ChoiceOption cacheMode;
    @XmlElement(required = true)
    protected LongOption reservationInMB;
    @XmlElement(required = true)
    protected LongOption blockSizeInKB;

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
     * Gets the value of the reservationInMB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getReservationInMB() {
        return reservationInMB;
    }

    /**
     * Sets the value of the reservationInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setReservationInMB(LongOption value) {
        this.reservationInMB = value;
    }

    /**
     * Gets the value of the blockSizeInKB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getBlockSizeInKB() {
        return blockSizeInKB;
    }

    /**
     * Sets the value of the blockSizeInKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setBlockSizeInKB(LongOption value) {
        this.blockSizeInKB = value;
    }

}
