
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostDigestInfoDigestMethodType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostDigestInfoDigestMethodType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SHA1"/>
 *     <enumeration value="MD5"/>
 *     <enumeration value="SHA256"/>
 *     <enumeration value="SHA384"/>
 *     <enumeration value="SHA512"/>
 *     <enumeration value="SM3_256"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostDigestInfoDigestMethodType")
@XmlEnum
public enum HostDigestInfoDigestMethodType {

    @XmlEnumValue("SHA1")
    SHA_1("SHA1"),
    @XmlEnumValue("MD5")
    MD_5("MD5"),
    @XmlEnumValue("SHA256")
    SHA_256("SHA256"),
    @XmlEnumValue("SHA384")
    SHA_384("SHA384"),
    @XmlEnumValue("SHA512")
    SHA_512("SHA512"),
    @XmlEnumValue("SM3_256")
    SM_3_256("SM3_256");
    private final String value;

    HostDigestInfoDigestMethodType(String v) {
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
    public static HostDigestInfoDigestMethodType fromValue(String v) {
        for (HostDigestInfoDigestMethodType c: HostDigestInfoDigestMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
