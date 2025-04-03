
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualIDEControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualIDEControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualControllerOption">
 *       <sequence>
 *         <element name="numIDEDisks" type="{urn:internalvim25}IntOption"/>
 *         <element name="numIDECdroms" type="{urn:internalvim25}IntOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualIDEControllerOption", propOrder = {
    "numIDEDisks",
    "numIDECdroms"
})
public class VirtualIDEControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected IntOption numIDEDisks;
    @XmlElement(required = true)
    protected IntOption numIDECdroms;

    /**
     * Gets the value of the numIDEDisks property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumIDEDisks() {
        return numIDEDisks;
    }

    /**
     * Sets the value of the numIDEDisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumIDEDisks(IntOption value) {
        this.numIDEDisks = value;
    }

    /**
     * Gets the value of the numIDECdroms property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumIDECdroms() {
        return numIDECdroms;
    }

    /**
     * Sets the value of the numIDECdroms property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumIDECdroms(IntOption value) {
        this.numIDECdroms = value;
    }

}
