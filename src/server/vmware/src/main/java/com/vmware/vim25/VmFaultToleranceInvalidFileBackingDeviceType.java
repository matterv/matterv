
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VmFaultToleranceInvalidFileBackingDeviceType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VmFaultToleranceInvalidFileBackingDeviceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="virtualFloppy"/>
 *     <enumeration value="virtualCdrom"/>
 *     <enumeration value="virtualSerialPort"/>
 *     <enumeration value="virtualParallelPort"/>
 *     <enumeration value="virtualDisk"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VmFaultToleranceInvalidFileBackingDeviceType")
@XmlEnum
public enum VmFaultToleranceInvalidFileBackingDeviceType {

    @XmlEnumValue("virtualFloppy")
    VIRTUAL_FLOPPY("virtualFloppy"),
    @XmlEnumValue("virtualCdrom")
    VIRTUAL_CDROM("virtualCdrom"),
    @XmlEnumValue("virtualSerialPort")
    VIRTUAL_SERIAL_PORT("virtualSerialPort"),
    @XmlEnumValue("virtualParallelPort")
    VIRTUAL_PARALLEL_PORT("virtualParallelPort"),
    @XmlEnumValue("virtualDisk")
    VIRTUAL_DISK("virtualDisk");
    private final String value;

    VmFaultToleranceInvalidFileBackingDeviceType(String v) {
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
    public static VmFaultToleranceInvalidFileBackingDeviceType fromValue(String v) {
        for (VmFaultToleranceInvalidFileBackingDeviceType c: VmFaultToleranceInvalidFileBackingDeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
