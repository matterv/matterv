
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OptionType">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="valueIsReadonly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionType", propOrder = {
    "valueIsReadonly"
})
@XmlSeeAlso({
    BoolOption.class,
    ChoiceOption.class,
    FloatOption.class,
    IntOption.class,
    LongOption.class,
    StringOption.class
})
public class OptionType
    extends DynamicData
{

    protected Boolean valueIsReadonly;

    /**
     * Gets the value of the valueIsReadonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValueIsReadonly() {
        return valueIsReadonly;
    }

    /**
     * Sets the value of the valueIsReadonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueIsReadonly(Boolean value) {
        this.valueIsReadonly = value;
    }

}
