
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ReplicationVmInProgressFaultActivity</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ReplicationVmInProgressFaultActivity">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="fullSync"/>
 *     <enumeration value="delta"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReplicationVmInProgressFaultActivity")
@XmlEnum
public enum ReplicationVmInProgressFaultActivity {

    @XmlEnumValue("fullSync")
    FULL_SYNC("fullSync"),
    @XmlEnumValue("delta")
    DELTA("delta");
    private final String value;

    ReplicationVmInProgressFaultActivity(String v) {
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
    public static ReplicationVmInProgressFaultActivity fromValue(String v) {
        for (ReplicationVmInProgressFaultActivity c: ReplicationVmInProgressFaultActivity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
