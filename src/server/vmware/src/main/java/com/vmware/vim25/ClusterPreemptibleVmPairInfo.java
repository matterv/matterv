
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterPreemptibleVmPairInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterPreemptibleVmPairInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="monitoredVm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="preemptibleVm" type="{urn:internalvim25}ManagedObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterPreemptibleVmPairInfo", propOrder = {
    "id",
    "monitoredVm",
    "preemptibleVm"
})
public class ClusterPreemptibleVmPairInfo
    extends DynamicData
{

    protected Integer id;
    @XmlElement(required = true)
    protected ManagedObjectReference monitoredVm;
    @XmlElement(required = true)
    protected ManagedObjectReference preemptibleVm;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the monitoredVm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getMonitoredVm() {
        return monitoredVm;
    }

    /**
     * Sets the value of the monitoredVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setMonitoredVm(ManagedObjectReference value) {
        this.monitoredVm = value;
    }

    /**
     * Gets the value of the preemptibleVm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPreemptibleVm() {
        return preemptibleVm;
    }

    /**
     * Sets the value of the preemptibleVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPreemptibleVm(ManagedObjectReference value) {
        this.preemptibleVm = value;
    }

}
