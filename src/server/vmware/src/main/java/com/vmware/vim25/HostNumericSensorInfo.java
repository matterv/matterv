
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNumericSensorInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNumericSensorInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="healthState" type="{urn:internalvim25}ElementDescription" minOccurs="0"/>
 *         <element name="currentReading" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="unitModifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="baseUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="rateUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sensorType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sensorNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fru" type="{urn:internalvim25}HostFru" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNumericSensorInfo", propOrder = {
    "name",
    "healthState",
    "currentReading",
    "unitModifier",
    "baseUnits",
    "rateUnits",
    "sensorType",
    "id",
    "sensorNumber",
    "timeStamp",
    "fru"
})
public class HostNumericSensorInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String name;
    protected ElementDescription healthState;
    protected long currentReading;
    protected int unitModifier;
    @XmlElement(required = true)
    protected String baseUnits;
    protected String rateUnits;
    @XmlElement(required = true)
    protected String sensorType;
    protected String id;
    protected Long sensorNumber;
    protected String timeStamp;
    protected HostFru fru;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the healthState property.
     * 
     * @return
     *     possible object is
     *     {@link ElementDescription }
     *     
     */
    public ElementDescription getHealthState() {
        return healthState;
    }

    /**
     * Sets the value of the healthState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementDescription }
     *     
     */
    public void setHealthState(ElementDescription value) {
        this.healthState = value;
    }

    /**
     * Gets the value of the currentReading property.
     * 
     */
    public long getCurrentReading() {
        return currentReading;
    }

    /**
     * Sets the value of the currentReading property.
     * 
     */
    public void setCurrentReading(long value) {
        this.currentReading = value;
    }

    /**
     * Gets the value of the unitModifier property.
     * 
     */
    public int getUnitModifier() {
        return unitModifier;
    }

    /**
     * Sets the value of the unitModifier property.
     * 
     */
    public void setUnitModifier(int value) {
        this.unitModifier = value;
    }

    /**
     * Gets the value of the baseUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUnits() {
        return baseUnits;
    }

    /**
     * Sets the value of the baseUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUnits(String value) {
        this.baseUnits = value;
    }

    /**
     * Gets the value of the rateUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateUnits() {
        return rateUnits;
    }

    /**
     * Sets the value of the rateUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateUnits(String value) {
        this.rateUnits = value;
    }

    /**
     * Gets the value of the sensorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * Sets the value of the sensorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorType(String value) {
        this.sensorType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the sensorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSensorNumber() {
        return sensorNumber;
    }

    /**
     * Sets the value of the sensorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSensorNumber(Long value) {
        this.sensorNumber = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the fru property.
     * 
     * @return
     *     possible object is
     *     {@link HostFru }
     *     
     */
    public HostFru getFru() {
        return fru;
    }

    /**
     * Sets the value of the fru property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFru }
     *     
     */
    public void setFru(HostFru value) {
        this.fru = value;
    }

}
