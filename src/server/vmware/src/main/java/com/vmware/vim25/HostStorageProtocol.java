
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostStorageProtocol</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostStorageProtocol">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="scsi"/>
 *     <enumeration value="nvme"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostStorageProtocol")
@XmlEnum
public enum HostStorageProtocol {

    @XmlEnumValue("scsi")
    SCSI("scsi"),
    @XmlEnumValue("nvme")
    NVME("nvme");
    private final String value;

    HostStorageProtocol(String v) {
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
    public static HostStorageProtocol fromValue(String v) {
        for (HostStorageProtocol c: HostStorageProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
