
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSubSpecificationDeleteEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSubSpecificationDeleteEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="subSpecName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSubSpecificationDeleteEvent", propOrder = {
    "subSpecName"
})
public class HostSubSpecificationDeleteEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected String subSpecName;

    /**
     * Gets the value of the subSpecName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSpecName() {
        return subSpecName;
    }

    /**
     * Sets the value of the subSpecName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSpecName(String value) {
        this.subSpecName = value;
    }

}
