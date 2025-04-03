
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="connectOption" type="{urn:internalvim25}VirtualDeviceConnectOption" minOccurs="0"/>
 *         <element name="busSlotOption" type="{urn:internalvim25}VirtualDeviceBusSlotOption" minOccurs="0"/>
 *         <element name="controllerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="autoAssignController" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="backingOption" type="{urn:internalvim25}VirtualDeviceBackingOption" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="defaultBackingOptionIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="licensingLimit" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="plugAndPlay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hotRemoveSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="numaSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceOption", propOrder = {
    "type",
    "connectOption",
    "busSlotOption",
    "controllerType",
    "autoAssignController",
    "backingOption",
    "defaultBackingOptionIndex",
    "licensingLimit",
    "deprecated",
    "plugAndPlay",
    "hotRemoveSupported",
    "numaSupported"
})
@XmlSeeAlso({
    VirtualCdromOption.class,
    VirtualDiskOption.class,
    VirtualFloppyOption.class,
    VirtualKeyboardOption.class,
    VirtualNVDIMMOption.class,
    VirtualPCIPassthroughOption.class,
    VirtualParallelPortOption.class,
    VirtualPointingDeviceOption.class,
    VirtualPrecisionClockOption.class,
    VirtualSCSIPassthroughOption.class,
    VirtualSerialPortOption.class,
    VirtualSoundCardOption.class,
    VirtualTPMOption.class,
    VirtualUSBOption.class,
    VirtualControllerOption.class,
    VirtualMachineVMCIDeviceOption.class,
    VirtualVMIROMOption.class,
    VirtualVideoCardOption.class,
    VirtualEthernetCardOption.class,
    VirtualWDTOption.class
})
public class VirtualDeviceOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected String type;
    protected VirtualDeviceConnectOption connectOption;
    protected VirtualDeviceBusSlotOption busSlotOption;
    protected String controllerType;
    protected BoolOption autoAssignController;
    protected List<VirtualDeviceBackingOption> backingOption;
    protected Integer defaultBackingOptionIndex;
    protected List<String> licensingLimit;
    protected boolean deprecated;
    protected boolean plugAndPlay;
    protected Boolean hotRemoveSupported;
    protected Boolean numaSupported;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the connectOption property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceConnectOption }
     *     
     */
    public VirtualDeviceConnectOption getConnectOption() {
        return connectOption;
    }

    /**
     * Sets the value of the connectOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceConnectOption }
     *     
     */
    public void setConnectOption(VirtualDeviceConnectOption value) {
        this.connectOption = value;
    }

    /**
     * Gets the value of the busSlotOption property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceBusSlotOption }
     *     
     */
    public VirtualDeviceBusSlotOption getBusSlotOption() {
        return busSlotOption;
    }

    /**
     * Sets the value of the busSlotOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceBusSlotOption }
     *     
     */
    public void setBusSlotOption(VirtualDeviceBusSlotOption value) {
        this.busSlotOption = value;
    }

    /**
     * Gets the value of the controllerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerType() {
        return controllerType;
    }

    /**
     * Sets the value of the controllerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerType(String value) {
        this.controllerType = value;
    }

    /**
     * Gets the value of the autoAssignController property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getAutoAssignController() {
        return autoAssignController;
    }

    /**
     * Sets the value of the autoAssignController property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setAutoAssignController(BoolOption value) {
        this.autoAssignController = value;
    }

    /**
     * Gets the value of the backingOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backingOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBackingOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualDeviceBackingOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the backingOption property.
     */
    public List<VirtualDeviceBackingOption> getBackingOption() {
        if (backingOption == null) {
            backingOption = new ArrayList<>();
        }
        return this.backingOption;
    }

    /**
     * Gets the value of the defaultBackingOptionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultBackingOptionIndex() {
        return defaultBackingOptionIndex;
    }

    /**
     * Sets the value of the defaultBackingOptionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultBackingOptionIndex(Integer value) {
        this.defaultBackingOptionIndex = value;
    }

    /**
     * Gets the value of the licensingLimit property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licensingLimit property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLicensingLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the licensingLimit property.
     */
    public List<String> getLicensingLimit() {
        if (licensingLimit == null) {
            licensingLimit = new ArrayList<>();
        }
        return this.licensingLimit;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     */
    public boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Sets the value of the deprecated property.
     * 
     */
    public void setDeprecated(boolean value) {
        this.deprecated = value;
    }

    /**
     * Gets the value of the plugAndPlay property.
     * 
     */
    public boolean isPlugAndPlay() {
        return plugAndPlay;
    }

    /**
     * Sets the value of the plugAndPlay property.
     * 
     */
    public void setPlugAndPlay(boolean value) {
        this.plugAndPlay = value;
    }

    /**
     * Gets the value of the hotRemoveSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotRemoveSupported() {
        return hotRemoveSupported;
    }

    /**
     * Sets the value of the hotRemoveSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotRemoveSupported(Boolean value) {
        this.hotRemoveSupported = value;
    }

    /**
     * Gets the value of the numaSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumaSupported() {
        return numaSupported;
    }

    /**
     * Sets the value of the numaSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumaSupported(Boolean value) {
        this.numaSupported = value;
    }

}
