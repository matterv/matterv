
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemEventInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SystemEventInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="when" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="selType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sensorNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventInfo", propOrder = {
    "recordId",
    "when",
    "selType",
    "message",
    "sensorNumber"
})
public class SystemEventInfo
    extends DynamicData
{

    protected long recordId;
    @XmlElement(required = true)
    protected String when;
    protected long selType;
    @XmlElement(required = true)
    protected String message;
    protected long sensorNumber;

    /**
     * Gets the value of the recordId property.
     * 
     */
    public long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     */
    public void setRecordId(long value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhen(String value) {
        this.when = value;
    }

    /**
     * Gets the value of the selType property.
     * 
     */
    public long getSelType() {
        return selType;
    }

    /**
     * Sets the value of the selType property.
     * 
     */
    public void setSelType(long value) {
        this.selType = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the sensorNumber property.
     * 
     */
    public long getSensorNumber() {
        return sensorNumber;
    }

    /**
     * Sets the value of the sensorNumber property.
     * 
     */
    public void setSensorNumber(long value) {
        this.sensorNumber = value;
    }

}
