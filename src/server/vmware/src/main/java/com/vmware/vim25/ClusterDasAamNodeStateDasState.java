
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterDasAamNodeStateDasState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterDasAamNodeStateDasState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="uninitialized"/>
 *     <enumeration value="initialized"/>
 *     <enumeration value="configuring"/>
 *     <enumeration value="unconfiguring"/>
 *     <enumeration value="running"/>
 *     <enumeration value="error"/>
 *     <enumeration value="agentShutdown"/>
 *     <enumeration value="nodeFailed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterDasAamNodeStateDasState")
@XmlEnum
public enum ClusterDasAamNodeStateDasState {

    @XmlEnumValue("uninitialized")
    UNINITIALIZED("uninitialized"),
    @XmlEnumValue("initialized")
    INITIALIZED("initialized"),
    @XmlEnumValue("configuring")
    CONFIGURING("configuring"),
    @XmlEnumValue("unconfiguring")
    UNCONFIGURING("unconfiguring"),
    @XmlEnumValue("running")
    RUNNING("running"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("agentShutdown")
    AGENT_SHUTDOWN("agentShutdown"),
    @XmlEnumValue("nodeFailed")
    NODE_FAILED("nodeFailed");
    private final String value;

    ClusterDasAamNodeStateDasState(String v) {
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
    public static ClusterDasAamNodeStateDasState fromValue(String v) {
        for (ClusterDasAamNodeStateDasState c: ClusterDasAamNodeStateDasState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
