
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigureHCIRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConfigureHCIRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="clusterSpec" type="{urn:internalvim25}ClusterComputeResourceHCIConfigSpec"/>
 *         <element name="hostInputs" type="{urn:internalvim25}ClusterComputeResourceHostConfigurationInput" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureHCIRequestType", propOrder = {
    "_this",
    "clusterSpec",
    "hostInputs"
})
public class ConfigureHCIRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected ClusterComputeResourceHCIConfigSpec clusterSpec;
    protected List<ClusterComputeResourceHostConfigurationInput> hostInputs;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the clusterSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterComputeResourceHCIConfigSpec }
     *     
     */
    public ClusterComputeResourceHCIConfigSpec getClusterSpec() {
        return clusterSpec;
    }

    /**
     * Sets the value of the clusterSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterComputeResourceHCIConfigSpec }
     *     
     */
    public void setClusterSpec(ClusterComputeResourceHCIConfigSpec value) {
        this.clusterSpec = value;
    }

    /**
     * Gets the value of the hostInputs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostInputs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceHostConfigurationInput }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostInputs property.
     */
    public List<ClusterComputeResourceHostConfigurationInput> getHostInputs() {
        if (hostInputs == null) {
            hostInputs = new ArrayList<>();
        }
        return this.hostInputs;
    }

}
