
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="logLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationEvent", propOrder = {
    "logLocation"
})
@XmlSeeAlso({
    CustomizationStartedEvent.class,
    CustomizationSucceeded.class,
    CustomizationFailed.class
})
public class CustomizationEvent
    extends VmEvent
{

    protected String logLocation;

    /**
     * Gets the value of the logLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogLocation() {
        return logLocation;
    }

    /**
     * Sets the value of the logLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogLocation(String value) {
        this.logLocation = value;
    }

}
