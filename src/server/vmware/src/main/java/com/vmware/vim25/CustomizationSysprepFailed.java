
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationSysprepFailed complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationSysprepFailed">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomizationFailed">
 *       <sequence>
 *         <element name="sysprepVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="systemVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSysprepFailed", propOrder = {
    "sysprepVersion",
    "systemVersion"
})
public class CustomizationSysprepFailed
    extends CustomizationFailed
{

    @XmlElement(required = true)
    protected String sysprepVersion;
    @XmlElement(required = true)
    protected String systemVersion;

    /**
     * Gets the value of the sysprepVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysprepVersion() {
        return sysprepVersion;
    }

    /**
     * Sets the value of the sysprepVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysprepVersion(String value) {
        this.sysprepVersion = value;
    }

    /**
     * Gets the value of the systemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * Sets the value of the systemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemVersion(String value) {
        this.systemVersion = value;
    }

}
