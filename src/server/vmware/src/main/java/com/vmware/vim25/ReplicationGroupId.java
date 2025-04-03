
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationGroupId complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReplicationGroupId">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="faultDomainId" type="{urn:internalvim25}FaultDomainId"/>
 *         <element name="deviceGroupId" type="{urn:internalvim25}DeviceGroupId"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationGroupId", propOrder = {
    "faultDomainId",
    "deviceGroupId"
})
public class ReplicationGroupId
    extends DynamicData
{

    @XmlElement(required = true)
    protected FaultDomainId faultDomainId;
    @XmlElement(required = true)
    protected DeviceGroupId deviceGroupId;

    /**
     * Gets the value of the faultDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link FaultDomainId }
     *     
     */
    public FaultDomainId getFaultDomainId() {
        return faultDomainId;
    }

    /**
     * Sets the value of the faultDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultDomainId }
     *     
     */
    public void setFaultDomainId(FaultDomainId value) {
        this.faultDomainId = value;
    }

    /**
     * Gets the value of the deviceGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceGroupId }
     *     
     */
    public DeviceGroupId getDeviceGroupId() {
        return deviceGroupId;
    }

    /**
     * Sets the value of the deviceGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceGroupId }
     *     
     */
    public void setDeviceGroupId(DeviceGroupId value) {
        this.deviceGroupId = value;
    }

}
