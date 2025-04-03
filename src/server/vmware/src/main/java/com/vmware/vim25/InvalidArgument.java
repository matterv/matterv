
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InvalidArgument">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}RuntimeFault">
 *       <sequence>
 *         <element name="invalidProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidArgument", propOrder = {
    "invalidProperty"
})
@XmlSeeAlso({
    IncompatibleSetting.class,
    InvalidDasConfigArgument.class,
    InvalidDasRestartPriorityForFtVm.class,
    InvalidDrsBehaviorForFtVm.class,
    InvalidIndexArgument.class
})
public class InvalidArgument
    extends RuntimeFault
{

    protected String invalidProperty;

    /**
     * Gets the value of the invalidProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidProperty() {
        return invalidProperty;
    }

    /**
     * Sets the value of the invalidProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidProperty(String value) {
        this.invalidProperty = value;
    }

}
