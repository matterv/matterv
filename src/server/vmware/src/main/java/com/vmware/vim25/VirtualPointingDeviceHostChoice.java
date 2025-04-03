
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualPointingDeviceHostChoice</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualPointingDeviceHostChoice">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="autodetect"/>
 *     <enumeration value="intellimouseExplorer"/>
 *     <enumeration value="intellimousePs2"/>
 *     <enumeration value="logitechMouseman"/>
 *     <enumeration value="microsoft_serial"/>
 *     <enumeration value="mouseSystems"/>
 *     <enumeration value="mousemanSerial"/>
 *     <enumeration value="ps2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualPointingDeviceHostChoice")
@XmlEnum
public enum VirtualPointingDeviceHostChoice {

    @XmlEnumValue("autodetect")
    AUTODETECT("autodetect"),
    @XmlEnumValue("intellimouseExplorer")
    INTELLIMOUSE_EXPLORER("intellimouseExplorer"),
    @XmlEnumValue("intellimousePs2")
    INTELLIMOUSE_PS_2("intellimousePs2"),
    @XmlEnumValue("logitechMouseman")
    LOGITECH_MOUSEMAN("logitechMouseman"),
    @XmlEnumValue("microsoft_serial")
    MICROSOFT_SERIAL("microsoft_serial"),
    @XmlEnumValue("mouseSystems")
    MOUSE_SYSTEMS("mouseSystems"),
    @XmlEnumValue("mousemanSerial")
    MOUSEMAN_SERIAL("mousemanSerial"),
    @XmlEnumValue("ps2")
    PS_2("ps2");
    private final String value;

    VirtualPointingDeviceHostChoice(String v) {
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
    public static VirtualPointingDeviceHostChoice fromValue(String v) {
        for (VirtualPointingDeviceHostChoice c: VirtualPointingDeviceHostChoice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
