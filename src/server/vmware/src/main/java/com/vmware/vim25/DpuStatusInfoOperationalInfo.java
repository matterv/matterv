
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DpuStatusInfoOperationalInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DpuStatusInfoOperationalInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="sensorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="healthState" type="{urn:internalvim25}ElementDescription" minOccurs="0"/>
 *         <element name="reading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DpuStatusInfoOperationalInfo", propOrder = {
    "sensorId",
    "healthState",
    "reading",
    "units",
    "timeStamp"
})
public class DpuStatusInfoOperationalInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String sensorId;
    protected ElementDescription healthState;
    @XmlElement(required = true)
    protected String reading;
    protected String units;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the sensorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorId() {
        return sensorId;
    }

    /**
     * Sets the value of the sensorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorId(String value) {
        this.sensorId = value;
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
     * Gets the value of the reading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReading() {
        return reading;
    }

    /**
     * Sets the value of the reading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReading(String value) {
        this.reading = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
