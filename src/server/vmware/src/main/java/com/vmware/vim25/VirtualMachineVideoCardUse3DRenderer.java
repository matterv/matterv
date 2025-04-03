
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineVideoCardUse3dRenderer</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineVideoCardUse3dRenderer">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="automatic"/>
 *     <enumeration value="software"/>
 *     <enumeration value="hardware"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineVideoCardUse3dRenderer")
@XmlEnum
public enum VirtualMachineVideoCardUse3DRenderer {

    @XmlEnumValue("automatic")
    AUTOMATIC("automatic"),
    @XmlEnumValue("software")
    SOFTWARE("software"),
    @XmlEnumValue("hardware")
    HARDWARE("hardware");
    private final String value;

    VirtualMachineVideoCardUse3DRenderer(String v) {
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
    public static VirtualMachineVideoCardUse3DRenderer fromValue(String v) {
        for (VirtualMachineVideoCardUse3DRenderer c: VirtualMachineVideoCardUse3DRenderer.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
