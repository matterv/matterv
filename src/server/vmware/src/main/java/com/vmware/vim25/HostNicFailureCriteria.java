
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNicFailureCriteria complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNicFailureCriteria">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="checkSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="speed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="checkDuplex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="fullDuplex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="checkErrorPercent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="percentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="checkBeacon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNicFailureCriteria", propOrder = {
    "checkSpeed",
    "speed",
    "checkDuplex",
    "fullDuplex",
    "checkErrorPercent",
    "percentage",
    "checkBeacon"
})
public class HostNicFailureCriteria
    extends DynamicData
{

    protected String checkSpeed;
    protected Integer speed;
    protected Boolean checkDuplex;
    protected Boolean fullDuplex;
    protected Boolean checkErrorPercent;
    protected Integer percentage;
    protected Boolean checkBeacon;

    /**
     * Gets the value of the checkSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckSpeed() {
        return checkSpeed;
    }

    /**
     * Sets the value of the checkSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckSpeed(String value) {
        this.checkSpeed = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeed(Integer value) {
        this.speed = value;
    }

    /**
     * Gets the value of the checkDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckDuplex() {
        return checkDuplex;
    }

    /**
     * Sets the value of the checkDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckDuplex(Boolean value) {
        this.checkDuplex = value;
    }

    /**
     * Gets the value of the fullDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullDuplex() {
        return fullDuplex;
    }

    /**
     * Sets the value of the fullDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullDuplex(Boolean value) {
        this.fullDuplex = value;
    }

    /**
     * Gets the value of the checkErrorPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckErrorPercent() {
        return checkErrorPercent;
    }

    /**
     * Sets the value of the checkErrorPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckErrorPercent(Boolean value) {
        this.checkErrorPercent = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentage(Integer value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the checkBeacon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBeacon() {
        return checkBeacon;
    }

    /**
     * Sets the value of the checkBeacon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBeacon(Boolean value) {
        this.checkBeacon = value;
    }

}
