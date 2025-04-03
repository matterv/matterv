
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageIORMConfigOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageIORMConfigOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabledOption" type="{urn:internalvim25}BoolOption"/>
 *         <element name="congestionThresholdOption" type="{urn:internalvim25}IntOption"/>
 *         <element name="statsCollectionEnabledOption" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="reservationEnabledOption" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageIORMConfigOption", propOrder = {
    "enabledOption",
    "congestionThresholdOption",
    "statsCollectionEnabledOption",
    "reservationEnabledOption"
})
public class StorageIORMConfigOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected BoolOption enabledOption;
    @XmlElement(required = true)
    protected IntOption congestionThresholdOption;
    protected BoolOption statsCollectionEnabledOption;
    protected BoolOption reservationEnabledOption;

    /**
     * Gets the value of the enabledOption property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getEnabledOption() {
        return enabledOption;
    }

    /**
     * Sets the value of the enabledOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setEnabledOption(BoolOption value) {
        this.enabledOption = value;
    }

    /**
     * Gets the value of the congestionThresholdOption property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getCongestionThresholdOption() {
        return congestionThresholdOption;
    }

    /**
     * Sets the value of the congestionThresholdOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setCongestionThresholdOption(IntOption value) {
        this.congestionThresholdOption = value;
    }

    /**
     * Gets the value of the statsCollectionEnabledOption property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getStatsCollectionEnabledOption() {
        return statsCollectionEnabledOption;
    }

    /**
     * Sets the value of the statsCollectionEnabledOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setStatsCollectionEnabledOption(BoolOption value) {
        this.statsCollectionEnabledOption = value;
    }

    /**
     * Gets the value of the reservationEnabledOption property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getReservationEnabledOption() {
        return reservationEnabledOption;
    }

    /**
     * Sets the value of the reservationEnabledOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setReservationEnabledOption(BoolOption value) {
        this.reservationEnabledOption = value;
    }

}
