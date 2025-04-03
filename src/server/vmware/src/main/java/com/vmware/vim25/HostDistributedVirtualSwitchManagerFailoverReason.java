
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostDistributedVirtualSwitchManagerFailoverReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostDistributedVirtualSwitchManagerFailoverReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="crash"/>
 *     <enumeration value="linkDown"/>
 *     <enumeration value="userInitiated"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostDistributedVirtualSwitchManagerFailoverReason")
@XmlEnum
public enum HostDistributedVirtualSwitchManagerFailoverReason {

    @XmlEnumValue("crash")
    CRASH("crash"),
    @XmlEnumValue("linkDown")
    LINK_DOWN("linkDown"),
    @XmlEnumValue("userInitiated")
    USER_INITIATED("userInitiated");
    private final String value;

    HostDistributedVirtualSwitchManagerFailoverReason(String v) {
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
    public static HostDistributedVirtualSwitchManagerFailoverReason fromValue(String v) {
        for (HostDistributedVirtualSwitchManagerFailoverReason c: HostDistributedVirtualSwitchManagerFailoverReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
