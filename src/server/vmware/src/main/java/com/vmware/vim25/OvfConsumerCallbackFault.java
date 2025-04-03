
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfConsumerCallbackFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfConsumerCallbackFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfFault">
 *       <sequence>
 *         <element name="extensionKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerCallbackFault", propOrder = {
    "extensionKey",
    "extensionName"
})
@XmlSeeAlso({
    OvfConsumerCommunicationError.class,
    OvfConsumerFault.class,
    OvfConsumerInvalidSection.class,
    OvfConsumerUndeclaredSection.class,
    OvfConsumerUndefinedPrefix.class
})
public class OvfConsumerCallbackFault
    extends OvfFault
{

    @XmlElement(required = true)
    protected String extensionKey;
    @XmlElement(required = true)
    protected String extensionName;

    /**
     * Gets the value of the extensionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionKey() {
        return extensionKey;
    }

    /**
     * Sets the value of the extensionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionKey(String value) {
        this.extensionKey = value;
    }

    /**
     * Gets the value of the extensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionName() {
        return extensionName;
    }

    /**
     * Sets the value of the extensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionName(String value) {
        this.extensionName = value;
    }

}
