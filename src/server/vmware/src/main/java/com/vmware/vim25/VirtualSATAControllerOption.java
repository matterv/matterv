
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSATAControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSATAControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualControllerOption">
 *       <sequence>
 *         <element name="numSATADisks" type="{urn:internalvim25}IntOption"/>
 *         <element name="numSATACdroms" type="{urn:internalvim25}IntOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSATAControllerOption", propOrder = {
    "numSATADisks",
    "numSATACdroms"
})
@XmlSeeAlso({
    VirtualAHCIControllerOption.class
})
public class VirtualSATAControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected IntOption numSATADisks;
    @XmlElement(required = true)
    protected IntOption numSATACdroms;

    /**
     * Gets the value of the numSATADisks property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSATADisks() {
        return numSATADisks;
    }

    /**
     * Sets the value of the numSATADisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSATADisks(IntOption value) {
        this.numSATADisks = value;
    }

    /**
     * Gets the value of the numSATACdroms property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSATACdroms() {
        return numSATACdroms;
    }

    /**
     * Sets the value of the numSATACdroms property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSATACdroms(IntOption value) {
        this.numSATACdroms = value;
    }

}
