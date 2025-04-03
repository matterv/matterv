
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVFlashManagerVFlashConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVFlashManagerVFlashConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vFlashResourceConfigInfo" type="{urn:internalvim25}HostVFlashManagerVFlashResourceConfigInfo" minOccurs="0"/>
 *         <element name="vFlashCacheConfigInfo" type="{urn:internalvim25}HostVFlashManagerVFlashCacheConfigInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashConfigInfo", propOrder = {
    "vFlashResourceConfigInfo",
    "vFlashCacheConfigInfo"
})
public class HostVFlashManagerVFlashConfigInfo
    extends DynamicData
{

    protected HostVFlashManagerVFlashResourceConfigInfo vFlashResourceConfigInfo;
    protected HostVFlashManagerVFlashCacheConfigInfo vFlashCacheConfigInfo;

    /**
     * Gets the value of the vFlashResourceConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostVFlashManagerVFlashResourceConfigInfo }
     *     
     */
    public HostVFlashManagerVFlashResourceConfigInfo getVFlashResourceConfigInfo() {
        return vFlashResourceConfigInfo;
    }

    /**
     * Sets the value of the vFlashResourceConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVFlashManagerVFlashResourceConfigInfo }
     *     
     */
    public void setVFlashResourceConfigInfo(HostVFlashManagerVFlashResourceConfigInfo value) {
        this.vFlashResourceConfigInfo = value;
    }

    /**
     * Gets the value of the vFlashCacheConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostVFlashManagerVFlashCacheConfigInfo }
     *     
     */
    public HostVFlashManagerVFlashCacheConfigInfo getVFlashCacheConfigInfo() {
        return vFlashCacheConfigInfo;
    }

    /**
     * Sets the value of the vFlashCacheConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVFlashManagerVFlashCacheConfigInfo }
     *     
     */
    public void setVFlashCacheConfigInfo(HostVFlashManagerVFlashCacheConfigInfo value) {
        this.vFlashCacheConfigInfo = value;
    }

}
