
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VmDasBeingResetEventReasonCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VmDasBeingResetEventReasonCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="vmtoolsHeartbeatFailure"/>
 *     <enumeration value="appHeartbeatFailure"/>
 *     <enumeration value="appImmediateResetRequest"/>
 *     <enumeration value="vmcpResetApdCleared"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VmDasBeingResetEventReasonCode")
@XmlEnum
public enum VmDasBeingResetEventReasonCode {

    @XmlEnumValue("vmtoolsHeartbeatFailure")
    VMTOOLS_HEARTBEAT_FAILURE("vmtoolsHeartbeatFailure"),
    @XmlEnumValue("appHeartbeatFailure")
    APP_HEARTBEAT_FAILURE("appHeartbeatFailure"),
    @XmlEnumValue("appImmediateResetRequest")
    APP_IMMEDIATE_RESET_REQUEST("appImmediateResetRequest"),
    @XmlEnumValue("vmcpResetApdCleared")
    VMCP_RESET_APD_CLEARED("vmcpResetApdCleared");
    private final String value;

    VmDasBeingResetEventReasonCode(String v) {
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
    public static VmDasBeingResetEventReasonCode fromValue(String v) {
        for (VmDasBeingResetEventReasonCode c: VmDasBeingResetEventReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
