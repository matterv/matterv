
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AnswerFileValidationInfoStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AnswerFileValidationInfoStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="success"/>
 *     <enumeration value="failed"/>
 *     <enumeration value="failed_defaults"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AnswerFileValidationInfoStatus")
@XmlEnum
public enum AnswerFileValidationInfoStatus {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("failed_defaults")
    FAILED_DEFAULTS("failed_defaults");
    private final String value;

    AnswerFileValidationInfoStatus(String v) {
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
    public static AnswerFileValidationInfoStatus fromValue(String v) {
        for (AnswerFileValidationInfoStatus c: AnswerFileValidationInfoStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
