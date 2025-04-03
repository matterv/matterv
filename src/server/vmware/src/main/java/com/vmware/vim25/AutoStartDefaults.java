
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoStartDefaults complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AutoStartDefaults">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="startDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="stopDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="waitForHeartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="stopAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoStartDefaults", propOrder = {
    "enabled",
    "startDelay",
    "stopDelay",
    "waitForHeartbeat",
    "stopAction"
})
public class AutoStartDefaults
    extends DynamicData
{

    protected Boolean enabled;
    protected Integer startDelay;
    protected Integer stopDelay;
    protected Boolean waitForHeartbeat;
    protected String stopAction;

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
     * Gets the value of the startDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartDelay() {
        return startDelay;
    }

    /**
     * Sets the value of the startDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartDelay(Integer value) {
        this.startDelay = value;
    }

    /**
     * Gets the value of the stopDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStopDelay() {
        return stopDelay;
    }

    /**
     * Sets the value of the stopDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStopDelay(Integer value) {
        this.stopDelay = value;
    }

    /**
     * Gets the value of the waitForHeartbeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitForHeartbeat() {
        return waitForHeartbeat;
    }

    /**
     * Sets the value of the waitForHeartbeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitForHeartbeat(Boolean value) {
        this.waitForHeartbeat = value;
    }

    /**
     * Gets the value of the stopAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopAction() {
        return stopAction;
    }

    /**
     * Sets the value of the stopAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopAction(String value) {
        this.stopAction = value;
    }

}
