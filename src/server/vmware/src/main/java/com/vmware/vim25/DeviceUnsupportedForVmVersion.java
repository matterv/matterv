
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceUnsupportedForVmVersion complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceUnsupportedForVmVersion">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidDeviceSpec">
 *       <sequence>
 *         <element name="currentVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="expectedVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceUnsupportedForVmVersion", propOrder = {
    "currentVersion",
    "expectedVersion"
})
public class DeviceUnsupportedForVmVersion
    extends InvalidDeviceSpec
{

    @XmlElement(required = true)
    protected String currentVersion;
    @XmlElement(required = true)
    protected String expectedVersion;

    /**
     * Gets the value of the currentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * Sets the value of the currentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentVersion(String value) {
        this.currentVersion = value;
    }

    /**
     * Gets the value of the expectedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedVersion() {
        return expectedVersion;
    }

    /**
     * Sets the value of the expectedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedVersion(String value) {
        this.expectedVersion = value;
    }

}
