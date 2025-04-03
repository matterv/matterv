
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NvdimmNamespaceDetailsHealthStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NvdimmNamespaceDetailsHealthStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="normal"/>
 *     <enumeration value="missing"/>
 *     <enumeration value="labelMissing"/>
 *     <enumeration value="interleaveBroken"/>
 *     <enumeration value="labelInconsistent"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NvdimmNamespaceDetailsHealthStatus")
@XmlEnum
public enum NvdimmNamespaceDetailsHealthStatus {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("missing")
    MISSING("missing"),
    @XmlEnumValue("labelMissing")
    LABEL_MISSING("labelMissing"),
    @XmlEnumValue("interleaveBroken")
    INTERLEAVE_BROKEN("interleaveBroken"),
    @XmlEnumValue("labelInconsistent")
    LABEL_INCONSISTENT("labelInconsistent");
    private final String value;

    NvdimmNamespaceDetailsHealthStatus(String v) {
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
    public static NvdimmNamespaceDetailsHealthStatus fromValue(String v) {
        for (NvdimmNamespaceDetailsHealthStatus c: NvdimmNamespaceDetailsHealthStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
