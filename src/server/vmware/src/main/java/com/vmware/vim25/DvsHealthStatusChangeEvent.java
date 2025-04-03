
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsHealthStatusChangeEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsHealthStatusChangeEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="switchUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="healthResult" type="{urn:internalvim25}HostMemberHealthCheckResult" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHealthStatusChangeEvent", propOrder = {
    "switchUuid",
    "healthResult"
})
@XmlSeeAlso({
    UplinkPortVlanTrunkedEvent.class,
    UplinkPortVlanUntrunkedEvent.class,
    MtuMatchEvent.class,
    MtuMismatchEvent.class,
    UplinkPortMtuNotSupportEvent.class,
    UplinkPortMtuSupportEvent.class,
    TeamingMatchEvent.class,
    TeamingMisMatchEvent.class
})
public class DvsHealthStatusChangeEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected String switchUuid;
    protected HostMemberHealthCheckResult healthResult;

    /**
     * Gets the value of the switchUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchUuid() {
        return switchUuid;
    }

    /**
     * Sets the value of the switchUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchUuid(String value) {
        this.switchUuid = value;
    }

    /**
     * Gets the value of the healthResult property.
     * 
     * @return
     *     possible object is
     *     {@link HostMemberHealthCheckResult }
     *     
     */
    public HostMemberHealthCheckResult getHealthResult() {
        return healthResult;
    }

    /**
     * Sets the value of the healthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMemberHealthCheckResult }
     *     
     */
    public void setHealthResult(HostMemberHealthCheckResult value) {
        this.healthResult = value;
    }

}
