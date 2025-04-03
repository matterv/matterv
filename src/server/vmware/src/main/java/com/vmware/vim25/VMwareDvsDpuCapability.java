
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDvsDpuCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDvsDpuCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="networkOffloadSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="activeStandbyModeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsDpuCapability", propOrder = {
    "networkOffloadSupported",
    "activeStandbyModeSupported"
})
public class VMwareDvsDpuCapability
    extends DynamicData
{

    protected Boolean networkOffloadSupported;
    protected Boolean activeStandbyModeSupported;

    /**
     * Gets the value of the networkOffloadSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkOffloadSupported() {
        return networkOffloadSupported;
    }

    /**
     * Sets the value of the networkOffloadSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkOffloadSupported(Boolean value) {
        this.networkOffloadSupported = value;
    }

    /**
     * Gets the value of the activeStandbyModeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveStandbyModeSupported() {
        return activeStandbyModeSupported;
    }

    /**
     * Sets the value of the activeStandbyModeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveStandbyModeSupported(Boolean value) {
        this.activeStandbyModeSupported = value;
    }

}
