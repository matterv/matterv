
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="licensed"/>
 *     <enumeration value="unlicensed"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState")
@XmlEnum
public enum ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState {

    @XmlEnumValue("licensed")
    LICENSED("licensed"),
    @XmlEnumValue("unlicensed")
    UNLICENSED("unlicensed"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState(String v) {
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
    public static ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState fromValue(String v) {
        for (ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState c: ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
