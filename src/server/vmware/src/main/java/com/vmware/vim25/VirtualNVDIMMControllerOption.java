
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVDIMMControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualNVDIMMControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualControllerOption">
 *       <sequence>
 *         <element name="numNVDIMMControllers" type="{urn:internalvim25}IntOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMMControllerOption", propOrder = {
    "numNVDIMMControllers"
})
public class VirtualNVDIMMControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected IntOption numNVDIMMControllers;

    /**
     * Gets the value of the numNVDIMMControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumNVDIMMControllers() {
        return numNVDIMMControllers;
    }

    /**
     * Sets the value of the numNVDIMMControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumNVDIMMControllers(IntOption value) {
        this.numNVDIMMControllers = value;
    }

}
