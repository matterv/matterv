
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VirtualMachineGuestOsIdentifier</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VirtualMachineGuestOsIdentifier">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="dosGuest"/>
 *     <enumeration value="win31Guest"/>
 *     <enumeration value="win95Guest"/>
 *     <enumeration value="win98Guest"/>
 *     <enumeration value="winMeGuest"/>
 *     <enumeration value="winNTGuest"/>
 *     <enumeration value="win2000ProGuest"/>
 *     <enumeration value="win2000ServGuest"/>
 *     <enumeration value="win2000AdvServGuest"/>
 *     <enumeration value="winXPHomeGuest"/>
 *     <enumeration value="winXPProGuest"/>
 *     <enumeration value="winXPPro64Guest"/>
 *     <enumeration value="winNetWebGuest"/>
 *     <enumeration value="winNetStandardGuest"/>
 *     <enumeration value="winNetEnterpriseGuest"/>
 *     <enumeration value="winNetDatacenterGuest"/>
 *     <enumeration value="winNetBusinessGuest"/>
 *     <enumeration value="winNetStandard64Guest"/>
 *     <enumeration value="winNetEnterprise64Guest"/>
 *     <enumeration value="winLonghornGuest"/>
 *     <enumeration value="winLonghorn64Guest"/>
 *     <enumeration value="winNetDatacenter64Guest"/>
 *     <enumeration value="winVistaGuest"/>
 *     <enumeration value="winVista64Guest"/>
 *     <enumeration value="windows7Guest"/>
 *     <enumeration value="windows7_64Guest"/>
 *     <enumeration value="windows7Server64Guest"/>
 *     <enumeration value="windows8Guest"/>
 *     <enumeration value="windows8_64Guest"/>
 *     <enumeration value="windows8Server64Guest"/>
 *     <enumeration value="windows9Guest"/>
 *     <enumeration value="windows9_64Guest"/>
 *     <enumeration value="windows9Server64Guest"/>
 *     <enumeration value="windows11_64Guest"/>
 *     <enumeration value="windows12_64Guest"/>
 *     <enumeration value="windowsHyperVGuest"/>
 *     <enumeration value="windows2019srv_64Guest"/>
 *     <enumeration value="windows2019srvNext_64Guest"/>
 *     <enumeration value="windows2022srvNext_64Guest"/>
 *     <enumeration value="freebsdGuest"/>
 *     <enumeration value="freebsd64Guest"/>
 *     <enumeration value="freebsd11Guest"/>
 *     <enumeration value="freebsd11_64Guest"/>
 *     <enumeration value="freebsd12Guest"/>
 *     <enumeration value="freebsd12_64Guest"/>
 *     <enumeration value="freebsd13Guest"/>
 *     <enumeration value="freebsd13_64Guest"/>
 *     <enumeration value="freebsd14Guest"/>
 *     <enumeration value="freebsd14_64Guest"/>
 *     <enumeration value="redhatGuest"/>
 *     <enumeration value="rhel2Guest"/>
 *     <enumeration value="rhel3Guest"/>
 *     <enumeration value="rhel3_64Guest"/>
 *     <enumeration value="rhel4Guest"/>
 *     <enumeration value="rhel4_64Guest"/>
 *     <enumeration value="rhel5Guest"/>
 *     <enumeration value="rhel5_64Guest"/>
 *     <enumeration value="rhel6Guest"/>
 *     <enumeration value="rhel6_64Guest"/>
 *     <enumeration value="rhel7Guest"/>
 *     <enumeration value="rhel7_64Guest"/>
 *     <enumeration value="rhel8_64Guest"/>
 *     <enumeration value="rhel9_64Guest"/>
 *     <enumeration value="centosGuest"/>
 *     <enumeration value="centos64Guest"/>
 *     <enumeration value="centos6Guest"/>
 *     <enumeration value="centos6_64Guest"/>
 *     <enumeration value="centos7Guest"/>
 *     <enumeration value="centos7_64Guest"/>
 *     <enumeration value="centos8_64Guest"/>
 *     <enumeration value="centos9_64Guest"/>
 *     <enumeration value="oracleLinuxGuest"/>
 *     <enumeration value="oracleLinux64Guest"/>
 *     <enumeration value="oracleLinux6Guest"/>
 *     <enumeration value="oracleLinux6_64Guest"/>
 *     <enumeration value="oracleLinux7Guest"/>
 *     <enumeration value="oracleLinux7_64Guest"/>
 *     <enumeration value="oracleLinux8_64Guest"/>
 *     <enumeration value="oracleLinux9_64Guest"/>
 *     <enumeration value="suseGuest"/>
 *     <enumeration value="suse64Guest"/>
 *     <enumeration value="slesGuest"/>
 *     <enumeration value="sles64Guest"/>
 *     <enumeration value="sles10Guest"/>
 *     <enumeration value="sles10_64Guest"/>
 *     <enumeration value="sles11Guest"/>
 *     <enumeration value="sles11_64Guest"/>
 *     <enumeration value="sles12Guest"/>
 *     <enumeration value="sles12_64Guest"/>
 *     <enumeration value="sles15_64Guest"/>
 *     <enumeration value="sles16_64Guest"/>
 *     <enumeration value="nld9Guest"/>
 *     <enumeration value="oesGuest"/>
 *     <enumeration value="sjdsGuest"/>
 *     <enumeration value="mandrakeGuest"/>
 *     <enumeration value="mandrivaGuest"/>
 *     <enumeration value="mandriva64Guest"/>
 *     <enumeration value="turboLinuxGuest"/>
 *     <enumeration value="turboLinux64Guest"/>
 *     <enumeration value="ubuntuGuest"/>
 *     <enumeration value="ubuntu64Guest"/>
 *     <enumeration value="debian4Guest"/>
 *     <enumeration value="debian4_64Guest"/>
 *     <enumeration value="debian5Guest"/>
 *     <enumeration value="debian5_64Guest"/>
 *     <enumeration value="debian6Guest"/>
 *     <enumeration value="debian6_64Guest"/>
 *     <enumeration value="debian7Guest"/>
 *     <enumeration value="debian7_64Guest"/>
 *     <enumeration value="debian8Guest"/>
 *     <enumeration value="debian8_64Guest"/>
 *     <enumeration value="debian9Guest"/>
 *     <enumeration value="debian9_64Guest"/>
 *     <enumeration value="debian10Guest"/>
 *     <enumeration value="debian10_64Guest"/>
 *     <enumeration value="debian11Guest"/>
 *     <enumeration value="debian11_64Guest"/>
 *     <enumeration value="debian12Guest"/>
 *     <enumeration value="debian12_64Guest"/>
 *     <enumeration value="asianux3Guest"/>
 *     <enumeration value="asianux3_64Guest"/>
 *     <enumeration value="asianux4Guest"/>
 *     <enumeration value="asianux4_64Guest"/>
 *     <enumeration value="asianux5_64Guest"/>
 *     <enumeration value="asianux7_64Guest"/>
 *     <enumeration value="asianux8_64Guest"/>
 *     <enumeration value="asianux9_64Guest"/>
 *     <enumeration value="opensuseGuest"/>
 *     <enumeration value="opensuse64Guest"/>
 *     <enumeration value="fedoraGuest"/>
 *     <enumeration value="fedora64Guest"/>
 *     <enumeration value="coreos64Guest"/>
 *     <enumeration value="vmwarePhoton64Guest"/>
 *     <enumeration value="other24xLinuxGuest"/>
 *     <enumeration value="other26xLinuxGuest"/>
 *     <enumeration value="otherLinuxGuest"/>
 *     <enumeration value="other3xLinuxGuest"/>
 *     <enumeration value="other4xLinuxGuest"/>
 *     <enumeration value="other5xLinuxGuest"/>
 *     <enumeration value="other6xLinuxGuest"/>
 *     <enumeration value="genericLinuxGuest"/>
 *     <enumeration value="other24xLinux64Guest"/>
 *     <enumeration value="other26xLinux64Guest"/>
 *     <enumeration value="other3xLinux64Guest"/>
 *     <enumeration value="other4xLinux64Guest"/>
 *     <enumeration value="other5xLinux64Guest"/>
 *     <enumeration value="other6xLinux64Guest"/>
 *     <enumeration value="otherLinux64Guest"/>
 *     <enumeration value="solaris6Guest"/>
 *     <enumeration value="solaris7Guest"/>
 *     <enumeration value="solaris8Guest"/>
 *     <enumeration value="solaris9Guest"/>
 *     <enumeration value="solaris10Guest"/>
 *     <enumeration value="solaris10_64Guest"/>
 *     <enumeration value="solaris11_64Guest"/>
 *     <enumeration value="os2Guest"/>
 *     <enumeration value="eComStationGuest"/>
 *     <enumeration value="eComStation2Guest"/>
 *     <enumeration value="netware4Guest"/>
 *     <enumeration value="netware5Guest"/>
 *     <enumeration value="netware6Guest"/>
 *     <enumeration value="openServer5Guest"/>
 *     <enumeration value="openServer6Guest"/>
 *     <enumeration value="unixWare7Guest"/>
 *     <enumeration value="darwinGuest"/>
 *     <enumeration value="darwin64Guest"/>
 *     <enumeration value="darwin10Guest"/>
 *     <enumeration value="darwin10_64Guest"/>
 *     <enumeration value="darwin11Guest"/>
 *     <enumeration value="darwin11_64Guest"/>
 *     <enumeration value="darwin12_64Guest"/>
 *     <enumeration value="darwin13_64Guest"/>
 *     <enumeration value="darwin14_64Guest"/>
 *     <enumeration value="darwin15_64Guest"/>
 *     <enumeration value="darwin16_64Guest"/>
 *     <enumeration value="darwin17_64Guest"/>
 *     <enumeration value="darwin18_64Guest"/>
 *     <enumeration value="darwin19_64Guest"/>
 *     <enumeration value="darwin20_64Guest"/>
 *     <enumeration value="darwin21_64Guest"/>
 *     <enumeration value="darwin22_64Guest"/>
 *     <enumeration value="darwin23_64Guest"/>
 *     <enumeration value="vmkernelGuest"/>
 *     <enumeration value="vmkernel5Guest"/>
 *     <enumeration value="vmkernel6Guest"/>
 *     <enumeration value="vmkernel65Guest"/>
 *     <enumeration value="vmkernel7Guest"/>
 *     <enumeration value="vmkernel8Guest"/>
 *     <enumeration value="amazonlinux2_64Guest"/>
 *     <enumeration value="amazonlinux3_64Guest"/>
 *     <enumeration value="crxPod1Guest"/>
 *     <enumeration value="crxSys1Guest"/>
 *     <enumeration value="rockylinux_64Guest"/>
 *     <enumeration value="almalinux_64Guest"/>
 *     <enumeration value="otherGuest"/>
 *     <enumeration value="otherGuest64"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VirtualMachineGuestOsIdentifier")
