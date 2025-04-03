
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DVPortStatusVmDirectPathGen2InactiveReasonNetwork</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DVPortStatusVmDirectPathGen2InactiveReasonNetwork">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="portNptIncompatibleDvs"/>
 *     <enumeration value="portNptNoCompatibleNics"/>
 *     <enumeration value="portNptNoVirtualFunctionsAvailable"/>
 *     <enumeration value="portNptDisabledForPort"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DVPortStatusVmDirectPathGen2InactiveReasonNetwork")
@XmlEnum
public enum DVPortStatusVmDirectPathGen2InactiveReasonNetwork {

    @XmlEnumValue("portNptIncompatibleDvs")
    PORT_NPT_INCOMPATIBLE_DVS("portNptIncompatibleDvs"),
    @XmlEnumValue("portNptNoCompatibleNics")
    PORT_NPT_NO_COMPATIBLE_NICS("portNptNoCompatibleNics"),
    @XmlEnumValue("portNptNoVirtualFunctionsAvailable")
    PORT_NPT_NO_VIRTUAL_FUNCTIONS_AVAILABLE("portNptNoVirtualFunctionsAvailable"),
    @XmlEnumValue("portNptDisabledForPort")
    PORT_NPT_DISABLED_FOR_PORT("portNptDisabledForPort");
    private final String value;

    DVPortStatusVmDirectPathGen2InactiveReasonNetwork(String v) {
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
    public static DVPortStatusVmDirectPathGen2InactiveReasonNetwork fromValue(String v) {
        for (DVPortStatusVmDirectPathGen2InactiveReasonNetwork c: DVPortStatusVmDirectPathGen2InactiveReasonNetwork.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
