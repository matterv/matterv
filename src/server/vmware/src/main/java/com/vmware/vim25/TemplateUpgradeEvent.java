
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateUpgradeEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TemplateUpgradeEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
 *       <sequence>
 *         <element name="legacyTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateUpgradeEvent", propOrder = {
    "legacyTemplate"
})
@XmlSeeAlso({
    TemplateBeingUpgradedEvent.class,
    TemplateUpgradeFailedEvent.class,
    TemplateUpgradedEvent.class
})
public class TemplateUpgradeEvent
    extends Event
{

    @XmlElement(required = true)
    protected String legacyTemplate;

    /**
     * Gets the value of the legacyTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyTemplate() {
        return legacyTemplate;
    }

    /**
     * Sets the value of the legacyTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyTemplate(String value) {
        this.legacyTemplate = value;
    }

}
