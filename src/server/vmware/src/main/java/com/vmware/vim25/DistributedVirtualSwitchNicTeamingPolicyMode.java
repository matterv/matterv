
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DistributedVirtualSwitchNicTeamingPolicyMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DistributedVirtualSwitchNicTeamingPolicyMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="loadbalance_ip"/>
 *     <enumeration value="loadbalance_srcmac"/>
 *     <enumeration value="loadbalance_srcid"/>
 *     <enumeration value="failover_explicit"/>
 *     <enumeration value="loadbalance_loadbased"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DistributedVirtualSwitchNicTeamingPolicyMode")
@XmlEnum
public enum DistributedVirtualSwitchNicTeamingPolicyMode {

    @XmlEnumValue("loadbalance_ip")
    LOADBALANCE_IP("loadbalance_ip"),
    @XmlEnumValue("loadbalance_srcmac")
    LOADBALANCE_SRCMAC("loadbalance_srcmac"),
    @XmlEnumValue("loadbalance_srcid")
    LOADBALANCE_SRCID("loadbalance_srcid"),
    @XmlEnumValue("failover_explicit")
    FAILOVER_EXPLICIT("failover_explicit"),
    @XmlEnumValue("loadbalance_loadbased")
    LOADBALANCE_LOADBASED("loadbalance_loadbased");
    private final String value;

    DistributedVirtualSwitchNicTeamingPolicyMode(String v) {
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
    public static DistributedVirtualSwitchNicTeamingPolicyMode fromValue(String v) {
        for (DistributedVirtualSwitchNicTeamingPolicyMode c: DistributedVirtualSwitchNicTeamingPolicyMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
