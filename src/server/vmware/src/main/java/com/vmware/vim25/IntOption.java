
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IntOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OptionType">
 *       <sequence>
 *         <element name="min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntOption", propOrder = {
    "min",
    "max",
    "defaultValue"
})
public class IntOption
    extends OptionType
{

    protected int min;
    protected int max;
    protected int defaultValue;

    /**
     * Gets the value of the min property.
     * 
     */
    public int getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     */
    public void setMin(int value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     */
    public int getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(int value) {
        this.max = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     */
    public int getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     */
    public void setDefaultValue(int value) {
        this.defaultValue = value;
    }

}
