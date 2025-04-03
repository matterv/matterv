
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostFirewallSystemRuleSetId</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostFirewallSystemRuleSetId">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="faultTolerance"/>
 *     <enumeration value="fdm"/>
 *     <enumeration value="updateManager"/>
 *     <enumeration value="vpxHeartbeats"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostFirewallSystemRuleSetId")
@XmlEnum
public enum HostFirewallSystemRuleSetId {

    @XmlEnumValue("faultTolerance")
    FAULT_TOLERANCE("faultTolerance"),
    @XmlEnumValue("fdm")
    FDM("fdm"),
    @XmlEnumValue("updateManager")
    UPDATE_MANAGER("updateManager"),
    @XmlEnumValue("vpxHeartbeats")
    VPX_HEARTBEATS("vpxHeartbeats");
    private final String value;

    HostFirewallSystemRuleSetId(String v) {
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
    public static HostFirewallSystemRuleSetId fromValue(String v) {
        for (HostFirewallSystemRuleSetId c: HostFirewallSystemRuleSetId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
