
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineFileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineFileInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vmPathName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="snapshotDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="suspendDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="logDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ftMetadataDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileInfo", propOrder = {
    "vmPathName",
    "snapshotDirectory",
    "suspendDirectory",
    "logDirectory",
    "ftMetadataDirectory"
})
public class VirtualMachineFileInfo
    extends DynamicData
{

    protected String vmPathName;
    protected String snapshotDirectory;
    protected String suspendDirectory;
    protected String logDirectory;
    protected String ftMetadataDirectory;

    /**
     * Gets the value of the vmPathName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmPathName() {
        return vmPathName;
    }

    /**
     * Sets the value of the vmPathName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmPathName(String value) {
        this.vmPathName = value;
    }

    /**
     * Gets the value of the snapshotDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapshotDirectory() {
        return snapshotDirectory;
    }

    /**
     * Sets the value of the snapshotDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapshotDirectory(String value) {
        this.snapshotDirectory = value;
    }

    /**
     * Gets the value of the suspendDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendDirectory() {
        return suspendDirectory;
    }

    /**
     * Sets the value of the suspendDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendDirectory(String value) {
        this.suspendDirectory = value;
    }

    /**
     * Gets the value of the logDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDirectory() {
        return logDirectory;
    }

    /**
     * Sets the value of the logDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDirectory(String value) {
        this.logDirectory = value;
    }

    /**
     * Gets the value of the ftMetadataDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtMetadataDirectory() {
        return ftMetadataDirectory;
    }

    /**
     * Sets the value of the ftMetadataDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtMetadataDirectory(String value) {
        this.ftMetadataDirectory = value;
    }

}
