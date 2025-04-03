
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineFlagInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineFlagInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="disableAcceleration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="enableLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="useToe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="runWithDebugInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="monitorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="htSharing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="snapshotDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="snapshotLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="diskUuidEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="virtualMmuUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="virtualExecUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="snapshotPowerOffBehavior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="recordReplayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="faultToleranceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cbrcCacheEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vvtdEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vbsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFlagInfo", propOrder = {
    "disableAcceleration",
    "enableLogging",
    "useToe",
    "runWithDebugInfo",
    "monitorType",
    "htSharing",
    "snapshotDisabled",
    "snapshotLocked",
    "diskUuidEnabled",
    "virtualMmuUsage",
    "virtualExecUsage",
    "snapshotPowerOffBehavior",
    "recordReplayEnabled",
    "faultToleranceType",
    "cbrcCacheEnabled",
    "vvtdEnabled",
    "vbsEnabled"
})
public class VirtualMachineFlagInfo
    extends DynamicData
{

    protected Boolean disableAcceleration;
    protected Boolean enableLogging;
    protected Boolean useToe;
    protected Boolean runWithDebugInfo;
    protected String monitorType;
    protected String htSharing;
    protected Boolean snapshotDisabled;
    protected Boolean snapshotLocked;
    protected Boolean diskUuidEnabled;
    protected String virtualMmuUsage;
    protected String virtualExecUsage;
    protected String snapshotPowerOffBehavior;
    protected Boolean recordReplayEnabled;
    protected String faultToleranceType;
    protected Boolean cbrcCacheEnabled;
    protected Boolean vvtdEnabled;
    protected Boolean vbsEnabled;

    /**
     * Gets the value of the disableAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableAcceleration() {
        return disableAcceleration;
    }

    /**
     * Sets the value of the disableAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableAcceleration(Boolean value) {
        this.disableAcceleration = value;
    }

    /**
     * Gets the value of the enableLogging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableLogging() {
        return enableLogging;
    }

    /**
     * Sets the value of the enableLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableLogging(Boolean value) {
        this.enableLogging = value;
    }

    /**
     * Gets the value of the useToe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseToe() {
        return useToe;
    }

    /**
     * Sets the value of the useToe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseToe(Boolean value) {
        this.useToe = value;
    }

    /**
     * Gets the value of the runWithDebugInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunWithDebugInfo() {
        return runWithDebugInfo;
    }

    /**
     * Sets the value of the runWithDebugInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunWithDebugInfo(Boolean value) {
        this.runWithDebugInfo = value;
    }

    /**
     * Gets the value of the monitorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorType() {
        return monitorType;
    }

    /**
     * Sets the value of the monitorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorType(String value) {
        this.monitorType = value;
    }

    /**
     * Gets the value of the htSharing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtSharing() {
        return htSharing;
    }

    /**
     * Sets the value of the htSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtSharing(String value) {
        this.htSharing = value;
    }

    /**
     * Gets the value of the snapshotDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnapshotDisabled() {
        return snapshotDisabled;
    }

    /**
     * Sets the value of the snapshotDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapshotDisabled(Boolean value) {
        this.snapshotDisabled = value;
    }

    /**
     * Gets the value of the snapshotLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSnapshotLocked() {
        return snapshotLocked;
    }

    /**
     * Sets the value of the snapshotLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapshotLocked(Boolean value) {
        this.snapshotLocked = value;
    }

    /**
     * Gets the value of the diskUuidEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiskUuidEnabled() {
        return diskUuidEnabled;
    }

    /**
     * Sets the value of the diskUuidEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiskUuidEnabled(Boolean value) {
        this.diskUuidEnabled = value;
    }

    /**
     * Gets the value of the virtualMmuUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualMmuUsage() {
        return virtualMmuUsage;
    }

    /**
     * Sets the value of the virtualMmuUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualMmuUsage(String value) {
        this.virtualMmuUsage = value;
    }

    /**
     * Gets the value of the virtualExecUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualExecUsage() {
        return virtualExecUsage;
    }

    /**
     * Sets the value of the virtualExecUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualExecUsage(String value) {
        this.virtualExecUsage = value;
    }

    /**
     * Gets the value of the snapshotPowerOffBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapshotPowerOffBehavior() {
        return snapshotPowerOffBehavior;
    }

    /**
     * Sets the value of the snapshotPowerOffBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapshotPowerOffBehavior(String value) {
        this.snapshotPowerOffBehavior = value;
    }

    /**
     * Gets the value of the recordReplayEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordReplayEnabled() {
        return recordReplayEnabled;
    }

    /**
     * Sets the value of the recordReplayEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordReplayEnabled(Boolean value) {
        this.recordReplayEnabled = value;
    }

    /**
     * Gets the value of the faultToleranceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultToleranceType() {
        return faultToleranceType;
    }

    /**
     * Sets the value of the faultToleranceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultToleranceType(String value) {
        this.faultToleranceType = value;
    }

    /**
     * Gets the value of the cbrcCacheEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCbrcCacheEnabled() {
        return cbrcCacheEnabled;
    }

    /**
     * Sets the value of the cbrcCacheEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCbrcCacheEnabled(Boolean value) {
        this.cbrcCacheEnabled = value;
    }

    /**
     * Gets the value of the vvtdEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVvtdEnabled() {
        return vvtdEnabled;
    }

    /**
     * Sets the value of the vvtdEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVvtdEnabled(Boolean value) {
        this.vvtdEnabled = value;
    }

    /**
     * Gets the value of the vbsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVbsEnabled() {
        return vbsEnabled;
    }

    /**
     * Sets the value of the vbsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVbsEnabled(Boolean value) {
        this.vbsEnabled = value;
    }

}
