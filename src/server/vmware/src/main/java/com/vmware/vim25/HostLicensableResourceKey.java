
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostLicensableResourceKey</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostLicensableResourceKey">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="numCpuPackages"/>
 *     <enumeration value="numCpuCores"/>
 *     <enumeration value="memorySize"/>
 *     <enumeration value="memoryForVms"/>
 *     <enumeration value="numVmsStarted"/>
 *     <enumeration value="numVmsStarting"/>
 *     <enumeration value="vsanCapacity"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostLicensableResourceKey")
@XmlEnum
public enum HostLicensableResourceKey {

    @XmlEnumValue("numCpuPackages")
    NUM_CPU_PACKAGES("numCpuPackages"),
    @XmlEnumValue("numCpuCores")
    NUM_CPU_CORES("numCpuCores"),
    @XmlEnumValue("memorySize")
    MEMORY_SIZE("memorySize"),
    @XmlEnumValue("memoryForVms")
    MEMORY_FOR_VMS("memoryForVms"),
    @XmlEnumValue("numVmsStarted")
    NUM_VMS_STARTED("numVmsStarted"),
    @XmlEnumValue("numVmsStarting")
    NUM_VMS_STARTING("numVmsStarting"),
    @XmlEnumValue("vsanCapacity")
    VSAN_CAPACITY("vsanCapacity");
    private final String value;

    HostLicensableResourceKey(String v) {
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
    public static HostLicensableResourceKey fromValue(String v) {
        for (HostLicensableResourceKey c: HostLicensableResourceKey.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
