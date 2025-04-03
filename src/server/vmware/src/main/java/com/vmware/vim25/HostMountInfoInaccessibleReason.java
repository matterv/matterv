
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostMountInfoInaccessibleReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostMountInfoInaccessibleReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AllPathsDown_Start"/>
 *     <enumeration value="AllPathsDown_Timeout"/>
 *     <enumeration value="PermanentDeviceLoss"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostMountInfoInaccessibleReason")
@XmlEnum
public enum HostMountInfoInaccessibleReason {

    @XmlEnumValue("AllPathsDown_Start")
    ALL_PATHS_DOWN_START("AllPathsDown_Start"),
    @XmlEnumValue("AllPathsDown_Timeout")
    ALL_PATHS_DOWN_TIMEOUT("AllPathsDown_Timeout"),
    @XmlEnumValue("PermanentDeviceLoss")
    PERMANENT_DEVICE_LOSS("PermanentDeviceLoss");
    private final String value;

    HostMountInfoInaccessibleReason(String v) {
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
    public static HostMountInfoInaccessibleReason fromValue(String v) {
        for (HostMountInfoInaccessibleReason c: HostMountInfoInaccessibleReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
