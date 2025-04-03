
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for IoFilterType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="IoFilterType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="cache"/>
 *     <enumeration value="replication"/>
 *     <enumeration value="encryption"/>
 *     <enumeration value="compression"/>
 *     <enumeration value="inspection"/>
 *     <enumeration value="datastoreIoControl"/>
 *     <enumeration value="dataProvider"/>
 *     <enumeration value="dataCapture"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IoFilterType")
@XmlEnum
public enum IoFilterType {

    @XmlEnumValue("cache")
    CACHE("cache"),
    @XmlEnumValue("replication")
    REPLICATION("replication"),
    @XmlEnumValue("encryption")
    ENCRYPTION("encryption"),
    @XmlEnumValue("compression")
    COMPRESSION("compression"),
    @XmlEnumValue("inspection")
    INSPECTION("inspection"),
    @XmlEnumValue("datastoreIoControl")
    DATASTORE_IO_CONTROL("datastoreIoControl"),
    @XmlEnumValue("dataProvider")
    DATA_PROVIDER("dataProvider"),
    @XmlEnumValue("dataCapture")
    DATA_CAPTURE("dataCapture");
    private final String value;

    IoFilterType(String v) {
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
    public static IoFilterType fromValue(String v) {
        for (IoFilterType c: IoFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
