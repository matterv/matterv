
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterNetworkConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterNetworkConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="networkPortGroup" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="ipSettings" type="{urn:internalvim25}CustomizationIPSettings"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterNetworkConfigSpec", propOrder = {
    "networkPortGroup",
    "ipSettings"
})
public class ClusterNetworkConfigSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference networkPortGroup;
    @XmlElement(required = true)
    protected CustomizationIPSettings ipSettings;

    /**
     * Gets the value of the networkPortGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getNetworkPortGroup() {
        return networkPortGroup;
    }

    /**
     * Sets the value of the networkPortGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setNetworkPortGroup(ManagedObjectReference value) {
        this.networkPortGroup = value;
    }

    /**
     * Gets the value of the ipSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIPSettings }
     *     
     */
    public CustomizationIPSettings getIpSettings() {
        return ipSettings;
    }

    /**
     * Sets the value of the ipSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIPSettings }
     *     
     */
    public void setIpSettings(CustomizationIPSettings value) {
        this.ipSettings = value;
    }

}
