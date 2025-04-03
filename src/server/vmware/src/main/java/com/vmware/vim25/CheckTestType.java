
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for CheckTestType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CheckTestType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="sourceTests"/>
 *     <enumeration value="hostTests"/>
 *     <enumeration value="resourcePoolTests"/>
 *     <enumeration value="datastoreTests"/>
 *     <enumeration value="networkTests"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CheckTestType")
@XmlEnum
public enum CheckTestType {

    @XmlEnumValue("sourceTests")
    SOURCE_TESTS("sourceTests"),
    @XmlEnumValue("hostTests")
    HOST_TESTS("hostTests"),
    @XmlEnumValue("resourcePoolTests")
    RESOURCE_POOL_TESTS("resourcePoolTests"),
    @XmlEnumValue("datastoreTests")
    DATASTORE_TESTS("datastoreTests"),
    @XmlEnumValue("networkTests")
    NETWORK_TESTS("networkTests");
    private final String value;

    CheckTestType(String v) {
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
    public static CheckTestType fromValue(String v) {
        for (CheckTestType c: CheckTestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
