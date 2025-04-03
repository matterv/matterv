
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LicenseAssignmentFailedReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LicenseAssignmentFailedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keyEntityMismatch"/>
 *     <enumeration value="downgradeDisallowed"/>
 *     <enumeration value="inventoryNotManageableByVirtualCenter"/>
 *     <enumeration value="hostsUnmanageableByVirtualCenterWithoutLicenseServer"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LicenseAssignmentFailedReason")
@XmlEnum
public enum LicenseAssignmentFailedReason {

    @XmlEnumValue("keyEntityMismatch")
    KEY_ENTITY_MISMATCH("keyEntityMismatch"),
    @XmlEnumValue("downgradeDisallowed")
    DOWNGRADE_DISALLOWED("downgradeDisallowed"),
    @XmlEnumValue("inventoryNotManageableByVirtualCenter")
    INVENTORY_NOT_MANAGEABLE_BY_VIRTUAL_CENTER("inventoryNotManageableByVirtualCenter"),
    @XmlEnumValue("hostsUnmanageableByVirtualCenterWithoutLicenseServer")
    HOSTS_UNMANAGEABLE_BY_VIRTUAL_CENTER_WITHOUT_LICENSE_SERVER("hostsUnmanageableByVirtualCenterWithoutLicenseServer");
    private final String value;

    LicenseAssignmentFailedReason(String v) {
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
    public static LicenseAssignmentFailedReason fromValue(String v) {
        for (LicenseAssignmentFailedReason c: LicenseAssignmentFailedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
