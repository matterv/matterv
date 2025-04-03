
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HttpNfcLeaseManifestEntryChecksumType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HttpNfcLeaseManifestEntryChecksumType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="sha1"/>
 *     <enumeration value="sha256"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HttpNfcLeaseManifestEntryChecksumType")
@XmlEnum
public enum HttpNfcLeaseManifestEntryChecksumType {

    @XmlEnumValue("sha1")
    SHA_1("sha1"),
    @XmlEnumValue("sha256")
    SHA_256("sha256");
    private final String value;

    HttpNfcLeaseManifestEntryChecksumType(String v) {
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
    public static HttpNfcLeaseManifestEntryChecksumType fromValue(String v) {
        for (HttpNfcLeaseManifestEntryChecksumType c: HttpNfcLeaseManifestEntryChecksumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
