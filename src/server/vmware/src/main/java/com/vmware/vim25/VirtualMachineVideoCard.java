
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVideoCard complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVideoCard">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDevice">
 *       <sequence>
 *         <element name="videoRamSizeInKB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="numDisplays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="useAutoDetect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="enable3DSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="use3dRenderer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="graphicsMemorySizeInKB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVideoCard", propOrder = {
    "videoRamSizeInKB",
    "numDisplays",
    "useAutoDetect",
    "enable3DSupport",
    "use3DRenderer",
    "graphicsMemorySizeInKB"
})
public class VirtualMachineVideoCard
    extends VirtualDevice
{

    protected Long videoRamSizeInKB;
    protected Integer numDisplays;
    protected Boolean useAutoDetect;
    protected Boolean enable3DSupport;
    @XmlElement(name = "use3dRenderer")
    protected String use3DRenderer;
    protected Long graphicsMemorySizeInKB;

    /**
     * Gets the value of the videoRamSizeInKB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoRamSizeInKB() {
        return videoRamSizeInKB;
    }

    /**
     * Sets the value of the videoRamSizeInKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoRamSizeInKB(Long value) {
        this.videoRamSizeInKB = value;
    }

    /**
     * Gets the value of the numDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDisplays() {
        return numDisplays;
    }

    /**
     * Sets the value of the numDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDisplays(Integer value) {
        this.numDisplays = value;
    }

    /**
     * Gets the value of the useAutoDetect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAutoDetect() {
        return useAutoDetect;
    }

    /**
     * Sets the value of the useAutoDetect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAutoDetect(Boolean value) {
        this.useAutoDetect = value;
    }

    /**
     * Gets the value of the enable3DSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnable3DSupport() {
        return enable3DSupport;
    }

    /**
     * Sets the value of the enable3DSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnable3DSupport(Boolean value) {
        this.enable3DSupport = value;
    }

    /**
     * Gets the value of the use3DRenderer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUse3DRenderer() {
        return use3DRenderer;
    }

    /**
     * Sets the value of the use3DRenderer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUse3DRenderer(String value) {
        this.use3DRenderer = value;
    }

    /**
     * Gets the value of the graphicsMemorySizeInKB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGraphicsMemorySizeInKB() {
        return graphicsMemorySizeInKB;
    }

    /**
     * Sets the value of the graphicsMemorySizeInKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGraphicsMemorySizeInKB(Long value) {
        this.graphicsMemorySizeInKB = value;
    }

}
