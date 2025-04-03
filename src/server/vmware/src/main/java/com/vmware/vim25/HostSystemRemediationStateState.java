
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostSystemRemediationStateState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostSystemRemediationStateState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="remediationReady"/>
 *     <enumeration value="precheckRemediationRunning"/>
 *     <enumeration value="precheckRemediationComplete"/>
 *     <enumeration value="precheckRemediationFailed"/>
 *     <enumeration value="remediationRunning"/>
 *     <enumeration value="remediationFailed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostSystemRemediationStateState")
@XmlEnum
public enum HostSystemRemediationStateState {

    @XmlEnumValue("remediationReady")
    REMEDIATION_READY("remediationReady"),
    @XmlEnumValue("precheckRemediationRunning")
    PRECHECK_REMEDIATION_RUNNING("precheckRemediationRunning"),
    @XmlEnumValue("precheckRemediationComplete")
    PRECHECK_REMEDIATION_COMPLETE("precheckRemediationComplete"),
    @XmlEnumValue("precheckRemediationFailed")
    PRECHECK_REMEDIATION_FAILED("precheckRemediationFailed"),
    @XmlEnumValue("remediationRunning")
    REMEDIATION_RUNNING("remediationRunning"),
    @XmlEnumValue("remediationFailed")
    REMEDIATION_FAILED("remediationFailed");
    private final String value;

    HostSystemRemediationStateState(String v) {
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
    public static HostSystemRemediationStateState fromValue(String v) {
        for (HostSystemRemediationStateState c: HostSystemRemediationStateState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
