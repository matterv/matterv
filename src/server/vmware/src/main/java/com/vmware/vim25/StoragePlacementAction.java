
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoragePlacementAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StoragePlacementAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterAction">
 *       <sequence>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="relocateSpec" type="{urn:internalvim25}VirtualMachineRelocateSpec"/>
 *         <element name="destination" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="spaceUtilBefore" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="spaceDemandBefore" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="spaceUtilAfter" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="spaceDemandAfter" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ioLatencyBefore" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoragePlacementAction", propOrder = {
    "vm",
    "relocateSpec",
    "destination",
    "spaceUtilBefore",
    "spaceDemandBefore",
    "spaceUtilAfter",
    "spaceDemandAfter",
    "ioLatencyBefore"
})
public class StoragePlacementAction
    extends ClusterAction
{

    protected ManagedObjectReference vm;
    @XmlElement(required = true)
    protected VirtualMachineRelocateSpec relocateSpec;
    @XmlElement(required = true)
    protected ManagedObjectReference destination;
    protected Float spaceUtilBefore;
    protected Float spaceDemandBefore;
    protected Float spaceUtilAfter;
    protected Float spaceDemandAfter;
    protected Float ioLatencyBefore;

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
     * Gets the value of the relocateSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRelocateSpec }
     *     
     */
    public VirtualMachineRelocateSpec getRelocateSpec() {
        return relocateSpec;
    }

    /**
     * Sets the value of the relocateSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRelocateSpec }
     *     
     */
    public void setRelocateSpec(VirtualMachineRelocateSpec value) {
        this.relocateSpec = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDestination(ManagedObjectReference value) {
        this.destination = value;
    }

    /**
     * Gets the value of the spaceUtilBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpaceUtilBefore() {
        return spaceUtilBefore;
    }

    /**
     * Sets the value of the spaceUtilBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpaceUtilBefore(Float value) {
        this.spaceUtilBefore = value;
    }

    /**
     * Gets the value of the spaceDemandBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpaceDemandBefore() {
        return spaceDemandBefore;
    }

    /**
     * Sets the value of the spaceDemandBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpaceDemandBefore(Float value) {
        this.spaceDemandBefore = value;
    }

    /**
     * Gets the value of the spaceUtilAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpaceUtilAfter() {
        return spaceUtilAfter;
    }

    /**
     * Sets the value of the spaceUtilAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpaceUtilAfter(Float value) {
        this.spaceUtilAfter = value;
    }

    /**
     * Gets the value of the spaceDemandAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpaceDemandAfter() {
        return spaceDemandAfter;
    }

    /**
     * Sets the value of the spaceDemandAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpaceDemandAfter(Float value) {
        this.spaceDemandAfter = value;
    }

    /**
     * Gets the value of the ioLatencyBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIoLatencyBefore() {
        return ioLatencyBefore;
    }

    /**
     * Sets the value of the ioLatencyBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIoLatencyBefore(Float value) {
        this.ioLatencyBefore = value;
    }

}
