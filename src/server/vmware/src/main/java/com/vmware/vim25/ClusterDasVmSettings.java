
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasVmSettings complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasVmSettings">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="restartPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="restartPriorityTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="isolationResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vmToolsMonitoringSettings" type="{urn:internalvim25}ClusterVmToolsMonitoringSettings" minOccurs="0"/>
 *         <element name="vmComponentProtectionSettings" type="{urn:internalvim25}ClusterVmComponentProtectionSettings" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasVmSettings", propOrder = {
    "restartPriority",
    "restartPriorityTimeout",
    "isolationResponse",
    "vmToolsMonitoringSettings",
    "vmComponentProtectionSettings"
})
public class ClusterDasVmSettings
    extends DynamicData
{

    protected String restartPriority;
    protected Integer restartPriorityTimeout;
    protected String isolationResponse;
    protected ClusterVmToolsMonitoringSettings vmToolsMonitoringSettings;
    protected ClusterVmComponentProtectionSettings vmComponentProtectionSettings;

    /**
     * Gets the value of the restartPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestartPriority() {
        return restartPriority;
    }

    /**
     * Sets the value of the restartPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestartPriority(String value) {
        this.restartPriority = value;
    }

    /**
     * Gets the value of the restartPriorityTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestartPriorityTimeout() {
        return restartPriorityTimeout;
    }

    /**
     * Sets the value of the restartPriorityTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestartPriorityTimeout(Integer value) {
        this.restartPriorityTimeout = value;
    }

    /**
     * Gets the value of the isolationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsolationResponse() {
        return isolationResponse;
    }

    /**
     * Sets the value of the isolationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsolationResponse(String value) {
        this.isolationResponse = value;
    }

    /**
     * Gets the value of the vmToolsMonitoringSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterVmToolsMonitoringSettings }
     *     
     */
    public ClusterVmToolsMonitoringSettings getVmToolsMonitoringSettings() {
        return vmToolsMonitoringSettings;
    }

    /**
     * Sets the value of the vmToolsMonitoringSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterVmToolsMonitoringSettings }
     *     
     */
    public void setVmToolsMonitoringSettings(ClusterVmToolsMonitoringSettings value) {
        this.vmToolsMonitoringSettings = value;
    }

    /**
     * Gets the value of the vmComponentProtectionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterVmComponentProtectionSettings }
     *     
     */
    public ClusterVmComponentProtectionSettings getVmComponentProtectionSettings() {
        return vmComponentProtectionSettings;
    }

    /**
     * Sets the value of the vmComponentProtectionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterVmComponentProtectionSettings }
     *     
     */
    public void setVmComponentProtectionSettings(ClusterVmComponentProtectionSettings value) {
        this.vmComponentProtectionSettings = value;
    }

}
