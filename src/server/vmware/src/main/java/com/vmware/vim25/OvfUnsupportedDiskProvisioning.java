
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfUnsupportedDiskProvisioning complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfUnsupportedDiskProvisioning">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfImport">
 *       <sequence>
 *         <element name="diskProvisioning" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="supportedDiskProvisioning" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedDiskProvisioning", propOrder = {
    "diskProvisioning",
    "supportedDiskProvisioning"
})
public class OvfUnsupportedDiskProvisioning
    extends OvfImport
{

    @XmlElement(required = true)
    protected String diskProvisioning;
    @XmlElement(required = true)
    protected String supportedDiskProvisioning;

    /**
     * Gets the value of the diskProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskProvisioning() {
        return diskProvisioning;
    }

    /**
     * Sets the value of the diskProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskProvisioning(String value) {
        this.diskProvisioning = value;
    }

    /**
     * Gets the value of the supportedDiskProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedDiskProvisioning() {
        return supportedDiskProvisioning;
    }

    /**
     * Sets the value of the supportedDiskProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedDiskProvisioning(String value) {
        this.supportedDiskProvisioning = value;
    }

}
