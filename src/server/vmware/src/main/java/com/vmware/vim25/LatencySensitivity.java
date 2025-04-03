
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LatencySensitivity complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LatencySensitivity">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="level" type="{urn:internalvim25}LatencySensitivitySensitivityLevel"/>
 *         <element name="sensitivity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatencySensitivity", propOrder = {
    "level",
    "sensitivity"
})
public class LatencySensitivity
    extends DynamicData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LatencySensitivitySensitivityLevel level;
    protected Integer sensitivity;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link LatencySensitivitySensitivityLevel }
     *     
     */
    public LatencySensitivitySensitivityLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatencySensitivitySensitivityLevel }
     *     
     */
    public void setLevel(LatencySensitivitySensitivityLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSensitivity(Integer value) {
        this.sensitivity = value;
    }

}
