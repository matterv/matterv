
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AgentInstallFailedReason</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AgentInstallFailedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NotEnoughSpaceOnDevice"/>
 *     <enumeration value="PrepareToUpgradeFailed"/>
 *     <enumeration value="AgentNotRunning"/>
 *     <enumeration value="AgentNotReachable"/>
 *     <enumeration value="InstallTimedout"/>
 *     <enumeration value="SignatureVerificationFailed"/>
 *     <enumeration value="AgentUploadFailed"/>
 *     <enumeration value="AgentUploadTimedout"/>
 *     <enumeration value="UnknownInstallerError"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AgentInstallFailedReason")
@XmlEnum
public enum AgentInstallFailedReason {

    @XmlEnumValue("NotEnoughSpaceOnDevice")
    NOT_ENOUGH_SPACE_ON_DEVICE("NotEnoughSpaceOnDevice"),
    @XmlEnumValue("PrepareToUpgradeFailed")
    PREPARE_TO_UPGRADE_FAILED("PrepareToUpgradeFailed"),
    @XmlEnumValue("AgentNotRunning")
    AGENT_NOT_RUNNING("AgentNotRunning"),
    @XmlEnumValue("AgentNotReachable")
    AGENT_NOT_REACHABLE("AgentNotReachable"),
    @XmlEnumValue("InstallTimedout")
    INSTALL_TIMEDOUT("InstallTimedout"),
    @XmlEnumValue("SignatureVerificationFailed")
    SIGNATURE_VERIFICATION_FAILED("SignatureVerificationFailed"),
    @XmlEnumValue("AgentUploadFailed")
    AGENT_UPLOAD_FAILED("AgentUploadFailed"),
    @XmlEnumValue("AgentUploadTimedout")
    AGENT_UPLOAD_TIMEDOUT("AgentUploadTimedout"),
    @XmlEnumValue("UnknownInstallerError")
    UNKNOWN_INSTALLER_ERROR("UnknownInstallerError");
    private final String value;

    AgentInstallFailedReason(String v) {
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
    public static AgentInstallFailedReason fromValue(String v) {
        for (AgentInstallFailedReason c: AgentInstallFailedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
