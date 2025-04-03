
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceHCIConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceHCIConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="workflowState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dvsSetting" type="{urn:internalvim25}ClusterComputeResourceDVSSetting" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="configuredHosts" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostConfigProfile" type="{urn:internalvim25}ClusterComputeResourceHostConfigurationProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHCIConfigInfo", propOrder = {
    "workflowState",
    "dvsSetting",
    "configuredHosts",
    "hostConfigProfile"
})
public class ClusterComputeResourceHCIConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String workflowState;
    protected List<ClusterComputeResourceDVSSetting> dvsSetting;
    protected List<ManagedObjectReference> configuredHosts;
    protected ClusterComputeResourceHostConfigurationProfile hostConfigProfile;

    /**
     * Gets the value of the workflowState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowState() {
        return workflowState;
    }

    /**
     * Sets the value of the workflowState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowState(String value) {
        this.workflowState = value;
    }

    /**
     * Gets the value of the dvsSetting property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvsSetting property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDvsSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceDVSSetting }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvsSetting property.
     */
    public List<ClusterComputeResourceDVSSetting> getDvsSetting() {
        if (dvsSetting == null) {
            dvsSetting = new ArrayList<>();
        }
        return this.dvsSetting;
    }

    /**
     * Gets the value of the configuredHosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredHosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfiguredHosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the configuredHosts property.
     */
    public List<ManagedObjectReference> getConfiguredHosts() {
        if (configuredHosts == null) {
            configuredHosts = new ArrayList<>();
        }
        return this.configuredHosts;
    }

    /**
     * Gets the value of the hostConfigProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterComputeResourceHostConfigurationProfile }
     *     
     */
    public ClusterComputeResourceHostConfigurationProfile getHostConfigProfile() {
        return hostConfigProfile;
    }

    /**
     * Sets the value of the hostConfigProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterComputeResourceHostConfigurationProfile }
     *     
     */
    public void setHostConfigProfile(ClusterComputeResourceHostConfigurationProfile value) {
        this.hostConfigProfile = value;
    }

}
