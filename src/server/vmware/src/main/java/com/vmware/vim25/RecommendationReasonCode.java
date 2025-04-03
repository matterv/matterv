
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for RecommendationReasonCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RecommendationReasonCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="fairnessCpuAvg"/>
 *     <enumeration value="fairnessMemAvg"/>
 *     <enumeration value="jointAffin"/>
 *     <enumeration value="antiAffin"/>
 *     <enumeration value="hostMaint"/>
 *     <enumeration value="enterStandby"/>
 *     <enumeration value="reservationCpu"/>
 *     <enumeration value="reservationMem"/>
 *     <enumeration value="powerOnVm"/>
 *     <enumeration value="powerSaving"/>
 *     <enumeration value="increaseCapacity"/>
 *     <enumeration value="checkResource"/>
 *     <enumeration value="unreservedCapacity"/>
 *     <enumeration value="vmHostHardAffinity"/>
 *     <enumeration value="vmHostSoftAffinity"/>
 *     <enumeration value="balanceDatastoreSpaceUsage"/>
 *     <enumeration value="balanceDatastoreIOLoad"/>
 *     <enumeration value="balanceDatastoreIOPSReservation"/>
 *     <enumeration value="datastoreMaint"/>
 *     <enumeration value="virtualDiskJointAffin"/>
 *     <enumeration value="virtualDiskAntiAffin"/>
 *     <enumeration value="datastoreSpaceOutage"/>
 *     <enumeration value="storagePlacement"/>
 *     <enumeration value="iolbDisabledInternal"/>
 *     <enumeration value="xvmotionPlacement"/>
 *     <enumeration value="networkBandwidthReservation"/>
 *     <enumeration value="hostInDegradation"/>
 *     <enumeration value="hostExitDegradation"/>
 *     <enumeration value="maxVmsConstraint"/>
 *     <enumeration value="ftConstraints"/>
 *     <enumeration value="vmHostAffinityPolicy"/>
 *     <enumeration value="vmHostAntiAffinityPolicy"/>
 *     <enumeration value="vmAntiAffinityPolicy"/>
 *     <enumeration value="balanceVsanUsage"/>
 *     <enumeration value="ahPlacementOptimization"/>
 *     <enumeration value="vmxUpgrade"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RecommendationReasonCode")
@XmlEnum
public enum RecommendationReasonCode {

    @XmlEnumValue("fairnessCpuAvg")
    FAIRNESS_CPU_AVG("fairnessCpuAvg"),
    @XmlEnumValue("fairnessMemAvg")
    FAIRNESS_MEM_AVG("fairnessMemAvg"),
    @XmlEnumValue("jointAffin")
    JOINT_AFFIN("jointAffin"),
    @XmlEnumValue("antiAffin")
    ANTI_AFFIN("antiAffin"),
    @XmlEnumValue("hostMaint")
    HOST_MAINT("hostMaint"),
    @XmlEnumValue("enterStandby")
    ENTER_STANDBY("enterStandby"),
    @XmlEnumValue("reservationCpu")
    RESERVATION_CPU("reservationCpu"),
    @XmlEnumValue("reservationMem")
    RESERVATION_MEM("reservationMem"),
    @XmlEnumValue("powerOnVm")
    POWER_ON_VM("powerOnVm"),
    @XmlEnumValue("powerSaving")
    POWER_SAVING("powerSaving"),
    @XmlEnumValue("increaseCapacity")
    INCREASE_CAPACITY("increaseCapacity"),
    @XmlEnumValue("checkResource")
    CHECK_RESOURCE("checkResource"),
    @XmlEnumValue("unreservedCapacity")
    UNRESERVED_CAPACITY("unreservedCapacity"),
    @XmlEnumValue("vmHostHardAffinity")
    VM_HOST_HARD_AFFINITY("vmHostHardAffinity"),
    @XmlEnumValue("vmHostSoftAffinity")
    VM_HOST_SOFT_AFFINITY("vmHostSoftAffinity"),
    @XmlEnumValue("balanceDatastoreSpaceUsage")
    BALANCE_DATASTORE_SPACE_USAGE("balanceDatastoreSpaceUsage"),
    @XmlEnumValue("balanceDatastoreIOLoad")
    BALANCE_DATASTORE_IO_LOAD("balanceDatastoreIOLoad"),
    @XmlEnumValue("balanceDatastoreIOPSReservation")
    BALANCE_DATASTORE_IOPS_RESERVATION("balanceDatastoreIOPSReservation"),
    @XmlEnumValue("datastoreMaint")
    DATASTORE_MAINT("datastoreMaint"),
    @XmlEnumValue("virtualDiskJointAffin")
    VIRTUAL_DISK_JOINT_AFFIN("virtualDiskJointAffin"),
    @XmlEnumValue("virtualDiskAntiAffin")
    VIRTUAL_DISK_ANTI_AFFIN("virtualDiskAntiAffin"),
    @XmlEnumValue("datastoreSpaceOutage")
    DATASTORE_SPACE_OUTAGE("datastoreSpaceOutage"),
    @XmlEnumValue("storagePlacement")
    STORAGE_PLACEMENT("storagePlacement"),
    @XmlEnumValue("iolbDisabledInternal")
    IOLB_DISABLED_INTERNAL("iolbDisabledInternal"),
    @XmlEnumValue("xvmotionPlacement")
    XVMOTION_PLACEMENT("xvmotionPlacement"),
    @XmlEnumValue("networkBandwidthReservation")
    NETWORK_BANDWIDTH_RESERVATION("networkBandwidthReservation"),
    @XmlEnumValue("hostInDegradation")
    HOST_IN_DEGRADATION("hostInDegradation"),
    @XmlEnumValue("hostExitDegradation")
    HOST_EXIT_DEGRADATION("hostExitDegradation"),
    @XmlEnumValue("maxVmsConstraint")
    MAX_VMS_CONSTRAINT("maxVmsConstraint"),
    @XmlEnumValue("ftConstraints")
    FT_CONSTRAINTS("ftConstraints"),
    @XmlEnumValue("vmHostAffinityPolicy")
    VM_HOST_AFFINITY_POLICY("vmHostAffinityPolicy"),
    @XmlEnumValue("vmHostAntiAffinityPolicy")
    VM_HOST_ANTI_AFFINITY_POLICY("vmHostAntiAffinityPolicy"),
    @XmlEnumValue("vmAntiAffinityPolicy")
    VM_ANTI_AFFINITY_POLICY("vmAntiAffinityPolicy"),
    @XmlEnumValue("balanceVsanUsage")
    BALANCE_VSAN_USAGE("balanceVsanUsage"),
    @XmlEnumValue("ahPlacementOptimization")
    AH_PLACEMENT_OPTIMIZATION("ahPlacementOptimization"),
    @XmlEnumValue("vmxUpgrade")
    VMX_UPGRADE("vmxUpgrade");
    private final String value;

    RecommendationReasonCode(String v) {
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
    public static RecommendationReasonCode fromValue(String v) {
        for (RecommendationReasonCode c: RecommendationReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
