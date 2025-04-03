
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterVmOrchestrationInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterVmOrchestrationInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="vmReadiness" type="{urn:internalvim25}ClusterVmReadiness"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmOrchestrationInfo", propOrder = {
    "vm",
    "vmReadiness"
})
public class ClusterVmOrchestrationInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference vm;
    @XmlElement(required = true)
    protected ClusterVmReadiness vmReadiness;

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVm(ManagedObjectReference value) {
        this.vm = value;
    }

    /**
     * Gets the value of the vmReadiness property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterVmReadiness }
     *     
     */
    public ClusterVmReadiness getVmReadiness() {
        return vmReadiness;
    }

    /**
     * Sets the value of the vmReadiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterVmReadiness }
     *     
     */
    public void setVmReadiness(ClusterVmReadiness value) {
        this.vmReadiness = value;
    }

}
