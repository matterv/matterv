
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="toolsStatus" type="{urn:internalvim25}VirtualMachineToolsStatus" minOccurs="0"/>
 *         <element name="toolsVersionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="toolsVersionStatus2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="toolsRunningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="toolsVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="toolsInstallType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guestFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guestFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guestDetailedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="net" type="{urn:internalvim25}GuestNicInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipStack" type="{urn:internalvim25}GuestStackInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="disk" type="{urn:internalvim25}GuestDiskInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="screen" type="{urn:internalvim25}GuestScreenInfo" minOccurs="0"/>
 *         <element name="guestState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="appHeartbeatStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guestKernelCrashed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="appState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guestOperationsReady" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="interactiveGuestOperationsReady" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="guestStateChangeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="generationInfo" type="{urn:internalvim25}GuestInfoNamespaceGenerationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hwVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="customizationInfo" type="{urn:internalvim25}GuestInfoCustomizationInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestInfo", propOrder = {
    "toolsStatus",
    "toolsVersionStatus",
    "toolsVersionStatus2",
    "toolsRunningStatus",
    "toolsVersion",
    "toolsInstallType",
    "guestId",
    "guestFamily",
    "guestFullName",
    "guestDetailedData",
    "hostName",
    "ipAddress",
    "net",
    "ipStack",
    "disk",
    "screen",
    "guestState",
    "appHeartbeatStatus",
    "guestKernelCrashed",
    "appState",
    "guestOperationsReady",
    "interactiveGuestOperationsReady",
    "guestStateChangeSupported",
    "generationInfo",
    "hwVersion",
    "customizationInfo"
})
public class GuestInfo
    extends DynamicData
{

    @XmlSchemaType(name = "string")
    protected VirtualMachineToolsStatus toolsStatus;
    protected String toolsVersionStatus;
    protected String toolsVersionStatus2;
    protected String toolsRunningStatus;
    protected String toolsVersion;
    protected String toolsInstallType;
    protected String guestId;
    protected String guestFamily;
    protected String guestFullName;
    protected String guestDetailedData;
    protected String hostName;
    protected String ipAddress;
    protected List<GuestNicInfo> net;
    protected List<GuestStackInfo> ipStack;
    protected List<GuestDiskInfo> disk;
    protected GuestScreenInfo screen;
    @XmlElement(required = true)
    protected String guestState;
    protected String appHeartbeatStatus;
    protected Boolean guestKernelCrashed;
    protected String appState;
    protected Boolean guestOperationsReady;
    protected Boolean interactiveGuestOperationsReady;
    protected Boolean guestStateChangeSupported;
    protected List<GuestInfoNamespaceGenerationInfo> generationInfo;
    protected String hwVersion;
    protected GuestInfoCustomizationInfo customizationInfo;

    /**
     * Gets the value of the toolsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineToolsStatus }
     *     
     */
    public VirtualMachineToolsStatus getToolsStatus() {
        return toolsStatus;
    }

    /**
     * Sets the value of the toolsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineToolsStatus }
     *     
     */
    public void setToolsStatus(VirtualMachineToolsStatus value) {
        this.toolsStatus = value;
    }

    /**
     * Gets the value of the toolsVersionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolsVersionStatus() {
        return toolsVersionStatus;
    }

    /**
     * Sets the value of the toolsVersionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolsVersionStatus(String value) {
        this.toolsVersionStatus = value;
    }

    /**
     * Gets the value of the toolsVersionStatus2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolsVersionStatus2() {
        return toolsVersionStatus2;
    }

    /**
     * Sets the value of the toolsVersionStatus2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolsVersionStatus2(String value) {
        this.toolsVersionStatus2 = value;
    }

    /**
     * Gets the value of the toolsRunningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolsRunningStatus() {
        return toolsRunningStatus;
    }

    /**
     * Sets the value of the toolsRunningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolsRunningStatus(String value) {
        this.toolsRunningStatus = value;
    }

    /**
     * Gets the value of the toolsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolsVersion() {
        return toolsVersion;
    }

    /**
     * Sets the value of the toolsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolsVersion(String value) {
        this.toolsVersion = value;
    }

    /**
     * Gets the value of the toolsInstallType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolsInstallType() {
        return toolsInstallType;
    }

    /**
     * Sets the value of the toolsInstallType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolsInstallType(String value) {
        this.toolsInstallType = value;
    }

    /**
     * Gets the value of the guestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * Sets the value of the guestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestId(String value) {
        this.guestId = value;
    }

    /**
     * Gets the value of the guestFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestFamily() {
        return guestFamily;
    }

    /**
     * Sets the value of the guestFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestFamily(String value) {
        this.guestFamily = value;
    }

    /**
     * Gets the value of the guestFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestFullName() {
        return guestFullName;
    }

    /**
     * Sets the value of the guestFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestFullName(String value) {
        this.guestFullName = value;
    }

    /**
     * Gets the value of the guestDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestDetailedData() {
        return guestDetailedData;
    }

    /**
     * Sets the value of the guestDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestDetailedData(String value) {
        this.guestDetailedData = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the net property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the net property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestNicInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the net property.
     */
    public List<GuestNicInfo> getNet() {
        if (net == null) {
            net = new ArrayList<>();
        }
        return this.net;
    }

    /**
     * Gets the value of the ipStack property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipStack property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIpStack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestStackInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the ipStack property.
     */
    public List<GuestStackInfo> getIpStack() {
        if (ipStack == null) {
            ipStack = new ArrayList<>();
        }
        return this.ipStack;
    }

    /**
     * Gets the value of the disk property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disk property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestDiskInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the disk property.
     */
    public List<GuestDiskInfo> getDisk() {
        if (disk == null) {
            disk = new ArrayList<>();
        }
        return this.disk;
    }

    /**
     * Gets the value of the screen property.
     * 
     * @return
     *     possible object is
     *     {@link GuestScreenInfo }
     *     
     */
    public GuestScreenInfo getScreen() {
        return screen;
    }

    /**
     * Sets the value of the screen property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestScreenInfo }
     *     
     */
    public void setScreen(GuestScreenInfo value) {
        this.screen = value;
    }

    /**
     * Gets the value of the guestState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestState() {
        return guestState;
    }

    /**
     * Sets the value of the guestState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestState(String value) {
        this.guestState = value;
    }

    /**
     * Gets the value of the appHeartbeatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppHeartbeatStatus() {
        return appHeartbeatStatus;
    }

    /**
     * Sets the value of the appHeartbeatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppHeartbeatStatus(String value) {
        this.appHeartbeatStatus = value;
    }

    /**
     * Gets the value of the guestKernelCrashed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestKernelCrashed() {
        return guestKernelCrashed;
    }

    /**
     * Sets the value of the guestKernelCrashed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestKernelCrashed(Boolean value) {
        this.guestKernelCrashed = value;
    }

    /**
     * Gets the value of the appState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppState() {
        return appState;
    }

    /**
     * Sets the value of the appState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppState(String value) {
        this.appState = value;
    }

    /**
     * Gets the value of the guestOperationsReady property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestOperationsReady() {
        return guestOperationsReady;
    }

    /**
     * Sets the value of the guestOperationsReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestOperationsReady(Boolean value) {
        this.guestOperationsReady = value;
    }

    /**
     * Gets the value of the interactiveGuestOperationsReady property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInteractiveGuestOperationsReady() {
        return interactiveGuestOperationsReady;
    }

    /**
     * Sets the value of the interactiveGuestOperationsReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInteractiveGuestOperationsReady(Boolean value) {
        this.interactiveGuestOperationsReady = value;
    }

    /**
     * Gets the value of the guestStateChangeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestStateChangeSupported() {
        return guestStateChangeSupported;
    }

    /**
     * Sets the value of the guestStateChangeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestStateChangeSupported(Boolean value) {
        this.guestStateChangeSupported = value;
    }

    /**
     * Gets the value of the generationInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generationInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGenerationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestInfoNamespaceGenerationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the generationInfo property.
     */
    public List<GuestInfoNamespaceGenerationInfo> getGenerationInfo() {
        if (generationInfo == null) {
            generationInfo = new ArrayList<>();
        }
        return this.generationInfo;
    }

    /**
     * Gets the value of the hwVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHwVersion() {
        return hwVersion;
    }

    /**
     * Sets the value of the hwVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHwVersion(String value) {
        this.hwVersion = value;
    }

    /**
     * Gets the value of the customizationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GuestInfoCustomizationInfo }
     *     
     */
    public GuestInfoCustomizationInfo getCustomizationInfo() {
        return customizationInfo;
    }

    /**
     * Sets the value of the customizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestInfoCustomizationInfo }
     *     
     */
    public void setCustomizationInfo(GuestInfoCustomizationInfo value) {
        this.customizationInfo = value;
    }

}
