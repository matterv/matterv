
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionManagerIpAllocationUsage complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtensionManagerIpAllocationUsage">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="extensionKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="numAddresses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionManagerIpAllocationUsage", propOrder = {
    "extensionKey",
    "numAddresses"
})
public class ExtensionManagerIpAllocationUsage
    extends DynamicData
{

    @XmlElement(required = true)
    protected String extensionKey;
    protected int numAddresses;

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
     * Gets the value of the numAddresses property.
     * 
     */
    public int getNumAddresses() {
        return numAddresses;
    }

    /**
     * Sets the value of the numAddresses property.
     * 
     */
    public void setNumAddresses(int value) {
        this.numAddresses = value;
    }

}
