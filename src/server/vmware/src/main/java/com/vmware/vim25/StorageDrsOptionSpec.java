
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageDrsOptionSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageDrsOptionSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ArrayUpdateSpec">
 *       <sequence>
 *         <element name="option" type="{urn:internalvim25}OptionValue" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsOptionSpec", propOrder = {
    "option"
})
public class StorageDrsOptionSpec
    extends ArrayUpdateSpec
{

    protected OptionValue option;

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link OptionValue }
     *     
     */
    public OptionValue getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionValue }
     *     
     */
    public void setOption(OptionValue value) {
        this.option = value;
    }

}
