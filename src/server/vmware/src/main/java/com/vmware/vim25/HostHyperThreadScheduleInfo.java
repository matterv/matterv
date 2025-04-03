
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostHyperThreadScheduleInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostHyperThreadScheduleInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="config" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHyperThreadScheduleInfo", propOrder = {
    "available",
    "active",
    "config"
})
public class HostHyperThreadScheduleInfo
    extends DynamicData
{

    protected boolean available;
    protected boolean active;
    protected boolean config;

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the config property.
     * 
     */
    public boolean isConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     */
    public void setConfig(boolean value) {
        this.config = value;
    }

}
