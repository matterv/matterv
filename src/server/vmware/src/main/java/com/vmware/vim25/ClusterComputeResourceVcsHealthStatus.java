
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterComputeResourceVcsHealthStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterComputeResourceVcsHealthStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="healthy"/>
 *     <enumeration value="degraded"/>
 *     <enumeration value="nonhealthy"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterComputeResourceVcsHealthStatus")
@XmlEnum
public enum ClusterComputeResourceVcsHealthStatus {

    @XmlEnumValue("healthy")
    HEALTHY("healthy"),
    @XmlEnumValue("degraded")
    DEGRADED("degraded"),
    @XmlEnumValue("nonhealthy")
    NONHEALTHY("nonhealthy");
    private final String value;

    ClusterComputeResourceVcsHealthStatus(String v) {
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
    public static ClusterComputeResourceVcsHealthStatus fromValue(String v) {
        for (ClusterComputeResourceVcsHealthStatus c: ClusterComputeResourceVcsHealthStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
