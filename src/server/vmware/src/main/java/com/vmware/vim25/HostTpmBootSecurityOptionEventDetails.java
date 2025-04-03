
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmBootSecurityOptionEventDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTpmBootSecurityOptionEventDetails">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostTpmEventDetails">
 *       <sequence>
 *         <element name="bootSecurityOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmBootSecurityOptionEventDetails", propOrder = {
    "bootSecurityOption"
})
@XmlSeeAlso({
    HostTpmNvTagEventDetails.class,
    HostTpmSignerEventDetails.class
})
public class HostTpmBootSecurityOptionEventDetails
    extends HostTpmEventDetails
{

    @XmlElement(required = true)
    protected String bootSecurityOption;

    /**
     * Gets the value of the bootSecurityOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBootSecurityOption() {
        return bootSecurityOption;
    }

    /**
     * Sets the value of the bootSecurityOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBootSecurityOption(String value) {
        this.bootSecurityOption = value;
    }

}
