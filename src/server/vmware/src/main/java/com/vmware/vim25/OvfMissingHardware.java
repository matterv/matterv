
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfMissingHardware complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfMissingHardware">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfImport">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="resourceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfMissingHardware", propOrder = {
    "name",
    "resourceType"
})
public class OvfMissingHardware
    extends OvfImport
{

    @XmlElement(required = true)
    protected String name;
    protected int resourceType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     */
    public int getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     */
    public void setResourceType(int value) {
        this.resourceType = value;
    }

}
