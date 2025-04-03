
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDvsMtuCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDvsMtuCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="minMtuSupported" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxMtuSupported" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsMtuCapability", propOrder = {
    "minMtuSupported",
    "maxMtuSupported"
})
public class VMwareDvsMtuCapability
    extends DynamicData
{

    protected int minMtuSupported;
    protected int maxMtuSupported;

    /**
     * Gets the value of the minMtuSupported property.
     * 
     */
    public int getMinMtuSupported() {
        return minMtuSupported;
    }

    /**
     * Sets the value of the minMtuSupported property.
     * 
     */
    public void setMinMtuSupported(int value) {
        this.minMtuSupported = value;
    }

    /**
     * Gets the value of the maxMtuSupported property.
     * 
     */
    public int getMaxMtuSupported() {
        return maxMtuSupported;
    }

    /**
     * Sets the value of the maxMtuSupported property.
     * 
     */
    public void setMaxMtuSupported(int value) {
        this.maxMtuSupported = value;
    }

}
