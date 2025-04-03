
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterHostPowerAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterHostPowerAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterAction">
 *       <sequence>
 *         <element name="operationType" type="{urn:internalvim25}HostPowerOperationType"/>
 *         <element name="powerConsumptionWatt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="cpuCapacityMHz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="memCapacityMB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterHostPowerAction", propOrder = {
    "operationType",
    "powerConsumptionWatt",
    "cpuCapacityMHz",
    "memCapacityMB"
})
public class ClusterHostPowerAction
    extends ClusterAction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HostPowerOperationType operationType;
    protected Integer powerConsumptionWatt;
    protected Integer cpuCapacityMHz;
    protected Integer memCapacityMB;

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link HostPowerOperationType }
     *     
     */
    public HostPowerOperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPowerOperationType }
     *     
     */
    public void setOperationType(HostPowerOperationType value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the powerConsumptionWatt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPowerConsumptionWatt() {
        return powerConsumptionWatt;
    }

    /**
     * Sets the value of the powerConsumptionWatt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPowerConsumptionWatt(Integer value) {
        this.powerConsumptionWatt = value;
    }

    /**
     * Gets the value of the cpuCapacityMHz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpuCapacityMHz() {
        return cpuCapacityMHz;
    }

    /**
     * Sets the value of the cpuCapacityMHz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpuCapacityMHz(Integer value) {
        this.cpuCapacityMHz = value;
    }

    /**
     * Gets the value of the memCapacityMB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemCapacityMB() {
        return memCapacityMB;
    }

    /**
     * Sets the value of the memCapacityMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemCapacityMB(Integer value) {
        this.memCapacityMB = value;
    }

}
