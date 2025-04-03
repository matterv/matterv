
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceHCIConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceHCIConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dvsProf" type="{urn:internalvim25}ClusterComputeResourceDvsProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostConfigProfile" type="{urn:internalvim25}ClusterComputeResourceHostConfigurationProfile" minOccurs="0"/>
 *         <element name="vSanConfigSpec" type="{urn:internalvim25}SDDCBase" minOccurs="0"/>
 *         <element name="vcProf" type="{urn:internalvim25}ClusterComputeResourceVCProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHCIConfigSpec", propOrder = {
    "dvsProf",
    "hostConfigProfile",
    "vSanConfigSpec",
    "vcProf"
})
public class ClusterComputeResourceHCIConfigSpec
    extends DynamicData
{

    protected List<ClusterComputeResourceDvsProfile> dvsProf;
    protected ClusterComputeResourceHostConfigurationProfile hostConfigProfile;
    protected SDDCBase vSanConfigSpec;
    protected ClusterComputeResourceVCProfile vcProf;

    /**
     * Gets the value of the dvsProf property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvsProf property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDvsProf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceDvsProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvsProf property.
     */
    public List<ClusterComputeResourceDvsProfile> getDvsProf() {
        if (dvsProf == null) {
            dvsProf = new ArrayList<>();
        }
        return this.dvsProf;
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

    /**
     * Gets the value of the vSanConfigSpec property.
     * 
     * @return
     *     possible object is
     *     {@link SDDCBase }
     *     
     */
    public SDDCBase getVSanConfigSpec() {
        return vSanConfigSpec;
    }

    /**
     * Sets the value of the vSanConfigSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDDCBase }
     *     
     */
    public void setVSanConfigSpec(SDDCBase value) {
        this.vSanConfigSpec = value;
    }

    /**
     * Gets the value of the vcProf property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterComputeResourceVCProfile }
     *     
     */
    public ClusterComputeResourceVCProfile getVcProf() {
        return vcProf;
    }

    /**
     * Sets the value of the vcProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterComputeResourceVCProfile }
     *     
     */
    public void setVcProf(ClusterComputeResourceVCProfile value) {
        this.vcProf = value;
    }

}
