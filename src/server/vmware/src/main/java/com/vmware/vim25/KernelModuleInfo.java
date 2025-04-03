
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KernelModuleInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KernelModuleInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="optionString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="loaded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="readOnlySection" type="{urn:internalvim25}KernelModuleSectionInfo"/>
 *         <element name="writableSection" type="{urn:internalvim25}KernelModuleSectionInfo"/>
 *         <element name="textSection" type="{urn:internalvim25}KernelModuleSectionInfo"/>
 *         <element name="dataSection" type="{urn:internalvim25}KernelModuleSectionInfo"/>
 *         <element name="bssSection" type="{urn:internalvim25}KernelModuleSectionInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KernelModuleInfo", propOrder = {
    "id",
    "name",
    "version",
    "filename",
    "optionString",
    "loaded",
    "enabled",
    "useCount",
    "readOnlySection",
    "writableSection",
    "textSection",
    "dataSection",
    "bssSection"
})
public class KernelModuleInfo
    extends DynamicData
{

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String filename;
    @XmlElement(required = true)
    protected String optionString;
    protected boolean loaded;
    protected boolean enabled;
    protected int useCount;
    @XmlElement(required = true)
    protected KernelModuleSectionInfo readOnlySection;
    @XmlElement(required = true)
    protected KernelModuleSectionInfo writableSection;
    @XmlElement(required = true)
    protected KernelModuleSectionInfo textSection;
    @XmlElement(required = true)
    protected KernelModuleSectionInfo dataSection;
    @XmlElement(required = true)
    protected KernelModuleSectionInfo bssSection;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the optionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionString() {
        return optionString;
    }

    /**
     * Sets the value of the optionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionString(String value) {
        this.optionString = value;
    }

    /**
     * Gets the value of the loaded property.
     * 
     */
    public boolean isLoaded() {
        return loaded;
    }

    /**
     * Sets the value of the loaded property.
     * 
     */
    public void setLoaded(boolean value) {
        this.loaded = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the useCount property.
     * 
     */
    public int getUseCount() {
        return useCount;
    }

    /**
     * Sets the value of the useCount property.
     * 
     */
    public void setUseCount(int value) {
        this.useCount = value;
    }

    /**
     * Gets the value of the readOnlySection property.
     * 
     * @return
     *     possible object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public KernelModuleSectionInfo getReadOnlySection() {
        return readOnlySection;
    }

    /**
     * Sets the value of the readOnlySection property.
     * 
     * @param value
     *     allowed object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public void setReadOnlySection(KernelModuleSectionInfo value) {
        this.readOnlySection = value;
    }

    /**
     * Gets the value of the writableSection property.
     * 
     * @return
     *     possible object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public KernelModuleSectionInfo getWritableSection() {
        return writableSection;
    }

    /**
     * Sets the value of the writableSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public void setWritableSection(KernelModuleSectionInfo value) {
        this.writableSection = value;
    }

    /**
     * Gets the value of the textSection property.
     * 
     * @return
     *     possible object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public KernelModuleSectionInfo getTextSection() {
        return textSection;
    }

    /**
     * Sets the value of the textSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public void setTextSection(KernelModuleSectionInfo value) {
        this.textSection = value;
    }

    /**
     * Gets the value of the dataSection property.
     * 
     * @return
     *     possible object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public KernelModuleSectionInfo getDataSection() {
        return dataSection;
    }

    /**
     * Sets the value of the dataSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public void setDataSection(KernelModuleSectionInfo value) {
        this.dataSection = value;
    }

    /**
     * Gets the value of the bssSection property.
     * 
     * @return
     *     possible object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public KernelModuleSectionInfo getBssSection() {
        return bssSection;
    }

    /**
     * Sets the value of the bssSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link KernelModuleSectionInfo }
     *     
     */
    public void setBssSection(KernelModuleSectionInfo value) {
        this.bssSection = value;
    }

}
