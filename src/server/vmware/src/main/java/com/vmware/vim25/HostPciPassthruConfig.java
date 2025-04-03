
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPciPassthruConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPciPassthruConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="passthruEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="applyNow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "HostPciPassthruConfig", propOrder = {
    "id",
    "passthruEnabled",
    "applyNow",
    "hardwareLabel"
})
@XmlSeeAlso({
    HostSriovConfig.class
})
public class HostPciPassthruConfig
    extends DynamicData
{

    @XmlElement(required = true)
    protected String id;
    protected boolean passthruEnabled;
    protected Boolean applyNow;
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
     * Gets the value of the applyNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyNow() {
        return applyNow;
    }

    /**
     * Sets the value of the applyNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyNow(Boolean value) {
        this.applyNow = value;
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
