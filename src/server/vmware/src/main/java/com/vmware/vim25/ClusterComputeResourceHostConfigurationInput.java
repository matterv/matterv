
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceHostConfigurationInput complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceHostConfigurationInput">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="hostVmkNics" type="{urn:internalvim25}ClusterComputeResourceHostVmkNicInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="allowedInNonMaintenanceMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHostConfigurationInput", propOrder = {
    "host",
    "hostVmkNics",
    "allowedInNonMaintenanceMode"
})
public class ClusterComputeResourceHostConfigurationInput
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference host;
    protected List<ClusterComputeResourceHostVmkNicInfo> hostVmkNics;
    protected Boolean allowedInNonMaintenanceMode;

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
     * Gets the value of the hostVmkNics property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostVmkNics property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostVmkNics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceHostVmkNicInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostVmkNics property.
     */
    public List<ClusterComputeResourceHostVmkNicInfo> getHostVmkNics() {
        if (hostVmkNics == null) {
            hostVmkNics = new ArrayList<>();
        }
        return this.hostVmkNics;
    }

    /**
     * Gets the value of the allowedInNonMaintenanceMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowedInNonMaintenanceMode() {
        return allowedInNonMaintenanceMode;
    }

    /**
     * Sets the value of the allowedInNonMaintenanceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowedInNonMaintenanceMode(Boolean value) {
        this.allowedInNonMaintenanceMode = value;
    }

}
