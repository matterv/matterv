
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthSystemRuntime complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HealthSystemRuntime">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="systemHealthInfo" type="{urn:internalvim25}HostSystemHealthInfo" minOccurs="0"/>
 *         <element name="hardwareStatusInfo" type="{urn:internalvim25}HostHardwareStatusInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthSystemRuntime", propOrder = {
    "systemHealthInfo",
    "hardwareStatusInfo"
})
public class HealthSystemRuntime
    extends DynamicData
{

    protected HostSystemHealthInfo systemHealthInfo;
    protected HostHardwareStatusInfo hardwareStatusInfo;

    /**
     * Gets the value of the systemHealthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostSystemHealthInfo }
     *     
     */
    public HostSystemHealthInfo getSystemHealthInfo() {
        return systemHealthInfo;
    }

    /**
     * Sets the value of the systemHealthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSystemHealthInfo }
     *     
     */
    public void setSystemHealthInfo(HostSystemHealthInfo value) {
        this.systemHealthInfo = value;
    }

    /**
     * Gets the value of the hardwareStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostHardwareStatusInfo }
     *     
     */
    public HostHardwareStatusInfo getHardwareStatusInfo() {
        return hardwareStatusInfo;
    }

    /**
     * Sets the value of the hardwareStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostHardwareStatusInfo }
     *     
     */
    public void setHardwareStatusInfo(HostHardwareStatusInfo value) {
        this.hardwareStatusInfo = value;
    }

}
