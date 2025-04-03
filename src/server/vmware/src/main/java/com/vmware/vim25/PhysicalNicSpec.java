
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalNicSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PhysicalNicSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ip" type="{urn:internalvim25}HostIpConfig" minOccurs="0"/>
 *         <element name="linkSpeed" type="{urn:internalvim25}PhysicalNicLinkInfo" minOccurs="0"/>
 *         <element name="enableEnhancedNetworkingStack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ensInterruptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicSpec", propOrder = {
    "ip",
    "linkSpeed",
    "enableEnhancedNetworkingStack",
    "ensInterruptEnabled"
})
public class PhysicalNicSpec
    extends DynamicData
{

    protected HostIpConfig ip;
    protected PhysicalNicLinkInfo linkSpeed;
    protected Boolean enableEnhancedNetworkingStack;
    protected Boolean ensInterruptEnabled;

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link HostIpConfig }
     *     
     */
    public HostIpConfig getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostIpConfig }
     *     
     */
    public void setIp(HostIpConfig value) {
        this.ip = value;
    }

    /**
     * Gets the value of the linkSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalNicLinkInfo }
     *     
     */
    public PhysicalNicLinkInfo getLinkSpeed() {
        return linkSpeed;
    }

    /**
     * Sets the value of the linkSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalNicLinkInfo }
     *     
     */
    public void setLinkSpeed(PhysicalNicLinkInfo value) {
        this.linkSpeed = value;
    }

    /**
     * Gets the value of the enableEnhancedNetworkingStack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableEnhancedNetworkingStack() {
        return enableEnhancedNetworkingStack;
    }

    /**
     * Sets the value of the enableEnhancedNetworkingStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableEnhancedNetworkingStack(Boolean value) {
        this.enableEnhancedNetworkingStack = value;
    }

    /**
     * Gets the value of the ensInterruptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnsInterruptEnabled() {
        return ensInterruptEnabled;
    }

    /**
     * Sets the value of the ensInterruptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnsInterruptEnabled(Boolean value) {
        this.ensInterruptEnabled = value;
    }

}
