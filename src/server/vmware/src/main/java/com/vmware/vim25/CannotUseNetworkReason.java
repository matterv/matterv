
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for CannotUseNetworkReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CannotUseNetworkReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NetworkReservationNotSupported"/>
 *     <enumeration value="MismatchedNetworkPolicies"/>
 *     <enumeration value="MismatchedDvsVersionOrVendor"/>
 *     <enumeration value="VMotionToUnsupportedNetworkType"/>
 *     <enumeration value="NetworkUnderMaintenance"/>
 *     <enumeration value="MismatchedEnsMode"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CannotUseNetworkReason")
@XmlEnum
public enum CannotUseNetworkReason {

    @XmlEnumValue("NetworkReservationNotSupported")
    NETWORK_RESERVATION_NOT_SUPPORTED("NetworkReservationNotSupported"),
    @XmlEnumValue("MismatchedNetworkPolicies")
    MISMATCHED_NETWORK_POLICIES("MismatchedNetworkPolicies"),
    @XmlEnumValue("MismatchedDvsVersionOrVendor")
    MISMATCHED_DVS_VERSION_OR_VENDOR("MismatchedDvsVersionOrVendor"),
    @XmlEnumValue("VMotionToUnsupportedNetworkType")
    V_MOTION_TO_UNSUPPORTED_NETWORK_TYPE("VMotionToUnsupportedNetworkType"),
    @XmlEnumValue("NetworkUnderMaintenance")
    NETWORK_UNDER_MAINTENANCE("NetworkUnderMaintenance"),
    @XmlEnumValue("MismatchedEnsMode")
    MISMATCHED_ENS_MODE("MismatchedEnsMode");
    private final String value;

    CannotUseNetworkReason(String v) {
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
    public static CannotUseNetworkReason fromValue(String v) {
        for (CannotUseNetworkReason c: CannotUseNetworkReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
