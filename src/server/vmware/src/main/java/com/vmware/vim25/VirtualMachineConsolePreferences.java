
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineConsolePreferences complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineConsolePreferences">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="powerOnWhenOpened" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="enterFullScreenOnPowerOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="closeOnPowerOffOrSuspend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConsolePreferences", propOrder = {
    "powerOnWhenOpened",
    "enterFullScreenOnPowerOn",
    "closeOnPowerOffOrSuspend"
})
public class VirtualMachineConsolePreferences
    extends DynamicData
{

    protected Boolean powerOnWhenOpened;
    protected Boolean enterFullScreenOnPowerOn;
    protected Boolean closeOnPowerOffOrSuspend;

    /**
     * Gets the value of the powerOnWhenOpened property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerOnWhenOpened() {
        return powerOnWhenOpened;
    }

    /**
     * Sets the value of the powerOnWhenOpened property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerOnWhenOpened(Boolean value) {
        this.powerOnWhenOpened = value;
    }

    /**
     * Gets the value of the enterFullScreenOnPowerOn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnterFullScreenOnPowerOn() {
        return enterFullScreenOnPowerOn;
    }

    /**
     * Sets the value of the enterFullScreenOnPowerOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnterFullScreenOnPowerOn(Boolean value) {
        this.enterFullScreenOnPowerOn = value;
    }

    /**
     * Gets the value of the closeOnPowerOffOrSuspend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCloseOnPowerOffOrSuspend() {
        return closeOnPowerOffOrSuspend;
    }

    /**
     * Sets the value of the closeOnPowerOffOrSuspend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloseOnPowerOffOrSuspend(Boolean value) {
        this.closeOnPowerOffOrSuspend = value;
    }

}
