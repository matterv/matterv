
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageIORMConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageIORMConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="congestionThresholdMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="congestionThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="percentOfPeakThroughput" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="statsCollectionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="reservationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="statsAggregationDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="reservableIopsThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageIORMConfigSpec", propOrder = {
    "enabled",
    "congestionThresholdMode",
    "congestionThreshold",
    "percentOfPeakThroughput",
    "statsCollectionEnabled",
    "reservationEnabled",
    "statsAggregationDisabled",
    "reservableIopsThreshold"
})
public class StorageIORMConfigSpec
    extends DynamicData
{

    protected Boolean enabled;
    protected String congestionThresholdMode;
    protected Integer congestionThreshold;
    protected Integer percentOfPeakThroughput;
    protected Boolean statsCollectionEnabled;
    protected Boolean reservationEnabled;
    protected Boolean statsAggregationDisabled;
    protected Integer reservableIopsThreshold;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the congestionThresholdMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongestionThresholdMode() {
        return congestionThresholdMode;
    }

    /**
     * Sets the value of the congestionThresholdMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongestionThresholdMode(String value) {
        this.congestionThresholdMode = value;
    }

    /**
     * Gets the value of the congestionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCongestionThreshold() {
        return congestionThreshold;
    }

    /**
     * Sets the value of the congestionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCongestionThreshold(Integer value) {
        this.congestionThreshold = value;
    }

    /**
     * Gets the value of the percentOfPeakThroughput property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentOfPeakThroughput() {
        return percentOfPeakThroughput;
    }

    /**
     * Sets the value of the percentOfPeakThroughput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentOfPeakThroughput(Integer value) {
        this.percentOfPeakThroughput = value;
    }

    /**
     * Gets the value of the statsCollectionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatsCollectionEnabled() {
        return statsCollectionEnabled;
    }

    /**
     * Sets the value of the statsCollectionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatsCollectionEnabled(Boolean value) {
        this.statsCollectionEnabled = value;
    }

    /**
     * Gets the value of the reservationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservationEnabled() {
        return reservationEnabled;
    }

    /**
     * Sets the value of the reservationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReservationEnabled(Boolean value) {
        this.reservationEnabled = value;
    }

    /**
     * Gets the value of the statsAggregationDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatsAggregationDisabled() {
        return statsAggregationDisabled;
    }

    /**
     * Sets the value of the statsAggregationDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatsAggregationDisabled(Boolean value) {
        this.statsAggregationDisabled = value;
    }

    /**
     * Gets the value of the reservableIopsThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReservableIopsThreshold() {
        return reservableIopsThreshold;
    }

    /**
     * Sets the value of the reservableIopsThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReservableIopsThreshold(Integer value) {
        this.reservableIopsThreshold = value;
    }

}
