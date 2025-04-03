
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDeviceConfigSpecFileOperation</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDeviceConfigSpecFileOperation">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="create"/>
 *     <enumeration value="destroy"/>
 *     <enumeration value="replace"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDeviceConfigSpecFileOperation")
@XmlEnum
public enum VirtualDeviceConfigSpecFileOperation {

    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("destroy")
    DESTROY("destroy"),
    @XmlEnumValue("replace")
    REPLACE("replace");
    private final String value;

    VirtualDeviceConfigSpecFileOperation(String v) {
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
    public static VirtualDeviceConfigSpecFileOperation fromValue(String v) {
        for (VirtualDeviceConfigSpecFileOperation c: VirtualDeviceConfigSpecFileOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
