
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LicenseManagerLicenseKey</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LicenseManagerLicenseKey">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="esxFull"/>
 *     <enumeration value="esxVmtn"/>
 *     <enumeration value="esxExpress"/>
 *     <enumeration value="san"/>
 *     <enumeration value="iscsi"/>
 *     <enumeration value="nas"/>
 *     <enumeration value="vsmp"/>
 *     <enumeration value="backup"/>
 *     <enumeration value="vc"/>
 *     <enumeration value="vcExpress"/>
 *     <enumeration value="esxHost"/>
 *     <enumeration value="gsxHost"/>
 *     <enumeration value="serverHost"/>
 *     <enumeration value="drsPower"/>
 *     <enumeration value="vmotion"/>
 *     <enumeration value="drs"/>
 *     <enumeration value="das"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LicenseManagerLicenseKey")
@XmlEnum
public enum LicenseManagerLicenseKey {

    @XmlEnumValue("esxFull")
    ESX_FULL("esxFull"),
    @XmlEnumValue("esxVmtn")
    ESX_VMTN("esxVmtn"),
    @XmlEnumValue("esxExpress")
    ESX_EXPRESS("esxExpress"),
    @XmlEnumValue("san")
    SAN("san"),
    @XmlEnumValue("iscsi")
    ISCSI("iscsi"),
    @XmlEnumValue("nas")
    NAS("nas"),
    @XmlEnumValue("vsmp")
    VSMP("vsmp"),
    @XmlEnumValue("backup")
    BACKUP("backup"),
    @XmlEnumValue("vc")
    VC("vc"),
    @XmlEnumValue("vcExpress")
    VC_EXPRESS("vcExpress"),
    @XmlEnumValue("esxHost")
    ESX_HOST("esxHost"),
    @XmlEnumValue("gsxHost")
    GSX_HOST("gsxHost"),
    @XmlEnumValue("serverHost")
    SERVER_HOST("serverHost"),
    @XmlEnumValue("drsPower")
    DRS_POWER("drsPower"),
    @XmlEnumValue("vmotion")
    VMOTION("vmotion"),
    @XmlEnumValue("drs")
    DRS("drs"),
    @XmlEnumValue("das")
    DAS("das");
    private final String value;

    LicenseManagerLicenseKey(String v) {
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
    public static LicenseManagerLicenseKey fromValue(String v) {
        for (LicenseManagerLicenseKey c: LicenseManagerLicenseKey.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
