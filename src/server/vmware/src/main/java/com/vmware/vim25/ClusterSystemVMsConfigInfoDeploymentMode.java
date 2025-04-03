
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ClusterSystemVMsConfigInfoDeploymentMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ClusterSystemVMsConfigInfoDeploymentMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SYSTEM_MANAGED"/>
 *     <enumeration value="ABSENT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ClusterSystemVMsConfigInfoDeploymentMode")
@XmlEnum
public enum ClusterSystemVMsConfigInfoDeploymentMode {

    SYSTEM_MANAGED,
    ABSENT;

    public String value() {
        return name();
    }

    public static ClusterSystemVMsConfigInfoDeploymentMode fromValue(String v) {
        return valueOf(v);
    }

}
