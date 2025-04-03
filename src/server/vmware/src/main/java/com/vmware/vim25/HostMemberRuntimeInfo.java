
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMemberRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostMemberRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="statusDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nsxtStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nsxtStatusDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="healthCheckResult" type="{urn:internalvim25}HostMemberHealthCheckResult" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostUplinkState" type="{urn:internalvim25}DistributedVirtualSwitchHostMemberHostUplinkState" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMemberRuntimeInfo", propOrder = {
    "host",
    "status",
    "statusDetail",
    "nsxtStatus",
    "nsxtStatusDetail",
    "healthCheckResult",
    "hostUplinkState"
})
public class HostMemberRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference host;
    protected String status;
    protected String statusDetail;
    protected String nsxtStatus;
    protected String nsxtStatusDetail;
    protected List<HostMemberHealthCheckResult> healthCheckResult;
    protected List<DistributedVirtualSwitchHostMemberHostUplinkState> hostUplinkState;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetail(String value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the nsxtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsxtStatus() {
        return nsxtStatus;
    }

    /**
     * Sets the value of the nsxtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsxtStatus(String value) {
        this.nsxtStatus = value;
    }

    /**
     * Gets the value of the nsxtStatusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsxtStatusDetail() {
        return nsxtStatusDetail;
    }

    /**
     * Sets the value of the nsxtStatusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsxtStatusDetail(String value) {
        this.nsxtStatusDetail = value;
    }

    /**
     * Gets the value of the healthCheckResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthCheckResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHealthCheckResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostMemberHealthCheckResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the healthCheckResult property.
     */
    public List<HostMemberHealthCheckResult> getHealthCheckResult() {
        if (healthCheckResult == null) {
            healthCheckResult = new ArrayList<>();
        }
        return this.healthCheckResult;
    }

    /**
     * Gets the value of the hostUplinkState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostUplinkState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostUplinkState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchHostMemberHostUplinkState }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostUplinkState property.
     */
    public List<DistributedVirtualSwitchHostMemberHostUplinkState> getHostUplinkState() {
        if (hostUplinkState == null) {
            hostUplinkState = new ArrayList<>();
        }
        return this.hostUplinkState;
    }

}
