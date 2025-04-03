
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostLowLevelProvisioningManagerFileReserveSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostLowLevelProvisioningManagerFileReserveSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="baseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="parentDir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="storageProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerFileReserveSpec", propOrder = {
    "baseName",
    "parentDir",
    "fileType",
    "storageProfile"
})
public class HostLowLevelProvisioningManagerFileReserveSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String baseName;
    @XmlElement(required = true)
    protected String parentDir;
    @XmlElement(required = true)
    protected String fileType;
    @XmlElement(required = true)
    protected String storageProfile;

    /**
     * Gets the value of the baseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseName() {
        return baseName;
    }

    /**
     * Sets the value of the baseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseName(String value) {
        this.baseName = value;
    }

    /**
     * Gets the value of the parentDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDir() {
        return parentDir;
    }

    /**
     * Sets the value of the parentDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDir(String value) {
        this.parentDir = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the storageProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageProfile() {
        return storageProfile;
    }

    /**
     * Sets the value of the storageProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageProfile(String value) {
        this.storageProfile = value;
    }

}
