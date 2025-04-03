
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PlacementAffinityRuleRuleScope</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PlacementAffinityRuleRuleScope">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="cluster"/>
 *     <enumeration value="host"/>
 *     <enumeration value="storagePod"/>
 *     <enumeration value="datastore"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PlacementAffinityRuleRuleScope")
@XmlEnum
public enum PlacementAffinityRuleRuleScope {

    @XmlEnumValue("cluster")
    CLUSTER("cluster"),
    @XmlEnumValue("host")
    HOST("host"),
    @XmlEnumValue("storagePod")
    STORAGE_POD("storagePod"),
    @XmlEnumValue("datastore")
    DATASTORE("datastore");
    private final String value;

    PlacementAffinityRuleRuleScope(String v) {
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
    public static PlacementAffinityRuleRuleScope fromValue(String v) {
        for (PlacementAffinityRuleRuleScope c: PlacementAffinityRuleRuleScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
