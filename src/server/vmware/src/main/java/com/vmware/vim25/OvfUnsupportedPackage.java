
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfUnsupportedPackage complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfUnsupportedPackage">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfFault">
 *       <sequence>
 *         <element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedPackage", propOrder = {
    "lineNumber"
})
@XmlSeeAlso({
    OvfInvalidVmName.class,
    OvfNoHostNic.class,
    OvfNoSupportedHardwareFamily.class,
    OvfUnsupportedAttribute.class,
    OvfUnsupportedElement.class,
    OvfUnsupportedSubType.class,
    OvfUnsupportedType.class
})
public class OvfUnsupportedPackage
    extends OvfFault
{

    protected Integer lineNumber;

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

}
