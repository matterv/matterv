
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationCloudinitPrep complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationCloudinitPrep">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomizationIdentitySettings">
 *       <sequence>
 *         <element name="metadata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="userdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationCloudinitPrep", propOrder = {
    "metadata",
    "userdata"
})
public class CustomizationCloudinitPrep
    extends CustomizationIdentitySettings
{

    @XmlElement(required = true)
    protected String metadata;
    protected String userdata;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata(String value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the userdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserdata() {
        return userdata;
    }

    /**
     * Sets the value of the userdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserdata(String value) {
        this.userdata = value;
    }

}
