
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostPatchManagerIntegrityStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostPatchManagerIntegrityStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="validated"/>
 *     <enumeration value="keyNotFound"/>
 *     <enumeration value="keyRevoked"/>
 *     <enumeration value="keyExpired"/>
 *     <enumeration value="digestMismatch"/>
 *     <enumeration value="notEnoughSignatures"/>
 *     <enumeration value="validationError"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostPatchManagerIntegrityStatus")
@XmlEnum
public enum HostPatchManagerIntegrityStatus {

    @XmlEnumValue("validated")
    VALIDATED("validated"),
    @XmlEnumValue("keyNotFound")
    KEY_NOT_FOUND("keyNotFound"),
    @XmlEnumValue("keyRevoked")
    KEY_REVOKED("keyRevoked"),
    @XmlEnumValue("keyExpired")
    KEY_EXPIRED("keyExpired"),
    @XmlEnumValue("digestMismatch")
    DIGEST_MISMATCH("digestMismatch"),
    @XmlEnumValue("notEnoughSignatures")
    NOT_ENOUGH_SIGNATURES("notEnoughSignatures"),
    @XmlEnumValue("validationError")
    VALIDATION_ERROR("validationError");
    private final String value;

    HostPatchManagerIntegrityStatus(String v) {
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
    public static HostPatchManagerIntegrityStatus fromValue(String v) {
        for (HostPatchManagerIntegrityStatus c: HostPatchManagerIntegrityStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
