
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for BaseConfigInfoDiskFileBackingInfoProvisioningType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BaseConfigInfoDiskFileBackingInfoProvisioningType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="thin"/>
 *     <enumeration value="eagerZeroedThick"/>
 *     <enumeration value="lazyZeroedThick"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BaseConfigInfoDiskFileBackingInfoProvisioningType")
@XmlEnum
public enum BaseConfigInfoDiskFileBackingInfoProvisioningType {

    @XmlEnumValue("thin")
    THIN("thin"),
    @XmlEnumValue("eagerZeroedThick")
    EAGER_ZEROED_THICK("eagerZeroedThick"),
    @XmlEnumValue("lazyZeroedThick")
    LAZY_ZEROED_THICK("lazyZeroedThick");
    private final String value;

    BaseConfigInfoDiskFileBackingInfoProvisioningType(String v) {
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
    public static BaseConfigInfoDiskFileBackingInfoProvisioningType fromValue(String v) {
        for (BaseConfigInfoDiskFileBackingInfoProvisioningType c: BaseConfigInfoDiskFileBackingInfoProvisioningType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
