
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineGuestSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineGuestSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="guestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="guestFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="toolsStatus" type="{urn:internalvim25}VirtualMachineToolsStatus" minOccurs="0"/>
 *         <element name="toolsVersionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="toolsVersionStatus2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="toolsRunningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hwVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineGuestSummary", propOrder = {
    "guestId",
    "guestFullName",
    "toolsStatus",
    "toolsVersionStatus",
    "toolsVersionStatus2",
    "toolsRunningStatus",
    "hostName",
    "ipAddress",
    "hwVersion"
})
public class VirtualMachineGuestSummary
    extends DynamicData
{

    protected String guestId;
    protected String guestFullName;
    @XmlSchemaType(name = "string")
    protected VirtualMachineToolsStatus toolsStatus;
    protected String toolsVersionStatus;
    protected String toolsVersionStatus2;
    protected String toolsRunningStatus;
    protected String hostName;
    protected String ipAddress;
    protected String hwVersion;

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

}
