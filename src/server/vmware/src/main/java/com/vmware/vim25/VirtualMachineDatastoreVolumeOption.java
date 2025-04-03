
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineDatastoreVolumeOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineDatastoreVolumeOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="fileSystemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="majorVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDatastoreVolumeOption", propOrder = {
    "fileSystemType",
    "majorVersion"
})
public class VirtualMachineDatastoreVolumeOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected String fileSystemType;
    protected Integer majorVersion;

    /**
     * Gets the value of the fileSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSystemType() {
        return fileSystemType;
    }

    /**
     * Sets the value of the fileSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSystemType(String value) {
        this.fileSystemType = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMajorVersion(Integer value) {
        this.majorVersion = value;
    }

}
