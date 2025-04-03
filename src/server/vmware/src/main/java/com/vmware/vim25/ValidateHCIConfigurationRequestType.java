
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidateHCIConfigurationRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ValidateHCIConfigurationRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="hciConfigSpec" type="{urn:internalvim25}ClusterComputeResourceHCIConfigSpec" minOccurs="0"/>
 *         <element name="hosts" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateHCIConfigurationRequestType", propOrder = {
    "_this",
    "hciConfigSpec",
    "hosts"
})
public class ValidateHCIConfigurationRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected ClusterComputeResourceHCIConfigSpec hciConfigSpec;
    protected List<ManagedObjectReference> hosts;

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
     * Gets the value of the hciConfigSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterComputeResourceHCIConfigSpec }
     *     
     */
    public ClusterComputeResourceHCIConfigSpec getHciConfigSpec() {
        return hciConfigSpec;
    }

    /**
     * Sets the value of the hciConfigSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterComputeResourceHCIConfigSpec }
     *     
     */
    public void setHciConfigSpec(ClusterComputeResourceHCIConfigSpec value) {
        this.hciConfigSpec = value;
    }

    /**
     * Gets the value of the hosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHosts().add(newItem);
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
     *     The value of the hosts property.
     */
    public List<ManagedObjectReference> getHosts() {
        if (hosts == null) {
            hosts = new ArrayList<>();
        }
        return this.hosts;
    }

}
