
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for QuarantineModeFaultFaultType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="QuarantineModeFaultFaultType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NoCompatibleNonQuarantinedHost"/>
 *     <enumeration value="CorrectionDisallowed"/>
 *     <enumeration value="CorrectionImpact"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QuarantineModeFaultFaultType")
@XmlEnum
public enum QuarantineModeFaultFaultType {

    @XmlEnumValue("NoCompatibleNonQuarantinedHost")
    NO_COMPATIBLE_NON_QUARANTINED_HOST("NoCompatibleNonQuarantinedHost"),
    @XmlEnumValue("CorrectionDisallowed")
    CORRECTION_DISALLOWED("CorrectionDisallowed"),
    @XmlEnumValue("CorrectionImpact")
    CORRECTION_IMPACT("CorrectionImpact");
    private final String value;

    QuarantineModeFaultFaultType(String v) {
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
    public static QuarantineModeFaultFaultType fromValue(String v) {
        for (QuarantineModeFaultFaultType c: QuarantineModeFaultFaultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
