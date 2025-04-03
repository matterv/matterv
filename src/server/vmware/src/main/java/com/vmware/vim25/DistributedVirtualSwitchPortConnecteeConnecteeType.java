
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DistributedVirtualSwitchPortConnecteeConnecteeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DistributedVirtualSwitchPortConnecteeConnecteeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="pnic"/>
 *     <enumeration value="vmVnic"/>
 *     <enumeration value="hostConsoleVnic"/>
 *     <enumeration value="hostVmkVnic"/>
 *     <enumeration value="systemCrxVnic"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributedVirtualSwitchPortConnecteeConnecteeType")
@XmlEnum
public enum DistributedVirtualSwitchPortConnecteeConnecteeType {

    @XmlEnumValue("pnic")
    PNIC("pnic"),
    @XmlEnumValue("vmVnic")
    VM_VNIC("vmVnic"),
    @XmlEnumValue("hostConsoleVnic")
    HOST_CONSOLE_VNIC("hostConsoleVnic"),
    @XmlEnumValue("hostVmkVnic")
    HOST_VMK_VNIC("hostVmkVnic"),
    @XmlEnumValue("systemCrxVnic")
    SYSTEM_CRX_VNIC("systemCrxVnic");
    private final String value;

    DistributedVirtualSwitchPortConnecteeConnecteeType(String v) {
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
    public static DistributedVirtualSwitchPortConnecteeConnecteeType fromValue(String v) {
        for (DistributedVirtualSwitchPortConnecteeConnecteeType c: DistributedVirtualSwitchPortConnecteeConnecteeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
