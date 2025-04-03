
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfInvalidPackage complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfInvalidPackage">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfFault">
 *       <sequence>
 *         <element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfInvalidPackage", propOrder = {
    "lineNumber"
})
@XmlSeeAlso({
    OvfConstraint.class,
    OvfAttribute.class,
    OvfProperty.class,
    OvfElement.class,
    OvfWrongNamespace.class,
    OvfXmlFormat.class
})
public class OvfInvalidPackage
    extends OvfFault
{

    protected int lineNumber;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

}
