
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineUsbInfoFamily</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineUsbInfoFamily">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="audio"/>
 *     <enumeration value="hid"/>
 *     <enumeration value="hid_bootable"/>
 *     <enumeration value="physical"/>
 *     <enumeration value="communication"/>
 *     <enumeration value="imaging"/>
 *     <enumeration value="printer"/>
 *     <enumeration value="storage"/>
 *     <enumeration value="hub"/>
 *     <enumeration value="smart_card"/>
 *     <enumeration value="security"/>
 *     <enumeration value="video"/>
 *     <enumeration value="wireless"/>
 *     <enumeration value="bluetooth"/>
 *     <enumeration value="wusb"/>
 *     <enumeration value="pda"/>
 *     <enumeration value="vendor_specific"/>
 *     <enumeration value="other"/>
 *     <enumeration value="unknownFamily"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineUsbInfoFamily")
@XmlEnum
public enum VirtualMachineUsbInfoFamily {

    @XmlEnumValue("audio")
    AUDIO("audio"),
    @XmlEnumValue("hid")
    HID("hid"),
    @XmlEnumValue("hid_bootable")
    HID_BOOTABLE("hid_bootable"),
    @XmlEnumValue("physical")
    PHYSICAL("physical"),
    @XmlEnumValue("communication")
    COMMUNICATION("communication"),
    @XmlEnumValue("imaging")
    IMAGING("imaging"),
    @XmlEnumValue("printer")
    PRINTER("printer"),
    @XmlEnumValue("storage")
    STORAGE("storage"),
    @XmlEnumValue("hub")
    HUB("hub"),
    @XmlEnumValue("smart_card")
    SMART_CARD("smart_card"),
    @XmlEnumValue("security")
    SECURITY("security"),
    @XmlEnumValue("video")
    VIDEO("video"),
    @XmlEnumValue("wireless")
    WIRELESS("wireless"),
    @XmlEnumValue("bluetooth")
    BLUETOOTH("bluetooth"),
    @XmlEnumValue("wusb")
    WUSB("wusb"),
    @XmlEnumValue("pda")
    PDA("pda"),
    @XmlEnumValue("vendor_specific")
    VENDOR_SPECIFIC("vendor_specific"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknownFamily")
    UNKNOWN_FAMILY("unknownFamily");
    private final String value;

    VirtualMachineUsbInfoFamily(String v) {
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
    public static VirtualMachineUsbInfoFamily fromValue(String v) {
        for (VirtualMachineUsbInfoFamily c: VirtualMachineUsbInfoFamily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
