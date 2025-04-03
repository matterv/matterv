
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSFilterSpecTrunkVlanSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSFilterSpecTrunkVlanSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSFilterSpecVlanSpec">
 *       <sequence>
 *         <element name="range" type="{urn:internalvim25}NumericRange" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSFilterSpecTrunkVlanSpec", propOrder = {
    "range"
})
public class DVSFilterSpecTrunkVlanSpec
    extends DVSFilterSpecVlanSpec
{

    protected NumericRange range;

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link NumericRange }
     *     
     */
    public NumericRange getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericRange }
     *     
     */
    public void setRange(NumericRange value) {
        this.range = value;
    }

}
