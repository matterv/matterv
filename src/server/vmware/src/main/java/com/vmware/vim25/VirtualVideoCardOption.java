
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVideoCardOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualVideoCardOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
 *       <sequence>
 *         <element name="videoRamSizeInKB" type="{urn:internalvim25}LongOption" minOccurs="0"/>
 *         <element name="numDisplays" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="useAutoDetect" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="support3D" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="use3dRendererSupported" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *         <element name="graphicsMemorySizeInKB" type="{urn:internalvim25}LongOption" minOccurs="0"/>
 *         <element name="graphicsMemorySizeSupported" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVideoCardOption", propOrder = {
    "videoRamSizeInKB",
    "numDisplays",
    "useAutoDetect",
    "support3D",
    "use3DRendererSupported",
    "graphicsMemorySizeInKB",
    "graphicsMemorySizeSupported"
})
public class VirtualVideoCardOption
    extends VirtualDeviceOption
{

    protected LongOption videoRamSizeInKB;
    protected IntOption numDisplays;
    protected BoolOption useAutoDetect;
    protected BoolOption support3D;
    @XmlElement(name = "use3dRendererSupported")
    protected BoolOption use3DRendererSupported;
    protected LongOption graphicsMemorySizeInKB;
    protected BoolOption graphicsMemorySizeSupported;

    /**
     * Gets the value of the videoRamSizeInKB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getVideoRamSizeInKB() {
        return videoRamSizeInKB;
    }

    /**
     * Sets the value of the videoRamSizeInKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setVideoRamSizeInKB(LongOption value) {
        this.videoRamSizeInKB = value;
    }

    /**
     * Gets the value of the numDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumDisplays() {
        return numDisplays;
    }

    /**
     * Sets the value of the numDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumDisplays(IntOption value) {
        this.numDisplays = value;
    }

    /**
     * Gets the value of the useAutoDetect property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getUseAutoDetect() {
        return useAutoDetect;
    }

    /**
     * Sets the value of the useAutoDetect property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setUseAutoDetect(BoolOption value) {
        this.useAutoDetect = value;
    }

    /**
     * Gets the value of the support3D property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getSupport3D() {
        return support3D;
    }

    /**
     * Sets the value of the support3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setSupport3D(BoolOption value) {
        this.support3D = value;
    }

    /**
     * Gets the value of the use3DRendererSupported property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getUse3DRendererSupported() {
        return use3DRendererSupported;
    }

    /**
     * Sets the value of the use3DRendererSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setUse3DRendererSupported(BoolOption value) {
        this.use3DRendererSupported = value;
    }

    /**
     * Gets the value of the graphicsMemorySizeInKB property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getGraphicsMemorySizeInKB() {
        return graphicsMemorySizeInKB;
    }

    /**
     * Sets the value of the graphicsMemorySizeInKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setGraphicsMemorySizeInKB(LongOption value) {
        this.graphicsMemorySizeInKB = value;
    }

    /**
     * Gets the value of the graphicsMemorySizeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getGraphicsMemorySizeSupported() {
        return graphicsMemorySizeSupported;
    }

    /**
     * Sets the value of the graphicsMemorySizeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setGraphicsMemorySizeSupported(BoolOption value) {
        this.graphicsMemorySizeSupported = value;
    }

}
