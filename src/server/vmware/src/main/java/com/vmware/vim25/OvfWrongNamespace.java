
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfWrongNamespace complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfWrongNamespace">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfInvalidPackage">
 *       <sequence>
 *         <element name="namespaceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfWrongNamespace", propOrder = {
    "namespaceName"
})
public class OvfWrongNamespace
    extends OvfInvalidPackage
{

    @XmlElement(required = true)
    protected String namespaceName;

    /**
     * Gets the value of the namespaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * Sets the value of the namespaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespaceName(String value) {
        this.namespaceName = value;
    }

}
