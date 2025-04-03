
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineScsiPassthroughType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineScsiPassthroughType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="disk"/>
 *     <enumeration value="tape"/>
 *     <enumeration value="printer"/>
 *     <enumeration value="processor"/>
 *     <enumeration value="worm"/>
 *     <enumeration value="cdrom"/>
 *     <enumeration value="scanner"/>
 *     <enumeration value="optical"/>
 *     <enumeration value="media"/>
 *     <enumeration value="com"/>
 *     <enumeration value="raid"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineScsiPassthroughType")
@XmlEnum
public enum VirtualMachineScsiPassthroughType {

    @XmlEnumValue("disk")
    DISK("disk"),
    @XmlEnumValue("tape")
    TAPE("tape"),
    @XmlEnumValue("printer")
    PRINTER("printer"),
    @XmlEnumValue("processor")
    PROCESSOR("processor"),
    @XmlEnumValue("worm")
    WORM("worm"),
    @XmlEnumValue("cdrom")
    CDROM("cdrom"),
    @XmlEnumValue("scanner")
    SCANNER("scanner"),
    @XmlEnumValue("optical")
    OPTICAL("optical"),
    @XmlEnumValue("media")
    MEDIA("media"),
    @XmlEnumValue("com")
    COM("com"),
    @XmlEnumValue("raid")
    RAID("raid"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    VirtualMachineScsiPassthroughType(String v) {
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
    public static VirtualMachineScsiPassthroughType fromValue(String v) {
        for (VirtualMachineScsiPassthroughType c: VirtualMachineScsiPassthroughType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
