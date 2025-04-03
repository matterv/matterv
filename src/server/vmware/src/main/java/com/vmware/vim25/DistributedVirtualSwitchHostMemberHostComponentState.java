
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DistributedVirtualSwitchHostMemberHostComponentState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DistributedVirtualSwitchHostMemberHostComponentState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="up"/>
 *     <enumeration value="pending"/>
 *     <enumeration value="outOfSync"/>
 *     <enumeration value="warning"/>
 *     <enumeration value="disconnected"/>
 *     <enumeration value="down"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributedVirtualSwitchHostMemberHostComponentState")
@XmlEnum
public enum DistributedVirtualSwitchHostMemberHostComponentState {

    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("outOfSync")
    OUT_OF_SYNC("outOfSync"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("disconnected")
    DISCONNECTED("disconnected"),
    @XmlEnumValue("down")
    DOWN("down");
    private final String value;

    DistributedVirtualSwitchHostMemberHostComponentState(String v) {
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
    public static DistributedVirtualSwitchHostMemberHostComponentState fromValue(String v) {
        for (DistributedVirtualSwitchHostMemberHostComponentState c: DistributedVirtualSwitchHostMemberHostComponentState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
