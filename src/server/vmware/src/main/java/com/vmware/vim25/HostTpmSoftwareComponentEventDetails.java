
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmSoftwareComponentEventDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTpmSoftwareComponentEventDetails">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostTpmEventDetails">
 *       <sequence>
 *         <element name="componentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vibName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vibVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vibVendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmSoftwareComponentEventDetails", propOrder = {
    "componentName",
    "vibName",
    "vibVersion",
    "vibVendor"
})
public class HostTpmSoftwareComponentEventDetails
    extends HostTpmEventDetails
{

    @XmlElement(required = true)
    protected String componentName;
    @XmlElement(required = true)
    protected String vibName;
    @XmlElement(required = true)
    protected String vibVersion;
    @XmlElement(required = true)
    protected String vibVendor;

    /**
     * Gets the value of the componentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentName(String value) {
        this.componentName = value;
    }

    /**
     * Gets the value of the vibName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVibName() {
        return vibName;
    }

    /**
     * Sets the value of the vibName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVibName(String value) {
        this.vibName = value;
    }

    /**
     * Gets the value of the vibVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVibVersion() {
        return vibVersion;
    }

    /**
     * Sets the value of the vibVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVibVersion(String value) {
        this.vibVersion = value;
    }

    /**
     * Gets the value of the vibVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVibVendor() {
        return vibVendor;
    }

    /**
     * Sets the value of the vibVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVibVendor(String value) {
        this.vibVendor = value;
    }

}
