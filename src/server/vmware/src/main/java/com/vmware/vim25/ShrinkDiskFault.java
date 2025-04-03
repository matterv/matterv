
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShrinkDiskFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ShrinkDiskFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="diskId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShrinkDiskFault", propOrder = {
    "diskId"
})
public class ShrinkDiskFault
    extends VimFault
{

    protected Integer diskId;

    /**
     * Gets the value of the diskId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiskId() {
        return diskId;
    }

    /**
     * Sets the value of the diskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiskId(Integer value) {
        this.diskId = value;
    }

}
