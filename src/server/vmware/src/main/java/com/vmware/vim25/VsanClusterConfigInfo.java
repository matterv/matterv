
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanClusterConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanClusterConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="defaultConfig" type="{urn:internalvim25}VsanClusterConfigInfoHostDefaultInfo" minOccurs="0"/>
 *         <element name="vsanEsaEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanClusterConfigInfo", propOrder = {
    "enabled",
    "defaultConfig",
    "vsanEsaEnabled"
})
public class VsanClusterConfigInfo
    extends DynamicData
{

    protected Boolean enabled;
    protected VsanClusterConfigInfoHostDefaultInfo defaultConfig;
    protected Boolean vsanEsaEnabled;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the defaultConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VsanClusterConfigInfoHostDefaultInfo }
     *     
     */
    public VsanClusterConfigInfoHostDefaultInfo getDefaultConfig() {
        return defaultConfig;
    }

    /**
     * Sets the value of the defaultConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanClusterConfigInfoHostDefaultInfo }
     *     
     */
    public void setDefaultConfig(VsanClusterConfigInfoHostDefaultInfo value) {
        this.defaultConfig = value;
    }

    /**
     * Gets the value of the vsanEsaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsanEsaEnabled() {
        return vsanEsaEnabled;
    }

    /**
     * Sets the value of the vsanEsaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsanEsaEnabled(Boolean value) {
        this.vsanEsaEnabled = value;
    }

}
