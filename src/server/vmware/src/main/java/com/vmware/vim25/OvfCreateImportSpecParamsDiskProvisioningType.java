
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for OvfCreateImportSpecParamsDiskProvisioningType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OvfCreateImportSpecParamsDiskProvisioningType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="monolithicSparse"/>
 *     <enumeration value="monolithicFlat"/>
 *     <enumeration value="twoGbMaxExtentSparse"/>
 *     <enumeration value="twoGbMaxExtentFlat"/>
 *     <enumeration value="thin"/>
 *     <enumeration value="thick"/>
 *     <enumeration value="seSparse"/>
 *     <enumeration value="eagerZeroedThick"/>
 *     <enumeration value="sparse"/>
 *     <enumeration value="flat"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OvfCreateImportSpecParamsDiskProvisioningType")
@XmlEnum
public enum OvfCreateImportSpecParamsDiskProvisioningType {

    @XmlEnumValue("monolithicSparse")
    MONOLITHIC_SPARSE("monolithicSparse"),
    @XmlEnumValue("monolithicFlat")
    MONOLITHIC_FLAT("monolithicFlat"),
    @XmlEnumValue("twoGbMaxExtentSparse")
    TWO_GB_MAX_EXTENT_SPARSE("twoGbMaxExtentSparse"),
    @XmlEnumValue("twoGbMaxExtentFlat")
    TWO_GB_MAX_EXTENT_FLAT("twoGbMaxExtentFlat"),
    @XmlEnumValue("thin")
    THIN("thin"),
    @XmlEnumValue("thick")
    THICK("thick"),
    @XmlEnumValue("seSparse")
    SE_SPARSE("seSparse"),
    @XmlEnumValue("eagerZeroedThick")
    EAGER_ZEROED_THICK("eagerZeroedThick"),
    @XmlEnumValue("sparse")
    SPARSE("sparse"),
    @XmlEnumValue("flat")
    FLAT("flat");
    private final String value;

    OvfCreateImportSpecParamsDiskProvisioningType(String v) {
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
    public static OvfCreateImportSpecParamsDiskProvisioningType fromValue(String v) {
        for (OvfCreateImportSpecParamsDiskProvisioningType c: OvfCreateImportSpecParamsDiskProvisioningType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
