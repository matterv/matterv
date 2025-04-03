
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EvaluationLicenseSource complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EvaluationLicenseSource">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}LicenseSource">
 *       <sequence>
 *         <element name="remainingHours" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluationLicenseSource", propOrder = {
    "remainingHours"
})
public class EvaluationLicenseSource
    extends LicenseSource
{

    protected Long remainingHours;

    /**
     * Gets the value of the remainingHours property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingHours() {
        return remainingHours;
    }

    /**
     * Sets the value of the remainingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingHours(Long value) {
        this.remainingHours = value;
    }

}
