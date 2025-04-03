
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineConfigSpecNpivWwnOp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineConfigSpecNpivWwnOp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="generate"/>
 *     <enumeration value="set"/>
 *     <enumeration value="remove"/>
 *     <enumeration value="extend"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineConfigSpecNpivWwnOp")
@XmlEnum
public enum VirtualMachineConfigSpecNpivWwnOp {

    @XmlEnumValue("generate")
    GENERATE("generate"),
    @XmlEnumValue("set")
    SET("set"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("extend")
    EXTEND("extend");
    private final String value;

    VirtualMachineConfigSpecNpivWwnOp(String v) {
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
    public static VirtualMachineConfigSpecNpivWwnOp fromValue(String v) {
        for (VirtualMachineConfigSpecNpivWwnOp c: VirtualMachineConfigSpecNpivWwnOp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
