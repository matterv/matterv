
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmPodConfigForPlacement complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmPodConfigForPlacement">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="storagePod" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="disk" type="{urn:internalvim25}PodDiskLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vmConfig" type="{urn:internalvim25}StorageDrsVmConfigInfo" minOccurs="0"/>
 *         <element name="interVmRule" type="{urn:internalvim25}ClusterRuleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPodConfigForPlacement", propOrder = {
    "storagePod",
    "disk",
    "vmConfig",
    "interVmRule"
})
public class VmPodConfigForPlacement
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference storagePod;
    protected List<PodDiskLocator> disk;
    protected StorageDrsVmConfigInfo vmConfig;
    protected List<ClusterRuleInfo> interVmRule;

    /**
     * Gets the value of the storagePod property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getStoragePod() {
        return storagePod;
    }

    /**
     * Sets the value of the storagePod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setStoragePod(ManagedObjectReference value) {
        this.storagePod = value;
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
     * {@link PodDiskLocator }
     * </p>
     * 
     * 
     * @return
     *     The value of the disk property.
     */
    public List<PodDiskLocator> getDisk() {
        if (disk == null) {
            disk = new ArrayList<>();
        }
        return this.disk;
    }

    /**
     * Gets the value of the vmConfig property.
     * 
     * @return
     *     possible object is
     *     {@link StorageDrsVmConfigInfo }
     *     
     */
    public StorageDrsVmConfigInfo getVmConfig() {
        return vmConfig;
    }

    /**
     * Sets the value of the vmConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageDrsVmConfigInfo }
     *     
     */
    public void setVmConfig(StorageDrsVmConfigInfo value) {
        this.vmConfig = value;
    }

    /**
     * Gets the value of the interVmRule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interVmRule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInterVmRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRuleInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the interVmRule property.
     */
    public List<ClusterRuleInfo> getInterVmRule() {
        if (interVmRule == null) {
            interVmRule = new ArrayList<>();
        }
        return this.interVmRule;
    }

}
