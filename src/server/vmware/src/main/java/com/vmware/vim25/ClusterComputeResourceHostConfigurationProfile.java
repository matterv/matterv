
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceHostConfigurationProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceHostConfigurationProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dateTimeConfig" type="{urn:internalvim25}HostDateTimeConfig" minOccurs="0"/>
 *         <element name="lockdownMode" type="{urn:internalvim25}HostLockdownMode" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHostConfigurationProfile", propOrder = {
    "dateTimeConfig",
    "lockdownMode"
})
public class ClusterComputeResourceHostConfigurationProfile
    extends DynamicData
{

    protected HostDateTimeConfig dateTimeConfig;
    @XmlSchemaType(name = "string")
    protected HostLockdownMode lockdownMode;

    /**
     * Gets the value of the dateTimeConfig property.
     * 
     * @return
     *     possible object is
     *     {@link HostDateTimeConfig }
     *     
     */
    public HostDateTimeConfig getDateTimeConfig() {
        return dateTimeConfig;
    }

    /**
     * Sets the value of the dateTimeConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDateTimeConfig }
     *     
     */
    public void setDateTimeConfig(HostDateTimeConfig value) {
        this.dateTimeConfig = value;
    }

    /**
     * Gets the value of the lockdownMode property.
     * 
     * @return
     *     possible object is
     *     {@link HostLockdownMode }
     *     
     */
    public HostLockdownMode getLockdownMode() {
        return lockdownMode;
    }

    /**
     * Sets the value of the lockdownMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostLockdownMode }
     *     
     */
    public void setLockdownMode(HostLockdownMode value) {
        this.lockdownMode = value;
    }

}
