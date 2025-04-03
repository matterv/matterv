
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostMemoryTierFlags</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostMemoryTierFlags">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="memoryTier"/>
 *     <enumeration value="persistentTier"/>
 *     <enumeration value="cachingTier"/>
 *     <enumeration value="unmappableTier"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostMemoryTierFlags")
@XmlEnum
public enum HostMemoryTierFlags {

    @XmlEnumValue("memoryTier")
    MEMORY_TIER("memoryTier"),
    @XmlEnumValue("persistentTier")
    PERSISTENT_TIER("persistentTier"),
    @XmlEnumValue("cachingTier")
    CACHING_TIER("cachingTier"),
    @XmlEnumValue("unmappableTier")
    UNMAPPABLE_TIER("unmappableTier");
    private final String value;

    HostMemoryTierFlags(String v) {
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
    public static HostMemoryTierFlags fromValue(String v) {
        for (HostMemoryTierFlags c: HostMemoryTierFlags.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
