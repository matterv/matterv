
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostQualifiedNameType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostQualifiedNameType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="nvmeQualifiedName"/>
 *     <enumeration value="vvolNvmeQualifiedName"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostQualifiedNameType")
@XmlEnum
public enum HostQualifiedNameType {

    @XmlEnumValue("nvmeQualifiedName")
    NVME_QUALIFIED_NAME("nvmeQualifiedName"),
    @XmlEnumValue("vvolNvmeQualifiedName")
    VVOL_NVME_QUALIFIED_NAME("vvolNvmeQualifiedName");
    private final String value;

    HostQualifiedNameType(String v) {
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
    public static HostQualifiedNameType fromValue(String v) {
        for (HostQualifiedNameType c: HostQualifiedNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
