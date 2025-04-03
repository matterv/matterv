
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSIOControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSIOControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualControllerOption">
 *       <sequence>
 *         <element name="numFloppyDrives" type="{urn:internalvim25}IntOption"/>
 *         <element name="numSerialPorts" type="{urn:internalvim25}IntOption"/>
 *         <element name="numParallelPorts" type="{urn:internalvim25}IntOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSIOControllerOption", propOrder = {
    "numFloppyDrives",
    "numSerialPorts",
    "numParallelPorts"
})
public class VirtualSIOControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected IntOption numFloppyDrives;
    @XmlElement(required = true)
    protected IntOption numSerialPorts;
    @XmlElement(required = true)
    protected IntOption numParallelPorts;

    /**
     * Gets the value of the numFloppyDrives property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumFloppyDrives() {
        return numFloppyDrives;
    }

    /**
     * Sets the value of the numFloppyDrives property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumFloppyDrives(IntOption value) {
        this.numFloppyDrives = value;
    }

    /**
     * Gets the value of the numSerialPorts property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSerialPorts() {
        return numSerialPorts;
    }

    /**
     * Sets the value of the numSerialPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSerialPorts(IntOption value) {
        this.numSerialPorts = value;
    }

    /**
     * Gets the value of the numParallelPorts property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumParallelPorts() {
        return numParallelPorts;
    }

    /**
     * Sets the value of the numParallelPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumParallelPorts(IntOption value) {
        this.numParallelPorts = value;
    }

}
