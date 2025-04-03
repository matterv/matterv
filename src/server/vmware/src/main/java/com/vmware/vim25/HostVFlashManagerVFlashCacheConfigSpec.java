
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVFlashManagerVFlashCacheConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVFlashManagerVFlashCacheConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="defaultVFlashModule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="swapCacheReservationInGB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashCacheConfigSpec", propOrder = {
    "defaultVFlashModule",
    "swapCacheReservationInGB"
})
public class HostVFlashManagerVFlashCacheConfigSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String defaultVFlashModule;
    protected long swapCacheReservationInGB;

    /**
     * Gets the value of the defaultVFlashModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultVFlashModule() {
        return defaultVFlashModule;
    }

    /**
     * Sets the value of the defaultVFlashModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultVFlashModule(String value) {
        this.defaultVFlashModule = value;
    }

    /**
     * Gets the value of the swapCacheReservationInGB property.
     * 
     */
    public long getSwapCacheReservationInGB() {
        return swapCacheReservationInGB;
    }

    /**
     * Sets the value of the swapCacheReservationInGB property.
     * 
     */
    public void setSwapCacheReservationInGB(long value) {
        this.swapCacheReservationInGB = value;
    }

}
