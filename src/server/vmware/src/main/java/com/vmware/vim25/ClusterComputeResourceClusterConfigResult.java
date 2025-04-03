
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceClusterConfigResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceClusterConfigResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="failedHosts" type="{urn:internalvim25}FolderFailedHostResult" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="configuredHosts" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceClusterConfigResult", propOrder = {
    "failedHosts",
    "configuredHosts"
})
public class ClusterComputeResourceClusterConfigResult
    extends DynamicData
{

    protected List<FolderFailedHostResult> failedHosts;
    protected List<ManagedObjectReference> configuredHosts;

    /**
     * Gets the value of the failedHosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failedHosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFailedHosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderFailedHostResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the failedHosts property.
     */
    public List<FolderFailedHostResult> getFailedHosts() {
        if (failedHosts == null) {
            failedHosts = new ArrayList<>();
        }
        return this.failedHosts;
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

}
