
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalNicConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PhysicalNicConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="spec" type="{urn:internalvim25}PhysicalNicSpec"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicConfig", propOrder = {
    "device",
    "spec"
})
public class PhysicalNicConfig
    extends DynamicData
{

    @XmlElement(required = true)
    protected String device;
    @XmlElement(required = true)
    protected PhysicalNicSpec spec;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalNicSpec }
     *     
     */
    public PhysicalNicSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalNicSpec }
     *     
     */
    public void setSpec(PhysicalNicSpec value) {
        this.spec = value;
    }

}
