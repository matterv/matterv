
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FcoeConfigVlanRange complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FcoeConfigVlanRange">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vlanLow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="vlanHigh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FcoeConfigVlanRange", propOrder = {
    "vlanLow",
    "vlanHigh"
})
public class FcoeConfigVlanRange
    extends DynamicData
{

    protected int vlanLow;
    protected int vlanHigh;

    /**
     * Gets the value of the vlanLow property.
     * 
     */
    public int getVlanLow() {
        return vlanLow;
    }

    /**
     * Sets the value of the vlanLow property.
     * 
     */
    public void setVlanLow(int value) {
        this.vlanLow = value;
    }

    /**
     * Gets the value of the vlanHigh property.
     * 
     */
    public int getVlanHigh() {
        return vlanHigh;
    }

    /**
     * Sets the value of the vlanHigh property.
     * 
     */
    public void setVlanHigh(int value) {
        this.vlanHigh = value;
    }

}
