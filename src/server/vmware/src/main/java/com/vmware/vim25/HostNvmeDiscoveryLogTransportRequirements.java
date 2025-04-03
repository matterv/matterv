
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostNvmeDiscoveryLogTransportRequirements</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostNvmeDiscoveryLogTransportRequirements">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="secureChannelRequired"/>
 *     <enumeration value="secureChannelNotRequired"/>
 *     <enumeration value="requirementsNotSpecified"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostNvmeDiscoveryLogTransportRequirements")
@XmlEnum
public enum HostNvmeDiscoveryLogTransportRequirements {

    @XmlEnumValue("secureChannelRequired")
    SECURE_CHANNEL_REQUIRED("secureChannelRequired"),
    @XmlEnumValue("secureChannelNotRequired")
    SECURE_CHANNEL_NOT_REQUIRED("secureChannelNotRequired"),
    @XmlEnumValue("requirementsNotSpecified")
    REQUIREMENTS_NOT_SPECIFIED("requirementsNotSpecified");
    private final String value;

    HostNvmeDiscoveryLogTransportRequirements(String v) {
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
    public static HostNvmeDiscoveryLogTransportRequirements fromValue(String v) {
        for (HostNvmeDiscoveryLogTransportRequirements c: HostNvmeDiscoveryLogTransportRequirements.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
