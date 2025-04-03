
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultToleranceSecondaryOpResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FaultToleranceSecondaryOpResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="powerOnAttempted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="powerOnResult" type="{urn:internalvim25}ClusterPowerOnVmResult" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceSecondaryOpResult", propOrder = {
    "vm",
    "powerOnAttempted",
    "powerOnResult"
})
public class FaultToleranceSecondaryOpResult
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference vm;
    protected boolean powerOnAttempted;
    protected ClusterPowerOnVmResult powerOnResult;

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
     * Gets the value of the powerOnAttempted property.
     * 
     */
    public boolean isPowerOnAttempted() {
        return powerOnAttempted;
    }

    /**
     * Sets the value of the powerOnAttempted property.
     * 
     */
    public void setPowerOnAttempted(boolean value) {
        this.powerOnAttempted = value;
    }

    /**
     * Gets the value of the powerOnResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterPowerOnVmResult }
     *     
     */
    public ClusterPowerOnVmResult getPowerOnResult() {
        return powerOnResult;
    }

    /**
     * Sets the value of the powerOnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterPowerOnVmResult }
     *     
     */
    public void setPowerOnResult(ClusterPowerOnVmResult value) {
        this.powerOnResult = value;
    }

}
