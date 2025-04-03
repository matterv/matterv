
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumVirtualCpusIncompatible complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NumVirtualCpusIncompatible">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmConfigFault">
 *       <sequence>
 *         <element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="numCpu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumVirtualCpusIncompatible", propOrder = {
    "reason",
    "numCpu"
})
public class NumVirtualCpusIncompatible
    extends VmConfigFault
{

    @XmlElement(required = true)
    protected String reason;
    protected int numCpu;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the numCpu property.
     * 
     */
    public int getNumCpu() {
        return numCpu;
    }

    /**
     * Sets the value of the numCpu property.
     * 
     */
    public void setNumCpu(int value) {
        this.numCpu = value;
    }

}
