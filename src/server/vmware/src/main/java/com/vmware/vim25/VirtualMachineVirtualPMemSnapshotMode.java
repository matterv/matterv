
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineVirtualPMemSnapshotMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineVirtualPMemSnapshotMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="independent_persistent"/>
 *     <enumeration value="independent_eraseonrevert"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineVirtualPMemSnapshotMode")
@XmlEnum
public enum VirtualMachineVirtualPMemSnapshotMode {

    @XmlEnumValue("independent_persistent")
    INDEPENDENT_PERSISTENT("independent_persistent"),
    @XmlEnumValue("independent_eraseonrevert")
    INDEPENDENT_ERASEONREVERT("independent_eraseonrevert");
    private final String value;

    VirtualMachineVirtualPMemSnapshotMode(String v) {
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
    public static VirtualMachineVirtualPMemSnapshotMode fromValue(String v) {
        for (VirtualMachineVirtualPMemSnapshotMode c: VirtualMachineVirtualPMemSnapshotMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
