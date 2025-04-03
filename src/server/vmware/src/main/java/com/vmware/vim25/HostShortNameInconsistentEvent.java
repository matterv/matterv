
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostShortNameInconsistentEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostShortNameInconsistentEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDasEvent">
 *       <sequence>
 *         <element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="shortName2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostShortNameInconsistentEvent", propOrder = {
    "shortName",
    "shortName2"
})
public class HostShortNameInconsistentEvent
    extends HostDasEvent
{

    @XmlElement(required = true)
    protected String shortName;
    @XmlElement(required = true)
    protected String shortName2;

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the shortName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName2() {
        return shortName2;
    }

    /**
     * Sets the value of the shortName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName2(String value) {
        this.shortName2 = value;
    }

}
