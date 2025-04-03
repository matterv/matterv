
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineWindowsQuiesceSpecVssBackupContext</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineWindowsQuiesceSpecVssBackupContext">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ctx_auto"/>
 *     <enumeration value="ctx_backup"/>
 *     <enumeration value="ctx_file_share_backup"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineWindowsQuiesceSpecVssBackupContext")
@XmlEnum
public enum VirtualMachineWindowsQuiesceSpecVssBackupContext {

    @XmlEnumValue("ctx_auto")
    CTX_AUTO("ctx_auto"),
    @XmlEnumValue("ctx_backup")
    CTX_BACKUP("ctx_backup"),
    @XmlEnumValue("ctx_file_share_backup")
    CTX_FILE_SHARE_BACKUP("ctx_file_share_backup");
    private final String value;

    VirtualMachineWindowsQuiesceSpecVssBackupContext(String v) {
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
    public static VirtualMachineWindowsQuiesceSpecVssBackupContext fromValue(String v) {
        for (VirtualMachineWindowsQuiesceSpecVssBackupContext c: VirtualMachineWindowsQuiesceSpecVssBackupContext.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
