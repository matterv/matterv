
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VMwareDVSVspanSessionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VMwareDVSVspanSessionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="mixedDestMirror"/>
 *     <enumeration value="dvPortMirror"/>
 *     <enumeration value="remoteMirrorSource"/>
 *     <enumeration value="remoteMirrorDest"/>
 *     <enumeration value="encapsulatedRemoteMirrorSource"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VMwareDVSVspanSessionType")
@XmlEnum
public enum VMwareDVSVspanSessionType {

    @XmlEnumValue("mixedDestMirror")
    MIXED_DEST_MIRROR("mixedDestMirror"),
    @XmlEnumValue("dvPortMirror")
    DV_PORT_MIRROR("dvPortMirror"),
    @XmlEnumValue("remoteMirrorSource")
    REMOTE_MIRROR_SOURCE("remoteMirrorSource"),
    @XmlEnumValue("remoteMirrorDest")
    REMOTE_MIRROR_DEST("remoteMirrorDest"),
    @XmlEnumValue("encapsulatedRemoteMirrorSource")
    ENCAPSULATED_REMOTE_MIRROR_SOURCE("encapsulatedRemoteMirrorSource");
    private final String value;

    VMwareDVSVspanSessionType(String v) {
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
    public static VMwareDVSVspanSessionType fromValue(String v) {
        for (VMwareDVSVspanSessionType c: VMwareDVSVspanSessionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
