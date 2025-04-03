
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostDasErrorEventHostDasErrorReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostDasErrorEventHostDasErrorReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="configFailed"/>
 *     <enumeration value="timeout"/>
 *     <enumeration value="communicationInitFailed"/>
 *     <enumeration value="healthCheckScriptFailed"/>
 *     <enumeration value="agentFailed"/>
 *     <enumeration value="agentShutdown"/>
 *     <enumeration value="isolationAddressUnpingable"/>
 *     <enumeration value="other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostDasErrorEventHostDasErrorReason")
@XmlEnum
public enum HostDasErrorEventHostDasErrorReason {

    @XmlEnumValue("configFailed")
    CONFIG_FAILED("configFailed"),
    @XmlEnumValue("timeout")
    TIMEOUT("timeout"),
    @XmlEnumValue("communicationInitFailed")
    COMMUNICATION_INIT_FAILED("communicationInitFailed"),
    @XmlEnumValue("healthCheckScriptFailed")
    HEALTH_CHECK_SCRIPT_FAILED("healthCheckScriptFailed"),
    @XmlEnumValue("agentFailed")
    AGENT_FAILED("agentFailed"),
    @XmlEnumValue("agentShutdown")
    AGENT_SHUTDOWN("agentShutdown"),
    @XmlEnumValue("isolationAddressUnpingable")
    ISOLATION_ADDRESS_UNPINGABLE("isolationAddressUnpingable"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    HostDasErrorEventHostDasErrorReason(String v) {
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
    public static HostDasErrorEventHostDasErrorReason fromValue(String v) {
        for (HostDasErrorEventHostDasErrorReason c: HostDasErrorEventHostDasErrorReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
