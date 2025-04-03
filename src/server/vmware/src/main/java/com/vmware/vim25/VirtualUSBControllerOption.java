
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualUSBControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualUSBControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualControllerOption">
 *       <sequence>
 *         <element name="autoConnectDevices" type="{urn:internalvim25}BoolOption"/>
 *         <element name="ehciSupported" type="{urn:internalvim25}BoolOption"/>
 *         <element name="supportedSpeeds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualUSBControllerOption", propOrder = {
    "autoConnectDevices",
    "ehciSupported",
    "supportedSpeeds"
})
public class VirtualUSBControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected BoolOption autoConnectDevices;
    @XmlElement(required = true)
    protected BoolOption ehciSupported;
    protected List<String> supportedSpeeds;

    /**
     * Gets the value of the autoConnectDevices property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getAutoConnectDevices() {
        return autoConnectDevices;
    }

    /**
     * Sets the value of the autoConnectDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setAutoConnectDevices(BoolOption value) {
        this.autoConnectDevices = value;
    }

    /**
     * Gets the value of the ehciSupported property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getEhciSupported() {
        return ehciSupported;
    }

    /**
     * Sets the value of the ehciSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setEhciSupported(BoolOption value) {
        this.ehciSupported = value;
    }

    /**
     * Gets the value of the supportedSpeeds property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedSpeeds property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedSpeeds().add(newItem);
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
     *     The value of the supportedSpeeds property.
     */
    public List<String> getSupportedSpeeds() {
        if (supportedSpeeds == null) {
            supportedSpeeds = new ArrayList<>();
        }
        return this.supportedSpeeds;
    }

}
