
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasVmConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasVmConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="restartPriority" type="{urn:internalvim25}DasVmPriority" minOccurs="0"/>
 *         <element name="powerOffOnIsolation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dasSettings" type="{urn:internalvim25}ClusterDasVmSettings" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasVmConfigInfo", propOrder = {
    "key",
    "restartPriority",
    "powerOffOnIsolation",
    "dasSettings"
})
public class ClusterDasVmConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference key;
    @XmlSchemaType(name = "string")
    protected DasVmPriority restartPriority;
    protected Boolean powerOffOnIsolation;
    protected ClusterDasVmSettings dasSettings;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setKey(ManagedObjectReference value) {
        this.key = value;
    }

    /**
     * Gets the value of the restartPriority property.
     * 
     * @return
     *     possible object is
     *     {@link DasVmPriority }
     *     
     */
    public DasVmPriority getRestartPriority() {
        return restartPriority;
    }

    /**
     * Sets the value of the restartPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DasVmPriority }
     *     
     */
    public void setRestartPriority(DasVmPriority value) {
        this.restartPriority = value;
    }

    /**
     * Gets the value of the powerOffOnIsolation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerOffOnIsolation() {
        return powerOffOnIsolation;
    }

    /**
     * Sets the value of the powerOffOnIsolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerOffOnIsolation(Boolean value) {
        this.powerOffOnIsolation = value;
    }

    /**
     * Gets the value of the dasSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasVmSettings }
     *     
     */
    public ClusterDasVmSettings getDasSettings() {
        return dasSettings;
    }

    /**
     * Sets the value of the dasSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasVmSettings }
     *     
     */
    public void setDasSettings(ClusterDasVmSettings value) {
        this.dasSettings = value;
    }

}
