
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualDiskType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualDiskType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="preallocated"/>
 *     <enumeration value="thin"/>
 *     <enumeration value="seSparse"/>
 *     <enumeration value="rdm"/>
 *     <enumeration value="rdmp"/>
 *     <enumeration value="raw"/>
 *     <enumeration value="delta"/>
 *     <enumeration value="sparse2Gb"/>
 *     <enumeration value="thick2Gb"/>
 *     <enumeration value="eagerZeroedThick"/>
 *     <enumeration value="sparseMonolithic"/>
 *     <enumeration value="flatMonolithic"/>
 *     <enumeration value="thick"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualDiskType")
@XmlEnum
public enum VirtualDiskType {

    @XmlEnumValue("preallocated")
    PREALLOCATED("preallocated"),
    @XmlEnumValue("thin")
    THIN("thin"),
    @XmlEnumValue("seSparse")
    SE_SPARSE("seSparse"),
    @XmlEnumValue("rdm")
    RDM("rdm"),
    @XmlEnumValue("rdmp")
    RDMP("rdmp"),
    @XmlEnumValue("raw")
    RAW("raw"),
    @XmlEnumValue("delta")
    DELTA("delta"),
    @XmlEnumValue("sparse2Gb")
    SPARSE_2_GB("sparse2Gb"),
    @XmlEnumValue("thick2Gb")
    THICK_2_GB("thick2Gb"),
    @XmlEnumValue("eagerZeroedThick")
    EAGER_ZEROED_THICK("eagerZeroedThick"),
    @XmlEnumValue("sparseMonolithic")
    SPARSE_MONOLITHIC("sparseMonolithic"),
    @XmlEnumValue("flatMonolithic")
    FLAT_MONOLITHIC("flatMonolithic"),
    @XmlEnumValue("thick")
    THICK("thick");
    private final String value;

    VirtualDiskType(String v) {
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
    public static VirtualDiskType fromValue(String v) {
        for (VirtualDiskType c: VirtualDiskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
