
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalNicLinkInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PhysicalNicLinkInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="speedMb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="duplex" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicLinkInfo", propOrder = {
    "speedMb",
    "duplex"
})
public class PhysicalNicLinkInfo
    extends DynamicData
{

    protected int speedMb;
    protected boolean duplex;

    /**
     * Gets the value of the speedMb property.
     * 
     */
    public int getSpeedMb() {
        return speedMb;
    }

    /**
     * Sets the value of the speedMb property.
     * 
     */
    public void setSpeedMb(int value) {
        this.speedMb = value;
    }

    /**
     * Gets the value of the duplex property.
     * 
     */
    public boolean isDuplex() {
        return duplex;
    }

    /**
     * Sets the value of the duplex property.
     * 
     */
    public void setDuplex(boolean value) {
        this.duplex = value;
    }

}
