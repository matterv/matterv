
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeSparseVirtualDiskSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeSparseVirtualDiskSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}FileBackedVirtualDiskSpec">
 *       <sequence>
 *         <element name="grainSizeKb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeSparseVirtualDiskSpec", propOrder = {
    "grainSizeKb"
})
public class SeSparseVirtualDiskSpec
    extends FileBackedVirtualDiskSpec
{

    protected Integer grainSizeKb;

    /**
     * Gets the value of the grainSizeKb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrainSizeKb() {
        return grainSizeKb;
    }

    /**
     * Sets the value of the grainSizeKb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrainSizeKb(Integer value) {
        this.grainSizeKb = value;
    }

}
