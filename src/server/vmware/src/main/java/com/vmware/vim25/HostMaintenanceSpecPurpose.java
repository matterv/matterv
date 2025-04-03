
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostMaintenanceSpecPurpose</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostMaintenanceSpecPurpose">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="hostUpgrade"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostMaintenanceSpecPurpose")
@XmlEnum
public enum HostMaintenanceSpecPurpose {

    @XmlEnumValue("hostUpgrade")
    HOST_UPGRADE("hostUpgrade");
    private final String value;

    HostMaintenanceSpecPurpose(String v) {
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
    public static HostMaintenanceSpecPurpose fromValue(String v) {
        for (HostMaintenanceSpecPurpose c: HostMaintenanceSpecPurpose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
