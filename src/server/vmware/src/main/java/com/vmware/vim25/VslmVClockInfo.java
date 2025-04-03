
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vslmVClockInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="vslmVClockInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vClockTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vslmVClockInfo", propOrder = {
    "vClockTime"
})
public class VslmVClockInfo
    extends DynamicData
{

    protected long vClockTime;

    /**
     * Gets the value of the vClockTime property.
     * 
     */
    public long getVClockTime() {
        return vClockTime;
    }

    /**
     * Sets the value of the vClockTime property.
     * 
     */
    public void setVClockTime(long value) {
        this.vClockTime = value;
    }

}
