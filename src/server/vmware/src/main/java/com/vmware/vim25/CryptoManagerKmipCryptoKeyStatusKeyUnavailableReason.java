
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KeyStateMissingInCache"/>
 *     <enumeration value="KeyStateClusterInvalid"/>
 *     <enumeration value="KeyStateClusterUnreachable"/>
 *     <enumeration value="KeyStateMissingInKMS"/>
 *     <enumeration value="KeyStateNotActiveOrEnabled"/>
 *     <enumeration value="KeyStateManagedByTrustAuthority"/>
 *     <enumeration value="KeyStateManagedByNKP"/>
 *     <enumeration value="NoPermissionToAccessKeyProvider"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason")
@XmlEnum
public enum CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason {

    @XmlEnumValue("KeyStateMissingInCache")
    KEY_STATE_MISSING_IN_CACHE("KeyStateMissingInCache"),
    @XmlEnumValue("KeyStateClusterInvalid")
    KEY_STATE_CLUSTER_INVALID("KeyStateClusterInvalid"),
    @XmlEnumValue("KeyStateClusterUnreachable")
    KEY_STATE_CLUSTER_UNREACHABLE("KeyStateClusterUnreachable"),
    @XmlEnumValue("KeyStateMissingInKMS")
    KEY_STATE_MISSING_IN_KMS("KeyStateMissingInKMS"),
    @XmlEnumValue("KeyStateNotActiveOrEnabled")
    KEY_STATE_NOT_ACTIVE_OR_ENABLED("KeyStateNotActiveOrEnabled"),
    @XmlEnumValue("KeyStateManagedByTrustAuthority")
    KEY_STATE_MANAGED_BY_TRUST_AUTHORITY("KeyStateManagedByTrustAuthority"),
    @XmlEnumValue("KeyStateManagedByNKP")
    KEY_STATE_MANAGED_BY_NKP("KeyStateManagedByNKP"),
    @XmlEnumValue("NoPermissionToAccessKeyProvider")
    NO_PERMISSION_TO_ACCESS_KEY_PROVIDER("NoPermissionToAccessKeyProvider");
    private final String value;

    CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason(String v) {
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
    public static CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason fromValue(String v) {
        for (CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason c: CryptoManagerKmipCryptoKeyStatusKeyUnavailableReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
