
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMultipathInfoFixedLogicalUnitPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostMultipathInfoFixedLogicalUnitPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostMultipathInfoLogicalUnitPolicy">
 *       <sequence>
 *         <element name="prefer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfoFixedLogicalUnitPolicy", propOrder = {
    "prefer"
})
public class HostMultipathInfoFixedLogicalUnitPolicy
    extends HostMultipathInfoLogicalUnitPolicy
{

    @XmlElement(required = true)
    protected String prefer;

    /**
     * Gets the value of the prefer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefer() {
        return prefer;
    }

    /**
     * Sets the value of the prefer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefer(String value) {
        this.prefer = value;
    }

}
