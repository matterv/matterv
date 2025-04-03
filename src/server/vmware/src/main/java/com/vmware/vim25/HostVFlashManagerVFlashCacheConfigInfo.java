
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVFlashManagerVFlashCacheConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVFlashManagerVFlashCacheConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vFlashModuleConfigOption" type="{urn:internalvim25}HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="defaultVFlashModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="swapCacheReservationInGB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashManagerVFlashCacheConfigInfo", propOrder = {
    "vFlashModuleConfigOption",
    "defaultVFlashModule",
    "swapCacheReservationInGB"
})
public class HostVFlashManagerVFlashCacheConfigInfo
    extends DynamicData
{

    protected List<HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption> vFlashModuleConfigOption;
    protected String defaultVFlashModule;
    protected Long swapCacheReservationInGB;

    /**
     * Gets the value of the vFlashModuleConfigOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vFlashModuleConfigOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVFlashModuleConfigOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the vFlashModuleConfigOption property.
     */
    public List<HostVFlashManagerVFlashCacheConfigInfoVFlashModuleConfigOption> getVFlashModuleConfigOption() {
        if (vFlashModuleConfigOption == null) {
            vFlashModuleConfigOption = new ArrayList<>();
        }
        return this.vFlashModuleConfigOption;
    }

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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSwapCacheReservationInGB() {
        return swapCacheReservationInGB;
    }

    /**
     * Sets the value of the swapCacheReservationInGB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSwapCacheReservationInGB(Long value) {
        this.swapCacheReservationInGB = value;
    }

}
