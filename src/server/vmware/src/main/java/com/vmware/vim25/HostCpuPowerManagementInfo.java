
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostCpuPowerManagementInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostCpuPowerManagementInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="currentPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hardwareSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCpuPowerManagementInfo", propOrder = {
    "currentPolicy",
    "hardwareSupport"
})
public class HostCpuPowerManagementInfo
    extends DynamicData
{

    protected String currentPolicy;
    protected String hardwareSupport;

    /**
     * Gets the value of the currentPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPolicy() {
        return currentPolicy;
    }

    /**
     * Sets the value of the currentPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPolicy(String value) {
        this.currentPolicy = value;
    }

    /**
     * Gets the value of the hardwareSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareSupport() {
        return hardwareSupport;
    }

    /**
     * Sets the value of the hardwareSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareSupport(String value) {
        this.hardwareSupport = value;
    }

}
