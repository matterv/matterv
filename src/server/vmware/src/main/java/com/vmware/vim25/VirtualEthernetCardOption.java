
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualEthernetCardOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualEthernetCardOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
 *       <sequence>
 *         <element name="supportedOUI" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="macType" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="wakeOnLanEnabled" type="{urn:internalvim25}BoolOption"/>
 *         <element name="vmDirectPathGen2Supported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="uptCompatibilityEnabled" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCardOption", propOrder = {
    "supportedOUI",
    "macType",
    "wakeOnLanEnabled",
    "vmDirectPathGen2Supported",
    "uptCompatibilityEnabled"
})
@XmlSeeAlso({
    VirtualE1000Option.class,
    VirtualE1000EOption.class,
    VirtualPCNet32Option.class,
    VirtualSriovEthernetCardOption.class,
    VirtualVmxnetOption.class
})
public class VirtualEthernetCardOption
    extends VirtualDeviceOption
{

    @XmlElement(required = true)
    protected ChoiceOption supportedOUI;
    @XmlElement(required = true)
    protected ChoiceOption macType;
    @XmlElement(required = true)
    protected BoolOption wakeOnLanEnabled;
    protected Boolean vmDirectPathGen2Supported;
    protected BoolOption uptCompatibilityEnabled;

    /**
     * Gets the value of the supportedOUI property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getSupportedOUI() {
        return supportedOUI;
    }

    /**
     * Sets the value of the supportedOUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setSupportedOUI(ChoiceOption value) {
        this.supportedOUI = value;
    }

    /**
     * Gets the value of the macType property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getMacType() {
        return macType;
    }

    /**
     * Sets the value of the macType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setMacType(ChoiceOption value) {
        this.macType = value;
    }

    /**
     * Gets the value of the wakeOnLanEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getWakeOnLanEnabled() {
        return wakeOnLanEnabled;
    }

    /**
     * Sets the value of the wakeOnLanEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setWakeOnLanEnabled(BoolOption value) {
        this.wakeOnLanEnabled = value;
    }

    /**
     * Gets the value of the vmDirectPathGen2Supported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmDirectPathGen2Supported() {
        return vmDirectPathGen2Supported;
    }

    /**
     * Sets the value of the vmDirectPathGen2Supported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmDirectPathGen2Supported(Boolean value) {
        this.vmDirectPathGen2Supported = value;
    }

    /**
     * Gets the value of the uptCompatibilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getUptCompatibilityEnabled() {
        return uptCompatibilityEnabled;
    }

    /**
     * Sets the value of the uptCompatibilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setUptCompatibilityEnabled(BoolOption value) {
        this.uptCompatibilityEnabled = value;
    }

}
