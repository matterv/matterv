
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NvdimmNamespaceType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NvdimmNamespaceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="blockNamespace"/>
 *     <enumeration value="persistentNamespace"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NvdimmNamespaceType")
@XmlEnum
public enum NvdimmNamespaceType {

    @XmlEnumValue("blockNamespace")
    BLOCK_NAMESPACE("blockNamespace"),
    @XmlEnumValue("persistentNamespace")
    PERSISTENT_NAMESPACE("persistentNamespace");
    private final String value;

    NvdimmNamespaceType(String v) {
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
    public static NvdimmNamespaceType fromValue(String v) {
        for (NvdimmNamespaceType c: NvdimmNamespaceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
