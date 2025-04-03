
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmDiskFileQueryFlags complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmDiskFileQueryFlags">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="diskType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="capacityKb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hardwareVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="controllerType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="diskExtents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="thin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="encryption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFileQueryFlags", propOrder = {
    "diskType",
    "capacityKb",
    "hardwareVersion",
    "controllerType",
    "diskExtents",
    "thin",
    "encryption"
})
public class VmDiskFileQueryFlags
    extends DynamicData
{

    protected boolean diskType;
    protected boolean capacityKb;
    protected boolean hardwareVersion;
    protected Boolean controllerType;
    protected Boolean diskExtents;
    protected Boolean thin;
    protected Boolean encryption;

    /**
     * Gets the value of the diskType property.
     * 
     */
    public boolean isDiskType() {
        return diskType;
    }

    /**
     * Sets the value of the diskType property.
     * 
     */
    public void setDiskType(boolean value) {
        this.diskType = value;
    }

    /**
     * Gets the value of the capacityKb property.
     * 
     */
    public boolean isCapacityKb() {
        return capacityKb;
    }

    /**
     * Sets the value of the capacityKb property.
     * 
     */
    public void setCapacityKb(boolean value) {
        this.capacityKb = value;
    }

    /**
     * Gets the value of the hardwareVersion property.
     * 
     */
    public boolean isHardwareVersion() {
        return hardwareVersion;
    }

    /**
     * Sets the value of the hardwareVersion property.
     * 
     */
    public void setHardwareVersion(boolean value) {
        this.hardwareVersion = value;
    }

    /**
     * Gets the value of the controllerType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isControllerType() {
        return controllerType;
    }

    /**
     * Sets the value of the controllerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControllerType(Boolean value) {
        this.controllerType = value;
    }

    /**
     * Gets the value of the diskExtents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiskExtents() {
        return diskExtents;
    }

    /**
     * Sets the value of the diskExtents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiskExtents(Boolean value) {
        this.diskExtents = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryption() {
        return encryption;
    }

    /**
     * Sets the value of the encryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryption(Boolean value) {
        this.encryption = value;
    }

}
