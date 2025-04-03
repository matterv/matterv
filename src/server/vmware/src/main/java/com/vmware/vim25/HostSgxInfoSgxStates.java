
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostSgxInfoSgxStates</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostSgxInfoSgxStates">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="notPresent"/>
 *     <enumeration value="disabledBIOS"/>
 *     <enumeration value="disabledCFW101"/>
 *     <enumeration value="disabledCPUMismatch"/>
 *     <enumeration value="disabledNoFLC"/>
 *     <enumeration value="disabledNUMAUnsup"/>
 *     <enumeration value="disabledMaxEPCRegs"/>
 *     <enumeration value="enabled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostSgxInfoSgxStates")
@XmlEnum
public enum HostSgxInfoSgxStates {

    @XmlEnumValue("notPresent")
    NOT_PRESENT("notPresent"),
    @XmlEnumValue("disabledBIOS")
    DISABLED_BIOS("disabledBIOS"),
    @XmlEnumValue("disabledCFW101")
    DISABLED_CFW_101("disabledCFW101"),
    @XmlEnumValue("disabledCPUMismatch")
    DISABLED_CPU_MISMATCH("disabledCPUMismatch"),
    @XmlEnumValue("disabledNoFLC")
    DISABLED_NO_FLC("disabledNoFLC"),
    @XmlEnumValue("disabledNUMAUnsup")
    DISABLED_NUMA_UNSUP("disabledNUMAUnsup"),
    @XmlEnumValue("disabledMaxEPCRegs")
    DISABLED_MAX_EPC_REGS("disabledMaxEPCRegs"),
    @XmlEnumValue("enabled")
    ENABLED("enabled");
    private final String value;

    HostSgxInfoSgxStates(String v) {
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
    public static HostSgxInfoSgxStates fromValue(String v) {
        for (HostSgxInfoSgxStates c: HostSgxInfoSgxStates.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
