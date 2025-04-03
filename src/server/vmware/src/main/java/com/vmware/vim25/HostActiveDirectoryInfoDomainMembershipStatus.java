
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostActiveDirectoryInfoDomainMembershipStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostActiveDirectoryInfoDomainMembershipStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="unknown"/>
 *     <enumeration value="ok"/>
 *     <enumeration value="noServers"/>
 *     <enumeration value="clientTrustBroken"/>
 *     <enumeration value="serverTrustBroken"/>
 *     <enumeration value="inconsistentTrust"/>
 *     <enumeration value="otherProblem"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostActiveDirectoryInfoDomainMembershipStatus")
@XmlEnum
public enum HostActiveDirectoryInfoDomainMembershipStatus {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("noServers")
    NO_SERVERS("noServers"),
    @XmlEnumValue("clientTrustBroken")
    CLIENT_TRUST_BROKEN("clientTrustBroken"),
    @XmlEnumValue("serverTrustBroken")
    SERVER_TRUST_BROKEN("serverTrustBroken"),
    @XmlEnumValue("inconsistentTrust")
    INCONSISTENT_TRUST("inconsistentTrust"),
    @XmlEnumValue("otherProblem")
    OTHER_PROBLEM("otherProblem");
    private final String value;

    HostActiveDirectoryInfoDomainMembershipStatus(String v) {
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
    public static HostActiveDirectoryInfoDomainMembershipStatus fromValue(String v) {
        for (HostActiveDirectoryInfoDomainMembershipStatus c: HostActiveDirectoryInfoDomainMembershipStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
