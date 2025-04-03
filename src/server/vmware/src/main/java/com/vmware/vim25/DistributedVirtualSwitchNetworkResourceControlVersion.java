
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DistributedVirtualSwitchNetworkResourceControlVersion</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DistributedVirtualSwitchNetworkResourceControlVersion">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="version2"/>
 *     <enumeration value="version3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributedVirtualSwitchNetworkResourceControlVersion")
@XmlEnum
public enum DistributedVirtualSwitchNetworkResourceControlVersion {

    @XmlEnumValue("version2")
    VERSION_2("version2"),
    @XmlEnumValue("version3")
    VERSION_3("version3");
    private final String value;

    DistributedVirtualSwitchNetworkResourceControlVersion(String v) {
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
    public static DistributedVirtualSwitchNetworkResourceControlVersion fromValue(String v) {
        for (DistributedVirtualSwitchNetworkResourceControlVersion c: DistributedVirtualSwitchNetworkResourceControlVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
