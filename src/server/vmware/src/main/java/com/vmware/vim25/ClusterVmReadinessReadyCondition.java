
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterVmReadinessReadyCondition</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterVmReadinessReadyCondition">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="none"/>
 *     <enumeration value="poweredOn"/>
 *     <enumeration value="guestHbStatusGreen"/>
 *     <enumeration value="appHbStatusGreen"/>
 *     <enumeration value="useClusterDefault"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterVmReadinessReadyCondition")
@XmlEnum
public enum ClusterVmReadinessReadyCondition {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("poweredOn")
    POWERED_ON("poweredOn"),
    @XmlEnumValue("guestHbStatusGreen")
    GUEST_HB_STATUS_GREEN("guestHbStatusGreen"),
    @XmlEnumValue("appHbStatusGreen")
    APP_HB_STATUS_GREEN("appHbStatusGreen"),
    @XmlEnumValue("useClusterDefault")
    USE_CLUSTER_DEFAULT("useClusterDefault");
    private final String value;

    ClusterVmReadinessReadyCondition(String v) {
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
    public static ClusterVmReadinessReadyCondition fromValue(String v) {
        for (ClusterVmReadinessReadyCondition c: ClusterVmReadinessReadyCondition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
