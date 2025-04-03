
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostNvmeTransportParametersNvmeAddressFamily</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostNvmeTransportParametersNvmeAddressFamily">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ipv4"/>
 *     <enumeration value="ipv6"/>
 *     <enumeration value="infiniBand"/>
 *     <enumeration value="fc"/>
 *     <enumeration value="loopback"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostNvmeTransportParametersNvmeAddressFamily")
@XmlEnum
public enum HostNvmeTransportParametersNvmeAddressFamily {

    @XmlEnumValue("ipv4")
    IPV_4("ipv4"),
    @XmlEnumValue("ipv6")
    IPV_6("ipv6"),
    @XmlEnumValue("infiniBand")
    INFINI_BAND("infiniBand"),
    @XmlEnumValue("fc")
    FC("fc"),
    @XmlEnumValue("loopback")
    LOOPBACK("loopback"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HostNvmeTransportParametersNvmeAddressFamily(String v) {
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
    public static HostNvmeTransportParametersNvmeAddressFamily fromValue(String v) {
        for (HostNvmeTransportParametersNvmeAddressFamily c: HostNvmeTransportParametersNvmeAddressFamily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
