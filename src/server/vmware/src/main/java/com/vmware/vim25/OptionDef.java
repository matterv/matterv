
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionDef complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OptionDef">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ElementDescription">
 *       <sequence>
 *         <element name="optionType" type="{urn:internalvim25}OptionType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionDef", propOrder = {
    "optionType"
})
public class OptionDef
    extends ElementDescription
{

    @XmlElement(required = true)
    protected OptionType optionType;

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType }
     *     
     */
    public OptionType getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType }
     *     
     */
    public void setOptionType(OptionType value) {
        this.optionType = value;
    }

}
