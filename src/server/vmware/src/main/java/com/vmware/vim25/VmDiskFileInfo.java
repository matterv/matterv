
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmDiskFileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmDiskFileInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}FileInfo">
 *       <sequence>
 *         <element name="diskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="capacityKb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="hardwareVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="controllerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="diskExtents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="thin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryption" type="{urn:internalvim25}VmDiskFileEncryptionInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFileInfo", propOrder = {
    "diskType",
    "capacityKb",
    "hardwareVersion",
    "controllerType",
    "diskExtents",
    "thin",
    "encryption"
})
public class VmDiskFileInfo
    extends FileInfo
{

    protected String diskType;
    protected Long capacityKb;
    protected Integer hardwareVersion;
    protected String controllerType;
    protected List<String> diskExtents;
    protected Boolean thin;
    protected VmDiskFileEncryptionInfo encryption;

    /**
     * Gets the value of the diskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * Sets the value of the diskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskType(String value) {
        this.diskType = value;
    }

    /**
     * Gets the value of the capacityKb property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacityKb() {
        return capacityKb;
    }

    /**
     * Sets the value of the capacityKb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacityKb(Long value) {
        this.capacityKb = value;
    }

    /**
     * Gets the value of the hardwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHardwareVersion() {
        return hardwareVersion;
    }

    /**
     * Sets the value of the hardwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHardwareVersion(Integer value) {
        this.hardwareVersion = value;
    }

    /**
     * Gets the value of the controllerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerType() {
        return controllerType;
    }

    /**
     * Sets the value of the controllerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerType(String value) {
        this.controllerType = value;
    }

    /**
     * Gets the value of the diskExtents property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diskExtents property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiskExtents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the diskExtents property.
     */
    public List<String> getDiskExtents() {
        if (diskExtents == null) {
            diskExtents = new ArrayList<>();
        }
        return this.diskExtents;
    }

    /**
     * Gets the value of the thin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThin() {
        return thin;
    }

    /**
     * Sets the value of the thin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThin(Boolean value) {
        this.thin = value;
    }

    /**
     * Gets the value of the encryption property.
     * 
     * @return
     *     possible object is
     *     {@link VmDiskFileEncryptionInfo }
     *     
     */
    public VmDiskFileEncryptionInfo getEncryption() {
        return encryption;
    }

    /**
     * Sets the value of the encryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmDiskFileEncryptionInfo }
     *     
     */
    public void setEncryption(VmDiskFileEncryptionInfo value) {
        this.encryption = value;
    }

}
