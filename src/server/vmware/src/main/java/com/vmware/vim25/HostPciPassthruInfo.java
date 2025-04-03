
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPciPassthruInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPciPassthruInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dependentDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="passthruEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="passthruCapable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="passthruActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hardwareLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPciPassthruInfo", propOrder = {
    "id",
    "dependentDevice",
    "passthruEnabled",
    "passthruCapable",
    "passthruActive",
    "hardwareLabel"
})
@XmlSeeAlso({
    HostSriovInfo.class
})
public class HostPciPassthruInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String dependentDevice;
    protected boolean passthruEnabled;
    protected boolean passthruCapable;
    protected boolean passthruActive;
    protected String hardwareLabel;

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
     * Gets the value of the dependentDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentDevice() {
        return dependentDevice;
    }

    /**
     * Sets the value of the dependentDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentDevice(String value) {
        this.dependentDevice = value;
    }

    /**
     * Gets the value of the passthruEnabled property.
     * 
     */
    public boolean isPassthruEnabled() {
        return passthruEnabled;
    }

    /**
     * Sets the value of the passthruEnabled property.
     * 
     */
    public void setPassthruEnabled(boolean value) {
        this.passthruEnabled = value;
    }

    /**
     * Gets the value of the passthruCapable property.
     * 
     */
    public boolean isPassthruCapable() {
        return passthruCapable;
    }

    /**
     * Sets the value of the passthruCapable property.
     * 
     */
    public void setPassthruCapable(boolean value) {
        this.passthruCapable = value;
    }

    /**
     * Gets the value of the passthruActive property.
     * 
     */
    public boolean isPassthruActive() {
        return passthruActive;
    }

    /**
     * Sets the value of the passthruActive property.
     * 
     */
    public void setPassthruActive(boolean value) {
        this.passthruActive = value;
    }

    /**
     * Gets the value of the hardwareLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareLabel() {
        return hardwareLabel;
    }

    /**
     * Sets the value of the hardwareLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareLabel(String value) {
        this.hardwareLabel = value;
    }

}
