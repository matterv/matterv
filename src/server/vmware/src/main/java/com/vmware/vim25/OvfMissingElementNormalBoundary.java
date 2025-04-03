
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfMissingElementNormalBoundary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfMissingElementNormalBoundary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfMissingElement">
 *       <sequence>
 *         <element name="boundary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfMissingElementNormalBoundary", propOrder = {
    "boundary"
})
public class OvfMissingElementNormalBoundary
    extends OvfMissingElement
{

    @XmlElement(required = true)
    protected String boundary;

    /**
     * Gets the value of the boundary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundary() {
        return boundary;
    }

    /**
     * Sets the value of the boundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundary(String value) {
        this.boundary = value;
    }

}
