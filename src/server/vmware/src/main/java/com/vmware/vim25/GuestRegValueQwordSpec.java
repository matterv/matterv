
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestRegValueQwordSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestRegValueQwordSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GuestRegValueDataSpec">
 *       <sequence>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueQwordSpec", propOrder = {
    "value"
})
public class GuestRegValueQwordSpec
    extends GuestRegValueDataSpec
{

    protected long value;

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

}
