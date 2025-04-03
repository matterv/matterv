
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for OvfConsumerOstNodeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OvfConsumerOstNodeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="envelope"/>
 *     <enumeration value="virtualSystem"/>
 *     <enumeration value="virtualSystemCollection"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OvfConsumerOstNodeType")
@XmlEnum
public enum OvfConsumerOstNodeType {

    @XmlEnumValue("envelope")
    ENVELOPE("envelope"),
    @XmlEnumValue("virtualSystem")
    VIRTUAL_SYSTEM("virtualSystem"),
    @XmlEnumValue("virtualSystemCollection")
    VIRTUAL_SYSTEM_COLLECTION("virtualSystemCollection");
    private final String value;

    OvfConsumerOstNodeType(String v) {
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
    public static OvfConsumerOstNodeType fromValue(String v) {
        for (OvfConsumerOstNodeType c: OvfConsumerOstNodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
