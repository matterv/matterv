
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostGraphicsInfoVgpuMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostGraphicsInfoVgpuMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="none"/>
 *     <enumeration value="sameSize"/>
 *     <enumeration value="mixedSize"/>
 *     <enumeration value="multiInstanceGpu"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostGraphicsInfoVgpuMode")
@XmlEnum
public enum HostGraphicsInfoVgpuMode {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("sameSize")
    SAME_SIZE("sameSize"),
    @XmlEnumValue("mixedSize")
    MIXED_SIZE("mixedSize"),
    @XmlEnumValue("multiInstanceGpu")
    MULTI_INSTANCE_GPU("multiInstanceGpu");
    private final String value;

    HostGraphicsInfoVgpuMode(String v) {
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
    public static HostGraphicsInfoVgpuMode fromValue(String v) {
        for (HostGraphicsInfoVgpuMode c: HostGraphicsInfoVgpuMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
