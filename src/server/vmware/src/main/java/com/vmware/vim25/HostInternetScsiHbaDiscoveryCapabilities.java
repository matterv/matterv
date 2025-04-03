
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaDiscoveryCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHbaDiscoveryCapabilities">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="iSnsDiscoverySettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="slpDiscoverySettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="staticTargetDiscoverySettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendTargetsDiscoverySettable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaDiscoveryCapabilities", propOrder = {
    "iSnsDiscoverySettable",
    "slpDiscoverySettable",
    "staticTargetDiscoverySettable",
    "sendTargetsDiscoverySettable"
})
public class HostInternetScsiHbaDiscoveryCapabilities
    extends DynamicData
{

    protected boolean iSnsDiscoverySettable;
    protected boolean slpDiscoverySettable;
    protected boolean staticTargetDiscoverySettable;
    protected boolean sendTargetsDiscoverySettable;

    /**
     * Gets the value of the iSnsDiscoverySettable property.
     * 
     */
    public boolean isISnsDiscoverySettable() {
        return iSnsDiscoverySettable;
    }

    /**
     * Sets the value of the iSnsDiscoverySettable property.
     * 
     */
    public void setISnsDiscoverySettable(boolean value) {
        this.iSnsDiscoverySettable = value;
    }

    /**
     * Gets the value of the slpDiscoverySettable property.
     * 
     */
    public boolean isSlpDiscoverySettable() {
        return slpDiscoverySettable;
    }

    /**
     * Sets the value of the slpDiscoverySettable property.
     * 
     */
    public void setSlpDiscoverySettable(boolean value) {
        this.slpDiscoverySettable = value;
    }

    /**
     * Gets the value of the staticTargetDiscoverySettable property.
     * 
     */
    public boolean isStaticTargetDiscoverySettable() {
        return staticTargetDiscoverySettable;
    }

    /**
     * Sets the value of the staticTargetDiscoverySettable property.
     * 
     */
    public void setStaticTargetDiscoverySettable(boolean value) {
        this.staticTargetDiscoverySettable = value;
    }

    /**
     * Gets the value of the sendTargetsDiscoverySettable property.
     * 
     */
    public boolean isSendTargetsDiscoverySettable() {
        return sendTargetsDiscoverySettable;
    }

    /**
     * Sets the value of the sendTargetsDiscoverySettable property.
     * 
     */
    public void setSendTargetsDiscoverySettable(boolean value) {
        this.sendTargetsDiscoverySettable = value;
    }

}
