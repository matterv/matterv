
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DistributedVirtualSwitchHostInfrastructureTrafficClass</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DistributedVirtualSwitchHostInfrastructureTrafficClass">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="management"/>
 *     <enumeration value="faultTolerance"/>
 *     <enumeration value="vmotion"/>
 *     <enumeration value="virtualMachine"/>
 *     <enumeration value="iSCSI"/>
 *     <enumeration value="nfs"/>
 *     <enumeration value="hbr"/>
 *     <enumeration value="vsan"/>
 *     <enumeration value="vdp"/>
 *     <enumeration value="backupNfc"/>
 *     <enumeration value="nvmetcp"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributedVirtualSwitchHostInfrastructureTrafficClass")
@XmlEnum
public enum DistributedVirtualSwitchHostInfrastructureTrafficClass {

    @XmlEnumValue("management")
    MANAGEMENT("management"),
    @XmlEnumValue("faultTolerance")
    FAULT_TOLERANCE("faultTolerance"),
    @XmlEnumValue("vmotion")
    VMOTION("vmotion"),
    @XmlEnumValue("virtualMachine")
    VIRTUAL_MACHINE("virtualMachine"),
    @XmlEnumValue("iSCSI")
    I_SCSI("iSCSI"),
    @XmlEnumValue("nfs")
    NFS("nfs"),
    @XmlEnumValue("hbr")
    HBR("hbr"),
    @XmlEnumValue("vsan")
    VSAN("vsan"),
    @XmlEnumValue("vdp")
    VDP("vdp"),
    @XmlEnumValue("backupNfc")
    BACKUP_NFC("backupNfc"),
    @XmlEnumValue("nvmetcp")
    NVMETCP("nvmetcp");
    private final String value;

    DistributedVirtualSwitchHostInfrastructureTrafficClass(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static DistributedVirtualSwitchHostInfrastructureTrafficClass fromValue(String v) {
        for (DistributedVirtualSwitchHostInfrastructureTrafficClass c: DistributedVirtualSwitchHostInfrastructureTrafficClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
