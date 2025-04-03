
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostVsanDiskInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostVsanDiskInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vsanUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="formatVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostVsanDiskInfo", propOrder = {
    "vsanUuid",
    "formatVersion"
})
public class VsanHostVsanDiskInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String vsanUuid;
    protected int formatVersion;

    /**
     * Gets the value of the vsanUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsanUuid() {
        return vsanUuid;
    }

    /**
     * Sets the value of the vsanUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsanUuid(String value) {
        this.vsanUuid = value;
    }

    /**
     * Gets the value of the formatVersion property.
     * 
     */
    public int getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     * 
     */
    public void setFormatVersion(int value) {
        this.formatVersion = value;
    }

}