@XmlEnum
public enum VirtualMachineGuestOsIdentifier {

    @XmlEnumValue("dosGuest")
    DOS_GUEST("dosGuest"),
    @XmlEnumValue("win31Guest")
    WIN_31_GUEST("win31Guest"),
    @XmlEnumValue("win95Guest")
    WIN_95_GUEST("win95Guest"),
    @XmlEnumValue("win98Guest")
    WIN_98_GUEST("win98Guest"),
    @XmlEnumValue("winMeGuest")
    WIN_ME_GUEST("winMeGuest"),
    @XmlEnumValue("winNTGuest")
    WIN_NT_GUEST("winNTGuest"),
    @XmlEnumValue("win2000ProGuest")
    WIN_2000_PRO_GUEST("win2000ProGuest"),
    @XmlEnumValue("win2000ServGuest")
    WIN_2000_SERV_GUEST("win2000ServGuest"),
    @XmlEnumValue("win2000AdvServGuest")
    WIN_2000_ADV_SERV_GUEST("win2000AdvServGuest"),
    @XmlEnumValue("winXPHomeGuest")
    WIN_XP_HOME_GUEST("winXPHomeGuest"),
    @XmlEnumValue("winXPProGuest")
    WIN_XP_PRO_GUEST("winXPProGuest"),
    @XmlEnumValue("winXPPro64Guest")
    WIN_XP_PRO_64_GUEST("winXPPro64Guest"),
    @XmlEnumValue("winNetWebGuest")
    WIN_NET_WEB_GUEST("winNetWebGuest"),
    @XmlEnumValue("winNetStandardGuest")
    WIN_NET_STANDARD_GUEST("winNetStandardGuest"),
    @XmlEnumValue("winNetEnterpriseGuest")
    WIN_NET_ENTERPRISE_GUEST("winNetEnterpriseGuest"),
    @XmlEnumValue("winNetDatacenterGuest")
    WIN_NET_DATACENTER_GUEST("winNetDatacenterGuest"),
    @XmlEnumValue("winNetBusinessGuest")
    WIN_NET_BUSINESS_GUEST("winNetBusinessGuest"),
    @XmlEnumValue("winNetStandard64Guest")
    WIN_NET_STANDARD_64_GUEST("winNetStandard64Guest"),
    @XmlEnumValue("winNetEnterprise64Guest")
    WIN_NET_ENTERPRISE_64_GUEST("winNetEnterprise64Guest"),
    @XmlEnumValue("winLonghornGuest")
    WIN_LONGHORN_GUEST("winLonghornGuest"),
    @XmlEnumValue("winLonghorn64Guest")
    WIN_LONGHORN_64_GUEST("winLonghorn64Guest"),
    @XmlEnumValue("winNetDatacenter64Guest")
    WIN_NET_DATACENTER_64_GUEST("winNetDatacenter64Guest"),
    @XmlEnumValue("winVistaGuest")
    WIN_VISTA_GUEST("winVistaGuest"),
    @XmlEnumValue("winVista64Guest")
    WIN_VISTA_64_GUEST("winVista64Guest"),
    @XmlEnumValue("windows7Guest")
    WINDOWS_7_GUEST("windows7Guest"),
    @XmlEnumValue("windows7_64Guest")
    WINDOWS_7_64_GUEST("windows7_64Guest"),
    @XmlEnumValue("windows7Server64Guest")
    WINDOWS_7_SERVER_64_GUEST("windows7Server64Guest"),
    @XmlEnumValue("windows8Guest")
    WINDOWS_8_GUEST("windows8Guest"),
    @XmlEnumValue("windows8_64Guest")
    WINDOWS_8_64_GUEST("windows8_64Guest"),
    @XmlEnumValue("windows8Server64Guest")
    WINDOWS_8_SERVER_64_GUEST("windows8Server64Guest"),
    @XmlEnumValue("windows9Guest")
    WINDOWS_9_GUEST("windows9Guest"),
    @XmlEnumValue("windows9_64Guest")
    WINDOWS_9_64_GUEST("windows9_64Guest"),
    @XmlEnumValue("windows9Server64Guest")
    WINDOWS_9_SERVER_64_GUEST("windows9Server64Guest"),
    @XmlEnumValue("windows11_64Guest")
    WINDOWS_11_64_GUEST("windows11_64Guest"),
    @XmlEnumValue("windows12_64Guest")
    WINDOWS_12_64_GUEST("windows12_64Guest"),
    @XmlEnumValue("windowsHyperVGuest")
    WINDOWS_HYPER_V_GUEST("windowsHyperVGuest"),
    @XmlEnumValue("windows2019srv_64Guest")
    WINDOWS_2019_SRV_64_GUEST("windows2019srv_64Guest"),
    @XmlEnumValue("windows2019srvNext_64Guest")
    WINDOWS_2019_SRV_NEXT_64_GUEST("windows2019srvNext_64Guest"),
    @XmlEnumValue("windows2022srvNext_64Guest")
    WINDOWS_2022_SRV_NEXT_64_GUEST("windows2022srvNext_64Guest"),
    @XmlEnumValue("freebsdGuest")
    FREEBSD_GUEST("freebsdGuest"),
    @XmlEnumValue("freebsd64Guest")
    FREEBSD_64_GUEST("freebsd64Guest"),
    @XmlEnumValue("freebsd11Guest")
    FREEBSD_11_GUEST("freebsd11Guest"),
    @XmlEnumValue("freebsd11_64Guest")
    FREEBSD_11_64_GUEST("freebsd11_64Guest"),
    @XmlEnumValue("freebsd12Guest")
    FREEBSD_12_GUEST("freebsd12Guest"),
    @XmlEnumValue("freebsd12_64Guest")
    FREEBSD_12_64_GUEST("freebsd12_64Guest"),
    @XmlEnumValue("freebsd13Guest")
    FREEBSD_13_GUEST("freebsd13Guest"),
    @XmlEnumValue("freebsd13_64Guest")
    FREEBSD_13_64_GUEST("freebsd13_64Guest"),
    @XmlEnumValue("freebsd14Guest")
    FREEBSD_14_GUEST("freebsd14Guest"),
    @XmlEnumValue("freebsd14_64Guest")
    FREEBSD_14_64_GUEST("freebsd14_64Guest"),
    @XmlEnumValue("redhatGuest")
    REDHAT_GUEST("redhatGuest"),
    @XmlEnumValue("rhel2Guest")
    RHEL_2_GUEST("rhel2Guest"),
    @XmlEnumValue("rhel3Guest")
    RHEL_3_GUEST("rhel3Guest"),
    @XmlEnumValue("rhel3_64Guest")
    RHEL_3_64_GUEST("rhel3_64Guest"),
    @XmlEnumValue("rhel4Guest")
    RHEL_4_GUEST("rhel4Guest"),
    @XmlEnumValue("rhel4_64Guest")
    RHEL_4_64_GUEST("rhel4_64Guest"),
    @XmlEnumValue("rhel5Guest")
    RHEL_5_GUEST("rhel5Guest"),
    @XmlEnumValue("rhel5_64Guest")
    RHEL_5_64_GUEST("rhel5_64Guest"),
    @XmlEnumValue("rhel6Guest")
    RHEL_6_GUEST("rhel6Guest"),
    @XmlEnumValue("rhel6_64Guest")
    RHEL_6_64_GUEST("rhel6_64Guest"),
    @XmlEnumValue("rhel7Guest")
    RHEL_7_GUEST("rhel7Guest"),
    @XmlEnumValue("rhel7_64Guest")
    RHEL_7_64_GUEST("rhel7_64Guest"),
    @XmlEnumValue("rhel8_64Guest")
    RHEL_8_64_GUEST("rhel8_64Guest"),
    @XmlEnumValue("rhel9_64Guest")
    RHEL_9_64_GUEST("rhel9_64Guest"),
    @XmlEnumValue("centosGuest")
    CENTOS_GUEST("centosGuest"),
    @XmlEnumValue("centos64Guest")
    CENTOS_64_GUEST("centos64Guest"),
    @XmlEnumValue("centos6Guest")
    CENTOS_6_GUEST("centos6Guest"),
    @XmlEnumValue("centos6_64Guest")
    CENTOS_6_64_GUEST("centos6_64Guest"),
    @XmlEnumValue("centos7Guest")
    CENTOS_7_GUEST("centos7Guest"),
    @XmlEnumValue("centos7_64Guest")
    CENTOS_7_64_GUEST("centos7_64Guest"),
    @XmlEnumValue("centos8_64Guest")
    CENTOS_8_64_GUEST("centos8_64Guest"),
    @XmlEnumValue("centos9_64Guest")
    CENTOS_9_64_GUEST("centos9_64Guest"),
    @XmlEnumValue("oracleLinuxGuest")
    ORACLE_LINUX_GUEST("oracleLinuxGuest"),
    @XmlEnumValue("oracleLinux64Guest")
    ORACLE_LINUX_64_GUEST("oracleLinux64Guest"),
    @XmlEnumValue("oracleLinux6Guest")
    ORACLE_LINUX_6_GUEST("oracleLinux6Guest"),
    @XmlEnumValue("oracleLinux6_64Guest")
    ORACLE_LINUX_6_64_GUEST("oracleLinux6_64Guest"),
    @XmlEnumValue("oracleLinux7Guest")
    ORACLE_LINUX_7_GUEST("oracleLinux7Guest"),
    @XmlEnumValue("oracleLinux7_64Guest")
    ORACLE_LINUX_7_64_GUEST("oracleLinux7_64Guest"),
    @XmlEnumValue("oracleLinux8_64Guest")
    ORACLE_LINUX_8_64_GUEST("oracleLinux8_64Guest"),
    @XmlEnumValue("oracleLinux9_64Guest")
    ORACLE_LINUX_9_64_GUEST("oracleLinux9_64Guest"),
    @XmlEnumValue("suseGuest")
    SUSE_GUEST("suseGuest"),
    @XmlEnumValue("suse64Guest")
    SUSE_64_GUEST("suse64Guest"),
    @XmlEnumValue("slesGuest")
    SLES_GUEST("slesGuest"),
    @XmlEnumValue("sles64Guest")
    SLES_64_GUEST("sles64Guest"),
    @XmlEnumValue("sles10Guest")
    SLES_10_GUEST("sles10Guest"),
    @XmlEnumValue("sles10_64Guest")
    SLES_10_64_GUEST("sles10_64Guest"),
    @XmlEnumValue("sles11Guest")
    SLES_11_GUEST("sles11Guest"),
    @XmlEnumValue("sles11_64Guest")
    SLES_11_64_GUEST("sles11_64Guest"),
    @XmlEnumValue("sles12Guest")
    SLES_12_GUEST("sles12Guest"),
    @XmlEnumValue("sles12_64Guest")
    SLES_12_64_GUEST("sles12_64Guest"),
    @XmlEnumValue("sles15_64Guest")
    SLES_15_64_GUEST("sles15_64Guest"),
    @XmlEnumValue("sles16_64Guest")
    SLES_16_64_GUEST("sles16_64Guest"),
    @XmlEnumValue("nld9Guest")
    NLD_9_GUEST("nld9Guest"),
    @XmlEnumValue("oesGuest")
    OES_GUEST("oesGuest"),
    @XmlEnumValue("sjdsGuest")
    SJDS_GUEST("sjdsGuest"),
    @XmlEnumValue("mandrakeGuest")
    MANDRAKE_GUEST("mandrakeGuest"),
    @XmlEnumValue("mandrivaGuest")
    MANDRIVA_GUEST("mandrivaGuest"),
    @XmlEnumValue("mandriva64Guest")
    MANDRIVA_64_GUEST("mandriva64Guest"),
    @XmlEnumValue("turboLinuxGuest")
    TURBO_LINUX_GUEST("turboLinuxGuest"),
    @XmlEnumValue("turboLinux64Guest")
    TURBO_LINUX_64_GUEST("turboLinux64Guest"),
    @XmlEnumValue("ubuntuGuest")
    UBUNTU_GUEST("ubuntuGuest"),
    @XmlEnumValue("ubuntu64Guest")
    UBUNTU_64_GUEST("ubuntu64Guest"),
    @XmlEnumValue("debian4Guest")
    DEBIAN_4_GUEST("debian4Guest"),
    @XmlEnumValue("debian4_64Guest")
    DEBIAN_4_64_GUEST("debian4_64Guest"),
    @XmlEnumValue("debian5Guest")
    DEBIAN_5_GUEST("debian5Guest"),
    @XmlEnumValue("debian5_64Guest")
    DEBIAN_5_64_GUEST("debian5_64Guest"),
    @XmlEnumValue("debian6Guest")
    DEBIAN_6_GUEST("debian6Guest"),
    @XmlEnumValue("debian6_64Guest")
    DEBIAN_6_64_GUEST("debian6_64Guest"),
    @XmlEnumValue("debian7Guest")
    DEBIAN_7_GUEST("debian7Guest"),
    @XmlEnumValue("debian7_64Guest")
    DEBIAN_7_64_GUEST("debian7_64Guest"),
    @XmlEnumValue("debian8Guest")
    DEBIAN_8_GUEST("debian8Guest"),
    @XmlEnumValue("debian8_64Guest")
    DEBIAN_8_64_GUEST("debian8_64Guest"),
    @XmlEnumValue("debian9Guest")
    DEBIAN_9_GUEST("debian9Guest"),
    @XmlEnumValue("debian9_64Guest")
    DEBIAN_9_64_GUEST("debian9_64Guest"),
    @XmlEnumValue("debian10Guest")
    DEBIAN_10_GUEST("debian10Guest"),
    @XmlEnumValue("debian10_64Guest")
    DEBIAN_10_64_GUEST("debian10_64Guest"),
    @XmlEnumValue("debian11Guest")
    DEBIAN_11_GUEST("debian11Guest"),
    @XmlEnumValue("debian11_64Guest")
    DEBIAN_11_64_GUEST("debian11_64Guest"),
    @XmlEnumValue("debian12Guest")
    DEBIAN_12_GUEST("debian12Guest"),
    @XmlEnumValue("debian12_64Guest")
    DEBIAN_12_64_GUEST("debian12_64Guest"),
    @XmlEnumValue("asianux3Guest")
    ASIANUX_3_GUEST("asianux3Guest"),
    @XmlEnumValue("asianux3_64Guest")
    ASIANUX_3_64_GUEST("asianux3_64Guest"),
    @XmlEnumValue("asianux4Guest")
    ASIANUX_4_GUEST("asianux4Guest"),
    @XmlEnumValue("asianux4_64Guest")
    ASIANUX_4_64_GUEST("asianux4_64Guest"),
    @XmlEnumValue("asianux5_64Guest")
    ASIANUX_5_64_GUEST("asianux5_64Guest"),
    @XmlEnumValue("asianux7_64Guest")
    ASIANUX_7_64_GUEST("asianux7_64Guest"),
    @XmlEnumValue("asianux8_64Guest")
    ASIANUX_8_64_GUEST("asianux8_64Guest"),
    @XmlEnumValue("asianux9_64Guest")
    ASIANUX_9_64_GUEST("asianux9_64Guest"),
    @XmlEnumValue("opensuseGuest")
    OPENSUSE_GUEST("opensuseGuest"),
    @XmlEnumValue("opensuse64Guest")
    OPENSUSE_64_GUEST("opensuse64Guest"),
    @XmlEnumValue("fedoraGuest")
    FEDORA_GUEST("fedoraGuest"),
    @XmlEnumValue("fedora64Guest")
    FEDORA_64_GUEST("fedora64Guest"),
    @XmlEnumValue("coreos64Guest")
    COREOS_64_GUEST("coreos64Guest"),
    @XmlEnumValue("vmwarePhoton64Guest")
    VMWARE_PHOTON_64_GUEST("vmwarePhoton64Guest"),
    @XmlEnumValue("other24xLinuxGuest")
    OTHER_24_X_LINUX_GUEST("other24xLinuxGuest"),
    @XmlEnumValue("other26xLinuxGuest")
    OTHER_26_X_LINUX_GUEST("other26xLinuxGuest"),
    @XmlEnumValue("otherLinuxGuest")
    OTHER_LINUX_GUEST("otherLinuxGuest"),
    @XmlEnumValue("other3xLinuxGuest")
    OTHER_3_X_LINUX_GUEST("other3xLinuxGuest"),
    @XmlEnumValue("other4xLinuxGuest")
    OTHER_4_X_LINUX_GUEST("other4xLinuxGuest"),
    @XmlEnumValue("other5xLinuxGuest")
    OTHER_5_X_LINUX_GUEST("other5xLinuxGuest"),
    @XmlEnumValue("other6xLinuxGuest")
    OTHER_6_X_LINUX_GUEST("other6xLinuxGuest"),
    @XmlEnumValue("genericLinuxGuest")
    GENERIC_LINUX_GUEST("genericLinuxGuest"),
    @XmlEnumValue("other24xLinux64Guest")
    OTHER_24_X_LINUX_64_GUEST("other24xLinux64Guest"),
    @XmlEnumValue("other26xLinux64Guest")
    OTHER_26_X_LINUX_64_GUEST("other26xLinux64Guest"),
    @XmlEnumValue("other3xLinux64Guest")
    OTHER_3_X_LINUX_64_GUEST("other3xLinux64Guest"),
    @XmlEnumValue("other4xLinux64Guest")
    OTHER_4_X_LINUX_64_GUEST("other4xLinux64Guest"),
    @XmlEnumValue("other5xLinux64Guest")
    OTHER_5_X_LINUX_64_GUEST("other5xLinux64Guest"),
    @XmlEnumValue("other6xLinux64Guest")
    OTHER_6_X_LINUX_64_GUEST("other6xLinux64Guest"),
    @XmlEnumValue("otherLinux64Guest")
    OTHER_LINUX_64_GUEST("otherLinux64Guest"),
    @XmlEnumValue("solaris6Guest")
    SOLARIS_6_GUEST("solaris6Guest"),
    @XmlEnumValue("solaris7Guest")
    SOLARIS_7_GUEST("solaris7Guest"),
    @XmlEnumValue("solaris8Guest")
    SOLARIS_8_GUEST("solaris8Guest"),
    @XmlEnumValue("solaris9Guest")
    SOLARIS_9_GUEST("solaris9Guest"),
    @XmlEnumValue("solaris10Guest")
    SOLARIS_10_GUEST("solaris10Guest"),
    @XmlEnumValue("solaris10_64Guest")
    SOLARIS_10_64_GUEST("solaris10_64Guest"),
    @XmlEnumValue("solaris11_64Guest")
    SOLARIS_11_64_GUEST("solaris11_64Guest"),
    @XmlEnumValue("os2Guest")
    OS_2_GUEST("os2Guest"),
    @XmlEnumValue("eComStationGuest")
    E_COM_STATION_GUEST("eComStationGuest"),
    @XmlEnumValue("eComStation2Guest")
    E_COM_STATION_2_GUEST("eComStation2Guest"),
    @XmlEnumValue("netware4Guest")
    NETWARE_4_GUEST("netware4Guest"),
    @XmlEnumValue("netware5Guest")
    NETWARE_5_GUEST("netware5Guest"),
    @XmlEnumValue("netware6Guest")
    NETWARE_6_GUEST("netware6Guest"),
    @XmlEnumValue("openServer5Guest")
    OPEN_SERVER_5_GUEST("openServer5Guest"),
    @XmlEnumValue("openServer6Guest")
    OPEN_SERVER_6_GUEST("openServer6Guest"),
    @XmlEnumValue("unixWare7Guest")
    UNIX_WARE_7_GUEST("unixWare7Guest"),
    @XmlEnumValue("darwinGuest")
    DARWIN_GUEST("darwinGuest"),
    @XmlEnumValue("darwin64Guest")
    DARWIN_64_GUEST("darwin64Guest"),
    @XmlEnumValue("darwin10Guest")
    DARWIN_10_GUEST("darwin10Guest"),
    @XmlEnumValue("darwin10_64Guest")
    DARWIN_10_64_GUEST("darwin10_64Guest"),
    @XmlEnumValue("darwin11Guest")
    DARWIN_11_GUEST("darwin11Guest"),
    @XmlEnumValue("darwin11_64Guest")
    DARWIN_11_64_GUEST("darwin11_64Guest"),
    @XmlEnumValue("darwin12_64Guest")
    DARWIN_12_64_GUEST("darwin12_64Guest"),
    @XmlEnumValue("darwin13_64Guest")
    DARWIN_13_64_GUEST("darwin13_64Guest"),
    @XmlEnumValue("darwin14_64Guest")
    DARWIN_14_64_GUEST("darwin14_64Guest"),
    @XmlEnumValue("darwin15_64Guest")
    DARWIN_15_64_GUEST("darwin15_64Guest"),
    @XmlEnumValue("darwin16_64Guest")
    DARWIN_16_64_GUEST("darwin16_64Guest"),
    @XmlEnumValue("darwin17_64Guest")
    DARWIN_17_64_GUEST("darwin17_64Guest"),
    @XmlEnumValue("darwin18_64Guest")
    DARWIN_18_64_GUEST("darwin18_64Guest"),
    @XmlEnumValue("darwin19_64Guest")
    DARWIN_19_64_GUEST("darwin19_64Guest"),
    @XmlEnumValue("darwin20_64Guest")
    DARWIN_20_64_GUEST("darwin20_64Guest"),
    @XmlEnumValue("darwin21_64Guest")
    DARWIN_21_64_GUEST("darwin21_64Guest"),
    @XmlEnumValue("darwin22_64Guest")
    DARWIN_22_64_GUEST("darwin22_64Guest"),
    @XmlEnumValue("darwin23_64Guest")
    DARWIN_23_64_GUEST("darwin23_64Guest"),
    @XmlEnumValue("vmkernelGuest")
    VMKERNEL_GUEST("vmkernelGuest"),
    @XmlEnumValue("vmkernel5Guest")
    VMKERNEL_5_GUEST("vmkernel5Guest"),
    @XmlEnumValue("vmkernel6Guest")
    VMKERNEL_6_GUEST("vmkernel6Guest"),
    @XmlEnumValue("vmkernel65Guest")
    VMKERNEL_65_GUEST("vmkernel65Guest"),
    @XmlEnumValue("vmkernel7Guest")
    VMKERNEL_7_GUEST("vmkernel7Guest"),
    @XmlEnumValue("vmkernel8Guest")
    VMKERNEL_8_GUEST("vmkernel8Guest"),
    @XmlEnumValue("amazonlinux2_64Guest")
    AMAZONLINUX_2_64_GUEST("amazonlinux2_64Guest"),
    @XmlEnumValue("amazonlinux3_64Guest")
    AMAZONLINUX_3_64_GUEST("amazonlinux3_64Guest"),
    @XmlEnumValue("crxPod1Guest")
    CRX_POD_1_GUEST("crxPod1Guest"),
    @XmlEnumValue("crxSys1Guest")
    CRX_SYS_1_GUEST("crxSys1Guest"),
    @XmlEnumValue("rockylinux_64Guest")
    ROCKYLINUX_64_GUEST("rockylinux_64Guest"),
    @XmlEnumValue("almalinux_64Guest")
    ALMALINUX_64_GUEST("almalinux_64Guest"),
    @XmlEnumValue("otherGuest")
    OTHER_GUEST("otherGuest"),
    @XmlEnumValue("otherGuest64")
    OTHER_GUEST_64("otherGuest64");
    private final String value;

    VirtualMachineGuestOsIdentifier(String v) {
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
    public static VirtualMachineGuestOsIdentifier fromValue(String v) {
        for (VirtualMachineGuestOsIdentifier c: VirtualMachineGuestOsIdentifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
