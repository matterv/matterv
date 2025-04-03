
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskRawDiskVer2BackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskRawDiskVer2BackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceDeviceBackingInfo">
 *       <sequence>
 *         <element name="descriptorFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="changeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sharing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskRawDiskVer2BackingInfo", propOrder = {
    "descriptorFileName",
    "uuid",
    "changeId",
    "sharing"
})
@XmlSeeAlso({
    VirtualDiskPartitionedRawDiskVer2BackingInfo.class
})
public class VirtualDiskRawDiskVer2BackingInfo
    extends VirtualDeviceDeviceBackingInfo
{

    @XmlElement(required = true)
    protected String descriptorFileName;
    protected String uuid;
    protected String changeId;
    protected String sharing;

    /**
     * Gets the value of the descriptorFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptorFileName() {
        return descriptorFileName;
    }

    /**
     * Sets the value of the descriptorFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptorFileName(String value) {
        this.descriptorFileName = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the changeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * Sets the value of the changeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeId(String value) {
        this.changeId = value;
    }

    /**
     * Gets the value of the sharing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharing() {
        return sharing;
    }

    /**
     * Sets the value of the sharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharing(String value) {
        this.sharing = value;
    }

}
