
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfDuplicatedPropertyIdExport complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfDuplicatedPropertyIdExport">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfExport">
 *       <sequence>
 *         <element name="fqid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfDuplicatedPropertyIdExport", propOrder = {
    "fqid"
})
public class OvfDuplicatedPropertyIdExport
    extends OvfExport
{

    @XmlElement(required = true)
    protected String fqid;

    /**
     * Gets the value of the fqid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFqid() {
        return fqid;
    }

    /**
     * Sets the value of the fqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFqid(String value) {
        this.fqid = value;
    }

}
