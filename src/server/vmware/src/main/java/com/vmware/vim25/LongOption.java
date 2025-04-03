
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LongOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LongOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OptionType">
 *       <sequence>
 *         <element name="min" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="max" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongOption", propOrder = {
    "min",
    "max",
    "defaultValue"
})
public class LongOption
    extends OptionType
{

    protected long min;
    protected long max;
    protected long defaultValue;

    /**
     * Gets the value of the min property.
     * 
     */
    public long getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     */
    public void setMin(long value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     */
    public long getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     */
    public void setMax(long value) {
        this.max = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     */
    public long getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     */
    public void setDefaultValue(long value) {
        this.defaultValue = value;
    }

}
