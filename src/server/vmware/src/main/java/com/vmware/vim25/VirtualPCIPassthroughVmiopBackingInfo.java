
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPCIPassthroughVmiopBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPCIPassthroughVmiopBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualPCIPassthroughPluginBackingInfo">
 *       <sequence>
 *         <element name="vgpu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vgpuMigrateDataSizeMB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="migrateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="enhancedMigrateCapability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughVmiopBackingInfo", propOrder = {
    "vgpu",
    "vgpuMigrateDataSizeMB",
    "migrateSupported",
    "enhancedMigrateCapability"
})
public class VirtualPCIPassthroughVmiopBackingInfo
    extends VirtualPCIPassthroughPluginBackingInfo
{

    protected String vgpu;
    protected Integer vgpuMigrateDataSizeMB;
    protected Boolean migrateSupported;
    protected Boolean enhancedMigrateCapability;

    /**
     * Gets the value of the vgpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgpu() {
        return vgpu;
    }

    /**
     * Sets the value of the vgpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgpu(String value) {
        this.vgpu = value;
    }

    /**
     * Gets the value of the vgpuMigrateDataSizeMB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVgpuMigrateDataSizeMB() {
        return vgpuMigrateDataSizeMB;
    }

    /**
     * Sets the value of the vgpuMigrateDataSizeMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVgpuMigrateDataSizeMB(Integer value) {
        this.vgpuMigrateDataSizeMB = value;
    }

    /**
     * Gets the value of the migrateSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMigrateSupported() {
        return migrateSupported;
    }

    /**
     * Sets the value of the migrateSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMigrateSupported(Boolean value) {
        this.migrateSupported = value;
    }

    /**
     * Gets the value of the enhancedMigrateCapability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnhancedMigrateCapability() {
        return enhancedMigrateCapability;
    }

    /**
     * Sets the value of the enhancedMigrateCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnhancedMigrateCapability(Boolean value) {
        this.enhancedMigrateCapability = value;
    }

}
