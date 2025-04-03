
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSHealthCheckCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSHealthCheckCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSHealthCheckCapability">
 *       <sequence>
 *         <element name="vlanMtuSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="teamingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSHealthCheckCapability", propOrder = {
    "vlanMtuSupported",
    "teamingSupported"
})
public class VMwareDVSHealthCheckCapability
    extends DVSHealthCheckCapability
{

    protected boolean vlanMtuSupported;
    protected boolean teamingSupported;

    /**
     * Gets the value of the vlanMtuSupported property.
     * 
     */
    public boolean isVlanMtuSupported() {
        return vlanMtuSupported;
    }

    /**
     * Sets the value of the vlanMtuSupported property.
     * 
     */
    public void setVlanMtuSupported(boolean value) {
        this.vlanMtuSupported = value;
    }

    /**
     * Gets the value of the teamingSupported property.
     * 
     */
    public boolean isTeamingSupported() {
        return teamingSupported;
    }

    /**
     * Sets the value of the teamingSupported property.
     * 
     */
    public void setTeamingSupported(boolean value) {
        this.teamingSupported = value;
    }

}
