
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IpRange complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IpRange">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}IpAddress">
 *       <sequence>
 *         <element name="addressPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prefixLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpRange", propOrder = {
    "addressPrefix",
    "prefixLength"
})
public class IpRange
    extends IpAddress
{

    @XmlElement(required = true)
    protected String addressPrefix;
    protected Integer prefixLength;

    /**
     * Gets the value of the addressPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * Sets the value of the addressPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPrefix(String value) {
        this.addressPrefix = value;
    }

    /**
     * Gets the value of the prefixLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrefixLength() {
        return prefixLength;
    }

    /**
     * Sets the value of the prefixLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrefixLength(Integer value) {
        this.prefixLength = value;
    }

}
